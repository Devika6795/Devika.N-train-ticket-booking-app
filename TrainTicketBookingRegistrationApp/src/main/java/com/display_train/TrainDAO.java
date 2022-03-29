package com.display_train;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TrainDAO {
	public static void trainDAO(DisplayTrain ds) throws Exception {
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		String query="INSERT INTO train_ticket_booking_app_display (train_name,train_from,train_to,train_date,train_timing )VALUES('"+ds.trainName+"','"+ds.trainFrom+"','"+ds.trainTo+"',NOW(),'"+ds.trainTiming+"')";
		Statement statement=connection.createStatement();
		int rows=statement.executeUpdate(query);
		System.out.println("no of rows inserted:"+rows);
		connection.close();
	}
		public static void busDAOUpdate(DisplayTrain ds)throws Exception
		{
			Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			System.out.println(connection);
			String query2="UPDATE train_ticket_booking_app_display SET bus_from='"+ds.trainName+"' WHERE train_name='"+ds.trainName+"'";
			System.out.println(query2);
			Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(query2);
			System.out.println("no of rows updated"+rows);
			connection.close();
			
		}
		public static void busDAOSelect(DisplayTrain ds)throws Exception
		{
			Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			System.out.println(connection);
			String query3="SELECT*FROM  train_ticket_booking_app_display";
			System.out.println(query3);
			Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(query3);
			System.out.println("no of rows updated"+rows);
			connection.close();
			
		}
		public static void busDAODelete(DisplayTrain ds)throws Exception
		{
			Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			System.out.println(connection);
			String query4="DELETE FROM train_ticket_booking_app_display where train_name='"+ds.trainName+"' ";
			System.out.println(query4);
			Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(query4);
			System.out.println("no of rows updated"+rows);
			connection.close();
			
		}
	

}


