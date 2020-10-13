import java.util.ArrayList;
import java.util.Scanner;
public class Q4 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int bigo = Integer.MIN_VALUE;
        int m = scanner.nextInt();
        int tesknum;
        for(int i = 0 ;i < m;i++){
            int s = scanner.nextInt();
            int o = scanner.nextInt();
            if(bigo < o){
                bigo = o;
            }
            list.add(new tesk(s,o));
        }
        for(int t = 0;t < bigo;t++){
            for(int nt = 0;nt < list.size();nt++){
//                if(list)
            }
        }
    }
}

class tesk{
    int s;
    int o;
    public tesk(int s,int o){
        this.s = s;
        this.o = o;
    }

    public int getO() {
        return o;
    }

    public int getS() {
        return s;
    }
}

