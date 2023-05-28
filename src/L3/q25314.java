package L3;

import java.util.Scanner;

public class q25314 {
public static void main(String[] args) {
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String ch = "";
        scanner.close();
 
        for(int i=1; i<=N/4 ;i++) {
            ch += "long ";
        }
        System.out.println(ch+"int");
}
}
}
