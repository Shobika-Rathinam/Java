package Inheri1;
import java.util.Scanner;
class saroo extends Exception{
	saroo()
	{
		super("siva");
	}
	saroo(String s)
	{
		super(s);
	}
}
public class exphandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(saroo s)
		{
			System.out.println(s.getMessage());
		}

	}

	static void validate(int age) throws saroo
	{
		if(age<18)
		{
			throw new saroo("Krishna");
		}
		else {
			System.out.println("valid");
		}
	}
}
