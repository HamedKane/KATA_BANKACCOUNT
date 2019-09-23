package com.kata.BankAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private List<Operation> listOperation = new ArrayList();
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
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
		
		LocalDate localDate = LocalDate.now();
		
		Operation operation = new Operation();
		operation.setDate(localDate);
		operation.setAmount(amount);
		operation.setSens(IParameters.CREDIT);
		
		listOperation.add(operation);
		this.setListOperation(listOperation);
	}
	
	public void withdraw(double amount) {
		
		if(amount>this.balance) {
			System.out.println("This operation is impossible.");
		}else {
			this.balance -= amount;
			
			LocalDate localDate = LocalDate.now();
			
			Operation operation = new Operation();
			operation.setDate(localDate);
			operation.setAmount(amount);
			operation.setSens(IParameters.DEBIT);
			
			listOperation.add(operation);
			this.setListOperation(listOperation);
		}
	}
	
	public void getHistory() {
		
		listOperation.forEach(operation->{			
			System.out.println(operation.getDate() + " - " + operation.getSens() + " - " + operation.getAmount());
			System.out.println("__________________________________________");
		});
		System.out.println("Balance : " + this.balance);
	}
}
