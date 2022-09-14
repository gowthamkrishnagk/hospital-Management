package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DoctorPrescription")
public class DoctorPrescription {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int prescriptionid;
private String patientName;
private Integer appointmentID;
private String description;
private String doctorName;
public int getPrescriptionid() {
	return prescriptionid;
}
public void setPrescriptionid(int prescriptionid) {
	this.prescriptionid = prescriptionid;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public Integer getAppointmentID() {
	return appointmentID;
}
public void setAppointmentID(Integer appointmentID) {
	this.appointmentID = appointmentID;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
}
