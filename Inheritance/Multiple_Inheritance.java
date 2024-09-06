interface  vehicle{
    void start();
}
interface features{
    void gps();
}
class Car implements vehicle,features{
    public void start()
    {
        System.out.println("Car started!! Won't wait for a single minute");
    }
    public void gps(){
        System.out.println("gps started tracing !!you can't hide any more");
    }
}
public class multiple {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.gps();
    }
}
