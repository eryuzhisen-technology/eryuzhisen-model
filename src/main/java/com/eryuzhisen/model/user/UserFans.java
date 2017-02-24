package com.eryuzhisen.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserFans implements Serializable{

	/**  */
	private static final long serialVersionUID = -8923776610451591393L;
	
	private long id;
	private long userId;
	private long fansUserId;
	private Date createTime;
	private Date updateTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getFansUserId() {
		return fansUserId;
	}
	public void setFansUserId(long fansUserId) {
		this.fansUserId = fansUserId;
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

}
