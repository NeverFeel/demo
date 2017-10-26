package com.xinfuli.yy.demo.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinfuli.yy.demo.domain.Student;
import com.xinfuli.yy.demo.mapper.StudentMapper;
import com.xinfuli.yy.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student findStudentById(String id) {
		Student student = new Student();
		student.setUsername("李四");
		student.setAge("21");
		student.setScore("78");
		student.setAddress("浦东新区塘桥");
		return student;
	}

	@Override
	@Transactional
	public void insert() {
		Student student = new Student();
		String id = UUID.randomUUID().toString().replace("-", "");
		student.setId(id);
		student.setUsername("李四");
		student.setAge("21");
		student.setScore("78");
		student.setAddress("浦东新区塘桥");
		studentMapper.insert(student);
	}

}
