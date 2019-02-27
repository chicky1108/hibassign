package com.cg.project.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="Author")
public class Author implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @Column(name="authorId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int authorId;
 
    @Column(name="firstName")
    private String firstName;
 
    @Column(name="middleName")
    private String middleName;
 
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="phoneNo")
    private String phoneNo;
    public Author() 
    {
    	
    }
    
	public Author(String firstName, String middleName, String lastName, String phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return authorId;
	}

	public void setId(int id) {
		this.authorId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [authorid=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
}