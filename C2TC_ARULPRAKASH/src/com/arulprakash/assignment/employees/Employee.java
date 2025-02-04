package com.arulprakash.assignment.employees;

import com.arulprakash.assignment.main.AssignmentMain;

public class Employee {
	 private String name; 
	    private int employeeId; 
	    private double salary; 
	    public Employee(String name, double salary) { 
	        this.name = name; 
	        this.employeeId = ++AssignmentMain.empId; 
	        this.salary = salary; 
	    }    public String getName() { 
	        return name; 
	    } public void setName(String name) { 
	        this.name = name; 
	    } 
	public int getEmployeeId() { 
	return employeeId; 
	} public void setEmployeeId(int employeeId) { 
	this.employeeId = employeeId; 
	}    public double getSalary() { 
	return salary; 
	}public void setSalary(double salary) { 
	this.salary = salary;
	}

}
