package pattern.patterns;

import java.util.Scanner;

public class pattern_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i=1;i<=2*n;i++){
            int i1 = 2 * n - i;
            int line = (i>n)? i1 :i;
            for (int j=0;j<line;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
