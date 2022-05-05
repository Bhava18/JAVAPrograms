package collections;

import java.util.HashSet;

import java.util.Iterator;

public class HashSetWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1=new Employee(101,"Bhavadharani",478);
		Employee s2=new Employee(102,"Sowbarnika",466);
		Employee s3=new Employee(103,"tamilselvi",489);
		
		HashSet hs=new HashSet ();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println("HashSet:"+hs);
//		for each
//	for(Employee e:hs) {
//		System.out.println(e.rollNo);
//			System.out.println(e.name);
//			System.out.println(e.marks);
//		}
		//Iterator<Employee> It=hs.iterator();
//		while(It.hasNext()){
//			System.out.println(It.next());
//		}
		
		

	}

}
  class Employee{
	public int rollNo;
	public String name;
	public int marks;
	
	public Employee(int rollNo,String name,int marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}

//	@Override
public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
