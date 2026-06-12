import java.lang.*;
import java.util.Scanner;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        name = "indhu";
        System.out.println(name);

        System.out.print("Enter the name: ");
        String a = sc.nextLine();
        System.out.println("enter the name is :"+a);
        String b = name.concat(" ").concat(a);
        System.out.println(b);

        String first = new String("daughter");
        String second = new String("father");
        String s = first.concat(" ").concat(second);
        System.out.println(s);

        String val1 = "135";
        String val2 = "789";
        String o = val1 + val2;
        System.out.println("reasult:"+o);

        String x = new String("132");
        String y = new String("132");
        System.out.println(x == y);

        a = "Java programming";
        int res = a.length();
        System.out.println("the length of the name is : " + res);

        String d = " Java welcome";
        for(char i : d.toCharArray()){
            System.out.println(i);
        }
     }
}
