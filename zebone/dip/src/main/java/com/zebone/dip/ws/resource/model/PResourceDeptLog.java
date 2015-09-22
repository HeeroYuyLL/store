package com.zebone.dip.ws.resource.model;

public class PResourceDeptLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.ID_
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.DEPT_ID
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.DEPT_NAME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.DEPT_DESC
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String deptDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String orgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.PARENT_DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String parentDeptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.CREATE_TIME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.OPER_TYPE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String operType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.INPUT_ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String inputOrgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_RESOURCE_DEPT_LOG.INPUT_USER_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    private String inputUserCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.ID_
     *
     * @return the value of P_RESOURCE_DEPT_LOG.ID_
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */

    //市县区代码
    private String cityCode;
    //乡镇街道代码
    private String townCode;
    //村、社区代码
    private String communityCode;
    //医疗机构编码（嘉兴就诊卡医院编码）
    private String medicalOrgCode;
    //归类代码
    private String classifiedCode;
    //科室分类代码
    private String deptClassifyCode;
    //院内码
    private String hospInternalCode;
    //门诊住院编码
    private String clinicHospCode;


    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.ID_
     *
     * @param id the value for P_RESOURCE_DEPT_LOG.ID_
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.DEPT_ID
     *
     * @return the value of P_RESOURCE_DEPT_LOG.DEPT_ID
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.DEPT_ID
     *
     * @param deptId the value for P_RESOURCE_DEPT_LOG.DEPT_ID
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.DEPT_CODE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.DEPT_CODE
     *
     * @param deptCode the value for P_RESOURCE_DEPT_LOG.DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.DEPT_NAME
     *
     * @return the value of P_RESOURCE_DEPT_LOG.DEPT_NAME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.DEPT_NAME
     *
     * @param deptName the value for P_RESOURCE_DEPT_LOG.DEPT_NAME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.DEPT_DESC
     *
     * @return the value of P_RESOURCE_DEPT_LOG.DEPT_DESC
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.DEPT_DESC
     *
     * @param deptDesc the value for P_RESOURCE_DEPT_LOG.DEPT_DESC
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc == null ? null : deptDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.ORG_CODE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.ORG_CODE
     *
     * @param orgCode the value for P_RESOURCE_DEPT_LOG.ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.PARENT_DEPT_CODE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.PARENT_DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.PARENT_DEPT_CODE
     *
     * @param parentDeptCode the value for P_RESOURCE_DEPT_LOG.PARENT_DEPT_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode == null ? null : parentDeptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.CREATE_TIME
     *
     * @return the value of P_RESOURCE_DEPT_LOG.CREATE_TIME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.CREATE_TIME
     *
     * @param createTime the value for P_RESOURCE_DEPT_LOG.CREATE_TIME
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.OPER_TYPE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.OPER_TYPE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getOperType() {
        return operType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.OPER_TYPE
     *
     * @param operType the value for P_RESOURCE_DEPT_LOG.OPER_TYPE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.INPUT_ORG_CODE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.INPUT_ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getInputOrgCode() {
        return inputOrgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.INPUT_ORG_CODE
     *
     * @param inputOrgCode the value for P_RESOURCE_DEPT_LOG.INPUT_ORG_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setInputOrgCode(String inputOrgCode) {
        this.inputOrgCode = inputOrgCode == null ? null : inputOrgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_RESOURCE_DEPT_LOG.INPUT_USER_CODE
     *
     * @return the value of P_RESOURCE_DEPT_LOG.INPUT_USER_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public String getInputUserCode() {
        return inputUserCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_RESOURCE_DEPT_LOG.INPUT_USER_CODE
     *
     * @param inputUserCode the value for P_RESOURCE_DEPT_LOG.INPUT_USER_CODE
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    public void setInputUserCode(String inputUserCode) {
        this.inputUserCode = inputUserCode == null ? null : inputUserCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getMedicalOrgCode() {
        return medicalOrgCode;
    }

    public void setMedicalOrgCode(String medicalOrgCode) {
        this.medicalOrgCode = medicalOrgCode;
    }

    public String getClassifiedCode() {
        return classifiedCode;
    }

    public void setClassifiedCode(String classifiedCode) {
        this.classifiedCode = classifiedCode;
    }

    public String getDeptClassifyCode() {
        return deptClassifyCode;
    }

    public void setDeptClassifyCode(String deptClassifyCode) {
        this.deptClassifyCode = deptClassifyCode;
    }

    public String getHospInternalCode() {
        return hospInternalCode;
    }

    public void setHospInternalCode(String hospInternalCode) {
        this.hospInternalCode = hospInternalCode;
    }

    public String getClinicHospCode() {
        return clinicHospCode;
    }

    public void setClinicHospCode(String clinicHospCode) {
        this.clinicHospCode = clinicHospCode;
    }
}