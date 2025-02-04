package com.arulprakash.assignment.utilities;

import com.arulprakash.assignment.employees.Developer;
import com.arulprakash.assignment.employees.Employee;
import com.arulprakash.assignment.employees.Manager;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) { 
        System.out.println("Employee Name: " + employee.getName()); 
        System.out.println("Employee ID: " + employee.getEmployeeId()); 
        System.out.println("Salary: " + employee.getSalary()); 
        if (employee instanceof Manager) { 
        try {
            Manager manager = (Manager) employee; 
            System.out.println("Department: " + manager.getDepartment()); 
        }
        catch (Exception e) {
        	System.out.println("employee cannot be type casted manager !!!");
        }
            
        } else if (employee instanceof Developer) { 
        	try {
            Developer developer = (Developer) employee; 
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        	}
        	catch (Exception e) {
            	System.out.println("employee cannot be type casted to developer !!!");

        	}
        } 
        System.out.println(); 
    }
}
