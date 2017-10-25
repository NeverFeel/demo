package com.xinfuli.yy.demo.mapper;

import org.apache.ibatis.annotations.Param;

import com.xinfuli.yy.demo.domain.Student;

public interface StudentMapper {
	
	void insert(@Param("student") Student student);

	void update(@Param("student") Student student);
	
}
