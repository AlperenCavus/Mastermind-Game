import java.util.*;
public class project01 {

	public static void main(String[] args) {
		boolean[] number= new boolean[10000];

		for(int i=0;i<1000;i++) {
			number[i]=false;
		}
			for(int j=1000;j<number.length;j++) {
				int firstDigit= j / 1000;
			int secondDigit= j / 100 % 10;
			int thirdDigit= j % 100 / 10;
			int fourthDigit= j % 100 % 10;
					
			if((firstDigit==secondDigit)||(firstDigit==thirdDigit)||(firstDigit==fourthDigit)||
					(secondDigit==thirdDigit)||(secondDigit==fourthDigit)||(thirdDigit==fourthDigit))
			{
				number[j]=false;
			}
			else {
				number[j]=true;
			System.out.println(j);
			}
			
			}
			
	}
}
		
		
		
		
		
		
	

