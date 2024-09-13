import java.util.*;
class Main implements Runnable {
    public void run()
    {
        int sum=0;
        for(int i=0;i<=3;i++){
            sum+=i;
        }
        System.out.println(sum);
        try{
            Thread.sleep(10000);
        }catch(Exception e)
        {
            System.out.print(e);
        }
    }
    public static void main(String args[])
    {
        Main m=new Main();
        Thread t=new Thread(m);//run method called here
        System.out.println(t.getId());
        t.setName("Siva");
        System.out.println(t.getName());
        t.start();
        System.out.println(t.isAlive());

        
    }
}
