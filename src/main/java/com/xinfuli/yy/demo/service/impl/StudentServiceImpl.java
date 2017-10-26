package com.xinfuli.yy.demo.service.impl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinfuli.yy.demo.domain.Student;
import com.xinfuli.yy.demo.mapper.StudentMapper;
import com.xinfuli.yy.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private static final String[] LASTNAME = { "赵", " 钱", "孙", " 李", "周", " 吴",
			"郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", " 杨" };
	private static final String[] FIRSTNAME = { "忆柏", "访琴", "秋枫", "含蓝", "映岚",
			"白萍", "亦双", "若柳", "诗蓝", "安易", "痴海", "又灵", "水琴", "凡真", "怀云", "飞蕾",
			"新巧", "觅梅" };
	private static final String[] ADDRESS = { "广粤路广中路53弄小区4号201", "宝山共富新村",
			"闸北珠江创意中心", "金桥金东名苑", "浦东塘桥", "长寿路陕西北路财富大厦" };
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student findStudentById(String id) {
		Student student = new Student();
		student.setUsername("王五");
		student.setAge(21);
		student.setScore("78");
		student.setAddress("浦东新区塘桥");
		return student;
	}

	@Override
	@Transactional
	public void insert() {
		Student student = new Student();
		Random random = new Random();
		String id = UUID.randomUUID().toString().replace("-", "");
		student.setId(id);
		student.setUsername(LASTNAME[random.nextInt(15)]+FIRSTNAME[random.nextInt(17)]);
		student.setAge(random.nextInt(100)+1);
		student.setScore(random.nextInt(99)+1+"");
		student.setAddress(ADDRESS[random.nextInt(5)]);
		studentMapper.insert(student);
	}

}
