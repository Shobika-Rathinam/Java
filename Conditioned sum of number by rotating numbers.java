import java.util.Scanner;
public class brn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int r;
        int i=1;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            if(r==2)
            {
                r=5;
            }
            else if(r==5)
            {
                r=2;
            }
            else if(r==6)
            {
                r=9;
            }
            else if(r==9)
            {
                r=6;
            }
            sum=sum+(r*i);
            n=n/10;
            i=i*10;
        }
        System.out.println(sum+num);
    }
}
