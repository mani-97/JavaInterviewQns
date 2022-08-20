package Interview_questions;

import java.util.Scanner;

public class In_07_SumOfDigits {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int givenNum=sc.nextInt();
		int sum=0;
		
		while(givenNum>0) {
		sum=sum+givenNum%10;
		givenNum=givenNum/10;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}
	
	
	

}
