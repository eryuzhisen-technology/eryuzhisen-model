package com.eryuzhisen.model.config;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author huangmiao
 * @version $Id: Banner.java, v 0.1 2017年2月27日 下午12:53:32 huangmiao Exp $
 */
public class Banner implements Serializable{
	/**  */
	private static final long serialVersionUID = -2009753582524127196L;
	private int id;
	private String bannerTitle;
	private String bannerDesc;
	private String bannerImg;
	private String clientVersion;
	private short clientType;
	private String jump;
	private short available;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBannerTitle() {
		return bannerTitle;
	}
	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}
	public String getBannerDesc() {
		return bannerDesc;
	}
	public void setBannerDesc(String bannerDesc) {
		this.bannerDesc = bannerDesc;
	}
	public String getBannerImg() {
		return bannerImg;
	}
	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getClientVersion() {
		return clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	public short getClientType() {
		return clientType;
	}
	public void setClientType(short clientType) {
		this.clientType = clientType;
	}
    public String getJump() {
        return jump;
    }
    public void setJump(String jump) {
        this.jump = jump;
    }
    public short getAvailable() {
        return available;
    }
    public void setAvailable(short available) {
        this.available = available;
    }
}
