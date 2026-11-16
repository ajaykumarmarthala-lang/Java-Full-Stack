package com.dsa.practice;

import java.util.Scanner;

public class RightAlignedInvertedTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
//           for(int i=n;i>=1;i--) {
//        	   for(int j=1;j<=n-i;j++) {
//        		   System.out.print(" ");
//        	   }
//        	   for(int j=1;j<=i;j++) {
//        		   System.out.print("*");
//        	   }
//        	   System.out.println();
//           }

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
