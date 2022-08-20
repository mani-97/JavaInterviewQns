package MustInterview;



class Base{
	 static Base ba;
	//private constructor
	private Base(){
		System.out.println("Private constructor");
	}
	Base(int a){
		System.out.println("default constructor");
	}

	//we using the singleton method for call private constructor
	public static Base getOb() {
	// we call constructor  
		ba=new Base();
		return ba;
	}
	class childclass extends Base{
		public childclass() {
			System.out.println("child class const");
		}
		
	}

}
public class Can_Constructor_be_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b=Base.getOb();
		Base bs=new Base(12);
		
	
		
	}

}
