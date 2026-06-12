import java.io.*;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number: ");
        a = sc.nextInt();
        if(a >= 18){
            System.out.println("Major");
        }
        else{
            System.out.println("not Major");
        }
    }
}
