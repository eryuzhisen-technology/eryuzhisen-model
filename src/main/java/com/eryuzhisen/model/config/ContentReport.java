package com.eryuzhisen.model.config;

import java.io.Serializable;

public class ContentReport implements Serializable{

    /**  */
    private static final long serialVersionUID = -2702255815831215819L;
    private int id;
    private short contentType;
    private String text;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public short getContentType() {
        return contentType;
    }
    public void setContentType(short contentType) {
        this.contentType = contentType;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    
}
