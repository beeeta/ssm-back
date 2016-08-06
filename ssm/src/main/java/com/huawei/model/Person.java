package com.huawei.model;

import java.sql.Time;

/**
 * person 实体
 * @author Administrator
 *
 */
public class Person {

    private int id;
    private String s_name;
    private String s_classId;
    private String s_age;
    private Time createTime;
    private Time updateTime;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_classId() {
		return s_classId;
	}
	public void setS_classId(String s_classId) {
		this.s_classId = s_classId;
	}
	public String getS_age() {
		return s_age;
	}
	public void setS_age(String s_age) {
		this.s_age = s_age;
	}
	public Time getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Time createTime) {
		this.createTime = createTime;
	}
	public Time getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Time updateTime) {
		this.updateTime = updateTime;
	}
    
}