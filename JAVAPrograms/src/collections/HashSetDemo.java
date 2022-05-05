package collections;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
//		hashSet does not maintain insertion order becoz of hashcode
//		 doesn't allow duplicates
		Set<String> names =new HashSet<String>();
		names.add("jack");
		names.add("Jill");
		names.add("rose");
		System.out.println("HashSet:"+names);
		names.add("juliet");
		System.out.println("HashSet after adding element:"+names);
		System.out.println("remove object:"+names.remove("Jill"));
//		Iterator
//		in set interface there is no SetIterator
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("--------------------------------");
//		LinkedHashSet is for the purpose of getting elements in insertion order
		Set<Integer> numbers=new LinkedHashSet<Integer>();
		numbers.add(12);
		numbers.add(23);
		numbers.add(18);
		System.out.println("LinkedHashSet:"+numbers);
		System.out.println("to find the set is empty:"+numbers.isEmpty());
		System.out.println("Set size:"+numbers.size());
		
		
		Set<Integer>numbers1=new LinkedHashSet<Integer>();
		System.out.println("another set:"+numbers1);


		numbers1.addAll(numbers);
		System.out.println("adding elments from numbers:"+numbers1);
		System.out.println("contains:"+numbers1.containsAll(numbers));
//		Iterator
		Iterator<Integer> IT=numbers.iterator();
		while(IT.hasNext()) {
			System.out.println("Iterator:"+IT.next());
		}
		
		
		
	

	}

}
