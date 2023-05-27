package L3;

import java.util.Scanner;

public class q25314 {
public static void main(String[] args) {
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String ch = "int";
 
        for(int i=0; i<N ;i++) {
            ch = "long "+ch;
        }
        System.out.println(ch);
}
}
}
