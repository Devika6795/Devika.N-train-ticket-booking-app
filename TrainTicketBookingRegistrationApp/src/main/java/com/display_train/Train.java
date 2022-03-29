package com.display_train;
import java.util.Scanner;

public class Train {

		public static void UpdateTrainTiming() throws Exception{
			Scanner sc=new Scanner(System.in );
			System.out.println("Enter Train id ");
			Integer trainId=sc.nextInt();
			System.out.println("Enter train Timing  to be Updated");
			String trainTiming=sc.nextLine();
			DisplayTrain ur=new DisplayTrain(trainId ,trainTiming);
	         //TrainDAO urDAO=new TrainDAO();
	         TrainDAO.busDAOUpdate(ur);
	  	      System.out.println("Entered train details");
	  		System.out.println("TrainId= "+trainId+'\n'+"TrainTo= "+trainTiming);
	  	
		}
		public static void InsertTrain() throws Exception  {
						Scanner sc=new Scanner(System.in );
					System.out.println("Enter Train Name ");
					String trainName=sc.nextLine();
					System.out.println("Enter Train From ");
					String trainFrom=sc.nextLine();
					System.out.println("Enter  To");
					String trainTo=sc.nextLine();
					System.out.println("Enter Train Date ");
					String trainDate=sc.nextLine();
					System.out.println("Enter Train Timing ");
					String trainTiming=sc.nextLine();
					
					DisplayTrain ur=new DisplayTrain(trainName, trainFrom,trainTo,trainDate ,trainTiming);
					//TrainDAO urDAO=new TrainDAO();
			         TrainDAO.trainDAO(ur);
			  	      System.out.println("Entered train details");
			  		System.out.println("TrainName= "+ur.trainName+'\n'+"TrainFrom= "+ur.trainFrom+'\n'+"TrainTo= "+ur.trainTo+'\n'+"TrainDate= "+ur.trainDate+'\n'+"TrainTiming= "+ur.trainTiming);
			  	
					
					}
		 public static void DeleteTrain() throws Exception {
			 Scanner sc=new Scanner(System.in );
				System.out.println("Enter Train id");
				Integer trainId=sc.nextInt();
				System.out.println("Also enter Train name  for deletion");
				String trainName=sc.nextLine();
				DisplayTrain ur=new DisplayTrain(trainId, trainName);
		         TrainDAO.busDAODelete(ur);
		  	      System.out.println("Deleted train details");
		  		System.out.println("TrainId= "+trainId+'\n'+"TrainName= "+trainName);
		  	
			}
		 }
		



