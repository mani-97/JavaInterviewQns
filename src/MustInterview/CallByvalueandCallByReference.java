package MustInterview;

class IntWrapper {
	   public int a;
	   public IntWrapper(int a){
		   this.a = a;
		   
		   }
	}
public class CallByvalueandCallByReference {
	//call by value method
	 public static void sum(int a, int b) {
	      int c=a+b;
	      System.out.println("total"+c);
	   }
	 //call by referce method
	 public static void sum(IntWrapper a, IntWrapper b) {
	     int  c= a.a+b.a;
	      System.out.println("total"+c);
	   } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call by value()
		// the actual and formal arguments will be created different memory location
		sum(20, 50);
		
		//call by reference
		// the actual and formal arguments will be created in the same location 
		 IntWrapper a = new IntWrapper(30);
	      IntWrapper b = new IntWrapper(45);
	   
	      sum(a, b);
		
	}

}
