package pattern.patterns;
import java.util.Scanner;
public class pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i=0;i<2*n;i++){
            int col = (n > i) ? i : ((2 * n) - i);
            for (int j=0;j<n-col;j++){
                System.out.print("  ");
            }
            for(int j=col;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=col;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
