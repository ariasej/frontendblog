/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

/**
 *
 * @author Enrique Niebles
 */
public class NodoT<T> {
    private T info;
    private ListaEnlazada<NodoT> hijos;

    /**
     * Constructor de la clase Nodo, asigna la info y crea la ListaEnlazada que
     * contendrá los hijos del nodo.
     *
     * @param dato Información que almacena el nodo.
     */
    public NodoT(T dato) {
        this.info = dato;
        this.hijos = new ListaEnlazada<>();
    }

    /**
     * Método para obtener la información del nodo.
     *
     * @return la infomación del nodo.
     */
    public T getInfo() {
        return this.info;
    }

    /**
     * Permite la inserción de un hijo al nodo.
     *
     * @param hijo Hijo del nodo.
     */
    public void setHijo(NodoT hijo) {
        hijos.setPtr(hijos.add(hijos.getPtr(), hijo));
    }

    /**
     * Método para obtener los hijos del nodo.
     *
     * @return ListaEnlazada con los hijos de un nodo.
     */
    public ListaEnlazada<NodoT> getHijos() {
        return this.hijos;
    }

}
