package com.empapp.model;

public class Employee {

	private String employeeName;
	private Integer employeeId;
	private String city;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String employeeName, Integer employeeId, String city, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
		this.salary = salary;
		
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", city=" + city + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
}
