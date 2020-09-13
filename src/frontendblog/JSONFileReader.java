/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jony1
 */
public class JSONFileReader {

    private String cadena;
    private String entrada;
    private FileReader file;
    BufferedReader fileIterator;

    public JSONFileReader(String ruta) {

        try {
            file = new FileReader(ruta);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public String getJSONdataToString() throws IOException {
        cadena = "";
        entrada = "";
        fileIterator = new BufferedReader(file);
        
        while ((cadena = fileIterator.readLine()) != null) {

     
            entrada += cadena + "\n";
        }
        file.close();

        return entrada; 
    }

}
