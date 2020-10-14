package edu.depaul.cdm.demo.student.demo;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PROFESSORS")
public class Professor {

	@Id
	@GeneratedValue
	@Column(name = "PROFESSOR_ID")
    private int Professor_ID;
	
	@Column(name = "FIRST_NAME")
    private String firstName;
	
	@Column(name = "LAST_NAME")
    private String lastName;

	//Constructor
	
	public Professor(int professor_ID, String firstName, String lastName) {
		super();
		Professor_ID = professor_ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Methods
	
    private boolean teachersTakeCourse(String tid, Integer cid){
        return true;

  }
	private boolean teachersDropCourse(String tid, Integer cid){
        return true;
    }
    private boolean giveGrade(){
        return false;
    }
}
