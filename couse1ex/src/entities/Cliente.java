package entities;

import java.util.Scanner;

public class Cliente {
	
	private String name;
	private String cpf;
	private int account;
	private String typeAccount;
	
	
	//getters setters----------------
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getConta() {
		return account;
	}
	public void setConta(int conta) {
		this.account = conta;
	}
	public String getTipoconta() {
		return typeAccount;
	}
	public void setTipoconta(String tipoconta) {
		this.typeAccount = tipoconta;
	}
	//getters setters_end-------------
	
	
	//Methods------------------------
	
	public void openAccount() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to day bank.");
		System.out.println("--------------------------------");
		System.out.println("Initiating a new accont.");
		System.out.println("Register: ");
		System.out.println("Please enter the client name:");
		this.name = kb.nextLine();
		System.out.println("Please enter the client CPF:");
		this.cpf = kb.nextLine();
		System.out.println("Please enter the account number:");
		this.account = kb.nextInt();
		System.out.println("Please select type of account: (CC) or (PP)");
		this.typeAccount = kb.nextLine();
		
		while( this.typeAccount != "CC" || this.typeAccount != "PP") {
			System.out.println("Invalid type! Enter type again:");
			this.typeAccount = kb.nextLine();
		}
		
		System.out.println("Account created successfully.");
		kb.close();
	}
	
	//Methods_end----------------
	
	
	
	
	

}
