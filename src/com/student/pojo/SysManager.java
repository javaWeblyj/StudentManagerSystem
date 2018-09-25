package com.student.pojo;

import java.util.Date;

public class SysManager {
    private String man_id;

    private String man_psd;


	public String getMan_id() {
		return man_id;
	}

	public void setMan_id(String man_id) {
		this.man_id = man_id;
	}

	public String getMan_psd() {
		return man_psd;
	}

	public void setMan_psd(String man_psd) {
		this.man_psd = man_psd;
	}

	public String getMan_name() {
		return man_name;
	}

	public void setMan_name(String man_name) {
		this.man_name = man_name;
	}

	public Date getMan_login() {
		return man_login;
	}

	public void setMan_login(Date man_login) {
		this.man_login = man_login;
	}

	private String man_name;

    private Date man_login;

    @Override
    public String toString() {
    	return "SysManager [man_id=" + man_id + ", man_psd=" + man_psd + ", man_name=" + man_name + ", man_login="
    			+ man_login + "]";
    }
}