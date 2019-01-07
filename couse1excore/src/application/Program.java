package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number:");
		int number = kb.nextInt();
		System.out.println("Enter account holder:");
		kb.nextLine();
		String holder = kb.nextLine();
		System.out.println("Is there an initial deposit (y/n)?");
		char response = kb.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter the initial vlaue:");
			double initialDeposit = kb.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		double depositValue = kb.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdrawtValue = kb.nextDouble();
		account.withdraw(withdrawtValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		kb.close();
		

	}

}
