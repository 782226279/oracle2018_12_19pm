package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CourseMapper;
import com.pojo.Course;

//service接口的实现类
@Service
public class CourseServiceImp implements CourseService {

	@Resource(name = "courseMapper")
	CourseMapper courseMapper;// 依赖dao接口

	@Override
	public List<Course> getPageCourse(int startindex, int pagenum) {
		// 调用dao层获取数据
		return courseMapper.getPageCourse(startindex, pagenum);
		// return null;
	}

}
