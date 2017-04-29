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
	private String catalogCoverUrl;
	private String catalogLabel;
	private short catalogStatus;
	private int catalogSort;
	private int commentCount;
	private int praiseCount;
	private short auditStatus;
	private String auditRemark;
	private short level;
	private short deleteFlag;
	//0 默认 1 热门 2 优秀
	private short catalogType;
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
    public int getCatalogSort() {
        return catalogSort;
    }
    public void setCatalogSort(int catalogSort) {
        this.catalogSort = catalogSort;
    }
    public String getCatalogCoverUrl() {
        return catalogCoverUrl;
    }
    public void setCatalogCoverUrl(String catalogCoverUrl) {
        this.catalogCoverUrl = catalogCoverUrl;
    }
    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    public int getPraiseCount() {
        return praiseCount;
    }
    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
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
    public short getLevel() {
        return level;
    }
    public void setLevel(short level) {
        this.level = level;
    }
    public short getDeleteFlag() {
        return deleteFlag;
    }
    public void setDeleteFlag(short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    public short getCatalogType() {
        return catalogType;
    }
    public void setCatalogType(short catalogType) {
        this.catalogType = catalogType;
    }
}
