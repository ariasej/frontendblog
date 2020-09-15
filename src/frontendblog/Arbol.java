/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

/**
 *
 * @author Enrique Niebles
 */
public class Arbol {

    private Nodo raiz;
    private Datos datos;

    /**
     * Initialize a tree with the specified root node.
     *
     * @param root The root node of the tree
     */
    public Arbol(Datos datos) {
        this.raiz = new Nodo("");
        this.datos = datos;
    }

    //Insercion de un elemento en el arbol
    public void insertaNodos() {
        // Insertar Usuarios al árbol.
        for (Usuario usr : datos.getUsers()) {
            Nodo nodoUsr = new Nodo(usr.toString());
            raiz.insertarHijo(nodoUsr);
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
    }

    /**
     * Get the root node of the tree
     *
     * @return the root node.
     */
    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo findNodo(Nodo node, String keyNodo) {
        if (node == null) {
            return null;
        }
        if (node.getInfo().equals(keyNodo)) {
            return node;
        } else {
            Nodo cnode = null;
            for (Nodo child : node.getHijos()) {
                if ((cnode = findNodo(child, keyNodo)) != null) {
                    return cnode;
                }
            }
        }
        return null;
    }

    /**
     *
     * Get the list of nodes arranged by the pre-order traversal of the tree.
     *
     * @return The list of nodes in the tree, arranged in the pre-order
     */
    public ArrayList<Nodo> obtenerRecorridoPreOrden() {
        ArrayList<Nodo> preOrden = new ArrayList<Nodo>();
        mostrarPreOrden(raiz, preOrden);
        return preOrden;
    }

    private void mostrarPreOrden(Nodo node, ArrayList<Nodo> preOrden) {
        preOrden.add(node);
        for (Nodo child : node.getHijos()) {
            mostrarPreOrden(child, preOrden);
        }
    }

    public ArrayList<Nodo> getPostOrderTraversal() {
        ArrayList<Nodo> postOrder = new ArrayList<Nodo>();
        buildPostOrder(raiz, postOrder);
        return postOrder;
    }

    private void buildPostOrder(Nodo node, ArrayList<Nodo> postOrder) {
        for (Nodo child : node.getHijos()) {
            buildPostOrder(child, postOrder);
        }
        postOrder.add(node);
    }
}
