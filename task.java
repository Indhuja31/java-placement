import java.lang.*;
import java.util.Scanner;
public class task {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Accepted positive age only");
        }
    }
      public static void main(String[] args) {
        task t = new task();

        t.setName("indhu");
        t.setAge(21);

        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
