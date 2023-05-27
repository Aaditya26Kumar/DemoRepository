package com.edu;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i==20) {
				//break;
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
