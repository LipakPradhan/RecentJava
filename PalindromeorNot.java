package com.string;

import java.lang.*;
import java.util.*;
public class PalindromeorNot {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String s1="";
		int len =s.length();
		for(int i=len-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("This string is palindrome");
		}else {
			System.out.println("This string is not a palindrome");
		}
	}
}
