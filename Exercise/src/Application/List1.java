package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.Reserve;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int emps = sc.nextInt();
		
		for (int e = 1; e <= emps; e++) {
			System.out.println();
			System.out.println("Emplyoee #" + e +":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println("----------------------------------");
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Boolean acho = false;
		for (Employee employee: employees) {
			if (id == employee.getId()) {
				System.out.print("Enter the percentage: ");
				Double percentege = sc.nextDouble();
				employee.increaseSalary(percentege);
				acho = true;
			} 
		}
		if (!acho) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("----------------------------------");
		System.out.println("List of employees:");
		for (Employee employee: employees) {	 
			    System.out.println(employee);
		}
		sc.close();
	}

}
