abstract class Bike{
    abstract void run();
}
public class Abs extends Bike{
    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Bike ob=new Abs();
        ob.run();
    }
}
