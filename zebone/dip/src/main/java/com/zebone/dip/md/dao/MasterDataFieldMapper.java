package com.zebone.dip.md.dao;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.md.vo.MasterDataField;
import com.zebone.dip.md.vo.MasterDataQuery;
import com.zebone.dip.md.vo.NameCode;

import org.apache.ibatis.session.RowBounds;

import java.util.HashMap;
import java.util.List;

/**
 * @author Yang Ying
 * @version 2013-07-02
 */
@Mapper
public interface MasterDataFieldMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    int insert(MasterDataField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    int insertSelective(MasterDataField record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    MasterDataField selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    int updateByPrimaryKeySelective(MasterDataField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_MASTER_DATA_FIELD
     *
     * @mbggenerated Mon Jul 01 16:41:00 CST 2013
     */
    int updateByPrimaryKey(MasterDataField record);

    /**
     * 根据主数据ID查询主数据字段表中对应的字段信息列表
     * @param masterDataId
     * @return
     */
    List<MasterDataField> getFieldByMasterDataId (String masterDataId);

    /**
     * 查询MD列表
     * @param rowBounds
     * @param masterDataQuery
     * @return
     */
    List<HashMap<String, Object>> getDetailObject(RowBounds rowBounds,MasterDataQuery masterDataQuery);

    /**
     * 查询MD列表 总数
     * @param masterDataQuery
     * @return
     */
    int getDetailObjectTotal(MasterDataQuery masterDataQuery);

    /**
     * 根据ID查询MD详细信息
     * @param masterDataQuery
     * @return
     */
    List<HashMap<String, Object>> getMtDetailsById(MasterDataQuery masterDataQuery);

    /**
     * 保存主数据内容信息
     * @param masterDataQuery
     * @return
     */
    int saveMDContentInfo(MasterDataQuery masterDataQuery);

    /**
     * 根据ＩＤ删除 MD
     * @param masterDataQuery
     * @return
     */
    int deleteMDContent(MasterDataQuery masterDataQuery);
    
    /**
     * 根据ＩＤ物理删除 MD
     * @param masterDataQuery
     * @return
     */
    int physicalDeleteMDContent(MasterDataQuery masterDataQuery);
    
    /**
     * 根据 ids 批量删除 MD
     * @param masterDataQuery
     * @return
     */
    int removeMDContentInfo(MasterDataQuery masterDataQuery);

    /**
     * 根据 dbName 获取具体表中MD_NAME字段的信息列表
     * @param masterDataQuery
     * @return
     */
    List<NameCode> getMDNameLic (MasterDataQuery masterDataQuery);

    /**
     * 根据主数据编码"MD_CODE"判断该编码是否已经存在
     * @param masterDataQuery
     * @return
     */
    int countMDInfo (MasterDataQuery masterDataQuery);
}