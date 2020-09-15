/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;
import java.util.List;

/**
 * A node of any type. A node contains a dato and links to it's hijos and it's
 * padre.
 *
 * @param <T> The class type of the node
 */
public class Nodo<T> {

    private T dato;
    private List<Nodo<T>> hijos;
    private Nodo<T> padre;

    public Nodo(T dato) {
        this.dato = dato;
        this.hijos = new ArrayList<Nodo<T>>();
    }

    public Nodo(Nodo<T> nodo) {
        this.dato = nodo.getDato();
        hijos = new ArrayList<Nodo<T>>();
    }

    /**
     *
     * Add a child to this node.
     *
     * @param hijo child node
     */
    public void insertarHijo(Nodo<T> hijo) {
        hijo.setPadre(this);
        hijos.add(hijo);
    }

    /**
     * Remove all hijos of this node.
     */
    public void eliminarHijos() {
        this.hijos.clear();
    }

    /**
     * Remove given child of this node.
     *
     * @param eliminarHijo the child node to remove.
     * @return <code>true</code> if the given node was a child of this node and
     * was deleted, <code>false</code> otherwise.
     */
    public boolean eliminarHijo(Nodo<T> hijo) {
        List<Nodo<T>> list = getHijos();
        return list.remove(hijo);
    }

    public void setHijos(List<Nodo<T>> hijos) {
        for (Nodo<T> hijo : hijos) {
            hijo.setPadre(this);
        }
        this.hijos = hijos;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }

    public Nodo<T> getPadre() {
        return this.padre;
    }

    public T getDato() {
        return this.dato;
    }

    public List<Nodo<T>> getHijos() {
        return this.hijos;
    }

    public Nodo<T> obtenerHijoEn(int i) {
        return hijos.get(i);
    }
}
