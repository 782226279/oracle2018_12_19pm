package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Student;
import com.service.StudentService;

//测试controller
@Controller
public class TestController {

	// @Resource(name = "studentServiceImp") 等价于StudentService
	// studentService=new StudentServiceImp();
	@Resource(name = "studentServiceImp")
	StudentService studentService;// service层的接口

	@RequestMapping("/test")
	public String test(HttpServletRequest request) {
		// 调用service相关的方法
		List<Student> list = studentService.getAllStudent();// 调用service层的方法，获取所有的Strudeng对象

		request.setAttribute("list", list);
		return "a";
	}
}
