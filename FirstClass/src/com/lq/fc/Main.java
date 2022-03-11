package com.lq.fc;

public class Main {

	public static void main(String[] args) {
	     
		Car c1 = new Car(40,50,true);
		Car c2 = new Car(70,60,true);
	
		
		/*c1.setSpeed(40);
		c2.setSpeed(70);
		c1.setGas(50);
		c2.setGas(60);
		c1.setEngineState(true);
		c2.setEngineState(true);*/
		
		System.out.println(c1.getSpeed() + " "+c1.getGas() + " " + c1.getEngineState());
		System.out.println(c2.getSpeed() + " "+c2.getGas() + " " + c2.getEngineState());	

	}

}
