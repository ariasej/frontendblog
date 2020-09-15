/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.util.ArrayList;

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
        for (Usuario usr : DATOS.getUsers()) {
            Nodo nodoUsr = new Nodo(usr.toString());
            raiz.addHijo(nodoUsr);
            // Insertar Posts del usuario.
            for (Post post : usr.getPosts()) {
                Nodo nodoPost = new Nodo(post.toString());
                nodoUsr.addHijo(nodoPost);
                // Insertar Comentarios del Post.
                for (Comment comment : post.getComments()) {
                    Nodo nodoComment = new Nodo(comment.toString());
                    nodoPost.addHijo(nodoComment);
                }
            }
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
            for (Nodo hijo : nodo.getHijos()) {
                nodoInfo = buscarNodo(hijo, informacion);
                if (nodoInfo != null) {
                    return nodoInfo;
                }
            }
        }
        return null;
    }

    /**
     *
     * Se obtiene un ArrayList de nodos obtenidos al recorrer el árbol.
     *
     * @return preOrden ArrayList con los Nodos del árbol.
     */
    public ArrayList<Nodo> recorrerArbol() {
        ArrayList<Nodo> recorrido = new ArrayList();
        mostrarRecorrido(raiz, recorrido);
        return recorrido;
    }
    
    /**
     * Recorre el árbol, nodo por nodo, y guarda su información.
     * 
     * @param nodo Nodo a añadir en el ArrayList.
     * @param recorrido  ArrayList con la información de los nodos.
     */
    private void mostrarRecorrido(Nodo nodo, ArrayList<Nodo> recorrido) {
        recorrido.add(nodo);
        for (Nodo hijo : nodo.getHijos()) {
            mostrarRecorrido(hijo, recorrido);
        }
    }
}
