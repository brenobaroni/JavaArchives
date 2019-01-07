package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	
		int n =kb.nextInt();
		int[][] mat = new int[n][n];
		kb.nextLine();
		
		for(int i =0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = kb.nextInt();
			}
		}
		System.out.println("-------------");
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count ++;
					System.out.print(mat[i][j]+ " ");
					System.out.println("Quantity of negative numbers is: " + count);
				}
			}
		}
		
		
		
		
		
		
		
		kb.close();
	}

}
