package com.isell.service.order.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.isell.core.mybatis.page.PageInfo;
import com.isell.core.util.JsonData;
import com.isell.core.util.Record;
import com.isell.service.order.po.CoolOrderExternal;
import com.isell.service.order.po.CoolOrderParam;
import com.isell.service.order.po.CoolOrderSelect;
import com.isell.service.order.po.CoolOrderWayBill;
import com.isell.service.order.po.CoolOrderWayBillReturn;
import com.isell.service.order.po.CoonShopCartParam;
import com.isell.service.order.vo.CoolDistributionCar;
import com.isell.service.order.vo.CoolOrder;
import com.isell.service.order.vo.CoonShopcart;
import com.isell.service.order.vo.OrderReturn;
import com.isell.service.shop.vo.CoonShop;

/**
 * 订单服务接口
 * 
 * @author lilin
 * @version [版本号, 2015年9月24日]
 */
public interface OrderService {
    /**
     * 根据主键获取订单
     * 
     * @param id id
     * @return 订单信息
     */
    CoolOrder getCoolOrderById(Integer id);
    
    /**
     * 根据订单编号获取订单
     * 
     * @param orderNo 订单编号
     * @return 订单信息
     */
    CoolOrder getCoolOrderByOrderNo(String orderNo);
    
    /**
     * 根据主键获取订单及详情
     * 
     * @param id id
     * @return 订单信息及详情
     */
    CoolOrder getCoolOrderDetailById(Integer id);
    
    /**
     * 根据订单编号获取订单及详情
     * 
     * @param orderNo 订单编号
     * @return 订单信息及详情
     */
    CoolOrder getCoolOrderDetailByOrderNo(String orderNo);
    
    /**
     * 根据物流单号查询订单详情
     * 
     * @param psCode 物流单号
     * @return 订单信息及详情
     */
    CoolOrder getCoolOrderDetailByPsCode(String psCode);
    
    /**
     * 根据条件查询订单列表
     * 
     * @param param 查询条件
     * @return 符合条件的订单列表
     */
    List<CoolOrder> getCoolOrderList(CoolOrder param);
    
    /**
     * 取消订单
     * 
     * @param ids 订单主键集合
     */
    void cancelOrder(Integer... ids);
    
    /**
     * 确认订单（不保存订单）
     * 
     * @param param 订单参数
     * @return 订单、商品信息
     */
    Record getCoolOrderReturn(CoolOrderParam param);
    
    /**
     * 保存订单
     * 
     * @param param 订单参数
     * @return
     */
    Record saveCoolOrder(CoolOrderParam param);
    
    /**
     * 修改订单（通用）
     * 
     * @param param
     * @return Record
     */
    Record updateCoolOrderCommon(Map<String, Object> param);
    
    /**
     * 修改订单（支付成功）
     * 
     * @param param
     * @return Record
     */
    Record updateCoolOrderCheck(Map<String, Object> param);
    
    /**
     * 宁波优贝获取物流单号更新订单
     * 
     * @param orderNo
     * @return Record
     */
    Record updateCoolOrderNbyb(String orderNo);
    
    /**
     * 修改订单（订单发货）0 自提，1 圆通，2 费舍尔，10 宁波艾购保税仓，11 宁波优贝保税仓，20 郑州海关
     * 
     * @param param
     * @return Record
     */
    Record updateCoolOrderDelivery(Map<String, Object> param);
    
    /**
     * 修改订单（签收）
     * 
     * @param param
     * @return Record
     */
    Record updateCoolOrderRec(Map<String, Object> param);
    
    /**
     * 删除订单
     * 
     * @param param
     * @return Record
     */
    Record deleteCoolOrder(Map<String, Object> param);
    
    /**
     * 取消订单
     * 
     * @param param
     * @return Record
     */
    Record cancelCoolOrder(CoolOrder coolOrder);
    
    /**
     * 分页查询订单列表
     * 
     * @param orderSelect 查询条件
     * @return 分页信息
     */
    PageInfo<CoolOrder> getCoolOrderListPage(CoolOrderSelect orderSelect);
    
    /**
     * 查询订单流水
     * 
     * @param param
     * @param jsonData
     */
    void getCoolOrderListSerial(CoolOrder order, JsonData jsonData);
    
    /**
     * 通用更新
     * 
     * @param param
     * @return Record
     */
    void updateOrder(CoolOrder param);
    
    /**
     * 统计商品销量
     * 
     * @param param
     */
    void getSumCoolProductSales(Map<String, Object> param, JsonData jsonData);
    
    /**
     * 统计店铺销量排名
     * 
     * @param param
     */
    void getSumCoonShopSales(Map<String, Object> param, JsonData jsonData);
    
    /**
     * 查询相关流水账
     * 
     * @param date
     * @return
     */
    void updateRunAccount(Date date);
    
    /**
     * 分页查询订单列表
     * 
     * @param orderSelect 查询条件
     * @return 订单信息
     */
    Record getOrderListPage(CoolOrderSelect orderSelect);
    
    /**
     * 查询订单详情
     * 
     * @param order 查询条件
     * @return 订单详情
     */
    Record getOrderDetail(CoolOrder order);
    
    /**
     * 删除订单
     * 
     * @param order 查询条件
     * @return 是否删除成功
     */
    Record deleteOrder(CoolOrder order);
    
    /**
     * 分页获取一件代发进货单列表
     * 
     * @param order 查询条件
     * @return 进货单列表信息
     */
    Record getDistributionCartListPage(CoolDistributionCar coolDistributionCar);
    
    /**
     * 分页获取一件代发购买过商品列表
     * 
     * @param coolOrderParam 查询条件
     * @return 商品列表信息
     */
    Record getBuyList(CoolOrderParam coolOrderParam);
    
    /**
     * 更新订单
     * 
     * @param coolOrder 订单参数
     * @return 是否更新成功
     */
    Record updateOrderReceive(CoolOrder coolOrder);
    
    /**
     * 保存评价
     * 
     * @param coolOrderParam 评价参数
     * @return 是否保存成功
     */
    Record saveOrderReview(CoolOrderParam coolOrderParam);
    
    /**
     * 保存购物车
     * 
     * @param coonShopCartParam 购物车参数
     * @return 是否保存成功
     */
    Record saveShopCart(CoonShopCartParam coonShopCartParam);
    
    /**
     * 获取购物车列表信息
     * 
     * @param coonShopCart 购物车参数
     * @return 购物车列表
     */
    Record getShopCartList(CoonShopcart coonShopcart);
    
    /**
     * 删除购物车
     * 
     * @param coonShopCart 购物车参数
     * @return 是否删除成功
     */
    Record deleteShopCart(CoonShopcart coonShopcart);
    
    /**
     * 获取订单各状态数量接口
     * 
     * @param param 参数
     * @return 状态数量
     */
    Record getStateCount(CoolOrderParam param);
    
    /**
     * 支付信息报关
     * 
     * @param orderNo 订单号
     * @return 报关状态
     */
    Record sendPayInfo(String orderNo);
    
    /**
     * 校验订单
     * 
     * @param order 订单信息
     */
    void validateOrder(CoolOrder order);
    
    /**
     * 保存订单
     * 
     * @param order 订单参数
     * @return 是否保存成功
     */
    Record saveCoolOrder(CoolOrder order);
    
    /**
     * 对外修改订单部分字段
     * 
     * @param order
     * @return
     */
    boolean updateOrderPartByOrderNo(CoolOrder order);
    
    /**
     * 客户系统调用该接口获取订单信息数据
     * 
     * @param orderNo
     * @param string
     * @return
     */
    List<CoolOrderExternal> getOrderExternalByOrderOldNo(String shopId, String orderNo);
    /**
     * 保存post失败记录
     * @param orderReturn
     * @return
     */
    int saveUnSuccessOrderReturn(OrderReturn orderReturn);
    
    /**
     * 客户系统调用该接口获取运单相关信息
     * 
     * @param order
     * @return
     */
    List<CoolOrderWayBillReturn> getWayBill(CoolOrderWayBill order);
    
    /**
     * 确认收货
     * 
     * @param order
     * @return
     */
    boolean confirmOrder(CoolOrder order);
    
    /**
     * 
     * @param order
     */
    boolean cancelOrder(CoolOrder order);
    
    /**
     * 购买支付流水
     *
     * @param orderNo 订单编号集合
     * @return 购买支付流水结果
     */
    JsonData buyTradeNo(String... orderNos);
    
   
    
    /**
     * 根据物流单号查询订单编号
     * 
     * @param psCode 物流单号
     * @return 订单编号
     */
    Record getOrderNoByPsCode(String psCode);
    /**
     * 震荣修改发货状态
     * @param param
     * @return
     */
	Record updateZrCoolOrderDelivery(Map<String, Object> param);
	
	Record getCoolOrderFare(Map<String, Object> param);
	
	/**
     * 获取最近购物人次列表
     * 
     * @param coonShop 购物车参数
     * @return 最近购物人次列表
     */
    Record getBuyCountPage(CoonShop coonShop);
}
