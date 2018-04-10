package com.tutorial07.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial07.consumer.dao.StudentMapper;
import com.tutorial07.consumer.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;


    public StudentServiceDatabase() {
    	
    }
    
    public StudentServiceDatabase(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public boolean addStudent (StudentModel student)
    {
        return studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    		log.info("student"+npm+"deleted.");
    		studentMapper.deleteStudent(npm);
    }


	@Override
	public void updateStudent(StudentModel student) {
		log.info("student"+student.getNpm()+"updated.");
		studentMapper.updateStudent(student);
	}

}
