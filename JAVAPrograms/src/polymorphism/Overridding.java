package polymorphism;

public class Overridding {

	public static void 
	main(String[] args) {
		// TODO Auto-generated method stub
		Sweetpotato sp=new Sweetpotato();
		sp.cost();
		sp.taste();
		sp.health();
		sp.type();
		sp.varaties();
			}
}
class Vegetables{
	void health() {
		System.out.println("veggies are healthy");
	}
	void varaties() {
		System.out.println(" a lot of varaties are there");
		
	}
	void cost() {
		System.out.println("the veggies cost extends upto 60");
	}
}
class Cabbage extends Vegetables {
	
	void health() {
		super.health();
		System.out.println("cabbage contains vitamin C");
	}
	void taste() {
		System.out.println("it is very delicious");
	}
	void type() {
		System.out.println("it is a type of leaves");
	}
	
}
class Sweetpotato extends Cabbage{
	void taste() {
		super.taste();
		System.out.println("it is sweet");
		
	}
	void health() {
		super.health();
		System.out.println("it contains fibre");
	}
	void type() {
		super.type();
		System.out.println("it is root");
	}
}
