package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.mapper.StudentMapper;
import com.student.pojo.Student;
import com.student.pojo.StudentExample;
import com.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentMapper studentMapper;

	@Override
	public int deleteByPrimaryKey(String stuId) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(stuId);
	}

	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.insert(record);
	}

	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.insertSelective(record);
	}

	@Override
	public List<Student> selectByExampleWithBLOBs(StudentExample example) {
		// TODO Auto-generated method stub
		return studentMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Student> selectByExample(StudentExample example) {
		// TODO Auto-generated method stub
		return studentMapper.selectByExample(example);
	}

	@Override
	public Student selectByPrimaryKey(String stuId) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(stuId);
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateById(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.updateById(record);
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return studentMapper.list();
	}

	@Override
	public int updateDelete(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.updateDelete(record);
	}

	@Override
	public int update(Student record) {
		// TODO Auto-generated method stub
		return studentMapper.update(record);
	}

	@Override
	public List<Student> selectByCID(int id) {
		// TODO Auto-generated method stub
		return studentMapper.selectByCID(id);
	}

	@Override
	public List<Integer> listCID() {
		// TODO Auto-generated method stub
		return studentMapper.listCID();
	}

}
