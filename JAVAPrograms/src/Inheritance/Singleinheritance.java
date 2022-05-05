package Inheritance;

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.age();
		d.bark();
        d.eat();
        d.rub();
        d.run();
        System.out.println("animal colour:"+d.colourOfAnimal);
        System.out.println("dog colour:"+d.colourOfDog);
	}
}
class Animal{
	String colourOfAnimal="white";

	public void eat() {

		System.out.println("animals are eating");
	}
	public void age() {
		System.out.println("animals have age");
	}
	public  void run() {
		System.out.println("animal is runnig");
	}
}
class Dog extends Animal{
	String colourOfDog="black";

	public void bark() {
		
System.out.println("dog sounds like BOW BOW");
	}
	public  void rub() {
		System.out.println("dog is  rubbing");
	}
	 
	
}
