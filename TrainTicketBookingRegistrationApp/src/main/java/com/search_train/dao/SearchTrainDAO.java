package com.search_train.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Booking.booking;
import com.display_train.DisplayTrain;


public class SearchTrainDAO {
	public static List<DisplayTrain> selectAll()throws Exception
	{
		List<DisplayTrain> displayTrainList=new ArrayList<DisplayTrain>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		String query="SELECT*FROM  train_ticket_booking_app_display";
		
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.err.println("Train Name \t" +"Train From         \t "+"Train To \t"+"Train Date \t"+ "Train Timing\n");
		while(rs.next())
		{
			//Integer id=rs.getInt("train_id");
			String trainName=rs.getString("train_name");
			String trainFrom=rs.getString("train_from");
			String trainTo=rs.getString("train_to");
			String trainDate=rs.getString("train_date");
			String trainTiming=rs.getString("train_timing");
			
			DisplayTrain trainObj=new DisplayTrain(0, trainName,trainFrom,trainTo,trainDate,trainTiming);
			 displayTrainList.add(trainObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayTrainList;
		
	}
	public static void findByTrainName(String trainName) throws SQLException {
Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		String query="SELECT*FROM  train_ticket_booking_app_display where train_name='"+trainName+"'";
		
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.err.println("Train Name \t" +"Train From         \t "+"Train To \t"+"Train Date \t"+ "Train Timing\n");
		while(rs.next())
		{
			Integer id=rs.getInt("train_id");
			String trainNames=rs.getString("train_name");
			String trainFrom=rs.getString("train_from");
			String trainTo=rs.getString("train_to");
			String trainDate=rs.getString("train_date");
			String trainTiming=rs.getString("train_timing");
			
			//DisplayTrain trainObj=new DisplayTrain(id,trainNames,trainFrom,trainTo,trainDate,trainTiming);	
			System.out.format("\n%d \t\t %s \t\t %s \t\t %s \t\t %s \t\t %s \t\t",trainNames,trainFrom,trainTo,trainDate,trainTiming);
			
		}
		
	}
	public static void findByTrainTo(String trainTo) throws SQLException {
Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		String query="SELECT*FROM  train_ticket_booking_app_display where train_to='"+trainTo+"'";
		
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.err.println("Train Id \t"+"Train Name \t" +"Train From         \t "+"Train To \t"+"Train Date \t"+ "Train Timing\n");
		while(rs.next())
		{
			//Integer id=rs.getInt("train_id");
			String trainNames=rs.getString("train_name");
			String trainFrom=rs.getString("train_from");
			String trainsTo=rs.getString("train_to");
			String trainDate=rs.getString("train_date");
			String trainTiming=rs.getString("train_timing");
			
			//DisplayTrain trainObj=new DisplayTrain(id,trainNames,trainFrom,trainTo,trainDate,trainTiming);	
			System.out.format("\n%d \t\t %s \t\t %s \t\t %s \t\t %s \t\t %s \t\t",trainNames,trainFrom,trainsTo,trainDate,trainTiming);
			
		}
		
	}
	public static void findByTrainFrom(String trainFrom) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	
	String query="SELECT*FROM  train_ticket_booking_app_display where train_from='"+trainFrom+"'";
	
	Statement statement=connection.createStatement();
	ResultSet rs=statement.executeQuery(query);
	System.err.println("Train Id \t"+"Train Name \t" +"Train From         \t "+"Train To \t"+"Train Date \t"+ "Train Timing\n");
	while(rs.next())
	{
		//Integer id=rs.getInt("train_id");
		String trainNames=rs.getString("train_name");
		String trainsFrom=rs.getString("train_from");
		String trainsTo=rs.getString("train_to");
		String trainDate=rs.getString("train_date");
		String trainTiming=rs.getString("train_timing");
		
		//DisplayTrain trainObj=new DisplayTrain(id,trainNames,trainFrom,trainTo,trainDate,trainTiming);	
		System.out.format("\n%d \t\t %s \t\t %s \t\t %s \t\t %s \t\t %s \t\t",trainNames,trainFrom,trainsTo,trainDate,trainTiming);
		booking.bookingTrain(trainFrom);
	}
	}
	
	
}
