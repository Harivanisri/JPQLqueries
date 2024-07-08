package com.example.jql.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empId;
private String empName;
private String location;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Employees2(int empId, String empName, String location) {
	
	this.empId = empId;
	this.empName = empName;
	this.location = location;
}
public Employees2() {
	
}
@Override
public String toString() {
	
	return "[empId=" + empId + ", empName=" + empName + ", location=" + location + "]";
}



}
