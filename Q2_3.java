import java.util.Scanner;;
public class Q2_3 {
	public static void main (String arg[]){
		Scanner sca =new Scanner(System.in);
		int t = sca.nextInt();
		long tt = 1;
		long sum = 1;
		for(int i = 1; i <= t;i++){
			tt = tt*2+i;
			sum += tt;
		}
		System.out.print(sum);
	}
	
	
}
