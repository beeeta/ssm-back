package com.huawei.model;

import java.sql.Time;

/**
 * person 实体
 * @author Administrator
 *
 */
public class Person {

    private int id;
    private String name;
    private String grade;
    private Time createTime;
    private Time updateTime;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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