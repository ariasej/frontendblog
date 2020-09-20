/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

/**
 * Clase ListaEnlazada para el manejo de información en el proyecto.
 * 
 * @author Enrique Niebles
 */
public class ListaEnlazada<T> {

    private T dato;
    private ListaEnlazada ptr;
    private ListaEnlazada link;
    private int size = 0;

    /**
     * Constructor de la clase.
     * 
     */
    public ListaEnlazada() {
        this.ptr = null;
    }
    
    /**
     * Obtener el dato de la ListaEnlazada.
     * 
     * @return T Dato almacenado.
     */
    public T getDato() {
        return dato;
    }
    
    /**
     * Se obtiene el link del Nodo.
     * 
     * @return ListaEnlazada Link del Nodo.
     */
    public ListaEnlazada getLink() {
        return link;
    }

    /**
     * PTR de la ListaEnlazada.
     * 
     * @return PTR.
     */
    public ListaEnlazada getPtr() {
        return ptr;
    }

    /**
     * Se obtiene el tamaño de la ListaEnlazada.
     * 
     * @return Size tamaño de la lista.
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Asigna el PTR de la ListaEnlazada.
     * 
     * @param ptr PTR a asignar.
     */
    public void setPtr(ListaEnlazada ptr) {
        this.ptr = ptr;
    }

    /**
     * Añadir dato T en la ListaEnlazada.
     * 
     * @param ptr PTR de la lista.
     * @param dato T dato a añadir.
     * @return Nuevo PTR de la ListaEnlazada.
     */
    public ListaEnlazada add(ListaEnlazada ptr, T dato) {
        ListaEnlazada p = ptr;
        ListaEnlazada q = new ListaEnlazada();
        q.dato = dato;
        if (ptr == null) {
            ptr = q;
        } else {
            while (p.link != null) {
                p = p.link;
            }
            p.link = q;
        }
        size++;
        return ptr;
    }

    /**
     * Obtener dato en una posición específica de la ListaEnlazada.
     * 
     * @param index Posición de la cual se quiere extraer el dato.
     * @return T dato de la lista enlazada Enlazada en dicha posición.
     */
    public T get(int index) {
        ListaEnlazada p = this.ptr;
        int i = 0;
        while (p != null) {
            if (i == index) {
                T dato = (T) p.dato;
                return dato;
            }
            p = p.link;
            i++;
        }
        return null;
    }
    
    /**
     * Se verifica si la ListaEnlazada tiene al menos un dato en ella.
     * 
     * @return true si la ListaEnlazada está vacía.
     */
    public boolean isEmpty(){
        return this.size == 0;
    }
}
