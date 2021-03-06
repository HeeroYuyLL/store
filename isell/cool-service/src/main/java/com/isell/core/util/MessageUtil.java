/**
 * ==================   =============   ============   =================================
 * Author               OperateType     Date           Description
 * ==================   =============   ============   =================================
 * lilin                New             2012-11-26     国际化消息类
 */
package com.isell.core.util;

import java.util.Locale;

import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * 国际化消息类
 * 
 * @author lilin
 * @version [版本号, 2012-11-26]
 */
public final class MessageUtil {
    /**
     * 静态实例
     */
    private static MessageUtil messageUtil;
    
    /**
     * 默认本地变量
     */
    private static Locale defaultLocale = Locale.CHINESE;
    
    /**
     * spring国际化资源对象
     */
    private ReloadableResourceBundleMessageSource messageSource;
    
    /**
     * 私有化构造方法避免实例化
     */
    private MessageUtil() {
        
    }
    
    /**
     * 获取实例
     * 
     * @return messageUtil
     */
    private static MessageUtil getInstance() {
        if (messageUtil == null) {
            messageUtil = new MessageUtil();
        }
        return messageUtil;
    }
    
    /**
     * 获取资源信息
     * 
     * @param key key
     * @param args 国际化参数
     * @return value
     */
    public static String getMessage(String key, Object... args) {
        return getInstance().getMsg(key, args);
    }
    
    /**
     * 获取资源信息
     * 
     * @param key key
     * @param args 国际化参数
     * @return value
     */
    private String getMsg(String key, Object... args) {
        String message = null;
        try {
            message = messageSource.getMessage(key, args, defaultLocale);
        } catch (NoSuchMessageException e) {
            
        }
        return message;
    }
    
    public void setMessageSource(ReloadableResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
