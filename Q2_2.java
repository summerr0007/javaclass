import java.util.Scanner;
public class Q2_2 {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		int in = sca.nextInt();
		int sum = 0;
		for(int i = 0 ;i < in;i++){
			sum += ((1+i)*(3*(i+1))*(5*(i+1))); 
		}
		System.out.print(sum);
	}
}
