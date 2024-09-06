class siva{
    void siva()
    {
        System.out.println("hotel Siva");
    }
}
class menu extends siva{
    void menu()
    {
        System.out.println("List of items:\n idly\n chappati");
    }
}
public class over {
    public static void main(String[] args) {
        menu m = new menu();
        siva s = new siva();
        s.siva();
        m.menu();


    }
}
