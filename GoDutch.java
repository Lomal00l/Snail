package startNew1;
import java.util.*;

public class GoDutch {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        double sumGRN;
	        int countFriends;
	        double percent = 10;
	        double partSum;
	        double partPercentGRN;
	        double sumPercentGRN;
	        System.out.println("friends");
	        countFriends = scan.nextInt();
	        System.out.println("sum");
	        sumGRN = scan.nextInt();
	        if(countFriends <= 0) {
	        	System.out.println("Number of friends cannot be negative or zero");
	        }if(sumGRN < 0) {
	        	System.out.println("Bill total amount cannot be negative");
	        }else { 
	        	partPercentGRN = sumGRN * 10 / 100;
	        	sumPercentGRN = partPercentGRN + sumGRN;
	        	partSum = sumPercentGRN / countFriends;
	        	System.out.println(partSum);
	        }
	       
	        

	}

}
