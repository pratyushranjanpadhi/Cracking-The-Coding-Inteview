/*Problem Statement
 * Write a program to replace all spaces in a string with "%20". 
 * 
 * Example : "Mr Pratyush Ranjan" => "Mr%20Pratyush%20Ranjan"
 * First input is the true length of the string and the string
 * 
 * Input : 18, "Mr Pratyush Ranjan"
 * Output : "Mr%20Pratyush%20Ranjan"
 */
package com.sonu.problems.chapter1;

import java.util.Scanner;

public class URLify {
	
	public static String urlify(int n, String str) {
		char[] ch = new char[n];
		ch = str.toCharArray();
		int counter = 0;
		for(int i=0; i<n; i++) {
			if(ch[i] == ' ') {
				counter ++;
			}
		}
		
		int newSize = n + (counter*2);
		char[] result = new char[newSize];
		for(int i=0; i<n; i++) {
			if(int i=)
		}
		return "";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(urlify(n, str));
	}

}
