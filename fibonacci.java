import java.io.*;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1,n;
        System.out.print("Enter the limit number: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
