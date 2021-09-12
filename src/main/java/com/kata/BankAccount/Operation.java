package com.kata.BankAccount;

import java.time.LocalDate;

public class Operation {
	
	private LocalDate date;
	private String sens;
	private Double amount;
	
	public Operation(LocalDate date, String sens, Double amount) {
		this.date = date;
		this.sens = sens;
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
