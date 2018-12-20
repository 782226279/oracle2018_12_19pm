package com.service;

import java.util.List;

import com.pojo.Course;

//Course业务层接口
public interface CourseService {

	/**
	 * 查询分页的Course
	 * 
	 * @param startindex
	 *            从第几条开始显示
	 * @param pagenum
	 *            每页的条数
	 * @return 返回分页的Course集合
	 */
	List<Course> getPageCourse(int startindex, int pagenum);
}
