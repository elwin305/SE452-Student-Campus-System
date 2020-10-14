package edu.depaul.cdm.demo.student.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ENROLLMENT")
public class Enrollment {
	
	@Id
	@Column(name = "CLASS_ID")
	private int classID;
	
	@Id
	@Column(name = "STUDENT_ID")
	private int studentID;

	//Constructor
	public Enrollment(int classID, int studentID) {
		super();
		this.classID = classID;
		this.studentID = studentID;
	}
}
