import java.io.*;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }
        System.out.println("reversed number is: " + rev);
    }
}
