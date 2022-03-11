package com.lq.boxclass;

public class Box {

	private double width;
	private double length;
	private double height;
	
    Box(double w, double l, double h){
    	width = w;
    	length = l;
    	height = h;
    }
    
    Box(double s){
    	this(s,s,s);
    }

    public double getVolume(){
    	return width*length*height;
    }
    
    public double getSurfaceArea() {
    	return 2*width*height + 2*length*height+2*width*length;
    }
    
    public void printBox(){
    	if (length > 0 && height > 0 && width > 0) {
    		System.out.println("Length = "+ length);
    		System.out.println("Width = "+ width);
    		System.out.println("Height = "+ height);
    		System.out.println("Volume = "+ getVolume());
    		System.out.println("Surface Area = "+ getSurfaceArea());
    		
    	}
    	else
    		System.out.printf("Box(%f,%f,%f) parameters are invalid.", getLength(),getWidth(),getHeight());
    }
	/**
	 * @return the width
	 */
	public final double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public final void setWidth(double width) {
		if (width > 0) {
			
		this.width = width;}
		
		else {
			System.out.println("Width must be greater than 0");
		}
	}

	/**
	 * @return the length
	 */
	public final double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public final void setLength(double length) {
		if (length > 0) {
		
		this.length = length;}
		
		else {
			System.out.println("Length must be greater than 0");
		}
	}

	/**
	 * @return the height
	 */
	public final double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public final void setHeight(double height) {
		if (height > 0) {
			
		this.height = height;}
		
		else {
			System.out.println("Height must be greater than 0");
		}
	}
    
    
}
