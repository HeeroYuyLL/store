package com.zebone.empi.dao;

import com.zebone.btp.core.mybatis.DcMapper;
import com.zebone.empi.vo.DocStorage;
import com.zebone.empi.vo.DocStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@DcMapper
public interface DocStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int countByExample(DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int deleteByExample(DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int insert(DocStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int insertSelective(DocStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    List<DocStorage> selectByExampleWithBLOBs(DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    List<DocStorage> selectByExample(DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    DocStorage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByExampleSelective(@Param("record") DocStorage record, @Param("example") DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByExampleWithBLOBs(@Param("record") DocStorage record, @Param("example") DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByExample(@Param("record") DocStorage record, @Param("example") DocStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByPrimaryKeySelective(DocStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByPrimaryKeyWithBLOBs(DocStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table D_DOC_STORAGE
     *
     * @mbggenerated Wed Aug 13 08:46:09 CST 2014
     */
    int updateByPrimaryKey(DocStorage record);
}