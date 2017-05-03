package com.eryuzhisen.model.config;

import java.io.Serializable;
import java.util.Date;

public class ModuleConfig implements Serializable{

    /**  */
    private static final long serialVersionUID = 163430867031467610L;

    private int id;
    private String pageId;
    private String moduleId;
    //是否可用 0 可用 1 不可用
    private short available;
    private Date createTime;
    private Date updateTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPageId() {
        return pageId;
    }
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    public String getModuleId() {
        return moduleId;
    }
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
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
