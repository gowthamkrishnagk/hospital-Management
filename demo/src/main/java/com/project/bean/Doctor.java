package com.project.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="doctor",uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int doc_id;
private String name;
private String department;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="doc_id")


private List<DoctorPrescription> docprescriptions;

public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

public int getDoc_id() {
	return doc_id;
}
public void setDoc_id(int doc_id) {
	this.doc_id = doc_id;
}

public List<DoctorPrescription> getDocprescriptions() {
	return docprescriptions;
}
public void setDocprescriptions(List<DoctorPrescription> docprescriptions) {
	this.docprescriptions = docprescriptions;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}




}
