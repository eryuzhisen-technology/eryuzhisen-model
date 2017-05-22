package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusAuthorize implements Serializable {

    /**  */
    private static final long serialVersionUID = -2927408491273001085L;
    
    private int id;
    private int catalogId;
    private String originalTitle;
    private String originalAuthor;
    private String originalUrl;
    private String authorizedImgUrl;
    private Date createTime;
    private Date updateTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCatalogId() {
        return catalogId;
    }
    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
    public String getOriginalAuthor() {
        return originalAuthor;
    }
    public void setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor;
    }
    public String getOriginalUrl() {
        return originalUrl;
    }
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
    public String getAuthorizedImgUrl() {
        return authorizedImgUrl;
    }
    public void setAuthorizedImgUrl(String authorizedImgUrl) {
        this.authorizedImgUrl = authorizedImgUrl;
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
