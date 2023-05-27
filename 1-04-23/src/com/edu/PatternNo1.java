package com.edu;

import java.util.Scanner;

public class PatternNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		ch = sc.nextInt();
		switch(ch) {
		case 1: 
for(int r=1;r<=2;r++) {
	for(int c=1;c<=r;c++) {
		System.out.print(c+"");	}
	System.out.println();
}
	break;	
		case 2: 
			for(int r=1;r<=3;r++) {
				for(int c=1;c<=r;c++) {
					System.out.print(c+"");	}
				System.out.println();
			}
			break;		
		case 3: 
			for(int r=1;r<=4;r++) {
				for(int c=1;c<=r;c++) {
					System.out.print(c+"");	}
				System.out.println();
			}
			break;
			default:
				System.out.println("Invalid");
		}				
	}

}
