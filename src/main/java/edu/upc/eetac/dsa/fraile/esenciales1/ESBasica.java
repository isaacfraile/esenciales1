package edu.upc.eetac.dsa.fraile.esenciales1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ESBasica {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("entrada.txt"));
            outputStream = new PrintWriter(new FileWriter("registro.txt"));

            String l;
            int cont = 0;
            while ((l = inputStream.readLine()) != null) {
            	l = l.replaceAll(" ", "");
                cont += l.length();
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fecha = dateFormat.format(new Date());
            outputStream.println(fecha + " entrada.txt " + cont);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
