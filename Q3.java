import java.util.Scanner;
public class Q3 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String sa,sb;
        int a=0,b=0;
        sa = scanner.next();
        sb = scanner.next();
        for(int i = 0;i<sa.length();i++){
            if(sb.indexOf(String.valueOf(sa.charAt(i))) == i){
                a++;
            }else if(sb.contains(String.valueOf(sa.charAt(i)))){
                b++;
            }
        }
        System.out.print(a+" "+b);
    }
}
