package class5;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		
	for(int i=1;i<=3;i++)   {                  //for rows      
			for(int k=1;k<=(rows-i);k++) {     //for space                       
				System.out.print(" ");}
			
			for(int j=1;j<=(2*i-1);j++) {       // to print*
				System.out.print("*");
			}
			System.out.println();
		}
//	reverse part
		for(int i=3-1;i>=1;i--) {               // to get diamond deduce one row and decrement rows values
			for(int k=1;k<=(rows-i);k++) {      //for space
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {        //to print *
				System.out.print("*");
			}System.out.println();
		}

	}

}

