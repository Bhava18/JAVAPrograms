package class2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="Bhavadharani";
		String name2="Sowbarnika";
		System.out.println("Name:"+name1);
		System.out.println("Name:"+name2);
		System.out.println("String of two names:"+(name1+name2 ));
		System.out.println(name1+" "+name2);
		System.out.println("String length:"+name1.length());
		System.out.println("String length:"+name2.length());
		System.out.println("Total string length:"+(name1.length()+name2.length()));
		System.out.println("String char:"+name1.charAt(0));
		System.out.println("String char:"+name2.charAt(8));
		
		
		
		String name3="This is Bhavadharani";
		String name4="I am Sowbarnika";
		System.out.println("String starting:"+name3.startsWith(""));
		System.out.println("String Starting:"+name4.startsWith("I"));
		System.out.println("String index:"+name3.indexOf("h"));      
		System.out.println("String index:"+name4.indexOf("S") );
		System.out.println("equals:"+name1.equals("bhavadharani"));
		System.out.println("equal:"+name3.equalsIgnoreCase(name4));
		System.out.println("String contains:"+name4.contains(name2));
		System.out.println("String contains"+name3.contains("is"));
		System.out.println("endswith:"+name4.endsWith("Sowbarnika"));
		System.out.println("endswith:"+name1.endsWith("i"));
		System.out.println("endswith:"+name4.endsWith(name2));
		System.out.println("String is empty:"+name2.isEmpty());
		System.out.println("replace:"+name4.replace("I", "Hi I"));
		System.out.println("substring:"+name3.substring(1,7));
		System.out.println("uppercase:"+name1.toUpperCase());
		System.out.println("lowercase"+name4.toLowerCase());
		System.out.println("Before string length:"+name3.length());
		System.out.println("trim string:"+name3.trim());
		System.out.println("After trim length of string:"+name4.trim().length());
		String[ ] namesplit=name4.split( "");
		System.out.println(namesplit[0]);
		System.out.println(namesplit[1]);
		System.out.println(namesplit[2]);
		System.out.println(namesplit[3]);
		System.out.println(namesplit[4]);
		System.out.println(namesplit[5]);
		System.out.println("S.M. "+name1);
		System.out.println(name2.length());
			
		}
	
		}

		
		
		
	
		


