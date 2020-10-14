package edu.depaul.cdm.demo.student.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CLASSES")
public class Class {

	@Id
	@GeneratedValue
	@Column(name = "CLASS_ID")
	private int class_ID;
	
	@Column(name = "COURSE_ID")
	private int course_ID;
	
	@Column(name = "PROFESSOR_ID")
	private int professor_ID;
	
	//Constructor
	
	public Class(int class_ID, int course_ID, int professor_ID) {
		super();
		this.class_ID = class_ID;
		this.course_ID = course_ID;
		this.professor_ID = professor_ID;
	}
	
	//Methods
	
	
}
