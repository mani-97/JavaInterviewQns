package MustInterview;

class base2{
	base2(){
		System.out.println("constructor");
	}
}
class child extends base2{
	child(){
		super();
		System.out.println("constructor b");
	}
}

public class Constructor_Callfrom_AnotherConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child b=new child();

	}

}
