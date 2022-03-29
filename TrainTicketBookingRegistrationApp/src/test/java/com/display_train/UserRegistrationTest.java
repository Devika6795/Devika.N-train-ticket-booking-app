package com.display_train;

import java.util.Scanner;

import com.Booking.BookTrain;
import com.UserRegistration.AdminLogin;
import com.UserRegistration.UserRegistration;
import com.UserRegistration.UserRegistrationCommonDAO;
import com.search_train.dao.SearchTrainDAO;

public class UserRegistrationTest {
	static int option = 0;
	static int status = 0;
	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1:Admin Login"+'\n'+"Enter 2: UserRegistration/Login");
	int adminUser=sc.nextInt();
	if(adminUser==1) {
		AdminLogin.login();
		System.out.println("Enter 1:admin Insert"+'\n'+"Enter 2: admin Delete"+'\n'+"Enter 3: admin update"+'\n'+"Enter 4: admin Select");
		int adminChanges=sc.nextInt();
		if(adminChanges==1) {
			Train.InsertTrain();
		}
		else if(adminChanges==2) {
			Train.DeleteTrain();
		}
		else if(adminChanges==3) {
			Train.UpdateTrainTiming();
			
		}
		else if(adminChanges==4){
			 DisplayTrainTest.display_train_test();
		}
	}
	else if(adminUser==2) {
		inputMethod();
	}
//	System.out.println("Enter your name:");
//		String name=sc.next();
//		System.out.println("Enter your email: ");
//		String email=sc.next();
//		System.out.println("Enter password: ");
//		String password=sc.next();
//		System.out.println("Enter the contact number: ");
//		String contact=sc.next();
//		
//		// System.out.println(userName" "+emailId"  "+password"  "+phoneNumber);
		//UserRegistration ur=new UserRegistration(name,email,password,contact);
//		    UserRegistrationCommonDAO urDAO=new UserRegistrationCommonDAO();
		    
//				    System.out.println("enter 1 : Register ");
//		    System.out.println("enter 2 : Login ");
//		    System.out.println("enter the number:");
//		    int option = sc.nextInt();
		    
//		    if(option==1) {
//		    urDAO.userRegistrationCommonDAO();
//		    }
//		    else if (option==2) {
//		    	  com.search_train.dao.UserLogin.login();
//		    }
//		    else {
//		    	System.out.println("Please enter valid details");
//		    }
//		    System.out.println("enter 3 : available trains");
//		    int choose = sc.nextInt();
//		    if(choose==3) {
//		    DisplayTrainTest.display_train_test();
//		    
		   
          
	}
	public static void inputMethod() throws Exception {
		UserRegistrationCommonDAO urDAO=new UserRegistrationCommonDAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 : Register ");
	    System.out.println("enter 2 : Login ");
	    System.out.println("enter the number:");
	    option = sc.nextInt();
	    if(option==1) {
		   status =  urDAO.userRegistrationCommonDAO();
		    }
		    else if (option==2) {
		    	 status = com.search_train.dao.UserLogin.login();
		    }
		    else {
		    	System.out.println("Please enter valid details");
		    	inputMethod();
		    }
	    if(status==1) {
		    System.out.println("enter 3 : available trains");
		    System.out.println("enter 4 : To search the Train Name:");
		    System.out.println("enter 5 : To search the Train Destination:");
		    System.out.println("enter 6 : To search the Train From:");
		    int choose = sc.nextInt();
		    if(choose==3) {
		    
		    DisplayTrainTest.display_train_test();
		    }
		   else if(choose==4) {
		    	System.out.println("Enter the Train Name:");
		    	String trainName=sc.next();
		    	SearchTrainDAO.findByTrainName(trainName);
		    	
		    }
		   else if(choose==5) {
			   System.out.println("Enetr the Train Destination:");
			   String trainsTo=sc.next();
					   SearchTrainDAO.findByTrainTo(trainsTo);
					   
		   }
		   else if(choose==6) {
			   System.out.println("Enter the Train From:");
			   String trainsFrom=sc.next();
			   SearchTrainDAO.findByTrainFrom(trainsFrom);
		   }
		    else {
		    	System.out.println("Please enter valid choice");
		    }
	    }
	    sc.close();
	}
}


