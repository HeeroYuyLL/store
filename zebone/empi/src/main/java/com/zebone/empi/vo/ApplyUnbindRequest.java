package com.zebone.empi.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 主索引解绑申请参数对象
 *
 * @author 杨英
 * @version 2014-8-4 下午2:28
 */
@XStreamAlias("request")
public class ApplyUnbindRequest {
    //姓名
    private String name;
    //性别
    private String sex;
    //民族
    private String nation;
    //出生日期
    @XStreamAlias("birthday")
    private String strBirthday;
    //户籍地址
    @XStreamAlias("permanent_address")
    private String permanentAddress;
    //照片信息
    @XStreamAlias("photo")
    private String strPhoto;
    //申请机构
    private String orgCode;
    //一级标识类型
    @XStreamAlias("first_cardType")
    private String firstCardType;
    //一级标识号
    @XStreamAlias("first_cardNo")
    private String firstCardNo;
    //二级标识类型
    @XStreamAlias("sec_cardType")
    private String secCardType;
    //二级标识号
    @XStreamAlias("sec_cardNo")
    private String secCardNo;
    //二级标识发卡机构
    @XStreamAlias("sec_cardOrg")
    private String secCardOrg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStrBirthday() {
        return strBirthday;
    }

    public void setStrBirthday(String strBirthday) {
        this.strBirthday = strBirthday;
    }

    public String getStrPhoto() {
        return strPhoto;
    }

    public void setStrPhoto(String strPhoto) {
        this.strPhoto = strPhoto;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getFirstCardType() {
        return firstCardType;
    }

    public void setFirstCardType(String firstCardType) {
        this.firstCardType = firstCardType;
    }

    public String getFirstCardNo() {
        return firstCardNo;
    }

    public void setFirstCardNo(String firstCardNo) {
        this.firstCardNo = firstCardNo;
    }

    public String getSecCardType() {
        return secCardType;
    }

    public void setSecCardType(String secCardType) {
        this.secCardType = secCardType;
    }

    public String getSecCardNo() {
        return secCardNo;
    }

    public void setSecCardNo(String secCardNo) {
        this.secCardNo = secCardNo;
    }

    public String getSecCardOrg() {
        return secCardOrg;
    }

    public void setSecCardOrg(String secCardOrg) {
        this.secCardOrg = secCardOrg;
    }
}
