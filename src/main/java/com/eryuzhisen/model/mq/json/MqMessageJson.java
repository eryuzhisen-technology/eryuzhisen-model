package com.eryuzhisen.model.mq.json;

public class MqMessageJson {
    private String msg_type;//1 点赞 2 评论 3 关注 4 收藏 5 审核 6 浏览
    private String master_user_id;
    private String user_id;
    private String catalog_id;
    private String chapter_id;
    private String comment;
    private String comment_id;
    private String to_reply_comment_id;
    public String getMaster_user_id() {
        return master_user_id;
    }
    public void setMaster_user_id(String master_user_id) {
        this.master_user_id = master_user_id;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getCatalog_id() {
        return catalog_id;
    }
    public void setCatalog_id(String catalog_id) {
        this.catalog_id = catalog_id;
    }
    public String getChapter_id() {
        return chapter_id;
    }
    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment_id() {
        return comment_id;
    }
    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }
    public String getTo_reply_comment_id() {
        return to_reply_comment_id;
    }
    public void setTo_reply_comment_id(String to_reply_comment_id) {
        this.to_reply_comment_id = to_reply_comment_id;
    }
    public String getMsg_type() {
        return msg_type;
    }
    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }
    
}
