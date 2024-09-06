class M1{
    void m1(){
        System.out.println("M1");
    }
}
class M2 extends M1{
    void m2(){
        System.out.println("M2");
    }
}
class M3 extends M2{
    void m3(){
        System.out.println("M3");
    }
}
public class multilevel {
    public static void main(String[] args) {
        M3 m=new M3();
        m.m3();
        m.m1();
        m.m2();
    }
}
