package com.learningDataJPa.Spring_Data_Jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;

	@PostMapping("student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);

	}
	
	@PostMapping("course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
}
