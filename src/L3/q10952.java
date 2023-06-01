package L3;

import java.util.Scanner;

public class q10952 {
public static void main(String[] args) {
    {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if(A>0 || B>0 ) {
                System.out.println(A+B);
            }
            else if(A==0&&B==0){
                break;
            }
        }
    }
}
}
