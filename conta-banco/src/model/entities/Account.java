package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account () {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	
	public void deposit (Double amount) {
		balance += amount;
		}
		
	
	public double withdraw (Double amount) {
		if (balance < 0) {
			throw new DomainException("Not enough balance");
			}
		else if (amount > withdrawLimit) {
			throw new DomainException ("The amount exceds withdraw limit");
		}
		else if (amount > balance) {
			throw new DomainException ("Not enough balance");
		}
		return balance -= amount;
	}
	
	
}
