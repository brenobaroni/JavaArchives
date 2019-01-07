package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many rooms do you have ?");
		int rooms = kb.nextInt();
		Rents[] vect = new Rents[rooms];
		kb.nextLine();
		System.out.println("How many rooms do you want to rent ?");
		int n = kb.nextInt();
		kb.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.println("Name of client:");
			String name = kb.nextLine();
			System.out.println("E-mail:");
			String email = kb.nextLine();
			System.out.println("Room");
			int roomqt = kb.nextInt();
			kb.nextLine();
			
			vect[roomqt] = new Rents(name, email, roomqt);

			
		}
		
		for(int i=0; i<rooms; i++) {
			if(vect[i] != null) {
				System.out.println("Reservas: " + vect[i].toString());
			}
		}
		
		kb.close();
		
		
	}

}
