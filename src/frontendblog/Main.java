/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

/**
 * Clase Main, realiza la ejecución del programa.
 *
 * @author Enrique Niebles
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Araña");
        cadenas.add("Perro");
        cadenas.add("Gato");
        cadenas.add("Oso");        
        
        ListaSimple<String> lista = new ListaSimple<>();
        
        // Llenar lista
        for (String cadena : cadenas) {
            lista.setPtr(lista.add(lista.getPtr(), cadena));
        }        
        
        // Recorrer lista
        ListaSimple p = lista.getPtr();        
        while(p != null){
            System.out.println(p.getDato());
            p = p.getLink();
        }        
        // Buscar dato
        System.out.println(lista.get(1));
    }    
}


