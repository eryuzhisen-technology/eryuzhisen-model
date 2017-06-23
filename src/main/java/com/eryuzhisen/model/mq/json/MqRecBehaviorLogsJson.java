package com.eryuzhisen.model.mq.json;
/**
 *  参考https://help.aliyun.com/document_detail/54477.html?spm=5176.doc54472.6.581.hcwJAi
 * 
 * @author huangmiao
 * @version $Id: MqRecLogsJson.java, v 0.1 2017年6月22日 上午10:29:53 huangmiao Exp $
 */
public class MqRecBehaviorLogsJson extends MqRecLogsJson{
    private String bhv_type;
    private String user_id;
    private String act_obj;
    private String obj_type;
    private String trace_id;
    private String bhv_datetime;
    private String pos_type;
    private String position;
    private String env;
    private String plates;
    public String getBhv_type() {
        return bhv_type;
    }
    public void setBhv_type(String bhv_type) {
        this.bhv_type = bhv_type;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getAct_obj() {
        return act_obj;
    }
    public void setAct_obj(String act_obj) {
        this.act_obj = act_obj;
    }
    public String getObj_type() {
        return obj_type;
    }
    public void setObj_type(String obj_type) {
        this.obj_type = obj_type;
    }
    public String getTrace_id() {
        return trace_id;
    }
    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }
    public String getBhv_datetime() {
        return bhv_datetime;
    }
    public void setBhv_datetime(String bhv_datetime) {
        this.bhv_datetime = bhv_datetime;
    }
    public String getPos_type() {
        return pos_type;
    }
    public void setPos_type(String pos_type) {
        this.pos_type = pos_type;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEnv() {
        return env;
    }
    public void setEnv(String env) {
        this.env = env;
    }
    public String getPlates() {
        return plates;
    }
    public void setPlates(String plates) {
        this.plates = plates;
    }
}
