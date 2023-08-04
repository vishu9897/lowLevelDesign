package normalJava;

abstract class parent{
	void wheel(){
		System.out.println("Wheel method of parent class");
	}
	abstract protected void tyre();
}
class child extends parent
{
	protected void tyre()
	{
		System.out.println("Tyre method to check abstarction");
	}
}
public class testAbstract {

	public static void main(String[] args) {
		parent ob=new child();
		ob.wheel();
		ob.tyre();
	}

}
