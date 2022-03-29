package com.Transaction;
import java.util.Scanner;

public class Transaction {
	public static void transaction() {
		System.out.println("Please select the mode of payment");
		System.out.println("1.UPI");
		System.out.println("2.Debit/Credit Card");
		System.out.println("3.NetBanking");
		Scanner sc3=new Scanner(System.in);
		int e=sc3.nextInt();
		if(e==1) {
			System.out.println("Enter your UPI Id");
			Scanner sc4=new Scanner(System.in);
			String u=sc4.next();
			if (u.contains("@")) {
				System.out.println("Enter your otp");
				int o=sc4.nextInt();
				System.out.println("payment Succesful");
			sc4.close();
				}
		}
		else if(e==2) {
			System.out.println("Enter your 16 Digit card Number");
			Scanner sc5=new Scanner(System.in);
			String card=sc5.next();
			if (card.length()==16);{
				System.out.println("Enter your OTP received on Your Registered Mobile Number");
				int a=sc5.nextInt();
				System.out.println("payment Successful");
			}
			
		}
		
	}
}


