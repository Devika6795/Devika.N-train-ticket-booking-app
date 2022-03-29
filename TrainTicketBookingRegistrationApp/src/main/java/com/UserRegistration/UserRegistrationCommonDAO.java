package com.UserRegistration;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;
import java.util.Scanner;

import UserRegistration.UserRegistrationValidation;
		public class UserRegistrationCommonDAO{
			public int userRegistrationCommonDAO() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your name:");
				String name=sc.next();
				System.out.println("Enter your email: ");
				String email=sc.next();
				System.out.println("Enter password: ");
				String password=sc.next();
				System.out.println("Enter the contact number: ");
				String contact=sc.next();
				int a=(int) (Math.random() * (9000-100+1)+100);
				System.out.println("Enter the captcha  "+  a);
				int captcha=sc.nextInt();
			
				UserRegistration ur=new UserRegistration(name,email,password,contact);
				
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				//"INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES( '"+us.userName+"','"+us.emailId+"', '"+us.password+"','"+us.phoneNumber+"')";
				String query="INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES( '"+ur.userName+"','"+ur.emailId+"', '"+ur.password+"','"+ur.phoneNumber+"')";
				Statement statement=connection.createStatement();
				int rows=statement.executeUpdate(query);
				if(rows==1) {
					System.out.println("Sucessfully Register");
					return 1;
				}
				else {
					return 0;
				}
				
			}
					}
		


