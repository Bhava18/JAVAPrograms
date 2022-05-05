package collections;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> symbols=new HashMap<String,String>();
		symbols.put("National Bird", "Peacock");
		symbols.put("Natinal Animal","Tiger");
		symbols.put("Natinal Tree", "Banyan Tree");
		symbols.put("National flower", "Lotus");
		symbols.put("National aquatic animal","Dolphin");
		symbols.put("National River", "Ganga");
		System.out.println("Natinal symbols of India:"+symbols);
		System.out.println(symbols.size());
//		using for each
		for(Map.Entry< String,String> m:symbols.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("Hashmap contains:"+symbols.containsKey("National anthem"));
		System.out.println("To find hashmap empty or not :"+symbols.isEmpty());
		
		
		System.out.println("-------------------------------------------");
		Map<String,String> symbols1=new LinkedHashMap<String,String>();

		symbols1.put("National Bird", "Peacock");
		symbols1.put("Natinal Animal","Tiger");
		symbols1.put("Natinal Tree", "Banyan Tree");
		symbols1.put("National flower", "Lotus");
		symbols1.put("National aquatic animal","Dolphin");
		symbols1.put("National River", "Ganga");
		System.out.println("Natinal symbols of India:"+symbols1);
		System.out.println(symbols1.size());
//		using for each
		for(Map.Entry<String,String> m1:symbols1.entrySet()) {
			System.out.println(m1.getKey()+"="+m1.getValue());
		}
		System.out.println(symbols1.entrySet());

		}
	}


 