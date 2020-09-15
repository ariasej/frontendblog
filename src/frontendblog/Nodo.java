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
 * @param Stringhe class type of the node
 */
public class Nodo {

    private String info;
    private ArrayList<Nodo> hijos;
    private Nodo padre;

    public Nodo(String dato) {
        this.info = dato;
        this.hijos = new ArrayList<Nodo>();
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

    public void setHijos(ArrayList<Nodo> hijos) {
        for (Nodo hijo : hijos) {
            hijo.setPadre(this);
        }
        this.hijos = hijos;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public String getInfo() {
        return this.info;
    }

    public ArrayList<Nodo> getHijos() {
        return this.hijos;
    }
}
