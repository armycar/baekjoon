package L2;

import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
    
        int newHour = hour;
        int newMinute = minute - 45;

        if(newMinute < 0 && newHour >0) {
            newHour -=1;
            newMinute +=60;
            System.out.println(newHour+" "+newMinute);
        }
        else if(newMinute < 0 && newHour <= 0) {
            newHour +=23;
            newMinute +=60;
            System.out.println(newHour+" "+newMinute);
        }
        else 
        System.out.println(newHour+" "+newMinute);
    }
}
