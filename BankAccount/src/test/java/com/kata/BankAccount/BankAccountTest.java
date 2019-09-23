package com.kata.BankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void deposit() {		
		BankAccount bankAccount = new BankAccount("XXXXXXXXX0",1000);
		bankAccount.deposit(500);
		assertEquals(1500,bankAccount.getBalance(),0);
	}
	
	@Test
	public void withdraw() {		
		BankAccount bankAccount = new BankAccount("XXXXXXXXX0",1000);
		bankAccount.withdraw(500);
		assertEquals(500,bankAccount.getBalance(),0);
	}
	
}
