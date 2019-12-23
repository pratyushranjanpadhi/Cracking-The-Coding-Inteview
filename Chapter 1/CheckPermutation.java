/*Problem Statement
 * Given two Strings , you have to check if the two strings are permutation of each other or not.(Permutation 
 * means if the two strings contains all the same characters or not)
 * 
 * Example
 * "hello" and "loleh" => True
 * "string" and "trsgni" => True
 * "sonu" and "sonfu" => False
 * "Hello" and "hello" => False
 * "hello  " and "hello" => False
 *  */

/* Solution 
 * Assumption : We assume that the strings are case sensitive(Example 4) and space is not allowed(Example 5)
 * 
 * 1: Sort the two strings and then compare both to find if they are equal => O(nlogN) which is for sorting
 */
package com.sonu.problems.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	// for sorting the strings
	public static String doSort(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

	// function implements the logic
	public static boolean permutation(String s1, String s2) {
		String sortedStr1 = doSort(s1);
		String sortedStr2 = doSort(s2);

		return (sortedStr1.length() != sortedStr1.length()) ? false : sortedStr1.equals(sortedStr2);//checks if the sorted strings are equal

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		System.out.println(permutation(s1, s2));

	}

}
