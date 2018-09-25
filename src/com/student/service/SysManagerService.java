package com.student.service;

import java.util.List;
import java.util.Map;

import com.student.pojo.SysManager;
import com.student.pojo.SysManagerExample;

public interface SysManagerService {
	
	// 插入数据记录
	int add(SysManager record);
	
	// 统计个数
	List<SysManager> list();
	
	// 更新登陆时间
	int updateLogin(SysManager record);
	
	SysManager login(Map<String, String> map);

	int deleteByPrimaryKey(String manId);

    int insert(SysManager record);

    int insertSelective(SysManager record);

    List<SysManager> selectByExample(SysManagerExample example);

    SysManager selectByPrimaryKey(String manId);

    int updateByPrimaryKeySelective(SysManager record);

    int updateByPrimaryKey(SysManager record);
}
