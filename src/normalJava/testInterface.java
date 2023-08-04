package normalJava;
interface parentInterface{
	 void wheel(); // modifier will be public only for interface as protected are not allowed
	 void tyre();
}
class childInterface implements parentInterface
{
	public void wheel(){
		System.out.println("Wheel method for checking interface");
	}
	public void tyre()
	{
		System.out.println("Tyre method for checking interface");
	}
}
public class testInterface {
	public static void main(String args[])
	{
		parentInterface ob= new childInterface();
		ob.wheel();
		ob.tyre();
	}
}
