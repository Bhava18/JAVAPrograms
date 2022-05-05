package Interface;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone  sp=new SmartPhone();
		sp.calling();
		sp.dialing();
		sp.messaging();
		sp.messaging();
		}
}
interface Features{
	void dialing();
	void calling();
}
interface Addons{
	void vcalling();
	void messaging();
	}
class SmartPhone implements Features,Addons {
	public void dialing()
	{
		System.out.println("we can dial through smartphone");
	}
	public void calling()
	{
		System.out.println("we can call through smartphone");
	}
	public void vcalling() {
		System.out.println("we can videocall through smartphone");
	}
	public void messaging() {
		System.out.println("we can message through smartphone");
	}

	
}
