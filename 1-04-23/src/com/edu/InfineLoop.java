package com.edu;

public class InfineLoop {

	public static void main(String[] args) {
		int i=1;
		//while(true) { //infinite while
		for(;;) { //infinite for
			System.out.println("hi");
			i++;
			if(i==10) {
				break;
			}
		}
	}

}
