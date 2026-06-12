import java.util.Scanner;
class teacher{
    String name;
    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("name: "+name);
    }
}
    class department extends teacher{
        String dname;
        Scanner sc = new Scanner(System.in);
    void getdept(){
        System.out.println("Enter the dname: ");
         String dname = sc.nextLine();
         System.out.println("d name: "+dname);
    }
}
    public class multilevel{
        public static void main(String args[]){
            teacher t = new teacher();
            t.getdata();
            department d = new department();
            d.getdept();
    }
}