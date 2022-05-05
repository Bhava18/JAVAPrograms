package Inheritance;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circumfernce cr=new Circumfernce();
		cr.circumferece(23);
		cr.rectangle(12, 40);
		cr.square(22);
		}
}
  class Rectangle{
	void rectangle(int l,int b) {
		 int areaOfRectangle;
		 areaOfRectangle= l*b;
		 System.out.println("Area of rectangle:"+areaOfRectangle);
	}
}
class Square extends Rectangle{
	void square(int a) {
		int areaofsquare;
		areaofsquare=a*a;
		 System.out.println("Area of square:"+areaofsquare);

	}}
class Circumfernce extends Square{
	void circumferece(int b) {
		int circumference;
		circumference=4*b;
		System.out.println("circumference:"+circumference);
		}
}