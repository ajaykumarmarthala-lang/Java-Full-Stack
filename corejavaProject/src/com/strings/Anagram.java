package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();

		System.out.println("Enter second string");
		String str2 = sc.next();

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram length fails");
		}
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            if(Arrays.equals(ch1, ch2)) {
            	System.out.println("Anagram");
            }else {
            	System.out.println("Not Anagram");
            }
            
		sc.close();
	}

}
