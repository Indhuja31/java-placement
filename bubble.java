import java.io.*;
import java.util.Scanner;
public class bubble {
    public static void main(String args[]) {
        int[] n = {40, 50, 30, 80, 10};
        for (int i = 0; i < 5-1; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        System.out.print("array numbers: ");
        for (int arr : n) {
            System.out.print(arr + " ");
        }
    }
}
