package com.isell.ei.pay.yijifu.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isell.core.util.JsonData;
import com.isell.ei.pay.yijifu.service.YijifuService;

/**
 * 易极付支付控制层
 * 
 * @author lilin
 * @version [版本号, 2015年10月28日]
 */
@Controller
@RequestMapping("pay/yijifu")
public class YijifuController {
    /**
     * 易极付支付service层接口
     */
    @Resource
    private YijifuService yijifuService;
    
    /**
     * PC端易极付支付
     * 
     * @param paramMap 参数信息
     * @param map 返回值
     * @return 返回的参数字符串
     */
    @RequestMapping("webPay")
    public String webPay(@RequestBody Map<String, String> paramMap, ModelMap map) {
        paramMap.put("service", "commonTradePay"); // PC支付接口名
        map.putAll(paramMap);
        map.addAttribute("result", yijifuService.getPayParams(paramMap));
        return "result";
    }
    
    /**
     * 上传支付信息
     *
     * @param paramMap 参数信息
     * @return 封装后的上传结果
     */
    @Deprecated
    @RequestMapping("paymentBillV2Order")
    @ResponseBody
    public JsonData paymentBillV2Order(@RequestBody Map<String, String> paramMap) {
        paramMap.put("service", "paymentBillV2Order"); // PC支付接口名
        Map<String, String> resultMap = yijifuService.paymentBillV2Order(paramMap);
        
        JsonData jsonData = new JsonData();
        jsonData.setData(resultMap);
        jsonData.setSuccess("SUCCESS".equals(resultMap.get("serviceStatus")));
        return jsonData;
    }
    
    /**
     * 实名认证信息查询
     *
     * @param paramMap 参数信息
     * @return 封装后的上传结果
     */
    @RequestMapping("realNameQuery")
    @ResponseBody
    public JsonData realNameQuery(@RequestBody Map<String, String> paramMap) {
        paramMap.put("service", "realNameQuery"); // PC支付接口名
        Map<String, String> resultMap = yijifuService.realNameQuery(paramMap);
        
        JsonData jsonData = new JsonData();
        jsonData.setData(resultMap);
        jsonData.setSuccess("pass".equals(resultMap.get("realNameQueryResult")));
        return jsonData;
    }
    
    /**
     * 订单合并支付
     *
     * @param paramMap 参数信息
     * @param map 返回值
     * @return 返回的参数字符串
     */
    @RequestMapping("unionCashierWebPay")
    public String unionCashierWebPay(@RequestBody Map<String, String> paramMap, ModelMap map) {
        map.putAll(paramMap);
        map.addAttribute("result", yijifuService.unionCashierWebPay(paramMap));
        return "result";
    }
    
    /**
     * 上传支付信息V3.0
     *
     * @param paramMap 参数信息
     * @return 封装后的上传结果
     */
    @RequestMapping("singlePaymentUpload")
    @ResponseBody
    public JsonData singlePaymentUpload(@RequestBody Map<String, String> paramMap) {
        Map<String, String> resultMap = yijifuService.singlePaymentUpload(paramMap);
        
        JsonData jsonData = new JsonData();
        jsonData.setData(resultMap);
        jsonData.setSuccess("SUCCESS".equals(resultMap.get("status")));
        return jsonData;
    }
    
    /**
     * 退款
     *
     * @param paramMap 参数信息
     * @return 封装后的结果
     */
    @RequestMapping("tradeRefund")
    @ResponseBody
    public JsonData tradeRefund(@RequestBody Map<String, String> paramMap) {
        Map<String, String> resultMap = yijifuService.tradeRefund(paramMap);
        
        JsonData jsonData = new JsonData();
        jsonData.setData(resultMap);
        jsonData.setSuccess("SUCCESS".equals(resultMap.get("refundStatus")));
        return jsonData;
    }
    
    /**
     * 跨境订单信息同步
     *
     * @param remittranceBatchNo 跨境付款批次号
     * @param orderNos 订单集合
     * @return 封装后的结果
     */
    @RequestMapping("corderRemittanceSynOrder")
    @ResponseBody
    public JsonData corderRemittanceSynOrder(String remittranceBatchNo, String orderNos) {
        Map<String, String> resultMap = yijifuService.corderRemittanceSynOrder(remittranceBatchNo, orderNos.split(","));
        
        JsonData jsonData = new JsonData();
        jsonData.setData(resultMap);
        jsonData.setSuccess("EXECUTE_SUCCESS".equals(resultMap.get("resultCode")));
        return jsonData;
    }
    
    /**
     * 跨境汇款申请
     *
     * @param paramMap 参数信息
     * @param map 返回值
     * @return 返回的参数字符串
     */
    @RequestMapping("applyRemittranceWithSynOrder")
    public String applyRemittranceWithSynOrder(@RequestBody Map<String, String> paramMap, ModelMap map) {
        map.putAll(paramMap);
        map.addAttribute("result", yijifuService.applyRemittranceWithSynOrder(paramMap));
        return "result";
    }
}
