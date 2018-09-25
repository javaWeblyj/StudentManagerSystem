package com.student.pojo;

public class Student {
    private String stu_id;

    private Integer c_id;

    private String stu_name;

    private Integer stu_age;

    private String stu_sex;

    private Boolean stu_status;

    private String stu_address;

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Integer getStu_age() {
		return stu_age;
	}

	public void setStu_age(Integer stu_age) {
		this.stu_age = stu_age;
	}


	public String getStu_sex() {
		return stu_sex;
	}

	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}

	public Boolean getStu_status() {
		return stu_status;
	}

	public void setStu_status(Boolean stu_status) {
		this.stu_status = stu_status;
	}

	public String getStu_address() {
		return stu_address;
	}

	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", c_id=" + c_id + ", stu_name=" + stu_name + ", stu_age=" + stu_age
				+ ", stu_sex=" + stu_sex + ", stu_status=" + stu_status + ", stu_address=" + stu_address + "]";
	}


    
}