package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusChapter implements Serializable{

	/**  */
	private static final long serialVersionUID = 2520825780716215923L;

	private int id;
	private long userId;
	private int catalogId;
	private int chapterIndex;
	private String chapterTitle;
	private String chapterDesc;
	private String chapterContent;
	private long praiseCount;
	private long commentCount;
	private short chapterStatus;
	private short auditStatus;
	private String auditRemark;
	private int wordsNum;
	private short deleteFlag;
	private Date createTime;
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
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}
	public String getChapterTitle() {
		return chapterTitle;
	}
	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}
	public String getChapterDesc() {
		return chapterDesc;
	}
	public void setChapterDesc(String chapterDesc) {
		this.chapterDesc = chapterDesc;
	}
	public String getChapterContent() {
		return chapterContent;
	}
	public void setChapterContent(String chapterContent) {
		this.chapterContent = chapterContent;
	}
	public long getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(long praiseCount) {
		this.praiseCount = praiseCount;
	}
	public long getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}
	public short getChapterStatus() {
		return chapterStatus;
	}
	public void setChapterStatus(short chapterStatus) {
		this.chapterStatus = chapterStatus;
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
    public int getChapterIndex() {
        return chapterIndex;
    }
    public void setChapterIndex(int chapterIndex) {
        this.chapterIndex = chapterIndex;
    }
    public short getAuditStatus() {
        return auditStatus;
    }
    public void setAuditStatus(short auditStatus) {
        this.auditStatus = auditStatus;
    }
    public String getAuditRemark() {
        return auditRemark;
    }
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }
    public short getDeleteFlag() {
        return deleteFlag;
    }
    public void setDeleteFlag(short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    public int getWordsNum() {
        return wordsNum;
    }
    public void setWordsNum(int wordsNum) {
        this.wordsNum = wordsNum;
    }
	
}
