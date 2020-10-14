package edu.depaul.cdm.demo.student.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOGIN")
public class LoginInfo {

	@Id
	@GeneratedValue
	@Column (name = "LOGIN_ID")
	private int loginID;
	
	@Column (name = "PASSWORD")	
	private String password;
	
	@Column (name = "ACCESS_TYPE")
	private String accessType;
	
	@Column (name = "STUDENT_ID")
	private int studentID;
	
	//Constructor
	
	public LoginInfo(int loginID, String password, String accessType, int studentID) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.accessType = accessType;
		this.studentID = studentID;
	}

}
