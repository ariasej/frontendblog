/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.List;

/**
 *
 * @author jony1
 */
public class Main {

    public static void main(String[] args) {
        Raiz raiz = new Raiz();
        
        // Se crea la raíz del árbol, con un dato vacío.
        Nodo root = new Nodo("");
        
        // Insertar Usuarios al árbol.
        for (Usuario usr : raiz.getUsers()) {
            Nodo nodoUsr = new Nodo(usr.toString());
            root.insertarHijo(nodoUsr);
            // Insertar Posts del usuario.
            for (Post post : usr.getPosts()) {                
                Nodo nodoPost = new Nodo(post.toString());
                nodoUsr.insertarHijo(nodoPost); 
                // Insertar Comentarios del Post.
                for (Comment comment : post.getComments()) {                
                    Nodo nodoComment = new Nodo(comment.toString());
                    nodoPost.insertarHijo(nodoComment);                     
                }
            }
        }        
        
        // Create a tree, providing the root node
        Arbol tree = new Arbol(root);

        // Get the pre-order traversal
        
        List<Nodo> preOrder = tree.getPostOrderTraversal();
        for (Nodo nodo : preOrder) {
            System.out.println(nodo.getDato());
        }
    }
}
