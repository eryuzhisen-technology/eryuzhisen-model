package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusComment implements Serializable{

	/**  */
	private static final long serialVersionUID = 6329188899443603854L;
	
	private long id;
	private long userId;
	private int chapterId;
	private int toCommentId;
	private String comment;
	private int praiseCount;
	private short available;
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
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public int getToCommentId() {
		return toCommentId;
	}
	public void setToCommentId(int toCommentId) {
		this.toCommentId = toCommentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}
	public short getAvailable() {
		return available;
	}
	public void setAvailable(short available) {
		this.available = available;
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
