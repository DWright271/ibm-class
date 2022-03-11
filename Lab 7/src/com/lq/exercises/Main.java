package com.lq.exercises;

public class Main {

	public static void main(String[] args) {

		Box b1 = new Box(5,6,1
			);
		
		b1.printBox();

		b1.setLength(2);
		b1.setHeight(3);
		b1.setWidth(4);
		b1.getVolume();
		b1.getSurfaceArea();
		b1.printBox();
	}

}
