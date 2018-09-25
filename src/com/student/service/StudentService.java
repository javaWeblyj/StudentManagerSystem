package com.student.service;

import java.util.List;

import com.student.pojo.Student;
import com.student.pojo.StudentExample;

public interface StudentService {
	
	List<Integer> listCID();
	
	List<Student> selectByCID(int id);

	// 逻辑删除
	int updateDelete(Student record);
	
	int update(Student record);
	
	int deleteByPrimaryKey(String stuId);

	int insert(Student record);
	
	int insertSelective(Student record);
	
	List<Student> selectByExampleWithBLOBs(StudentExample example);
	
	List<Student> selectByExample(StudentExample example);
	
	Student selectByPrimaryKey(String stuId);
	
	int updateByPrimaryKeySelective(Student record);
	
	int updateByPrimaryKeyWithBLOBs(Student record);
	
	int updateById(Student record);

	List<Student> list();
}
