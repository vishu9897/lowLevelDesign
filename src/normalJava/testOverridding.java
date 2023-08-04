package normalJava;
class parentInherit{
	public void show()
	{
		System.out.println("testing show method in parent class");
	}
} 
class childInherit extends parentInherit{
	 public void show()
	{
		System.out.println("testing show method in child class");
	}
}
public class testOverridding {
	protected void display()
	{
		System.out.println("display Method");
	}
	public static void main(String args[])
	{
		
		parentInherit obj= new parentInherit();
		obj.show();
		parentInherit obj1= new childInherit();
		obj1.show();
		childInherit obj2= new childInherit();
		obj2.show();
		parentInterface obj3= new childInterface();
		obj3.wheel();
		testOverridding obj4=new testOverridding();
		obj4.display();
	}
	
}
