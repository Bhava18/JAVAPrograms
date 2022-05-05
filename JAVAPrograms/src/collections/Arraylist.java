package collections;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Bhava");
		al.add("Sowbarni");
		al.add(20);
		al.add(18);
		al.add("Tamil");
		al.add(9.3f);
		al.add(2, "Playing");
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.indexOf(20));
		System.out.println(al.size());
		System.out.println(al.contains(20));
	
//		al.clear();
//		System.out.println(al);
		System.out.println(al.isEmpty());
//		al.removeAll(al);
//		System.out.println(al);
//		using for loop
		System.out.println("using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
//		using for-each loop
		System.out.println("using for-each loop");
		for(Object t:al) {
			System.out.println(t);
			
		}
//		using itertor
		System.out.println("using iterator");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		using list iterator
		System.out.println("List iterator");
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("previous");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		
		
		
			
		}
	}

	

