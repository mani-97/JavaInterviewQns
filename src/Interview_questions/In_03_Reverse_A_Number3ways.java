package Interview_questions;

import java.util.Scanner;

public class In_03_Reverse_A_Number3ways {

	public void usingNormalway() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int given=sc.nextInt();
		int rev=0;
		do {
			rev=rev*10+given%10;
			given=given/10;
		}while(given!=0);
		System.out.println("reverse number is:"+rev);	
	}
	public void usingStringBuffer() {
		int given=1234;
		String strNum=String.valueOf(given);
		StringBuffer sb=new StringBuffer(strNum);
		StringBuffer reverse=sb.reverse();	
		System.out.println(reverse);
	}
	public void usingStringBuilder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int givenNum=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(givenNum);
		StringBuilder reverse=sb.reverse();	
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}
}
