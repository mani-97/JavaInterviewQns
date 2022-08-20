package Interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class In_02_Reverse_A_String4ways {
	public void conCatnation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String givenStr=sc.nextLine();
		String rev=null;
		int length=givenStr.length();	//name="nani"; 4
		for(int i=length-1;i>=0;i--) {
			rev=rev+givenStr.charAt(i); 		//	0123
		}
	}
	public void usingCharArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:");
		String given=sc.nextLine();
		String reverse ="";
		char[] arr=given.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {	
			reverse=reverse+arr[i];
			System.out.print(reverse);
		}
	}
	public void usingStringBuffer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:");
		String given=sc.nextLine();
		StringBuffer buffer=new StringBuffer(given);
		StringBuffer name=buffer.reverse();
		System.out.println(name);
	}
	public void usingCollections() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:");
		String given=sc.nextLine();
		char[] arr=given.toCharArray();
		List<Character> list=new ArrayList<Character>();

		for (Character character : arr) {
			list.add(character);
		}	
		Collections.reverse(list);
		for (Character chara : list) {
			System.out.println(chara);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

}
