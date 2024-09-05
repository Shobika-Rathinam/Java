import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    String email;
    long phno;
    String address;

    Student(int a, String b, int c, String d, long e, String f) {
        id = a;
        name =b ;
        age = c;
        email = d;
        phno =e ;
        address = f;


    }
    void display() {
        System.out.println(id + " " + name + " " + age + " " + email + " " + phno + " " + address + " " );
    }
}
public class stu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id=sc.nextInt();
        System.out.println("Enter student name: ");
        String name=sc.next();
        System.out.println("Enter student age: ");
        int age=sc.nextInt();
        System.out.println("Enter student email: ");
        String email=sc.next();
        System.out.println("Enter student phno: ");
        long phno=sc.nextLong();
        System.out.println("Enter student address: ");
        String address=sc.next();
        Student s=new Student(id,name,age,email,phno,address);

        s.display();
    }
}
