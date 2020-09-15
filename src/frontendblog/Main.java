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

        // Mostrar árbol.    
        ArrayList<Nodo> preOrder = arbol.obtenerRecorridoPreOrden();
        //for (Nodo nodo : preOrder) {
        //    System.out.println(nodo.getInfo());
        //}

        Nodo raiz = arbol.getRaiz();
        int codigo = 10;
        if (codigo > datos.getUsers().size() || codigo <= 0) {
            System.out.println("El usuario con ID " + codigo + " no ha sido encontrado.");
        } else {
            Nodo usuario = arbol.findNodo(raiz, raiz.getHijos().get(codigo - 1).getInfo());
            System.out.println("Imprimiendo información del usuario: " + codigo);
            System.out.println(usuario.getInfo());
            System.out.println("\n***********************************************************");
            // Mostar todos los post del usuario.
            for (Nodo post : usuario.getHijos()) {
                System.out.println(post.getInfo());
            }
            System.out.println("\n*************************************************************");
            // Mostrar post en específico y sus comentarios.
            int postID = 1;
            Nodo usrPost = arbol.findNodo(usuario, usuario.getHijos().get(postID - 1).getInfo());
            System.out.println(usrPost.getInfo());
            for (Nodo comment : usrPost.getHijos()) {
                System.out.println(comment.getInfo());
            }

        }

    }
}
