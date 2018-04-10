package com.tutorial07.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tutorial07.consumer.dao.StudentDAO;
import com.tutorial07.consumer.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService{
	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public StudentModel selectStudent(String npm) {
		log.info("REST - select student with npm {}",npm);
		return studentDAO.selectStudent(npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		log.info("REST - select all students");
		return studentDAO.selectAllStudents();
	}

	@Override
	public boolean addStudent(StudentModel student) {
		return false;
	}

	@Override
	public void deleteStudent(String npm) {	
	}

	@Override
	public void updateStudent(StudentModel student) {
	}

}
