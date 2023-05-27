package com.edu;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int c=0;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}	
		}
		if(c==2) 
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}

}
