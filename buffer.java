
import java.lang.*;
import java.util.Scanner;
public class buffer {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Mkce");
        String e = " madam ";
        String s = " is a college";

        sb.append(s);
        System.out.println(sb);

        sb.insert(10, " best ");
        System.out.println(sb);

        sb.delete(10, 16);
        System.out.println(sb);
  
        String original = sb.toString();

        sb.reverse();
        System.out.println(sb);

        if (original.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        System.out.println(sb.capacity());
    }
}