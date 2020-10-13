import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Q5 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int m;
        m = scanner.nextInt();
        ArrayList<Integer> neg= new ArrayList<Integer>();
        ArrayList<Integer> in= new ArrayList<Integer>();
        ArrayList<Integer> zero= new ArrayList<Integer>();
        int sum = 1;
        int big = Integer.MIN_VALUE;
        for(int i = 0;i < m;i++){
            in.add(scanner.nextInt());
            if(in.get(i) < 0){
                neg.add(i);
            }else if(in.get(i) == 0){
                zero.add(i);
            }
        }

//        for(int i:in){
//            if(i == 0){
//                if(sum > big){
//                    big = sum;
//                }
//                sum = 0;
//            }else{
//                if()
//            }
//        }
//
        int nt = 0;
        for (int i =0;i < m;i++){
            boolean tt =false;
            if(in.get(i) == 0){
                if(sum > big){
                    big = sum;
                }
                sum = 0;
            }else {
                if(in.get(i) < 0){
                    nt++;
                    for(int z:zero){
                        if(i > z && neg.get(nt-1) < z){
                            tt = false;
                            break;
                        }else{
                            tt = true;
                        }
                    }
                    if(zero.isEmpty()){
                        tt = true;
                    }
                    if(tt == true){
                        sum *= in.get(i);
                    }else{
                        if(sum > big){
                            big = sum;
                        }
                        sum = 0;
                    }

                }else if(nt%2 == 1){
                    if(sum > big){
                        big = sum;
                    }
                    sum = 0;
                }
                else{
                    sum *= in.get(i);
                }

            }
        }
        if(sum > big){
            big = sum;
        }
        sum = 0;
        System.out.print(big);
    }
}
