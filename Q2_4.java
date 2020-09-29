import java.util.Scanner;
public class Q2_4 {
	public static void main(String arg[]) {
		Scanner sca =new Scanner(System.in);
		int in = sca.nextInt();
		int sum=0;
		while(in > 1){
			if(in%2 == 0){
				in=in/2;
			}else{
				in = in*3+1;
			}
			sum++;
		}
		System.out.print(sum);
	}
}
