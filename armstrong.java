import java.io.*;
import java.util.Scanner;
public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int real = n;
        int power = String.valueOf(n).length();
        int sum = 0;
        while (n > 0){
            int value = n % 10;
            sum += (int)Math.pow(value, power);
            n /= 10;
        }
        if(sum == real){
            System.out.println("armstrong number:"+real);
        }
        else{
            System.out.println("not a armstrong number:"+real);
        }
    }
}
