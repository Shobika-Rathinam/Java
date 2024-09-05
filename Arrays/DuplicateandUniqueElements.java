import java.util.Scanner;
public class DuplicateandUniqueElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int fre[]=new int[257];
		for(int j=0;j<n;j++)
		{
			fre[arr[j]]++;
		}
		System.out.println("Duplicate elements");
		for(int i=0;i<257;i++)
		{
			if(fre[i]>1)
			{
				System.out.println(i+" - "+fre[i]);
			}
		}
		System.out.println("Unique elements");
		for(int i=0;i<257;i++)
		{
			if(fre[i]==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}

