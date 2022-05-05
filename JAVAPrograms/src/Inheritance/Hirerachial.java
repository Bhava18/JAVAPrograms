package Inheritance;

public class Hirerachial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d=new Deer();
		d.run();
		d.eat();
		Cat c=new Cat();
		c.chase();
		c.eat();
		Camel ca=new Camel();
		ca.Storage();
		ca.eat();
}
}
class Aniaml{
	public  void eat() {
		System.out.println("Animals eat carnivours");
	}
}
class Camel extends Animal{
	public void Storage() {
		System.out.println("Camel store water");
	}
}
class Cat extends Animal{
	public void drink() {
		System.out.println("cat drinks milk");
		
	}
	public void chase() {
		System.out.println("cats chase rats");
	}
}
class Deer extends Animal{
	public void run() {
		System.out.println("deer runs very fast");
		
	}
}
