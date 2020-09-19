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
public class ArbolT {
    
    final private NodoT<String> raiz;
    final private Datos DATOS;

    /**
     * Se inicializa la clase árbol.
     *
     * @param datos Contiene la información extraída de los JSON.
     */
    public ArbolT(Datos datos) {
        this.raiz = new NodoT("");
        this.DATOS = datos;
    }
    
    public void insertarNodos(){
        // Insertar Usuarios al árbol.        
        // Recorrer lista
        ListaEnlazada<Usuario> datos = DATOS.getUsers().getPtr();        
        while(datos != null){
            NodoT<Usuario> nodoUsr = new NodoT<>(datos.getDato());
            raiz.setHijo(nodoUsr);
            // Insertar Posts del usuario.
            ListaEnlazada<Post> postList = datos.getDato().getPosts().getPtr();        
            while(postList != null){
                NodoT nodoPost = new NodoT<>(postList.getDato());
                nodoUsr.setHijo(nodoPost);
                // Insertar Comentarios del Post.
                ListaEnlazada p = postList.getDato().getComments().getPtr();        
                while(p != null){
                    NodoT nodoComment = new NodoT<>(p.getDato());
                    nodoPost.setHijo(nodoComment);
                    p = p.getLink();
                } 
                postList = postList.getLink();
            }             
            datos = datos.getLink();
        }    
    }
    
    public NodoT getRaiz() {
        return raiz;
    }    

    /**
     * Se realiza la búsqueda de un usuario teniendo en cuenta su nombre.
     *
     * @param name Nombre del usuario a buscar.
     * @return Nodo del usuario encontrado.
     */
    public NodoT buscarUsuario(String name) {
        ListaEnlazada<NodoT> p = this.raiz.getHijos().getPtr();
        while (p != null) {
            Usuario user = (Usuario) p.getDato().getInfo();
            if (user.getNombre().toLowerCase().contains(name.toLowerCase())) {
                return p.getDato();
            }
            p = p.getLink();
        }
        return null;
    }
    /**
     * Se realiza la búsqueda de un usuario teniendo en cuenta su nombre.
     *
     * @param id Nombre del usuario a buscar.
     * @return Nodo del usuario encontrado.
     */
    public NodoT buscarUsuario(int id) {
        ListaEnlazada<NodoT> p = this.raiz.getHijos().getPtr();
        while (p != null) {
            Usuario user = (Usuario) p.getDato().getInfo();
            if (user.getId() == id) {
                return p.getDato();
            }
            p = p.getLink();
        }
        return null;
    }
    /**
     * Se realiza la búsqueda del nodo Post que contenga algo de la información
     * ingresada.
     *
     * @param usuario Usuario que contiene el post a buscar.
     * @param title Información a buscar.
     * @return Información del post.
     */
    public NodoT buscarPost(NodoT usuario, String title) {
        ListaEnlazada<NodoT> p = usuario.getHijos().getPtr();
        while (p != null) {
            Post post = (Post) p.getDato().getInfo();
            if (post.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return p.getDato();
            }
            p = p.getLink();
        }
        return null;
    }
    
    /**
     * Se realiza la búsqueda del nodo Post que contenga algo de la información
     * ingresada.
     *
     * @param usuario Usuario que contiene el post a buscar.
     * @param id Información a buscar.
     * @return Información del post.
     */
    public NodoT buscarPost(NodoT usuario, int id) {
        ListaEnlazada<NodoT> p = usuario.getHijos().getPtr();
        while (p != null) {
            Post post = (Post) p.getDato().getInfo();
            if (post.getId() == id) {
                return p.getDato();
            }
            p = p.getLink();
        }
        return null;
    }
    
    public ListaEnlazada<NodoT> recorrerArbol() {
        ListaEnlazada<NodoT> recorrido = new ListaEnlazada();
        mostrarRecorrido(raiz, recorrido);
        return recorrido;
    }

    /**
     * Recorre el árbol, nodo por nodo, y guarda su información.
     *
     * @param nodo Nodo a añadir en la Lista Enlazada.
     * @param recorrido Lista Enlazada con la información de los nodos.
     */
    private void mostrarRecorrido(NodoT nodo, ListaEnlazada<NodoT> recorrido) {
        recorrido.setPtr(recorrido.add(recorrido.getPtr(), nodo));
        ListaEnlazada<NodoT> p = nodo.getHijos().getPtr();
        while (p != null) {
            mostrarRecorrido(p.getDato(), recorrido);
            p = p.getLink();
        }
    }   
}
