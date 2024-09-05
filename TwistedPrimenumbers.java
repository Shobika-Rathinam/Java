package jtraining;
import java.util.Scanner;
public class decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		
		int flag=0,fla=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			
		}
		
		if(flag!=1)
		{
			int k=n;
			while(k>0)
			{
				int rem=k%10;
				r=r*10+rem;
				k/=10;
			}
			for(int j=2;j<r;j++)
			{
				if(r%j==0)
				{
					fla=1;
					break;
				}
				
			}
			if(fla==0)
			{
				System.out.print(n+ " is Twisted Prime");
			}
			else
			{
				System.out.print(n+ " is not Twisted Prime");
			}
		}
		else {
			System.out.print(n+ " is not   Prime");
		}
	
	}

}

