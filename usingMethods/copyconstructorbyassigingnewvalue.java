public class student {
    int id;
    String name;
    int age;
    student(int i,String n)
    {
        id=i;
        name=n;
    }
    student(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    student(){} 

    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        student s=new student(7,"John",30);
        student s1=new student();
        s1.id=s.id;
        s1.name=s.name;
        s1.age=s.age;
        s.display();
        s1.display();
    }
}
