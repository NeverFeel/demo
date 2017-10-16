package com.xinfuli.yy.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xinfuli.yy.demo.domain.Student;
import com.xinfuli.yy.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/getStudentById",method=RequestMethod.GET)
	public Student getStudentById(){
		return studentService.findStudentById("");
	}
	
}
