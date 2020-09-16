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
public class ListaEnlazada<T> {

    private T dato;
    private ListaEnlazada ptr;
    private ListaEnlazada link;
    private int size = 0;

    public ListaEnlazada() {
        this.ptr = null;
    }

    public T getDato() {
        return dato;
    }

    public ListaEnlazada getLink() {
        return link;
    }

    public ListaEnlazada getPtr() {
        return ptr;
    }

    public int getSize() {
        return size;
    }

    public void setPtr(ListaEnlazada ptr) {
        this.ptr = ptr;
    }

    ListaEnlazada add(ListaEnlazada ptr, T dato) {
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

    T get(int index) {
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
}
