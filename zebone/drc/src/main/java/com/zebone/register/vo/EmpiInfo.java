package com.zebone.register.vo;

public class EmpiInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.ID_
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.MAIN_ID
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String mainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.DOC_ORG
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String docOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.SYSTEM_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String systemType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.CARD_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String cardType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.CARD_NO
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.DOCTOR_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String doctorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.DOC_DEPT_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String docDeptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.ICD_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    private String icdCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column R_EMPI_INFO.HEALTH_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    //卫生服务活动
    private String healthCode;

    //活动时间
    private String activeTime;

    //患者姓名
    private String name;

    //发卡单位
    private String cardOrg;
    
    public String getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.ID_
     *
     * @param id the value for R_EMPI_INFO.ID_
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.MAIN_ID
     *
     * @return the value of R_EMPI_INFO.MAIN_ID
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.MAIN_ID
     *
     * @param mainId the value for R_EMPI_INFO.MAIN_ID
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.DOC_ORG
     *
     * @return the value of R_EMPI_INFO.DOC_ORG
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getDocOrg() {
        return docOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.DOC_ORG
     *
     * @param docOrg the value for R_EMPI_INFO.DOC_ORG
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setDocOrg(String docOrg) {
        this.docOrg = docOrg == null ? null : docOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.SYSTEM_TYPE
     *
     * @return the value of R_EMPI_INFO.SYSTEM_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.SYSTEM_TYPE
     *
     * @param systemType the value for R_EMPI_INFO.SYSTEM_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.CARD_TYPE
     *
     * @return the value of R_EMPI_INFO.CARD_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.CARD_TYPE
     *
     * @param cardType the value for R_EMPI_INFO.CARD_TYPE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.CARD_NO
     *
     * @return the value of R_EMPI_INFO.CARD_NO
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.CARD_NO
     *
     * @param cardNo the value for R_EMPI_INFO.CARD_NO
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.DOCTOR_CODE
     *
     * @return the value of R_EMPI_INFO.DOCTOR_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.DOCTOR_CODE
     *
     * @param doctorCode the value for R_EMPI_INFO.DOCTOR_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode == null ? null : doctorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.DOC_DEPT_CODE
     *
     * @return the value of R_EMPI_INFO.DOC_DEPT_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getDocDeptCode() {
        return docDeptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.DOC_DEPT_CODE
     *
     * @param docDeptCode the value for R_EMPI_INFO.DOC_DEPT_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setDocDeptCode(String docDeptCode) {
        this.docDeptCode = docDeptCode == null ? null : docDeptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.ICD_CODE
     *
     * @return the value of R_EMPI_INFO.ICD_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getIcdCode() {
        return icdCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.ICD_CODE
     *
     * @param icdCode the value for R_EMPI_INFO.ICD_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode == null ? null : icdCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column R_EMPI_INFO.HEALTH_CODE
     *
     * @return the value of R_EMPI_INFO.HEALTH_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public String getHealthCode() {
        return healthCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column R_EMPI_INFO.HEALTH_CODE
     *
     * @param healthCode the value for R_EMPI_INFO.HEALTH_CODE
     *
     * @mbggenerated Thu Aug 08 15:59:28 CST 2013
     */
    public void setHealthCode(String healthCode) {
        this.healthCode = healthCode == null ? null : healthCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardOrg() {
        return cardOrg;
    }

    public void setCardOrg(String cardOrg) {
        this.cardOrg = cardOrg == null ? null : cardOrg.trim();
    }
}