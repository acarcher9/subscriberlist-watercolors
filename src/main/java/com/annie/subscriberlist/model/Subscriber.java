package com.annie.subscriberlist.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// we created a new class (object) called Subscriber. This lays out the data we will be collecting for the database

// @Entity is what creates the Subscriber table
@Entity
public class Subscriber {

//	@Id lets Spring know this is our Id (using primary keys)
	
//	@GeneratedValue tells Spring that there will be an automated shift to the Id
	
//	@GenerationType.AUTO specifies that our Id will be automatically generated. **this is also why we didn't select "id" for our constructor or our getters and setters.**
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private Date signedUp;
	
//	constructor (omitting id)
	public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.signedUp = signedUp;
	}

//	getters and setters (omitting id)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

//	generated toString method (including Id!)
	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", signedUp=" + signedUp + "]";
	}
	

	
	
}
