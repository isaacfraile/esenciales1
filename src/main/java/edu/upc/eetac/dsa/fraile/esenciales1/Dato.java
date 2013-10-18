package edu.upc.eetac.dsa.fraile.esenciales1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dato implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 4543501059994504708L;
	public int i;
	public char c;
	public String s;
	
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		
		Dato d1= new Dato();
		Dato d2 = new Dato();
		Dato d3 = new Dato();
		d1.i=12;
		d2.c=('k');
		d3.s=("Hola");
		BufferedReader bf = null;
		BufferedWriter bw = null;
		
		
		
		try {
			
			//De objeto a byte:
			
			//Tambien se puede :ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("fichero.txt"));
		    
			FileOutputStream fileOut=new FileOutputStream("fichero.txt");
			ObjectOutputStream salida=new ObjectOutputStream(fileOut);
		      salida.writeObject(d1);
		      salida.writeObject(d2);
		      salida.writeObject(d3);
		      salida.close();
			
			//DE byte a objeto
		      FileInputStream fileIn=new FileInputStream("fichero.txt");
		      ObjectInputStream entrada=new ObjectInputStream(fileIn);
		      
	          Dato d4=(Dato)entrada.readObject();
	         Dato d5=(Dato)entrada.readObject();
	         Dato d6=(Dato)entrada.readObject();
	          entrada.close();
	          System.out.println(d4.i);
	          System.out.println(d5.c);
	         System.out.println(d6.s);
	          
		      
		     
		      
			
			
		}

		catch (FileNotFoundException error) {
			error.printStackTrace();
		} catch (IOException error2) {

			error2.printStackTrace();

		}
		
		
		
		
		
		
		
	}
	private void readObject(java.io.ObjectInputStream stream)
		     throws IOException, ClassNotFoundException
		{
		   // Aqui debemos leer los bytes de stream y reconstruir el objeto
		}
		 
		private void writeObject(java.io.ObjectOutputStream stream)
		     throws IOException
		{
		   
		}
}
