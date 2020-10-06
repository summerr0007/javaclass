import java.util.Scanner;
public class Q3_3 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        System.out.print(fibonacci(k+1));
    }
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
