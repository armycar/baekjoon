package L3;

import java.util.Scanner;

public class q11022 {
public static void main(String[] args) {
    {
       Scanner scanner = new Scanner(System.in);
       int T = scanner.nextInt();
       int C = 0; 

       for(int i=1;i<=T;i++) {
       int A = scanner.nextInt();
       int B = scanner.nextInt();
       C = A+B;
       System.out.println("Case #"+i+": "+A+" + "+B+" = "+C);
       }
}
}
}
