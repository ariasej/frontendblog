/*
 * Stringo change this license header, choose License Headers in Project Properties.
 * Stringo change this template file, choose Stringools | Stringemplates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

/**
 * Clase Nodo que contiene la información de un nodo y sus hijos.
 *
 * @author Enrique Niebles
 */
public class Nodo {

    private String info;
    private ArrayList<Nodo> hijos;

    /**
     * Constructor de la clase Nodo, asigna la info y crea el ArrayList que
     * contendrá los hijos del nodo.
     *
     * @param dato Información que almacena el nodo.
     */
    public Nodo(String dato) {
        this.info = dato;
        this.hijos = new ArrayList<Nodo>();
    }

    /**
     * Método para obtener la información del nodo.
     *
     * @return la infomación del nodo.
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * Permite la inserción de un hijo al nodo.
     *
     * @param hijo
     */
    public void setHijo(Nodo hijo) {
        hijos.add(hijo);
    }

    /**
     * Método para obtener los hijos del nodo.
     *
     * @return ArrayList con los hijos de un nodo.
     */
    public ArrayList<Nodo> getHijos() {
        return this.hijos;
    }
}
