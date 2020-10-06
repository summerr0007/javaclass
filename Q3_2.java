import java.util.Scanner;
public class Q3_2 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int m,n;
        int[][] arr;
        m = scanner.nextInt();
        n = scanner.nextInt();
        arr = new int[m][n];
        for(int i = 0 ;i<m;i++){
            for (int j=0;j < n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ;i<n;i++){
            for (int j=0;j < m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
