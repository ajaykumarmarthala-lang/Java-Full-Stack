package com.scenario;

import java.util.Scanner;
// Scenario Based Requirement Task 
//Account balance = ₹20,000.
//The account balance must be sufficient.
//The withdrawal amount must be a multiple of 100.
//Withdrawal must be positive.
//The withdrawal amount must be greater than zero.
//If all conditions are satisfied, deduct the amount from the balance.
//Maximum withdrawal per transaction = ₹10,000.
public class ATMWithdrawal {

	static double balance = 20000;
	static double maxLimit = 10000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw");
		double wamount = sc.nextDouble();
		if (wamount > 0) {
			if (wamount % 100 == 0) {
				if (wamount <= balance) {
					if (wamount <= maxLimit) {
						balance = balance - wamount;
						System.out.println("The remaining balance is : " + balance);
					} else {
						System.out.println("Withdrawal Limit Exceeded!!");
					}

				} else {
					System.out.println("Insufficient amount to withdraw!!");
				}
			} else {
				System.out.println("Invalid Withdrawal Amount!");
				System.out.println("Please enter an amount in multiples of 100.");
			}
		} else {
			System.out.println("Invalid Amount Can you please enter a positive number ");
		}
		sc.close();
	}

}
