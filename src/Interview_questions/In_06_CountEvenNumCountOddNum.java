package Interview_questions;

public class In_06_CountEvenNumCountOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int given=1245;

		int even_count=0;
		int odd_count=0;

		while(given>0){
			int ret=given%10; // 1 2 3 4
			if(ret%2==0){
				even_count++;
			}
			else {
				odd_count++;
			}	
			given=given/10;	//1  
		}
		System.out.println("Number of even Numbers:"+even_count);
		System.out.println("Number of Odd Numbers:"+odd_count);


	}

}
