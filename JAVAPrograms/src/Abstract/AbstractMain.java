package Abstract;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
obj.display();
obj.show();


	}

}
 abstract class A{
	abstract void display();
	
 }
abstract class B extends A {
	 void display() {
		 System.out.println("abstract method in class A");
	 }
	 abstract void show();
 }
class C extends B{
	void show() {
	System.out.println("there is one abstract method in class B");
}
}