package com.yzr.learn;

import com.alibaba.fastjson.JSON;
import com.yzr.pojo.Grade;
import com.yzr.pojo.Student;

public class MainTest {
	public static void main(String[] args) {
		
		Grade grade = new Grade();
		grade.setId(0L);
		grade.setName("admin");
		
		Student student = new Student();
		student.setId(2L);
		student.setName("guest");
		
		Student rootUser = new Student();
		student.setId(3L);
		student.setName("root");
		
		grade.addStudent(student);
		grade.addStudent(rootUser);
		
		String jsonString = JSON.toJSONString(grade);
		System.out.println("json字符串 ： " + jsonString);
		
		// 转换为对象  bean
		Grade grade2 = JSON.parseObject(jsonString, Grade.class);
		System.out.println("JavaBean对象:" + grade2);
		
		
	}
}
