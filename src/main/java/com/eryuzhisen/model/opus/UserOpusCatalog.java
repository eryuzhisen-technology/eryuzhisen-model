package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusCatalog implements Serializable{

	/**  */
	private static final long serialVersionUID = -3236452378211951099L;

	private int id;
	private long userId;
	private int categoryId;
	private String catalogTitle;
	private String catalogDesc;
	private String catalogLabel;
	private short catalogStatus;
	private Date createtime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCatalogTitle() {
		return catalogTitle;
	}
	public void setCatalogTitle(String catalogTitle) {
		this.catalogTitle = catalogTitle;
	}
	public String getCatalogDesc() {
		return catalogDesc;
	}
	public void setCatalogDesc(String catalogDesc) {
		this.catalogDesc = catalogDesc;
	}
	public String getCatalogLabel() {
		return catalogLabel;
	}
	public void setCatalogLabel(String catalogLabel) {
		this.catalogLabel = catalogLabel;
	}
	public short getCatalogStatus() {
		return catalogStatus;
	}
	public void setCatalogStatus(short catalogStatus) {
		this.catalogStatus = catalogStatus;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
