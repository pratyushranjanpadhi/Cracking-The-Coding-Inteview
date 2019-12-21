/*Problem statement

Implement an algorithm to determine if a string has all the unique characters. What if you can not 
use additional  data structure.

Example : 
sonu => true
sono => false
sonO => true
*/


/*Solution
(These two do not use additional data structure but are inefficient compared to the third one) 
1. Compare every character with all other characters with two loops => O(n^2)
2. Sorting the string and checking the neighboring character if the are equal => O(nlogN) which is for sorting

(This one uses additional data structure but is the most efficient algorithm)
3. The Discussed one : Take a boolean array of size 128(Assuming it to be ASCII). Initially all elements will
   be false . Then for each character in the string, find its ASCII value(Lets say i) and check the i-th index.
   If it has already been visited then return false or return true. => O(n)
 */ 


package com.sonu.problems.chapter1;

import java.util.Scanner;

public class IsUnique {
	
	public static boolean isUnique(String str) {
		boolean[] checker = new boolean[128];
		
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);//converts the character to ASCII value
			if(checker[val]) { //if it is already visited then returns false
				return false;
			}
			else {
				checker[val] = true;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isUnique(str));

	}

}
