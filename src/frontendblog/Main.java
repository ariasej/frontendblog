/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

/**
 *
 * @author jony1
 */
public class Main {

    public static void main(String[] args) {
        // Se realiza la lectura de datos del JSONFileReader
        Datos datos = new Datos();             
        // Se crea el árbol.
        Arbol arbol = new Arbol(datos);
        arbol.insertaNodos();

        // Get the pre-order traversal        
        ArrayList<Nodo> preOrder = arbol.obtenerRecorridoPreOrden();
        for (Nodo nodo : preOrder) {
            System.out.println(nodo.getDato());
        }
    }
}
