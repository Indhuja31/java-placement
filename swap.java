import java.io.*;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter the number a: ");
        a = sc.nextInt();
        System.out.print("Enter the number b: ");
        b = sc.nextInt();
        System.out.println("Before swapping: " +a+ " " +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:" +a+ " " +b);
    }
}