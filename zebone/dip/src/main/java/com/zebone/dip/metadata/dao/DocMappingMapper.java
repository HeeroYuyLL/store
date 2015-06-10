package com.zebone.dip.metadata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.metadata.vo.DocMapping;
import com.zebone.dip.metadata.vo.TreeInfo;
@Mapper
public interface DocMappingMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    int insert(DocMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    int insertSelective(DocMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    DocMapping selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    int updateByPrimaryKeySelective(DocMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_MAPPING
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    int updateByPrimaryKey(DocMapping record);
    
    
    /**
     * 根据docid,fieldid,xpath查询是否出现过映射记录
     * @param record
     * @return
     * @author 陈阵 
     * @date 2013-8-5 上午9:34:09
     */
    DocMapping selectByDFC(DocMapping record);
    
    
    /**
     * 根据docID和xpath 获取节点重复性和选择性
     * @param docId
     * @param xpath
     * @return
     * @author 陈阵 
     * @date 2013-8-5 上午9:36:17
     */
    DocMapping getDocMappingByDocIdXpath(@Param("docId") String docId, @Param("xpath") String xpath);
    
    
    
    /**
     * 根据文档id和fieldId获取文档映射
     * @param docId
     * @param fieldId
     * @return
     * @author 陈阵 
     * @date 2013-9-9 上午11:03:31
     */
    List<DocMapping> getDocMappingByDocIdAndFieldId(@Param("docId") String docId, @Param("fieldId") String fieldId);
      

	/**
	 * @author caixl
	 * @date Jul 3, 2013
	 * @description TODO 删除文档相关的元数据节点
	 * @param docId
	 * @return int
	 */
	int deleteByDocId(@Param("docId")String docId);

	/**
	 * @author caixl
	 * @date Jul 3, 2013
	 * @description TODO 获取所有节点的标识
	 * @param docId
	 * @return List<String>
	 */
	List<String> getMapIdsByDocId(@Param("docId")String docId);

	/**
	 * @author caixl
	 * @date Jul 4, 2013
	 * @description TODO 批量插入映射关系
	 * @param list
	 * @return int
	 */
	int insertBatch(List<DocMapping> list);

	/**
	 * @author caixl
	 * @date Jul 4, 2013
	 * @description TODO 获取文档的所有映射节点
	 * @param id
	 * @return List<TreeInfo>
	 */
	List<TreeInfo> getInfoByDoc(@Param("docId")String id);

	/**
	 * @author caixl
	 * @date Jul 11, 2013
	 * @description TODO 获取文档相关元数据映射数目
	 * @param id
	 * @return int
	 */
	int getCountDocMapByDocId(@Param("docId")String id);

	/**
	  * @Title: updateMappingByPrimaryKey 
	  * @Description: 根据主键id，更新映射信息
	  * @author LinBin
	  * @param obj
	  * @return
	  * @throws
	 */
	int updateMappingByPrimaryKey(DocMapping obj);
}