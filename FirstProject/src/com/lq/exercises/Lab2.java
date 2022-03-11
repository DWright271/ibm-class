package com.lq.exercises;

import java.util.Scanner;

public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width;
        int height;
        int area;
        double radius = 10;
        double pi = 3.14;
        boolean result = true;
        int [] daysInMonth = new int [12];
        String[] monthNames = {"January", "February", "March", "April", "May",
        		"June", "July", "August", "September", "October","November","December"};
        int x;
        int y;
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        
        width = 8;
        height = 12;
        area = 96;
        daysInMonth[0]=31;
        daysInMonth[1]=28;
        daysInMonth[2]=31;
        daysInMonth[3]=30;
        daysInMonth[4]=31;
        daysInMonth[5]=30;
        daysInMonth[6]=31;
        daysInMonth[7]=31;
        daysInMonth[8]=30;
        daysInMonth[9]=31;
        daysInMonth[10]=30;
        daysInMonth[11]=31;
        
      //  x = 30;
       
		System.out.println("Hello World!");
		System.out.println("The value of width is " + width);
		System.out.println("The value of length is " + height);
		System.out.println("The value of area is " + area);
		System.out.println("The value of radius is " + radius);
		System.out.println("The value of pi is " + pi);
		System.out.println("The value of result is " + result);
		for (int i = 0; i < 12; i++)
		   System.out.println(monthNames[i] + " has " + daysInMonth[i] + " days.");
		
//		if (x < y) {
//			System.out.println("x is greater than");
//		}else {
//			System.out.println("x is less than");}
				
	/*	if (x==1) {
			System.out.println("John");
		}
		else if (x==2 ) {
			System.out.println("Jane");
		}
		else if (x==3) {
			System.out.println("Sarah");
		}
		else {
			System.out.println("Dustin");
		} */
		
		switch (x) {
		
		    case 1:
		    	System.out.println("John");
		    	break;
		    case 2:
		    	System.out.println("Jane");
		    	break;
		    case 3:
		    	System.out.println("Sarah");
		    	break;
		    case 4:
		    case 5:
		    	System.out.println("Good Bye");
		    	break;
		    default:
		    	System.out.println("Tim");
		    	    
		}
	}

}
