package com.display_train;

public class DisplayTrain {
	    public Integer id;
		public String trainName;
		public String trainFrom;
		public String trainTo;
		public String trainDate;
		public String trainTiming;
	public DisplayTrain(int id,String trainName, String trainFrom, String trainTo, String Date,String trainTiming) {
			this.id=id;
			this.trainName = trainName;
			this.trainFrom = trainFrom;
			this.trainTo = trainTo;
		    this.trainDate = trainDate;
			this.trainTiming = trainTiming;
		}
	public DisplayTrain(Integer id, String trainTiming) {
		this.id=id;
		this.trainTiming = trainTiming;

	}
	public DisplayTrain(String trainName, String trainFrom, String trainTo, String trainDate, String trainTiming) {
		// TODO Auto-generated constructor stub
		this.trainName = trainName;
		this.trainFrom = trainFrom;
		this.trainTo = trainTo;
	    this.trainDate = trainDate;
	}
	@Override
	public String toString() {
		return '\n'+id +"\t\t"+ trainName +"\t\t"+ trainFrom + "\t\t"+trainTo +"\t\t"+ trainDate + "\t\t"+trainTiming;
	}

	
		

	}

