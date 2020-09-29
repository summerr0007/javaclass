import java.util.Scanner;
public class Q2_5 {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		String str = sca.next().toUpperCase();
		char tar = sca.next().toUpperCase().charAt(0);
		int re=0;
		int e =0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == tar){
				if(e != 0){
					System.out.print(i-re+" ");
				}
				
				re = i;
				//System.out.print("__"+re+" re ");
				e++;
			}
			
		}
	}
}
