package MustInterview;


class base1{
	base1(){
	System.out.println("cons 1");
	}
	base1(String name){
		this();
	System.out.println(name);
	}
}
class child1 extends base1{
	child1(){
		super();
	}
	child1(String name){
	super(name);	
	}
}

public class Can_Constructor_OverloadorOverridden {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 cd=new child1("cons 2");
		
		
		
	}

}
