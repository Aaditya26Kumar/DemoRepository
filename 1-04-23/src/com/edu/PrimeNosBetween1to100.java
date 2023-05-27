package com.edu;

public class PrimeNosBetween1to100 {

	public static void main(String[] args) {
		int c,n=0;
		for(int i=1;i<=100;i++) {  //1 2 3 4 5 6 ..............100
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
				n++;
			}
		}
		System.out.println();
		System.out.println("No. of prime numbers between 1 to 100 "+n);
	}
	}
