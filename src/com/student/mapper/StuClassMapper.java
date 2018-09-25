package com.student.mapper;


import com.student.pojo.StuClass;
import com.student.pojo.StuClassExample;

import java.util.List;

public interface StuClassMapper {
	
	int deleteById(String classId);
	// 统计个数
	List<StuClass> list();
		
    int deleteByPrimaryKey(Integer classId);

    int insert(StuClass record);

    int insertSelective(StuClass record);

    List<StuClass> selectByExampleWithBLOBs(StuClassExample example);
    

    List<StuClass> selectByExample(StuClassExample example);

    StuClass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(StuClass record);

    int updateByPrimaryKeyWithBLOBs(StuClass record);

    int updateByPrimaryKey(StuClass record);
}