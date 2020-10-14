package edu.depaul.cdm.demo.student.demo;

import lombok.Data;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "COURSES")
public class Course {

	@Id
    @GeneratedValue
    private int Course_ID;
	@Column(name = "SHORT_NAME")
	private String shortName;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DEPARTMENT")
	private String dept;
	@Column(name = "CREDITS")
	private int credits;
	@Column(name = "GRADUATE")
	private boolean graduate;
	
	//Constructor
	public Course(int course_ID, String shortName, String name, String dept, int credits, boolean graduate) {
		super();
		Course_ID = course_ID;
		this.shortName = shortName;
		this.name = name;
		this.dept = dept;
		this.credits = credits;
		this.graduate = graduate;
	}

	//methods
	
    private boolean editCourse(){
        return false;
    }

}
