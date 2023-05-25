package L2;

import java.util.Scanner;

public class q2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();

        int newHour = hour;
        int newMinute = minute + time;

        if(newMinute>=60) {
            newHour += newMinute/60;
            newMinute %= 60;
            if(newHour>=24) {
                newHour %= 24;
            }
        }
        System.out.println(newHour+" "+newMinute);
        scanner.close();
    }
}
