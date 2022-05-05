package collections;
import java.util.*;


public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(101,"Bhavadharani","erode");
Student s2=new Student(102,"Sowbarnika","erode");
Student s3=new Student(103,"sowmiya","tirupur");
Student s4=new Student(104,"Sriya","tirupur");


List<Student>l=new ArrayList<>();
l.add(s1);
l.add(s2);
l.add(s3);
l.add(s4);




Student s5=new Student(105,"Nikki","Nilgris");
Student s6=new Student(106,"Niviya","nilgris");
Student s7=new Student(107,"Kavya","chennai");


List<Student>l1=new ArrayList<>();
l1.add(s5);
l1.add(s6);
l1.add(s7);

l.addAll(l1);



for(Student st:l) {
System.out.println("Roll No:"+  st.rollNo   +"Name:"  +  st.name    +  "Address:"  +  st.address);
}



//for(Student st:l1) {
//System.out.println("RollNo:"  +  st.rollNo+  "Name:"+  st.name+  "Address:"+  st.address);
//}

	}
}
 class Student{
	public int rollNo;
	public String name;
	public String address;
 
	
	public Student(int rollNo,String name,String address) {
		this. rollNo=rollNo;
		this. name=name;
		this. address=address;
	}
 
	
 }

