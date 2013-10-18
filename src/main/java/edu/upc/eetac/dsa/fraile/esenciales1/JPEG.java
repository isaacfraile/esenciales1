package edu.upc.eetac.dsa.fraile.esenciales1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class JPEG {

	public static void main(String[] arg) {
		
		BufferedWriter bw=null;

	try {
		File fichero = new File("Blackeyegalaxy.jpg");
		System.out.println("El fichero JPG tiene " + fichero.length()+ " Bytes");
		bw = new BufferedWriter(new FileWriter("registro2.txt", true));
		bw.write("\n"+fichero.length());
	
		bw.close();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	}
	catch (IOException ee) {
		ee.printStackTrace();
		// TODO: handle exception
	}

		
	

			}
	}

	

