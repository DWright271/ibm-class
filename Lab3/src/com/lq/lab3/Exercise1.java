package com.lq.lab3;

public class Exercise1 {

	public static void main(String[] args) {
		
	String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday",
	                       "Friday","Saturday"};
	
    int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    String[] monthNames = {"January", "February", "March", "April", "May",
    		"June", "July", "August", "September", "October","November","December"};
	
	/*for (int i = 0; i < daysOfWeek.length; i++) {
		System.out.println(daysOfWeek[i]);
	}
		
	for (int i = daysOfWeek.length - 1; i >= 0; i--) {
		System.out.println(daysOfWeek[i]);
	}
	
	
	for (int i = 1; i<101; i++) {
		if (i<50 || i>60) {
		System.out.println(i);
		}
	}*/
	
	int j = 1;
	while (j < 13) {
		switch(j){
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
            break;
			
		    case 2:
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
			break;
			
		    case 4:
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
			break;
			
		    case 6:
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
			break;
			
			
		    case 9:
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
			break;
			
		    	
		    case 11:
			System.out.println(daysInMonth[j-1]);	
			System.out.println(monthNames[j-1]);
			break;
	
		}
		j++;
	}
	
	}

}
