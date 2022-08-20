package MustInterview;


class Override {
	int a=10;
	
	private void privateMethod() {
		System.out.println("private Method");
	}
	static void method() {
		System.out.println("static method");
	}
	
	/* we cannot override the private or static method. if you try the super class method will hide.
	it is method hidding.
	*/	
}
class Overridden extends Override{
	
	
	
	void privateMethod() {
		System.out.println("private method in childclass");
	}
}
public class Can_we_override_PirvateMethod {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Overridden over=new Overridden();
		over.privateMethod();
	}

}
