class Departmentstore{

    int pens(String pen)
    {
        if(pen=="SAG") {
            return 30;
        }
        if(pen=="Apsara")
        {
            return 40;
        }
        if(pen=="Sagan")
        {
            return 60;
        }
        return 0;
    }
    int pencils(String pencil)
    {
        if(pencil=="Sagan")
        {
            return 8;
        }
        if(pencil=="Apsara")
        {

            return 9;
        }
        if(pencil=="SAG") {
            return 5;
        }
        return 0;
    }
}
class Employee extends Departmentstore{
    void purchase()
    {
        System.out.println("SAG Pencils "+pencils("SAG"));
        System.out.println("SAG pens "+pens("SAG"));
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.purchase();
       // System.out.println(emp.price);
    }
}
