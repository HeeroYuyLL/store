package com.sell.ei.weixinop.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sell.cache.service.JVMCacheService;
import com.sell.core.util.Coder;
import com.sell.core.util.HttpUtils;
import com.sell.core.util.Identities;
import com.sell.core.util.JsonUtil;
import com.sell.ei.weixinop.bean.WeixinConfig;
import com.sell.ei.weixinop.bean.WeixinTocken;
import com.sell.ei.weixinop.service.WeixinopService;

/**
 * 微信开放平台（公众号）开发服务接口实现类
 * 
 * @author lilin
 * @version [版本号, 2015年7月29日]
 */
@Service("weixinopService")
public class WeixinopServiceImpl implements WeixinopService {
    /**
     * log
     */
    private static final Logger log = Logger.getLogger(WeixinopServiceImpl.class);
    
    /**
     * 缓存模块
     */
    @Resource
    private JVMCacheService jvmCacheService;
    
    @Override
    public String getTicket() {
        // 先从缓存中取key
        String ticket = jvmCacheService.get(WEIXIN_TICKET_KEY);
        if (ticket != null) {
            return ticket;
        }
        String result = HttpUtils.httpsGet(GET_TOKEN_URL);
        WeixinTocken weixinTocken = JsonUtil.readValue(result, WeixinTocken.class);
        
        if (StringUtils.isEmpty(weixinTocken.getAccessToken())) {
            throw new RuntimeException(weixinTocken.getErrmsg());
        }
        // 请求微信获得ticket
        result = HttpUtils.httpsGet(GET_TICKET_URL + weixinTocken.getAccessToken());
        weixinTocken = JsonUtil.readValue(result, WeixinTocken.class);
        if (StringUtils.isEmpty(weixinTocken.getTicket())) {
            throw new RuntimeException(weixinTocken.getErrmsg());
        }
        // 放入缓存 公众号要缓存ticket，因为接口有调用次数限制
        // 默认有效期2小时，这里缓存1小时
        jvmCacheService.set(WEIXIN_TICKET_KEY, weixinTocken.getTicket(), weixinTocken.getExpiresIn() / 2);
        return weixinTocken.getTicket();
    }
    
    @Override
    public WeixinConfig getWeixinConfig(String url) {
        WeixinConfig weixinConfig = new WeixinConfig();
        weixinConfig.setAppId(APPID);
        weixinConfig.setNonceStr(Identities.uuid());
        weixinConfig.setTimestamp(System.currentTimeMillis() / 1000 + "");
        // 生成签名
        StringBuilder builder = new StringBuilder();
        builder.append("jsapi_ticket=").append(getTicket()); // 获取ticket
        builder.append("&noncestr=").append(weixinConfig.getNonceStr());
        builder.append("&timestamp=").append(weixinConfig.getTimestamp());
        builder.append("&url=").append(url);
        log.debug(builder.toString());
        weixinConfig.setSignature(Coder.encodeSHA1(builder.toString()));
        
        return weixinConfig;
    }
}