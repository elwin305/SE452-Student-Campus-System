package edu.depaul.cdm.demo.student.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "TUITION")
public class TuitionBill {
	
	@Id
	@GeneratedValue
	@Column(name = "TUITION_ID")
	private int tuitionID;
	
	@Column(name = "STUDENT_ID")
	private int studentID;
	
	@Column(name = "MONEY_DUE")
	private float due;

	//Constructor
	
	public TuitionBill(int tuitionID, int studentID, float due) {
		super();
		this.tuitionID = tuitionID;
		this.studentID = studentID;
		this.due = due;
	}
	
	
}
