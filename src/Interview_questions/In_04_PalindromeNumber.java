package Interview_questions;

import java.util.Scanner;

public class In_04_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* a palindrome number is a number that remains the same when its 
		 digits are reversed. like 16461 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int givenNum=sc.nextInt();
		int org_no=givenNum;
		int rev=0;
		while(givenNum!=0) {
			rev=rev*10+givenNum%10;
			givenNum=givenNum/10;
		}
		
		if(rev==org_no) {
			System.out.println(org_no+" is Palindrome Number");
		}
		else {
			System.out.println(org_no+" is not Palindrome Number");
		}
		
		
		
		
	}

}
