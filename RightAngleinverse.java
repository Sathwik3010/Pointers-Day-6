package com.codegnan.patternexample;

public class RightAngleinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// number of rows

		int rows=5;
		// outer loop for number of rows
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
