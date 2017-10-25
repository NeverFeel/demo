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
		student.setUsername("张三");
		student.setAge("20");
		student.setScore("98");
		student.setAddress("长寿路陕西北路财富大厦");
		return student;
	}

	@Override
	@Transactional
	public void insert() {
		Student student = new Student();
		String id = UUID.randomUUID().toString().replace("-", "");
		student.setId(id);
		student.setUsername("张三");
		student.setAge("20");
		student.setScore("98");
		student.setAddress("长寿路陕西北路财富大厦");
		studentMapper.insert(student);
	}

}
