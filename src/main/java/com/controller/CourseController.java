package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Course;
import com.service.CourseService;

@Controller
public class CourseController {
	@Resource(name="courseServiceImp")
	CourseService courseService;

	@RequestMapping("/getpagecourse")
	public String getPageCourse(HttpServletRequest request,int page){//1   2  3
		
		int pagenum=2;
		
		List<Course> list=courseService.getPageCourse((page-1)*pagenum, pagenum);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		return "courselist";
	}
	
}

