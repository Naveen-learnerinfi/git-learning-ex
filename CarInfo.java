package com.task;

public class CarInfo { //methodoverloading
public void car_Model() {
	System.out.println("Mahindra Thar");
	
}
public void car_Model(String price) {//datatype 
	System.out.println(price);
	
}
public void car_Model(int seats, String mileage) {// Datacount
	System.out.println(seats);
	System.out.println(mileage);
	}

public void car_Model( String fueltype,int cylinder) {//Dataorder
	System.out.println(fueltype);
	System.out.println(cylinder);
	}

public static void main(String[] args) {
	CarInfo car1 = new CarInfo();
	car1.car_Model();
	car1.car_Model("price is 9.5 - 14.5 lakh");
	car1.car_Model(4, "9.0 kmpl");
	car1.car_Model("diesel", 4);
}


	
}
