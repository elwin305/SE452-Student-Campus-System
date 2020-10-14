package edu.depaul.cdm.demo.student.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PAYMENTS")
public class Payment {

	@Id
	@GeneratedValue
	@Column(name = "PAYMENT_ID")
	private long paymentID;
	
	@Column(name = "TUITION_ID")
	private int tuitionID;
	
	@Column(name = "AMOUNT_PAID")
	private float paid;

	//Constructor
	
	public Payment(long paymentID, int tuitionID, float paid) {
		super();
		this.paymentID = paymentID;
		this.tuitionID = tuitionID;
		this.paid = paid;
	}
	
	
	
}
