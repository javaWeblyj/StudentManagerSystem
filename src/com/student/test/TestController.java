package com.student.test;



import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.student.pojo.SysManager;
import com.student.service.StuClassService;
import com.student.service.SysManagerService;

public class TestController {
	
	@Autowired
	SysManagerService sysManagerService;
	
	@Resource
	private StuClassService stuClassService;
	
	@Test
	public void helloStuClass() {
		stuClassService.deleteByPrimaryKey(2015250601);
	}
	
	@Test
	public void hello() {
		SysManager sm = sysManagerService.selectByPrimaryKey("201525060113");
		System.out.println(sm);
	}
}
