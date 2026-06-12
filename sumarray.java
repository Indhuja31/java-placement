import java.io.*;
import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("even index value: ");
        for (int i = 0; i < 5; i += 2) {
            System.out.println(arr[i]);
        }
        System.out.println("odd index value: ");
        for(int i = 1; i < 5; i += 2){
            System.out.println(arr[i]);
        }
    }
}