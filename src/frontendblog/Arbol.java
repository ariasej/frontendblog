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
public class Arbol<T> {
    private Nodo<T> raiz;

    /**
     * Initialize a tree with the specified root node.
     *
     * @param root The root node of the tree
     */
    public Arbol(Nodo<T> root) {
        this.raiz = root;
    }

    /**
     * Checks if the tree is empty (root node is null)
     *
     * @return <code>true</code> if the tree is empty,
     * <code>false</code> otherwise.
     */
    public boolean isEmpty() {
        return raiz == null;
    }

    /**
     * Get the root node of the tree
     *
     * @return the root node.
     */
    public Nodo<T> getRaiz() {
        return raiz;
    }

    /**
     * Set the root node of the tree. Replaces existing root node.
     *
     * @param raiz The root node to replace the existing root node with.
     */
    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    private boolean find(Nodo<T> node, T keyNodo) {
        boolean res = false;
        if (node.getDato().equals(keyNodo))
            return true;

        else {
            for (Nodo<T> child : node.getHijos())
                if (find(child, keyNodo))
                    res = true;
        }

        return res;
    }

    private Nodo<T> findNodo(Nodo<T> node, T keyNodo) {
        if (node == null)
            return null;
        if (node.getDato().equals(keyNodo))
            return node;
        else {
            Nodo<T> cnode = null;
            for (Nodo<T> child : node.getHijos())
                if ((cnode = findNodo(child, keyNodo)) != null)
                    return cnode;
        }
        return null;
    }

    /**
     *
     * Get the list of nodes arranged by the pre-order traversal of the tree.
     *
     * @return The list of nodes in the tree, arranged in the pre-order
     */
    public ArrayList<Nodo<T>> obtenerRecorridoPreOrden() {
        ArrayList<Nodo<T>> preOrden = new ArrayList<Nodo<T>>();
        mostrarPreOrden(raiz, preOrden);
        return preOrden;
    }

    private void mostrarPreOrden(Nodo<T> node, ArrayList<Nodo<T>> preOrden) {
        preOrden.add(node);
        for (Nodo<T> child : node.getHijos()) {
            mostrarPreOrden(child, preOrden);
        }
    }
}
