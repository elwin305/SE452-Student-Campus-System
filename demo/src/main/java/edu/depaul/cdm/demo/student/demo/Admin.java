package edu.depaul.cdm.demo.student.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ADMINS")
public class Admin {

	@Id
    @GeneratedValue
    @Column(name = "ADMIN_ID")
    private int admin_id;
	
	@Column(name = "FIRST_NAME")
    private String firstName;
	
	@Column(name = "LAST_NAME")
    private String lastName;
	
	//Constructor
    public Admin(int admin_id, String firstName, String lastName) {
		super();
		this.admin_id = admin_id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Methods
	
	private boolean editCourse(){
        return false;
    }
    private boolean teachersTakeCourse(String tid, Integer cid){
        return true;
    }
    private boolean teachersDropCourse(String tid, Integer cid){
        return true;
    }
    private boolean editGrade(){
        return false;
    }
    private boolean studentsTakeCourse(String sid, Integer cid){
        return true;
    }
    private boolean studentsDropCourse(String sid, Integer cid){
        return true;
    }
    private boolean editBill(){
        return false;
    }
}
