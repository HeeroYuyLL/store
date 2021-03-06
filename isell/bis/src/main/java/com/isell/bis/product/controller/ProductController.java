package com.isell.bis.product.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isell.bis.product.po.CoonShopProductPo;
import com.isell.core.config.BisConfig;
import com.isell.core.config.vo.AccessSystem;
import com.isell.core.util.JsonData;
import com.isell.core.util.JsonUtil;
import com.isell.service.order.vo.Catelog;
import com.isell.service.product.po.CoolProductExternal;
import com.isell.service.product.po.CoolProductExternalStock;
import com.isell.service.product.po.CoolProductExternalStockSelect;
import com.isell.service.product.service.ProductService;
import com.isell.service.product.vo.CoolProductCategory;
import com.isell.service.product.vo.CoolProductReview;
import com.isell.service.shop.po.CoonShopProductInfo;
import com.isell.service.shop.po.CoonShopProductParam;

/**
 * 商品controller
 * 
 * @author wangpeng
 * @version [版本号, 2015-10-09]
 */
@Controller
@RequestMapping("product")
public class ProductController {

	private static final Logger log = Logger.getLogger(ProductController.class); 
	/**
	 * 商品service
	 */
	@Resource
	private ProductService productService;
	/**
     * 配置信息
     */
    @Resource
    private BisConfig config;
	/**
	 * 获取商品列表接口
	 * 
	 * @param jsonObj 参数
	 * @return 是否保存成功
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getProductList")
	@ResponseBody
	public JsonData getProductList(String jsonObj) {
		CoonShopProductParam coonShopProductPo = JsonUtil.readValue(jsonObj,CoonShopProductParam.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getProductList(coonShopProductPo).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("productList") != null) {
			jsonData.setRows((List<CoonShopProductInfo>) resultMap.get("productList"));
			resultMap.remove("productList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取商品分类列表接口
	 * 
	 * @param jsonObj 参数
	 * @return 是否保存成功
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getProductTypeList")
	@ResponseBody
	public JsonData getProductTypeList(String jsonObj) {
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getProductTypeList().getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("typeList") != null) {
			jsonData.setRows((List<CoolProductCategory>) resultMap.get("typeList"));
			resultMap.remove("typeList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取商品详情接口
	 * 
	 * @param jsonObj 参数
	 * @return 商品详情
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getProductDetail")
	@ResponseBody
	public JsonData getProductDetail(String jsonObj) {
		CoonShopProductParam coonShopProductPo = JsonUtil.readValue(jsonObj, CoonShopProductParam.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getProductDetail(coonShopProductPo).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("productList") != null) {
			jsonData.setRows((List<CoonShopProductInfo>) resultMap.get("productList"));
			resultMap.remove("productList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取商品评价列表接口
	 * 
	 * @param jsonObj 参数
	 * @return 商品评价列表
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getProductReviewList")
	@ResponseBody
	public JsonData getProductReviewList(String jsonObj) {
		CoolProductReview review = JsonUtil.readValue(jsonObj,CoolProductReview.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getProductReviewListPage(review).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("reviewList") != null) {
			jsonData.setRows((List<CoolProductReview>) resultMap.get("reviewList"));
			resultMap.remove("reviewList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 保存商品上架（含批量）接口
	 * 
	 * @param jsonObj 参数
	 * @return 是否保存成功
	 */
	@RequestMapping("saveShopProduct")
	@ResponseBody
	public JsonData saveShopProduct(String jsonObj) {
		CoonShopProductPo po = JsonUtil.readValue(jsonObj, CoonShopProductPo.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.saveShopProduct(po.getProductList()).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			if(!jsonData.getSuccess()){
				jsonData.setMsg((String) resultMap.get("msg"));
			}			
			resultMap.remove("msg");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 更新商品排序接口
	 * 
	 * @param jsonObj 参数
	 * @return 是否更新成功
	 */
	@RequestMapping("updateShopProductOrder")
	@ResponseBody
	public JsonData updateShopProductOrder(String jsonObj) {
		CoonShopProductPo po = JsonUtil.readValue(jsonObj, CoonShopProductPo.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.updateShopProductOrder(po.getProductList()).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 保存新品上线接口
	 * 
	 * @param jsonObj 参数
	 * @return 是否更新成功
	 */
	@RequestMapping("saveShopProductNew")
	@ResponseBody
	public JsonData saveShopProductNew(String jsonObj) {
		CoonShopProductPo po = JsonUtil.readValue(jsonObj, CoonShopProductPo.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.saveShopProductNew(po.getProductList()).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取已上架商品列表接口
	 * 
	 * @param jsonObj 参数
	 * @return 商品列表
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getShopProductList")
	@ResponseBody
	public JsonData getShopProductList(String jsonObj) {
		CoonShopProductParam param = JsonUtil.readValue(jsonObj, CoonShopProductParam.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getShopProductListPage(param).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("productList") != null) {
			jsonData.setRows((List<CoonShopProductInfo>) resultMap .get("productList"));
			resultMap.remove("productList");
		}
		if (resultMap.get("total") != null) {
			jsonData.setTotal((Integer) resultMap .get("total"));
			resultMap.remove("total");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取未上架商品列表接口
	 * 
	 * @param jsonObj  参数
	 * @return 商品列表
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getShopProductNoList")
	@ResponseBody
	public JsonData getShopProductNoList(String jsonObj) {
		CoonShopProductParam param = JsonUtil.readValue(jsonObj, CoonShopProductParam.class);
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getShopProductNoList(param).getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("productList") != null) {
			jsonData.setRows((List<CoonShopProductInfo>) resultMap.get("productList"));
			resultMap.remove("productList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}

	/**
	 * 获取热门搜索商品列表接口
	 * 
	 * @param jsonObj  参数
	 * @return 商品列表
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("getHotTrendProductList")
	@ResponseBody
	public JsonData getHotTrendProductList(String jsonObj) {
		JsonData jsonData = new JsonData();
		Map<String, Object> resultMap = productService.getHotTrendProductList() .getColumns();
		jsonData.setSuccess(resultMap.get("success") == null ? false : (Boolean) resultMap.get("success"));
		resultMap.remove("success");
		if (resultMap.get("msg") != null) {
			jsonData.setMsg((String) resultMap.get("msg"));
			resultMap.remove("msg");
		}
		if (resultMap.get("productList") != null) {
			jsonData.setRows((List<CoonShopProductInfo>) resultMap .get("productList"));
			resultMap.remove("productList");
		}
		jsonData.setData(resultMap);
		return jsonData;
	}	
	/**
	 * 光云--根据商品id数组 查询多个商品信息
	 * @param jsonObj
	 * @param request
	 * @return
	 */
	@RequestMapping("queryGoodsinfoByids")
	@ResponseBody
	public JsonData  queryGoodsinfoByids(String jsonObj,HttpServletRequest request)
	{
		log.info("get queryGoodsinfoByids ok!jsonObj:"+jsonObj);
	     JsonData vo = new JsonData();
	     try {	    	  
	    	 CoolProductExternal product = JsonUtil.readValue(jsonObj, CoolProductExternal.class);
	    	// CoolProductExternal product=new CoolProductExternal();product.setQueryids("212,213");
	    	 product.setImage_domain(config.getImgDomain());
	    	 List<CoolProductExternal>record=productService.queryGoodsinfoByids(product);
	    	 if(!"".equals(request.getParameter("accessCode")))
		        {
		        	 AccessSystem sys = config.getAccessSysMap().get(request.getParameter("accessCode"));
		        	 if (sys != null) {
		        		 if(sys.getIsgooddetail()==0)
		        		 {
		        			 for(CoolProductExternal info:record)
		        			 {
		        				 info.setContent("");
		        			 }
		        		 }
		        	 }
		        }
	    	 vo.setSuccess(true);
	    	 vo.setRows(record);
	     } catch(Exception e){
	    	 vo.setSuccess(false);
				vo.setMsg(e.getMessage());
				e.printStackTrace();
	     }
	     return vo;
	}
	
	/**
	 * 外部商品信息推送接口
	 * @param jsonObj
	 * @return
	 */
	@RequestMapping("getInfo")
	@ResponseBody
	public JsonData getInfo(String jsonObj,HttpServletRequest request) {
		log.info("get getStock ok!jsonObj:"+jsonObj);
	     JsonData jsonData = new JsonData();
	      try {	    	  
	    	 CoolProductExternal product = JsonUtil.readValue(jsonObj, CoolProductExternal.class);
	        /*if(product==null||(null==product.getId()&&StringUtils.isBlank(product.getName()))) {
	   			 jsonData.setSuccess(false);
	   			 jsonData.setMsg("id  and  name are null");
	        	throw new RuntimeException("parameters[id,name] are null!");
	        }*/
	    	 if(product.getPage()>0)
	    	 {
	    		 product.setStart((product.getPage()-1)*product.getLimit());
	    	 }
	        product.setImage_domain(config.getImgDomain());
	        List<CoolProductExternal> record =  productService.getProductInfo(product);
	        if(record.size()>0)
	        {
	        	jsonData.setTotal(this.productService.queryProductAllNum(product));
	        }
	        if(!"".equals(request.getParameter("accessCode")))
	        {
	        	 AccessSystem sys = config.getAccessSysMap().get(request.getParameter("accessCode"));
	        	 if (sys != null) {
	        		 if(sys.getIsgooddetail()==0)
	        		 {
	        			 for(CoolProductExternal info:record)
	        			 {
	        				 info.setContent("");
	        			 }
	        		 }
	        	 }
	        }
	       jsonData.setSuccess(true);
	       jsonData.setRows(record);
		} catch(Exception e){
			jsonData.setSuccess(false);
			jsonData.setMsg(e.getMessage());
			e.printStackTrace();
		}
        return jsonData;
	} 
	/**
	 * 根据父类id查询所有的子分类信息
	 * @param jsonObj
	 * @return
	 */
	@RequestMapping("queryCateloglistByPid")
	@ResponseBody
	public JsonData queryCateloglistByPid(String jsonObj)
	{
		log.info("get queryCateloglistByPid ok!jsonObj:"+jsonObj);
		JsonData vo=new JsonData();
		Catelog info=JsonUtil.readValue(jsonObj, Catelog.class);
		List<Catelog>list=this.productService.queryCateloglistByPid(info);
		if(list.size()>0)
		{
			vo.setSuccess(true);
			vo.setData(list);
		}else
		{
			vo.setSuccess(false);
			vo.setMsg("无数据");
		}
		return vo;
	}
	/**
	 * 外部获取库存记录
	 * @param jsonObj
	 * @return
	 */
	@RequestMapping("getStock")
	@ResponseBody
	public JsonData getStock(String jsonObj) {
		log.info("get getStock ok!jsonObj:"+jsonObj);
		 JsonData jsonData = new JsonData();
	      try {
	    	  CoolProductExternalStock product = JsonUtil.readValue(jsonObj, CoolProductExternalStock.class);
	        if(product==null||(StringUtils.isBlank(product.getGid())&&StringUtils.isBlank(product.getCode()))) {
	   			 jsonData.setSuccess(false);
	   			 jsonData.setMsg("gid  and  code are null");
	        	throw new RuntimeException("parameters[id,name] are null!");
	        }
	        List<CoolProductExternalStockSelect> products =  productService.getProductStock(product);
	       jsonData.setSuccess(true);
	       jsonData.setRows(products);
		} catch(Exception e){
			jsonData.setSuccess(false);
			jsonData.setMsg(e.getMessage());
			e.printStackTrace();
		}
       return jsonData;
	}
}
