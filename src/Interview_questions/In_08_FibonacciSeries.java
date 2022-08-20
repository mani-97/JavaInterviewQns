package Interview_questions;

import java.util.Scanner;

public class In_08_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fibonacci series :
	// a series of numbers in which each number(fibonacci number)is the sum of the preceding two numbers.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int givenNum=sc.nextInt();
		int num1=0,num2=1,fib=0;
		System.out.print("Fibonacci Series:");
		for(int i=2;i<givenNum;i++) {
			fib=num1+num2;				//0,1 1
			System.out.print(" "+fib);
			num1=num2;
			num2=fib;
		}
		
		
		
		
		
		
		
	}

}
