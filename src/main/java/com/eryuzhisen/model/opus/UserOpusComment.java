package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusComment implements Serializable{

	/**  */
	private static final long serialVersionUID = 6329188899443603854L;
	
	private long id;
	private long userId;
	private int catalogId;
	private int chapterId;
	private long toCommentId;
	private long toReplyCommentId;
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
	public long getToCommentId() {
		return toCommentId;
	}
	public void setToCommentId(long toCommentId) {
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
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}
    public long getToReplyCommentId() {
        return toReplyCommentId;
    }
    public void setToReplyCommentId(long toReplyCommentId) {
        this.toReplyCommentId = toReplyCommentId;
    }
	
}
