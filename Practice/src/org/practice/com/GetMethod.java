package org.practice.com;

public class GetMethod {
	public int balance=5000;
	public int getBalance()
	{

	return this.balance;

}
	public void setBalance(int value) {
		if(value>3000) {
		this.balance=value;
		}
		
	}

}
