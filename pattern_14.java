package pattern.patterns;
import java.util.Scanner;
public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i=1;i<=2*n;i++){
            int col = (n > i) ? i : ((2 * n) - i);
            for (int j=0;j<col;j++){
                System.out.print("*");
            }
            int a = n-i;
            int b = i-n;
            int space = (n>i) ? 2*a : 2*b;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for (int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
