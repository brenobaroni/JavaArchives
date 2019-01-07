package application;

import java.util.Scanner;

import entities.Cliente;

public class Program extends Cliente {

	public static void main(String[] args) {

		System.out.println("Menu:");
		System.out.println("1 - Create acccout:");
		System.out.println("2 - Exit:");

		Scanner kb = new Scanner(System.in);
		int menuoption = kb.nextInt();
		while(menuoption != 1 || menuoption != 2) {
		
			switch (menuoption) {
				case 1:
					Cliente cl = new Cliente();
					cl.openAccount();
				case 2:
					System.out.println("Good Bye!");
				default:
					System.out.println("Wrong option.");
					menuoption = kb.nextInt();

			}
		
		}
		
		kb.close();

	}

}
