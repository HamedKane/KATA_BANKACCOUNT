package com.kata.BankAccount;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	Client client = new Client("C1","Hamed","N'DAW");
    BankAccount bankAccount = new BankAccount("BA00001",client);
	
	@Before
	public void initValues() {	
		bankAccount.deposit(500);
	}
	
	@Test
	public void deposit() {		
		bankAccount.deposit(500);
		assertEquals(1000,bankAccount.getBalance(),0);
	}
	
	@Test
	public void withdraw() {			
		bankAccount.withdraw(200);
		assertEquals(300,bankAccount.getBalance(),0);
	}
	
	@Test
	public void getHistory() {			
		bankAccount.withdraw(400);
		assertEquals(100,bankAccount.getBalance(),0);
	}
	
}
