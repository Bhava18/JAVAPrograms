package filehandling;
import java.io.IOException;
import java.io.*;


public class UsingFileWriting {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	String location=("C:Users\\admin\\Desktop\\bhava.txt")	;
	String content="helloword";
	FileWriter fw=new FileWriter(location);
	fw.write(content);
	fw.close();
		 
	
		}
	}


