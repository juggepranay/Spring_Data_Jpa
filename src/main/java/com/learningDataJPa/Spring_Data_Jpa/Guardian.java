package com.learningDataJPa.Spring_Data_Jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {
	
	private String guardianName;
	private String email;
	@Id
	private String mobile;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Student student;
	
	


}
