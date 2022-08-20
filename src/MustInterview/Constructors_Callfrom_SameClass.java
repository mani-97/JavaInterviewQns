package MustInterview;

class constructor{
	//default constructor
 constructor() {
		System.out.println("Constructor 1");
	}
 //parameterized constructor
	constructor(int a){
		this();
		System.out.println("Constructor"+a);
	}
}
public class Constructors_Callfrom_SameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		constructor con=new constructor(2);
		
		

	}

}
