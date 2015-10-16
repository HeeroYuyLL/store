package com.isell.service.member.dao;

import java.util.List;

import com.isell.core.mybatis.Mapper;
import com.isell.service.member.vo.CoolMemberReceiver;

import org.apache.ibatis.annotations.Param;

/**
 * 会员收货地址mapper
 * 
 * @author wangpeng
 * @version [版本号, 2015-10-04] 
 */
@Mapper
public interface CoolMemberReceiverMapper{   
    /**
     * 根据主键查询
     */
    public CoolMemberReceiver getCoolMemberReceiverById(@Param("id")Integer id); 

    /**
     * 查询出所有记录
     */
    public List<CoolMemberReceiver> findAllCoolMemberReceiver();    
    
    /**
     * 保存
     */
    public int saveCoolMemberReceiver(CoolMemberReceiver coolMemberReceiver);
    
    /**
     * 根据主键更新（参数对象中的主键将作为更新条件）
     */
    public int updateCoolMemberReceiver(CoolMemberReceiver coolMemberReceiver);
    
    /**
     * 根据主键删除
     */
    public int deleteCoolMemberReceiver(@Param("id")Integer id);
}
