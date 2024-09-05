import java.util.*;
public class mergeArrays {
	public static void main(String[] args) {

		int n[]= {1,2,7};
		int m[]= {5,6,2,8};
		int me[]=new int[7];
		System.arraycopy(n,0, me, 0, n.length);
		System.arraycopy(m, 0, me,n.length, m.length);
		Arrays.sort(me);
		for(int i=0;i<me.length -1;i++)
		{
			if(me[i]==me[i+1])
			{
				me[i+1]=0;
			}
		}
		for(int i=0;i<me.length;i++)
		{
			if(me[i]!=0)
			{
				System.out.print(me[i]);
			}
		}
	}

}
