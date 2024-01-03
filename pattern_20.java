package pattern.patterns;

import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
