package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("how many employees will be registered?");
		int regs = kb.nextInt();
		
		for(int i=1; i<=regs; i++) {
			
			// Coleta de dados
			System.out.println();
			System.out.println("Employee #" + i + ":");
			kb.nextLine();
			int id = kb.nextInt();
			System.out.println("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.println("Salary: ");
			double salary = kb.nextDouble();
			
			//Inserção dos dados Coletados
			list.add(new Employee(id, name, salary));
			
		}
		
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = kb.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage.");
			int percentage = kb.nextInt();
			emp.increaseSalary(percentage);
						
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		
		kb.close();
	}

}
