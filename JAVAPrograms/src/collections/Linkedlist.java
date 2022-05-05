package collections;
import java.util.* ;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll =new LinkedList<Integer>();
		ll.add(12);
		ll.add(23);
		ll.add(45);
		ll.add(34);
		ll.add(12);
		System.out.println("linkedlist:"+ll);
		
// adding elements		
//		adding element at first
		ll.addFirst(77);
		System.out.println("linked list after adding element into first:"+ll);
//		add an element at last
		ll.addLast("bhava");
		System.out.println("linked list after adding element at last:"+ll);
//		getting element
		System.out.println("getting first:"+ll.getFirst());
		System.out.println("get last:"+ll.getLast());
		System.out.println("get using index:"+ll.get(3));
//		remove firt occurence 
		ll.removeFirstOccurrence(12);
		ll.removeLastOccurrence("bhava");
		System.out.println("remove first occurence:"+ll);
		System.out.println("remove last occurence:"+ll);
		
//	delete the element
		ll.remove("bhava");
		
		System.out.println("remove:"+ll);
		
//		poll is used to remove element
		
		System.out.println("removing using poll first:"+ll.pollFirst());
		
		System.out.println("removing using poll last:"+ll.pollLast());
//		using iterator
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println("using iterator:"+it.next()); 
		}
		ListIterator lit=ll.listIterator();
		while(lit.hasNext()) {
			System.out.println("using list iterator:"+lit.next());
		}
		while(lit.hasPrevious()) {
			System.out.println("get previous:"+lit.previous());
		}



	}

}