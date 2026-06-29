import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "indhu";
        int password = 123;
        int phoneno = 12345678;
        System.out.print("Enter username: ");
        String inputuser = sc.nextLine();
        System.out.print("Enter password: ");
        int inputpass = sc.nextInt();
        System.out.print("Enter phone number: ");
        int inputphone = sc.nextInt();
        if (inputuser.equals(username)) {
            if (inputpass == password) {
                if (inputphone == phoneno) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Incorrect phone number");
                }
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect username");
        }
    }
}