package L1;
import java.util.*;
public class q2588 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        scanner.nextLine();     
        b = scanner.nextInt();

        int c =  a*(b%10);
        int d = a*((b/10)%10);
        int e = a*(b/100);
        int f = c+(d*10)+(e*100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        scanner.close();
    }
}
