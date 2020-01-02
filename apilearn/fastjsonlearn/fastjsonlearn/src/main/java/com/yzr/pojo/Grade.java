package com.yzr.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

public class Grade {
	private Long id;
	private String name;
	private List<Student> list = new ArrayList<Student>();
	
	public Grade() {
		super();
	}

	public Grade(Long id, String name, List<Student> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

	public void addStudent(Student student) {
		list.add(student);
	}
	
}