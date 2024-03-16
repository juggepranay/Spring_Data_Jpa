package com.learningDataJPa.Spring_Data_Jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	


	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
