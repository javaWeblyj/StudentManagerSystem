package com.student.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.mapper.SysManagerMapper;
import com.student.pojo.SysManager;
import com.student.pojo.SysManagerExample;
import com.student.service.SysManagerService;

@Service("sysManagerService")
public class SysManagerServiceImpl implements SysManagerService {
	
	@Autowired
	SysManagerMapper sysManagerMapper;
	
	@Override
	public SysManager login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sysManagerMapper.login(map);
	}

	@Override
	public int deleteByPrimaryKey(String manId) {
		// TODO Auto-generated method stub
		return sysManagerMapper.deleteByPrimaryKey(manId);
	}

	@Override
	public int insert(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.insert(record);
	}

	@Override
	public int insertSelective(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.insertSelective(record);
	}

	@Override
	public List<SysManager> selectByExample(SysManagerExample example) {
		// TODO Auto-generated method stub
		return sysManagerMapper.selectByExample(example);
	}

	@Override
	public SysManager selectByPrimaryKey(String manId) {
		// TODO Auto-generated method stub
		return sysManagerMapper.selectByPrimaryKey(manId);
	}

	@Override
	public int updateByPrimaryKeySelective(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateLogin(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.updateLogin(record);
	}

	@Override
	public List<SysManager> list() {
		// TODO Auto-generated method stub
		return sysManagerMapper.list();
	}

	@Override
	public int add(SysManager record) {
		// TODO Auto-generated method stub
		return sysManagerMapper.add(record);
	}


}
