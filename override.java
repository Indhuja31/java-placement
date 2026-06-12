import java.util.Scanner;
class C {
    int add(int a, int b) {
        return a + b;
    }
}
class Adr extends C {
    int add(int a, int b) {
        System.out.println("Using Advanced Calculator add method");
        return a + b;
    }
}
public class override {
    public static void main(String[] args) {
        C calc = new C();
        int result = calc.add(15, 25);

        System.out.println("Sum = " + result);
    }
}
