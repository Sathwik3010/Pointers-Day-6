package com.codegnan.patternexample;

public class BinaryTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6; // total number of rows

		for(int i=0;i<=rows;i++) {
			for(int j=0;j<=i;j++) {
				if((i + j)%2==0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println(); // move to next line
		}
	}

}
