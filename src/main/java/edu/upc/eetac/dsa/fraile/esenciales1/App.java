package edu.upc.eetac.dsa.fraile.esenciales1;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args){

    	BufferedReader inputStream = null;
        int cont = 0;
        int x = 0;
        try {
            try {
            	inputStream = new BufferedReader(new FileReader("numeros.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

          	String c;
            try {
				while ((c = inputStream.readLine()) != null) {
					x = Integer.parseInt(c);
					rango(x);
				    ++cont;
				}
			}catch (IOException e) {
				e.printStackTrace();
			} catch (BigNumberException e) {
				e.printStackTrace();
			}
        } finally {
            if (inputStream != null) {
                try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
            System.out.print(cont);
        }
    }
    static void rango(int num)throws BigNumberException{
        if(num>1000){
            throw new BigNumberException("Entero superior a 1000");
        }
	}
}