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
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        student s=new student(7,"John",30);
        student s1=new student(5,"Jane");
        s.display();
        s1.display();
    }
}
