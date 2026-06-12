import java.lang.*;
import java.util.Scanner;
public class bulider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mkce");
        sb.append(" welcome");
        System.out.println(sb);
        sb.insert(5, " to ");
        System.out.println(sb);
        sb.replace(0, 5, "college");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
