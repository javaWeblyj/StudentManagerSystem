package com.student.pojo;

public class StuClass {
	private Integer class_id;
	private String class_name;
	private String class_introduce;

	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_introduce() {
		return class_introduce;
	}
	public void setClass_introduce(String class_introduce) {
		this.class_introduce = class_introduce;
	}
	@Override
	public String toString() {
		return "StuClass [class_id=" + class_id + ", class_name=" + class_name + ", class_introduce=" + class_introduce
				+ "]";
	}
	
}
