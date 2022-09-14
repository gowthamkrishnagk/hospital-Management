package com.project.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private int id;
private String UserName;
private String dob;
private long phone;
private String email;
private String password;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="appointmentid",referencedColumnName = "appointmentid")
private UserAppointment userAppointment;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
