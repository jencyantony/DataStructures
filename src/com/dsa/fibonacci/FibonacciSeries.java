package com.dsa.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter n");
		int n = scan.nextInt();
		int i = 0;
		int a = 1;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c;
		while(i<n){
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
		scan.close();
	}
}
