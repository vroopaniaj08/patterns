package pattern.patterns;
import java.util.Scanner;
public class pattern_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
