package Interview_questions;

import java.util.Scanner;

public class FindLargestOf3Numbers2ways {

	public void usingIfelse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int Num1=sc.nextInt();
		System.out.println("Enter the numbers:");
		int Num2=sc.nextInt();
		System.out.println("Enter the numbers:");
		int Num3=sc.nextInt();
		
		if(Num1<Num3&&Num3>Num2) {
			System.out.println(Num3+"is Largest Number");
			
		}else if(Num1<Num2&&Num2>Num3) {
			System.out.println(Num2+"is Largest Number");
		}
		else {
			System.out.println(Num1+"is Largest Number");
		}
	}
	public void usingTernaryOperator() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int Num1=sc.nextInt();
		System.out.println("Enter the numbers:");
		int Num2=sc.nextInt();
		System.out.println("Enter the numbers:");
		int Num3=sc.nextInt();
		//Ternary operator;
				int largeNum=Num1>Num2?Num1:Num2;
				int largestNum=largeNum>Num3?largeNum:Num3;
				System.out.println(largestNum);
				
				//simple logic 
				int large=Num3<(Num1>Num2?Num1:Num2)?Num3:(Num1>Num2?Num1:Num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
