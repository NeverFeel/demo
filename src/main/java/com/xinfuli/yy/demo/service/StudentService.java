package com.xinfuli.yy.demo.service;

import com.xinfuli.yy.demo.domain.Student;

public interface StudentService {
	
	/**
	 * 
	 * @Title: findStudentById 
	 * @Description: 根据学生id查找 
	 * @param @param id
	 * @param @return  参数说明 
	 * @return Student    返回类型 
	 * @throws
	 */
	Student findStudentById(String id);

}
