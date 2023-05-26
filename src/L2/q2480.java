package L2;
import java.util.*;
public class q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a==b&&b==c) {
            System.out.println(10000+(a*1000));
        }
        else if(a==b && b!=c && c!=a){
            System.out.println(1000+(a*100));
        }
        else if(b==c && a!=b && c!=a){
            System.out.println(1000+(b*100));
        }
        else if(a==c && a!=b && c!=b){
            System.out.println(1000+(c*100));
        }
        else {
            if(a>b && a>c) {
                System.out.println(a*100);
            }
            else if(b>a && b>c) {
                System.out.println(b*100);
            }
            else if(c>a && c>b) {
                System.out.println(c*100);
            }
        }
    }   
}
