import java.io.*;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println("neither prime or composite");
        } 
        else if (isPrime(n)) {
            System.out.println("prime number");
        } 
        else {
            System.out.println("composite number");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}