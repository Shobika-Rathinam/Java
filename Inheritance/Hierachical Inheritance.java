class India{
    String PM;
    String CM;
    String Prime()
    {
        this.PM="Mr.Modi";
        return PM;
    }
    String Chief(String name)
    {
        this.CM=name;
        return CM;
    }
}
class Tamilnadu extends India{
    void tamil() {
        System.out.println("Prime Minister of India "+super.Prime());
        System.out.println("Chief Minister of TamilNadu "+super.Chief("Mr.Stalin"));
    }

}
class Kerela extends India{
    void ker(){
        System.out.println("Prime Minister of India "+super.Prime());
        System.out.println("Chief Minister of Kerala "+super.Chief("Mr.Vijayan"));
    }


}
public class hierachical {
    public static void main(String[] args) {
        Tamilnadu t=new Tamilnadu();
        Kerela k=new Kerela();
        t.tamil();
        k.ker();

    }
}
