package com.saurabh.hibernate.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
    @Id
    @GeneratedValue
    @Column(name="id")
	private int userId;
    @Column(name="username")
	private String userName;
    @Embedded //optional
    @AttributeOverrides({
    	@AttributeOverride(name="street",column=@Column(name="home_street")),
    	@AttributeOverride(name="city",column=@Column(name="home_city")),
    	@AttributeOverride(name="state",column=@Column(name="home_state")),
    	@AttributeOverride(name="pincode",column=@Column(name="home_pincode"))
    	
    })
    private Address homeAddress;
    private Address officeAddress;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	 
	
	
	
}
