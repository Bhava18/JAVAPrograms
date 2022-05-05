package filehandling;
import java.io.*;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class UsingBufferedFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("Using buffered .txt"
					+ "");
					bw=new BufferedWriter(fw);
					bw.write("Name:Bhavadharani S.M");
					bw.write("Address:17-A Pattappan kovil Street,Sembulichampalayam(PO),Anthiyur(tk),Erode(dt)");
					bw.write("City:Erode");
					bw.write("Zipcode:638501");
					bw.write("country:INDIA");
		}catch(IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
			
					
		}
		
		

	}


