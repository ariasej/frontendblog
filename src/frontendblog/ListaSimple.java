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
public class ListaSimple <T> {
    private T dato;
    private ListaSimple ptr; 
    private ListaSimple link;    

    public ListaSimple() {
        this.ptr = null;
    }

    public T getDato() {
        return dato;
    }

    public ListaSimple getLink() {
        return link;
    }

    public ListaSimple getPtr() {
        return ptr;
    }

    public void setPtr(ListaSimple ptr) {
        this.ptr = ptr;
    }
    
    ListaSimple add(ListaSimple ptr, T dato){
        ListaSimple p = ptr;
        ListaSimple q = new ListaSimple();
        q.dato = dato;
        if (ptr == null) {
            ptr = q;
        }else{
            while(p.link != null){
                p = p.link;
            }
            p.link = q;
        }
        return ptr;
    }
    
    T get(int index){
        ListaSimple p = this.ptr;
        int i = 0;
        while (p != null){
            if (i == index){
                T dato = (T) p.dato;
                return dato;
            }
            p = p.link;
            i++;
        }
        return null;
    }  
}
