package pattern.patterns;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int space = n-1;
        int number = 1;
        for (int i =0 ;i<n;i++){
            for (int j=0;j<space;j++){
                System.out.print(" ");
            }
            number =1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number = number * (i-j)/(j+1);
            }
            space--;
            System.out.println();
        }
    }
}
