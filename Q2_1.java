
import java.util.Scanner;
public class Q2_1 {
	public static void main(String arg[]) {
		Scanner san = new Scanner(System.in);
		int in = san.nextInt();
		for(int i = 1; i <= in ;i++){
			if(i %9 == 0 && i%7 == 0){
				System.out.print(i+" ");
			}
		}
	}
}
