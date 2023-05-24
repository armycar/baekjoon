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

        System.out.println(newHour+" "+newMinute);
    }
}
