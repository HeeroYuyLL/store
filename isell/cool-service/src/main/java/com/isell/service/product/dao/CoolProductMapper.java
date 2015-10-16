package com.isell.service.product.dao;

import java.util.List;

import com.isell.core.mybatis.Mapper;
import com.isell.service.product.po.CoolProductSelect;
import com.isell.service.product.vo.CoolProduct;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * 商品mapper
 * 
 * @author wangpeng
 * @version [版本号, 2015-10-04] 
 */
@Mapper
public interface CoolProductMapper{   
    /**
     * 根据主键查询
     */
    public CoolProduct getCoolProductById(@Param("id")Integer id); 

    /**
     * 查询出所有记录
     */
    public List<CoolProduct> findAllCoolProduct();    
    
    /**
     * 保存
     */
    public int saveCoolProduct(CoolProduct coolProduct);
    
    /**
     * 根据主键更新（参数对象中的主键将作为更新条件）
     */
    public int updateCoolProduct(CoolProduct coolProduct);
    
    /**
     * 根据主键删除
     */
    public int deleteCoolProduct(@Param("id")Integer id);
    
    /**
     * 根据条件分页查询商品信息
     *
     * @param rowBounds
     * @param coolProduct
     * @return
     */
    public List<CoolProduct> getCoolProductPageList(RowBounds rowBounds,CoolProductSelect coolProductSelect);
    /**
     * 根据分页查询商品数量
     *
     * @param coolProduct
     * @return
     */
    public int getCoolProductPageListCount(CoolProductSelect CoolProductSelect);
}
