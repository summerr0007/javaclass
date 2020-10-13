import java.util.Scanner;
import java.text.*;
public class Q1 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        double x,y,z,speed;
        x = Double.parseDouble(scanner.next());
        y = Double.parseDouble(scanner.next());
        z = Double.parseDouble(scanner.next());
        speed = z/1.6/((60*x)+y)*3600;
        System.out.print("Speed = "+decimalFormat.format(speed));

    }

}
