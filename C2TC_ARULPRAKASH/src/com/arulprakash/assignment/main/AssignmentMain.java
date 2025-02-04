package com.arulprakash.assignment.main;
import java.util.ArrayList;
import java.util.Scanner;
import com.arulprakash.assignment.employees.Employee;
import com.arulprakash.assignment.employees.Developer;
import com.arulprakash.assignment.employees.Manager;
import com.arulprakash.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static ArrayList<Employee> employee=new ArrayList<>();
	public static int empId=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("create the employee details\n1-> manager\n2->developer\n3->exit");
			String name=sc.nextLine();
			sc.nextLine();
			Long salary=sc.nextLong();
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					 Manager manager = new Manager(sc.nextLine(), sc.nextInt(),sc.nextLong(),sc.nextLine());
					 employee.add(manager);
					 break;
				case 2:
			        Developer developer = new Developer(sc.nextLine(), sc.nextInt(),sc.nextLong(),sc.nextLine());
			        employee.add(developer);
			        break;
				default :
					System.out.println("enter the correct choice!!");
			}
			
		}
//		for(Employee emp:employee)
//	        EmployeeUtilities.printEmployeeDetails(emp); 
	}

}
