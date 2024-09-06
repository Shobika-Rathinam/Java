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
///////OR---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class metbrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cpy=a;
        int i=1;
        int num=0;
        while(cpy>0) {
            int r=digit(cpy%10);
            num=num+r*i;
            cpy=cpy/10;
            i=i*10;
        }
        System.out.println(num+a);

    }
    public static int digit(int n) {
        if(n==2) {
            return 5;
        }
        else if(n==5)
        {
            return 2;
        } else if (n==6) {
            return 9;
        } else if (n==9) {
            return 6;
        }
        else {
            return n;
        }
    }
}

