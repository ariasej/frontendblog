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

    /**
     * Initialize a tree with the specified root node.
     *
     * @param root The root node of the tree
     */
    public Arbol(Nodo root) {
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
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * Set the root node of the tree. Replaces existing root node.
     *
     * @param raiz The root node to replace the existing root node with.
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    private boolean find(Nodo node, String keyNodo) {
        boolean res = false;
        if (node.getDato().equals(keyNodo))
            return true;

        else {
            for (Nodo child : node.getHijos())
                if (find(child, keyNodo))
                    res = true;
        }

        return res;
    }

    private Nodo findNodo(Nodo node, String keyNodo) {
        if (node == null)
            return null;
        if (node.getDato().equals(keyNodo))
            return node;
        else {
            Nodo cnode = null;
            for (Nodo child : node.getHijos())
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
