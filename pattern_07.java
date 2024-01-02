package pattern.patterns;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer: ");
        int n = sc.nextInt();
        int p = 2 * n;
        for (int i = 1; i < p; i += 2) {
            for (int j = p; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}