package com.learningDataJPa.Spring_Data_Jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	private Integer credits;
	
	@ManyToOne(targetEntity=Teacher.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(referencedColumnName="teacherId",name="Teacher_Id"
			)
	private Teacher teacher;

}
