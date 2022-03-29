package com.search_train.dao;

//package com.User_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.Transaction.Transaction;

public class UserLogin {
	public static int login() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter login Email");
		String email = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
		//System.out.println("Enter the Captcha"+a);
		//String Captcha = scan.next();
		int a=(int) (Math.random() * (9000-100+1)+100);
		System.out.println("Enter the captcha  "+  a);
		int captcha=scan.nextInt();
	
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		String query = "select email_id,PASSWORD from train_ticket_booking_app_registration\r\n"
				+ " where email_id='" + email + "'";
		java.sql.Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		String useremail = null;
		String userpassword = null;
		while (result.next()) {
			useremail = result.getString("email_id");
			userpassword = result.getString("PASSWORD");
		}
		if (useremail == null) {
			System.out.println("No records found - please register");
			return 0;
		} else if (userpassword.equals(password)) {
			System.out.println("WELCOME TO THE PAGE");
			return 1;
		} else {
			System.out.println("Invalid Credentials");
			return 0;
		}
		
	}

}
