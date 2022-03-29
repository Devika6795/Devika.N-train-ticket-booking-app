package com.Booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BookTrain {
	public static void TrainBooking(int id) {
try{Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter trainId to Book:");
		int tid=sc.nextInt();
		
	
		
		PreparedStatement statement=null;
		Statement statement1=null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		String query1="SELECT train_name,ticket_rate FROM train_ticket_booking_app_display WHERE train_id=?";
		statement = connection.prepareStatement(query1);
		statement.setInt(1, tid);
		rs = statement.executeQuery();
		String trainName=null;
		Integer ticketRate=0;
		while(rs.next()) {
		    trainName=rs.getString("train_name");
			 ticketRate=rs.getInt("ticket_rate");
			//System.out.format("%d \t\t %s \t\t %d",fId,vegDish,vegDishPrice);
		}
		
		String query2="SELECT full_name FROM train_ticket_booking_app_registration_Form WHERE s_no=?";
		statement=connection.prepareStatement(query2);
		statement.setInt(1,id);
		rs1=statement.executeQuery();
		String username=null;
		if(rs1.next()) {
			username=rs1.getString("full_name");
			
		}
		
		
		String query3="INSERT INTO book_train(train_id,user_id,user_name,booking_trainName,trainTicket_rate)VALUES("+id+","+id+",'"+username+"','"+trainName+"',"+ticketRate+")";
	
		statement1=connection.createStatement();
		int rows=statement1.executeUpdate(query3);
		if(rows==1) {
		System.out.println("booked sucessfull");
		}}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}


