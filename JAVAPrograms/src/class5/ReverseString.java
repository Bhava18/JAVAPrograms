package class5;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I am from Tamilnadu";
		String reverse="";
//		for(int i=name.length()-1;i>=0;i--) {
//			reverse=reverse+name.charAt(i);
//		}
			
		
//		System.out.print(name.charAt(i));
//		System.out.println("reverse name:"+reverse);
//	using array		
char a[]=name.toCharArray();
int length=a.length;
for(int i=length-1;i>=0;i--) {
	reverse=reverse+a[i];
}
System.out.println("reverse:"+reverse);
	


// using string buffer
StringBuffer sb=new StringBuffer(name);
System.out.println(sb.reverse());
	}
}

