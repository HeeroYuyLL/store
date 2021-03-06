package com.isell.core.config.vo;

import java.util.Date;

/**
 * 接入系统信息
 * 
 * @author lilin
 * @version [版本号, 2015年7月22日]
 */
public class AccessSystem {
    /**
     * 主键id
     */
    private int id;
    
    /**
     * 接入系统名称
     */
    private String name;
    
    /**
     * 接入编码（由BIS统一分配给客户）
     */
    private String accessCode;
    
    /**
     * 系统私钥（由BIS统一分配给客户）
     */
    private String privateKey;
    
    /**
     * 接入系统外网ip
     */
    private String ip;
    
    /**
     * 接入系统域名
     */
    private String host;
    
    /**
     * 是否冻结
     */
    private boolean frozen;
    
    /**
     * 用户id
     */
    private Integer userId;
    
    /**
     * 酷店id
     */
    private String shopId;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    private int isgooddetail;
    private String sycstockurl;//推送库存url
    private String sycpriceurl;//推送价格url
    private String sycunaddurl;
    
    
    
    public String getSycunaddurl() {
		return sycunaddurl;
	}

	public void setSycunaddurl(String sycunaddurl) {
		this.sycunaddurl = sycunaddurl;
	}

	public String getSycstockurl() {
		return sycstockurl;
	}

	public void setSycstockurl(String sycstockurl) {
		this.sycstockurl = sycstockurl;
	}

	public String getSycpriceurl() {
		return sycpriceurl;
	}

	public void setSycpriceurl(String sycpriceurl) {
		this.sycpriceurl = sycpriceurl;
	}

	public AccessSystem() {
        
    }
    
    public AccessSystem(String accessCode, String privateKey, boolean frozen) {
        this.accessCode = accessCode;
        this.privateKey = privateKey;
        this.frozen = frozen;
    }
    
    public int getIsgooddetail() {
		return isgooddetail;
	}

	public void setIsgooddetail(int isgooddetail) {
		this.isgooddetail = isgooddetail;
	}

	public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAccessCode() {
        return accessCode;
    }
    
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    
    public String getIp() {
        return ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public boolean isFrozen() {
        return frozen;
    }
    
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }
    
    public String getPrivateKey() {
        return privateKey;
    }
    
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
