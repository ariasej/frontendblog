/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int codigo;

        // Get the pre-order traversal        
        ArrayList<Nodo> preOrder = arbol.obtenerRecorridoPreOrden();
        //for (Nodo nodo : preOrder) {
        //    System.out.println(nodo.getInfo());
        //}
        
        Nodo raiz = arbol.getRaiz();
        System.out.print("Digite el código del usuario: ");
        codigo = sc.nextInt();
        Usuario usrFind = null;
        for (Usuario user : datos.getUsers()) {
            if (user.getId() == codigo)
                usrFind = user;
        }        
        try{
            Nodo nodoUsr = arbol.findNodo(raiz, usrFind.toString());
            System.out.println(nodoUsr.getInfo());
            for (Nodo hijo : nodoUsr.getHijos()) {
                System.out.println(hijo.getInfo());
            }
        } catch (java.lang.NullPointerException e){
            System.out.println("No encontrado.");
        }
        
    }
}
