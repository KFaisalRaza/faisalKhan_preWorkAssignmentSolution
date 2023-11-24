package com.codingchallenge11;

class Account {
	String customerName;
	int accountNo;

	Account(String a, int b) {
		this.customerName = a;
		this.accountNo = b;
	}

	void display() {
		System.out.println("Customer name:" + this.customerName);
		System.out.println("Account number:" + this.accountNo);
	}
}

class CurrentAccount extends Account {
	int currentBalance;

	CurrentAccount(String a, int b, int c) {
		super(a, b);
		this.currentBalance = c;
	}

	void display() {
		super.display();
		System.out.println("Current Balance: " + currentBalance);
	}

}

class AccountDetails extends CurrentAccount {
	int depostiAmount, withdrawlAmount;

	AccountDetails(String a, int b, int c, int d, int e) {
		super(a, b, c);
		this.depostiAmount = d;
		this.withdrawlAmount = e;
	}

	void display() {
		super.display();
		System.out.println("Deposit Amount:" + this.depostiAmount);
		System.out.println("Withdrawl Amount:" + this.withdrawlAmount);

	}

}

class Main {

	public static void main(String args[]) {

		AccountDetails A = new AccountDetails("Harshit", 11111, 10000, 5000, 500);

		A.display();

	}

}
