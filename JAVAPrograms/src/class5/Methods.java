package class5;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m= new Methods();
				m.Add();
		m.Sub(56,23);
		double c;
		c= Mul (1.1,1.3);
		System.out.println("Mul of two numbers:"+c);
		
		System.out.println("div of two numbers;"+(22.3/323.2));
		System.out.println("*********Method2*********");
	Method2 m2=new Method2();
		m2.Sum();
		m2.Sub(123, 45);
		System.out.println("mul with return:"+m2.Mul(11.3, 12.7));
		System.out.println("div with return:"+m2.Div(111.3,3.4));
	}
	void Add() {
		int a=12;
		int b=123;
		int c=0;
		c=a+b;
		System.out.println("sum of two numbers without parameter:"+c);
	}
	void Sub(int a,int b ) {
		int c=0;
		c=a-b;
		System.out.println("sub of two members with parameters:"+c);
}
	static double Mul(double a,double b) {
		double c =0.00;
	c=a*b;
	return c;
	}
	static double Div(double a,double b) {
		double c=0;
		c=a/b;
		return c;
		
			
	}
}
	