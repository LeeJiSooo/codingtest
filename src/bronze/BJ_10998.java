package bronze;

import java.util.Scanner;

public class BJ_10998 {
    public static void main(String[] args) {
        int A, B;
        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();

        if(0 < A && B < 10){
            System.out.println(A * B);
        }
    }
}
