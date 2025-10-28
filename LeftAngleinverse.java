package com.codegnan.patternexample;

public class LeftAngleinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
