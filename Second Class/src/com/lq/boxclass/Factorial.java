package com.lq.boxclass;

import java.util.Scanner;

public class Factorial {
	
	static int Factorial(int n) {
	    return (n == 1 || n == 0) ? 1 : n * Factorial(n - 1);}

	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
int x;
int y;
x = scn.nextInt();
y = Factorial(x);
System.out.println(y);
		
	}

}
