import java.util.Scanner;
public class  Factorial{

	public static int fact(int x)
	{
		if(x==0)
		{
			return 1;
		}
		else
		{
			return x*fact(x-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.print(fact(n));
		
	}

}
