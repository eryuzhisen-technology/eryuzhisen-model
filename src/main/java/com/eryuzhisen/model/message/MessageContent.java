package com.eryuzhisen.model.message;

public class MessageContent {
    private String title;
    private String cite;
    private String media_url;
    private String content;
    public String getCite() {
        return cite;
    }
    public void setCite(String cite) {
        this.cite = cite;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMedia_url() {
        return media_url;
    }
    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }
    
}
