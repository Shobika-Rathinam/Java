public class thrd extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thrd m=new thrd();
		Thread s2=new Thread();
//System.out.println(s2.getName());
//ystem.ut.println(s2.getId());
		s2.setName("Siva");
		System.out.println(s2.getName());
	    Thread s3=new Thread();
	    s3.setName("Krishna");
	    System.out.println(s3.getName());
	   
	    s2.start();
	    System.out.println(s2.isAlive());
	    System.out.println(Thread.currentThread().getName());
	    
	  
	}

}
