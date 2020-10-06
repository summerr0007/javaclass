import java.util.Scanner;
public class Q3_1 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n,k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        for(int i = 1;i <= n;i++){
            int cou = 0;
            for(int j = 1 ;j<= k;j++){
                if(i%j==0){
                    cou++;
                }
            }
            if(cou%2==1){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
