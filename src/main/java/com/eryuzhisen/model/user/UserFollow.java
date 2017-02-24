package com.eryuzhisen.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserFollow implements Serializable{

	/**  */
	private static final long serialVersionUID = 3521383758031883215L;

	private long id;
	private long userId;
	private long followUserId;
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
	public long getFollowUserId() {
		return followUserId;
	}
	public void setFollowUserId(long followUserId) {
		this.followUserId = followUserId;
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
