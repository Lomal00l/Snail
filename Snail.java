package startNew1;
import java.util.*;

public class Snail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int a,b,h;
        double sum;
        //Start Data
        System.out.println("a");
        a = scan.nextInt();
        System.out.println("b");
        b = scan.nextInt();
        System.out.println("h");
        h = scan.nextInt();
        sum = a-b;
        double exit = h/sum;

        if(sum == 0 | exit <= 0) {
            System.out.println("Impossible");
        }else {
            System.out.println(exit);
        }
    }
}
