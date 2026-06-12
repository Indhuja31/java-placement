import java.io.*;
import java.util.Scanner;
public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("table numbers: "+n);
        for(int i = 1; i <= 10; i++){
            int a = n * i;
            System.out.println(n+ " x " +i+ " = " +a);
        }
    }
}
