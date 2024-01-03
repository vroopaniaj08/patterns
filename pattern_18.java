package pattern.patterns;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                int value = Math.min(Math.min(i,j),Math.abs(Math.min(2*n-i,2*n-j)));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
