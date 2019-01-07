package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		Funcionario fc1 = new Funcionario();
		
		System.out.println("Enter name of Func: ");
		fc1.name = kb.nextLine();
		
		System.out.println("Enter the Gross Salary of Func: ");
		fc1.grossSalary = kb.nextDouble();
		
		System.out.println("Enter Tax: ");
		fc1.tax = kb.nextInt();
		
		System.out.println(fc1.name.toString());
		
		kb.close();
	}

}
