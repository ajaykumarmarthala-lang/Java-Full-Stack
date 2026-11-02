package methods;

import java.util.Scanner;

public class BankAccount {
	double balance = 5000;

	public static void main(String[] args) {
		System.out.println("Main method started");
		BankAccount ba = new BankAccount();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Deposit");
		double amount=sc.nextDouble();
		ba.deposit(amount);

		System.out.println("Enter Amount to Withdraw");
		double wamount=sc.nextDouble();
		ba.withdraw(wamount);
//		ba.checkBalance();


	}
void withdraw(double wamount) {
	if(wamount <= balance) {
		balance=balance-wamount;
		checkBalance();

	}
	else {
		System.out.println("Insufficeint Funds");
	}
	
}
	void checkBalance() {
		System.out.println("The current balance is : " + balance);

	}
	void deposit(double amount) {
		if(amount > 0) {
		balance=balance+amount;
		checkBalance();

		}
		else {
			System.out.println("Invalid amount to deposit");
		}
	}

}
