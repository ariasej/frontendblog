/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

/**
 * Clase Arbol que contiene la estructura del árbol y sus métodos.
 *
 * @author Enrique Niebles
 */
public class Arbol {

    final private Nodo raiz;
    final private Datos DATOS;

    /**
     * Se inicializa la clase árbol.
     *
     * @param datos Contiene la información extraída de los JSON.
     */
    public Arbol(Datos datos) {
        this.raiz = new Nodo("");
        this.DATOS = datos;
    }

    /**
     * Se inserta la información extraída de los JSON en el árbol.
     *
     * @see insertarHijo()
     */
    public void insertaNodos() {
        // Insertar Usuarios al árbol.
        
        // Recorrer lista
        ListaEnlazada<Usuario> datos = DATOS.getUsers().getPtr();        
        while(datos != null){
            Nodo nodoUsr = new Nodo(datos.getDato().toString());
            raiz.setHijo(nodoUsr);
            // Insertar Posts del usuario.
            ListaEnlazada<Post> postList = datos.getDato().getPosts().getPtr();        
            while(postList != null){
                Nodo nodoPost = new Nodo(postList.getDato().toString());
                nodoUsr.setHijo(nodoPost);
                // Insertar Comentarios del Post.
                ListaEnlazada p = postList.getDato().getComments().getPtr();        
                while(p != null){
                    Nodo nodoComment = new Nodo(p.getDato().toString());
                    nodoPost.setHijo(nodoComment);
                    p = p.getLink();
                } 
                postList = postList.getLink();
            }             
            datos = datos.getLink();
        } 
    }

    /**
     * Se obtiene el nodo Raíz del árbol.
     *
     * @return la raíz del nodo.
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * Se busca la información en el árbol, dado un nodo.
     *
     * @param nodo Nodo donde se realiza la búsqueda.
     * @param informacion Información a buscar en el nodo.
     * @return la raíz del nodo.
     */
    public Nodo buscarNodo(Nodo nodo, String informacion) {
        if (nodo == null) {
            return null;
        } else if (nodo.getInfo().equals(informacion)) {
            return nodo;
        } else {
            Nodo nodoInfo = null;
            ListaEnlazada<Nodo> p = nodo.getHijos().getPtr();
            while (p != null) {
                nodoInfo = buscarNodo(p.getDato(), informacion);
                if (nodoInfo != null) {
                    return nodoInfo;
                }
                p = p.getLink();
            }
        }
        return null;
    }

    /**
     * Se realiza la búsqueda de un usuario teniendo en cuenta su nombre.
     *
     * @param name Nombre del usuario a buscar.
     * @return Nodo del usuario encontrado.
     */
    public Nodo buscarUsuario(String name) {
        ListaEnlazada<Usuario> datos = DATOS.getUsers().getPtr();        
        while(datos != null){
            if (datos.getDato().getNombre().toLowerCase().contains(name.toLowerCase())) {
                return buscarNodo(raiz, datos.getDato().toString());
            }
            datos = datos.getLink();
        } 
        return null;
    }

    /**
     * Se realiza la búsqueda del nodo Post que contenga algo de la información
     * ingresada.
     *
     * @param usuario Usuario que contiene el post a buscar.
     * @param info Información a buscar.
     * @return
     */
    public Nodo buscarPost(Nodo usuario, String info) {
        ListaEnlazada<Nodo> p = usuario.getHijos().getPtr();
        while (p != null) {
            if (p.getDato().getInfo().toLowerCase().contains(info.toLowerCase())) {
                return p.getDato();
            }
            p = p.getLink();
        }
        return null;
    }

    /**
     *
     * Se obtiene una Lista Enlazada de nodos obtenidos al recorrer el árbol.
     *
     * @return preOrden Lista Enlazada con los Nodos del árbol.
     */
    public ListaEnlazada<Nodo> recorrerArbol() {
        ListaEnlazada<Nodo> recorrido = new ListaEnlazada();
        mostrarRecorrido(raiz, recorrido);
        return recorrido;
    }

    /**
     * Recorre el árbol, nodo por nodo, y guarda su información.
     *
     * @param nodo Nodo a añadir en la Lista Enlazada.
     * @param recorrido Lista Enlazada con la información de los nodos.
     */
    private void mostrarRecorrido(Nodo nodo, ListaEnlazada<Nodo> recorrido) {
        recorrido.setPtr(recorrido.add(recorrido.getPtr(), nodo));
        ListaEnlazada<Nodo> p = nodo.getHijos().getPtr();
        while (p != null) {
            mostrarRecorrido(p.getDato(), recorrido);
            p = p.getLink();
        }
    }
}
