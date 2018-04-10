package com.tutorial07.producer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial07.producer.model.StudentModel;
import com.tutorial07.producer.service.StudentService;

@RestController
@RequestMapping("/rest")
public class StudentRestController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student/view/{npm}")
	public StudentModel view(@PathVariable(value="npm") String npm) {
		StudentModel student = studentService.selectStudent(npm);
		return student;
	}
	
}
