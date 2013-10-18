package edu.upc.eetac.dsa.fraile.esenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mayorregistro {

	public static void main(String[] arg) {
	
		BufferedReader bf = null;
		BufferedReader bff =null;
		int total = 0;
		int total2 = 0;
		
		
		
		try {
			File registro1 = new File("cregistro.txt");
			File registro2 = new File("registro2.txt");
			System.out.println("EL registro.txt del ejercicio 4 tiene "+ registro1.length()+ " Bytes");
			System.out.println("EL registro.txt del ejercicio 5 tiene "+ registro2.length()+ " Bytes");
			
			if (registro1.length()>registro2.length()){
				System.out.println("El fichero de mayor tama�o es el registro.txt del ejercicio 4");
				
			} else if (registro1.length()<registro2.length()){
				System.out.println("El fichero de mayor tama�o es el registro.txt del ejercicio 5");
			}
			
			FileReader fr = new FileReader("registro.txt");
			bf = new BufferedReader(fr);
			// Lectura del fichero de Java
			String linea;
			while ((linea = bf.readLine()) != null) {
				// control(Integer.parseInt(linea));
				// System.out.println(linea);
				total = total + linea.length();
				
			
			
		} System.out.println("EL fichero registro.txt del ejercicio 4 tiene "+total+ " caracteres");
		
		
		FileReader fr2 = new FileReader("registro2.txt");
		bff = new BufferedReader(fr2);
		// Lectura del fichero de Java
		String linea2;
		while ((linea2 = bff.readLine()) != null) {
			// control(Integer.parseInt(linea));
			// System.out.println(linea);
			total2 = total2 + linea2.length();
			
		
		
	} System.out.println("EL fichero registro.txt del ejercicio 5 tiene "+total2+ " caracteres");
	
	if (total>total2){
		System.out.println("El fichero con mas caracteres es el registro.txt del ejercicio 4");
		
	} else if (total<total2){
		System.out.println("El fichero con mas caracteres es el registro.txt del ejercicio 5");
	}
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			catch (IOException e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

