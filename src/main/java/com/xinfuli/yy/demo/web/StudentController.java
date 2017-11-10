package com.xinfuli.yy.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xinfuli.yy.demo.common.CommonResult;
import com.xinfuli.yy.demo.configuration.NumberConfiguration;
import com.xinfuli.yy.demo.service.StudentService;


/**
 * 
 * @ClassName: StudentController 
 * @Description: TODO
 * @author ilidan_Y
 * @date 2017年10月18日 上午10:01:41 
 *
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private NumberConfiguration numberConfiguration;
	
	@RequestMapping(value="/insertStudent",method=RequestMethod.GET)
	public CommonResult insertStudent(){
		return studentService.insert();
	}
	
	@RequestMapping(value="/getStudentById",method=RequestMethod.GET)
	public CommonResult getStudentById(){
		return studentService.findStudentById("");
	}
	
	@RequestMapping(value="/getRandomNumber",method=RequestMethod.GET)
	public CommonResult getRandomNumber(){
		return new CommonResult(numberConfiguration);
	}
}
