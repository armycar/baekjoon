package L3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q15552 {
public static void main(String[] args) {
    {
        try {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        

       int n = Integer.parseInt(reader.readLine());
       int sum = 0;
       for(int i=1;i<=n;i++) {
        String[] input = reader.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        sum = A+B;
        writer.write(String.valueOf(sum));
        writer.newLine();
       }
       writer.flush();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
}
}
}
