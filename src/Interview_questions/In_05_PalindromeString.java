package Interview_questions;

import java.util.Scanner;

public class In_05_PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Palindrome String is a String that remains the same when its Characters are reversed 
		// like e.g: Madam 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:");
		String givenStr=sc.nextLine();
		
		String originalStr=givenStr;
		String reverse="";
		int length=givenStr.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+givenStr.charAt(i);	
		}
		if(reverse.equalsIgnoreCase(originalStr)) {
			System.out.println(originalStr+" is Palindrome String");
		}
		else {
			System.out.println(originalStr+" is not Palindrome String");
		}
		
	}

}
