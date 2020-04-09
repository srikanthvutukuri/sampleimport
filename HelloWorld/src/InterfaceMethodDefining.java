
interface Phone
{

	void call();
	
	default void msg()
	{
		System.out.println("messaging done successfully");
	}
}


class Iphone implements Phone
{

	
	  public void call() {
	  System.out.println("calling functionality worked .....");
	  
	  }
	 
 
 
}


public class InterfaceMethodDefining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Phone phone=new Iphone();
		phone.call();
		
phone.msg();		
		
	}

}
