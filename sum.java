import java.io.*;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10; 
            sum += digit;     
            n = n / 10; 
        }
        System.out.println(sum);
    }
}
