package com.zebone.docSub.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 文档订阅消息参数对象
 *
 * @author 杨英
 * @version 2014-8-12 下午2:15
 */
@XStreamAlias("docSubMsg")
public class DocSubMessage {
    //文档上传机构
    private String docOrg;
    private String empi;
    //文档类型
    private String docType;
    //文档版本号
    private String docVersion;
    //文档编号
    private String docNo;
    //活动时间
    private String activeTime;
    //文档具体内容
    private String docXml;

    public String getDocOrg() {
        return docOrg;
    }

    public void setDocOrg(String docOrg) {
        this.docOrg = docOrg;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public String getDocXml() {
        return docXml;
    }

    public void setDocXml(String docXml) {
        this.docXml = docXml;
    }

    public String getDocVersion() {
        return docVersion;
    }

    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }
}
