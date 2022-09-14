package com.project.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Appointment")
public class UserAppointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int appointmentid;
private String  Patientname;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "doc_id")
private Doctor doctor;
private String symptoms;
private String date;
private String time;
public int getAppointmentid() {
	return appointmentid;
}
public void setAppointmentid(int appointmentid) {
	this.appointmentid = appointmentid;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}

public String getPatientname() {
	return Patientname;
}
public void setPatientname(String patientname) {
	Patientname = patientname;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public String getSymptoms() {
	return symptoms;
}
public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
