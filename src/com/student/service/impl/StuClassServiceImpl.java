package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.mapper.StuClassMapper;
import com.student.pojo.StuClass;
import com.student.pojo.StuClassExample;
import com.student.service.StuClassService;

@Service("stuClassService")
public class StuClassServiceImpl implements StuClassService {

	@Autowired
	StuClassMapper stuClassMapper;
	@Override
	public int deleteByPrimaryKey(Integer classId) {
		// TODO Auto-generated method stub
		return stuClassMapper.deleteByPrimaryKey(classId);
	}

	@Override
	public int insert(StuClass record) {
		// TODO Auto-generated method stub
		return stuClassMapper.insert(record);
	}

	@Override
	public int insertSelective(StuClass record) {
		// TODO Auto-generated method stub
		return stuClassMapper.insertSelective(record);
	}

	@Override
	public List<StuClass> selectByExampleWithBLOBs(StuClassExample example) {
		// TODO Auto-generated method stub
		return stuClassMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<StuClass> selectByExample(StuClassExample example) {
		// TODO Auto-generated method stub
		return stuClassMapper.selectByExample(example);
	}

	@Override
	public StuClass selectByPrimaryKey(Integer classId) {
		// TODO Auto-generated method stub
		return stuClassMapper.selectByPrimaryKey(classId);
	}

	@Override
	public int updateByPrimaryKeySelective(StuClass record) {
		// TODO Auto-generated method stub
		return stuClassMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(StuClass record) {
		// TODO Auto-generated method stub
		return stuClassMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(StuClass record) {
		// TODO Auto-generated method stub
		return stuClassMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<StuClass> list() {
		// TODO Auto-generated method stub
		return stuClassMapper.list();
	}

	@Override
	public int deleteById(String classId) {
		// TODO Auto-generated method stub
		return stuClassMapper.deleteById(classId);
	}



}
