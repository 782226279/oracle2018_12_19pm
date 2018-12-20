package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;
import com.service.StudentService;

public class Test {
	public static void main(String[] args) {
		// 模拟当前类是控制器
		// 测试spring整合mybatis
		// 调用service层 只要从spring容器里面获取service对象
		ApplicationContext acx = new ClassPathXmlApplicationContext(
				"spring-dao.xml");// 加载spring容器

		StudentService ss = (StudentService) acx.getBean("studentServiceImp");// 获取service层接口
		Student record = new Student();
		record.setName("yy");
		ss.insert(record);

		// List<Student> list = ss.getAllStudent();
		// for (Student stu : list) {
		// System.out.println(stu.getId() + "\t" + stu.getName());
		// }

	}
}
