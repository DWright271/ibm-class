package com.lq.exercises;

public class Cube extends Box {

	Cube(double s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	private double side;

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
		super.setHeight(width);
		super.setLength(width);
	}


	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		super.setLength(length);
		super.setHeight(length);
		super.setWidth(length);
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
		super.setWidth(height);
		super.setLength(height);
	}

	public void setSide(double side) {	
		
		if (side > 0) {
		
		this.side = side;}
		
		else {
			System.out.println("Side must be greater than 0");
		}
	
	}
}
