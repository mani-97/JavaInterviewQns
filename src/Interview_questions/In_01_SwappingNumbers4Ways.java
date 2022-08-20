package Interview_questions;


//swapping is interchaning the value from variable

public class In_01_SwappingNumbers4Ways {
	public void usingThridVar() {
		int mySalary=20000;
		int supervisorSalary=50000;
		System.out.println("before swapping the Mysalary: "+mySalary+" supervisorSalary: "+supervisorSalary);
		int temp=mySalary;
		mySalary=supervisorSalary;
		supervisorSalary=temp;
		System.out.println("After swapping the Mysalary: "+mySalary+" supervisorSalary: "+supervisorSalary);
	}
	public void usingSum() {
		int first=20;
		int second=50;
		System.out.println("before swapping value of first: "+first+" value of second: "+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("After swappingvalue of first: "+first+" value of second: "+second);
	}
	public void usingMulitplication() {
		// the given two numbers are should not to be zero.
		int first=20;
		int second=50;
		System.out.println("before swapping value of first: "+first+" value of second: "+second);
		first=first*second;
		second=first/second;
		first=first/second;
		System.out.println("After swapping value of first: "+first+" value of second: "+second);
	}
	public void usingSingleStatement() {
		int first=20;
		int second=50;
		second=first+second-(first=second);
		System.out.println("value of "+first+" "+second);
		// the execution always execure right to left so
		//s=20+50-(50)=20
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		


	}

}
