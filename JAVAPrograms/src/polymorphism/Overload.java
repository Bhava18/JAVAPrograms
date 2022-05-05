package polymorphism;

public class Overload {

	public static void main(String[] args) {
//		TODO Auto generated-  method stub
		A obj = new A();
		obj.add();
		obj.add(34, 76);
		obj.add(23, 12, 6);
		
	}

}
class A{
	void add() {
		int a=12;
		int b=23;
		int c=a+b;
//	c=a+b;
		System.out.println("addition without parameters:"+c);
	}
	void add(int x,int y) {
		int z=x+y;
//		z=x+y;
		System.out.println("addition with two parameters:"+z);
	}
	void add(int p,int q,int r) {
		int s=p+q+r;
//		s=p+q+r;
		System.out.println("addition with three parameters:"+s);
	}
	
	}
