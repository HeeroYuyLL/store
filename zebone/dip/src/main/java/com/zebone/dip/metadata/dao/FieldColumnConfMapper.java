package com.zebone.dip.metadata.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.metadata.vo.FieldColumnConf;

@Mapper
public interface FieldColumnConfMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insert(FieldColumnConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insertSelective(FieldColumnConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    FieldColumnConf selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateByPrimaryKeySelective(FieldColumnConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_FIELD_COLUMN_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateTableFieldInfo(FieldColumnConf record);

    //获取表字段信息列表
    List<FieldColumnConf> tableFieldList(RowBounds rowBounds, FieldColumnConf fieldConf);

    //获取表字段信息总数
    int tableFieldTotalCount(FieldColumnConf fieldTableConf);

    //注册表字段信息
    int saveTableFieldInfo(FieldColumnConf fieldTableConf);

    //根据id删除表字段信息
    int deleteTableFieldByIds (List<String> list);
    
    
    /**
     * 模糊查询表的列名
     * @param parameter
     * @return
     */
    List<FieldColumnConf> selectLikeByColDesc(Map<String,String> parameter);
    
    
    /**
     * 获取表的所有列
     * @param tableId
     * @return
     */
    List<FieldColumnConf> selectAllCol(@Param("tableId") String tableId);

    /**
     * 判断该字段名称是否已经存在
     * @param fieldTableConf
     * @return
     */
    int columnNameCount (FieldColumnConf fieldTableConf);
}