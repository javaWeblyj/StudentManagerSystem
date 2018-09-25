package com.student.mapper;

import com.student.pojo.Student;
import com.student.pojo.StudentExample;
import java.util.List;

public interface StudentMapper {
	
	List<Student> selectByCID(int id);
	
	List<Student> list();
	
	List<Integer> listCID();
	
	
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
    
}