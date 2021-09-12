package com.kata.BankAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	private String accountNumber;
	private Client client;
	private double balance;
	private List<Operation> listOperation = new ArrayList();
	
	public BankAccount(String accountNumber, Client client) {
		this.accountNumber = accountNumber;
		this.client = client;
		this.balance = 0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Operation> getListOperation() {
		return listOperation;
	}

	public void setListOperation(List<Operation> listOperation) {
		this.listOperation = listOperation;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		Operation operation = new Operation(LocalDate.now(), IParameters.CREDIT, amount);		
		listOperation.add(operation);
		this.setListOperation(listOperation);
	}
	
	public void withdraw(double amount) {		
		if(amount>this.balance) {
			System.out.println("This operation is impossible.");
		}else {
			this.balance -= amount;
			Operation operation = new Operation(LocalDate.now(), IParameters.DEBIT, amount);
			listOperation.add(operation);
			this.setListOperation(listOperation);
		}
	}
	
	public void getHistory() {
		System.out.println("------------Operations history---------------");
		listOperation.forEach(operation->{			
			System.out.println(operation.getDate() + " - " + operation.getSens() + " - " + operation.getAmount());
		});
		System.out.println("---------------------------------------------");
		System.out.println("Balance : " + this.balance);
	}
}
