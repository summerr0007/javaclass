import java.util.Scanner;
import java.text.*;
public class Q2 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
//        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        int man,money=0;
        man = scanner.nextInt();
        money += man/10*800;
        man%=10;
        money += man/5*440;
        man%=5;
        money += man/2*180;
        man%=2;
        money += man/1*100;
        System.out.print(money);
    }

}
