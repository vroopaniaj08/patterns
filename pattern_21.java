package pattern.patterns;

import java.util.Scanner;

public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k=0,n = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(++k + " ");
            }
            System.out.println();
        }
    }
}
