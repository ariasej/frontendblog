/*
 * Stringo change this license header, choose License Headers in Project Properties.
 * Stringo change this template file, choose Stringools | Stringemplates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

/**
 * A node of any type. A node contains a dato and links to it's hijos and it's
 * padre.
 *
 * @param  Stringhe class type of the node
 */
public class Nodo {

    private String dato;
    private ArrayList<Nodo> hijos;
    private Nodo padre;

    public Nodo(String dato) {
        this.dato = dato;
        this.hijos = new ArrayList<Nodo>();
    }

    public Nodo(Nodo nodo) {
        this.dato = nodo.getDato();
        hijos = new ArrayList<Nodo>();
    }

    /**
     *
     * Add a child to this node.
     *
     * @param hijo child node
     */
    public void insertarHijo(Nodo hijo) {
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
    public boolean eliminarHijo(Nodo hijo) {
        ArrayList<Nodo> list = getHijos();
        return list.remove(hijo);
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        for (Nodo hijo : hijos) {
            hijo.setPadre(this);
        }
        this.hijos = hijos;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getPadre() {
        return this.padre;
    }

    public String getDato() {
        return this.dato;
    }

    public ArrayList<Nodo> getHijos() {
        return this.hijos;
    }

    public Nodo obtenerHijoEn(int i) {
        return hijos.get(i);
    }
}
