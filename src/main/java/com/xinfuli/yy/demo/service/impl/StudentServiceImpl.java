package com.xinfuli.yy.demo.service.impl;

import org.springframework.stereotype.Service;

import com.xinfuli.yy.demo.domain.Student;
import com.xinfuli.yy.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student findStudentById(String id) {
		Student student = new Student();
		student.setUsername("张三");
		student.setAge("20");
		student.setScore("98");
		student.setAddress("长寿路陕西北路财富大厦");
		return student;
	}

}
