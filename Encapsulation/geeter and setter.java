package inheri2;
class krishna{
	private int age;//private fields
	private String hobby;
	public String getHobby()
	{
		return hobby;
	}
	public void setHobby(String hobby )
	{
		this.hobby=hobby;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.print("Enter crt age");
		}
	}
	
}
class class2 {
	public static void main(String args[]) {
		krishna k=new krishna();
		k.setAge(1);
		k.setHobby("playing");
		System.out.println(k.getAge());
		System.out.println(k.getHobby());
		
	}

}
