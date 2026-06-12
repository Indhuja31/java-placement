import java.io.*;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        String firstName = name.split(" ")[0];
        System.out.println("First name: " + firstName);
    }
} 