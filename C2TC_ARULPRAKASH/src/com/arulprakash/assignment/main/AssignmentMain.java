package com.arulprakash.assignment.main;

import com.arulprakash.assignment.employees.Developer;
import com.arulprakash.assignment.employees.Manager;
import com.arulprakash.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer);
	}

}
