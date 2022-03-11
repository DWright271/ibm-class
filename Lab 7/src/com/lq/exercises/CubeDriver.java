package com.lq.exercises;

public class CubeDriver {

	public static void main(String[] args) {
		
		Cube c1 = new Cube(5);
		Cube c2 = new Cube(8);

		System.out.println(c1.getHeight());
		System.out.println(c1.getLength());
		System.out.println(c1.getWidth());
		
		System.out.println(c2.getHeight());
		System.out.println(c2.getLength());
		System.out.println(c2.getWidth());
		
		c1.setLength(20);
		c1.printBox();
		c2.setLength(-5);
		c2.printBox();
	}

}
