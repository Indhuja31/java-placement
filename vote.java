import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println((n >= 18) ? "elgibile" : "not elgibile");
    }
}
