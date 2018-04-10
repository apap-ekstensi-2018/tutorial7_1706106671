package com.tutorial07.consumer.dao;

import java.util.List;

import com.tutorial07.consumer.model.StudentModel;

public interface StudentDAO {
	StudentModel selectStudent(String npm);
	List<StudentModel>  selectAllStudents();
}
