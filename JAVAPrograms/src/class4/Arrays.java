package class4;

public class Arrays{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int marks[]=new int[6];
		marks[0]=87;
		marks[1]=95;
		marks[2]=83;
		marks[3]=76;	
		marks[4]=98;
		marks[5]=73;
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		int number[][]=new int[3][2];
		number[0][0]=22;
		number[0][1]=45;
		number[1][0]=32;
		number[1][1]=54;
		number[2][0]=36;
		number[2][1]=59;
		for(int[] x:number) {
			for( int y:x) {
				System.out.print(y+" ");}
				System.out.println();}
			
	
	String name[][]=new String[4][2];
	name[0][0]="Bhava";
	name[0][1]="20";
	
	name[1][0]="Sowbarni";
	name[1][1]="18";
	
	name[2][0]="Tamil";
	name[2][1]="44";
	name[3][0]="Mathes";
	name[3][1]="54";
			

  
   
    for (String[]i:name) {
    	for(String k:i) {
    		System.out.print(k+" ");}
    	System.out.println();}
    	
  
    				
    			int	 i[][]=new int[4][4];
    				i[0][0]=4;
    				i[0][1]=5;
    				i[1][2]=6;
    				i[1][3]=9;
    				i[2][1]=6;
    				i[3][0]=4;
    				for(int []a:i) {
    					for(int k:a) {
    						System.out.print(k+" ");
    						
    					}
    					
    					System.out.println(" ");
    				}
    				float numbers[][]=new float[2][2];
    				numbers[0][0]=1.2f;
    				numbers[0][1]=4.3f;
    				numbers[1][0]=3.4f;
    				numbers[1][1]=9.5f;
    				for(float[]f:numbers) {
    					for(float h:f) {
    						System.out.print(h+" ");}
    						System.out.println(" ");
    					}
    				double n[][]= {{11.23,11.45,11.65} ,{12.34,11.89,78.34}};
    				for(double[]s:n) {
    					for(double q:s) {
    						System.out.print(q+" ");
    					}
    					System.out.println(" ");
    				}
    				}
	}

    				
    			
    				
    			
    		

			
		
		
		
		
		
		
		
		
		

					
			
		






	
	
	
	


