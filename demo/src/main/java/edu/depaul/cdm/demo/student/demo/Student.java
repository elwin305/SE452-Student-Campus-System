package edu.depaul.cdm.demo.student.demo;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private int student_id;
    
	@Column(name = "FIRST_NAME")
    private String firstName;
	
	@Column(name = "LAST_NAME")
    private String lastName;
	
	@Column(name = "U_PASS")
	private int uPass;
	
	@Column(name = "CREDITS_TAKEN")
	private int credits;
	
	//Constructor
	
    public Student(int student_id, String firstName, String lastName, int upass, int credits) {
		super();
		this.student_id = student_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.uPass = upass;
		this.credits = credits;
	}
	
	//Methods

	private boolean studentsTakeCourse(String sid, Integer cid){
        return true;
    }
    private boolean studentsDropCourse(String sid, Integer cid){
        return true;
    }
    private boolean payBill(){
        return false;
    }

}
