/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

/**
 * Clase Main, realiza la ejecución del programa.
 *
 * @author Enrique Niebles
 */
public class Main {

    public static void main(String[] args) {
        // Se realiza la lectura de datos del JSONFileReader.
        Datos datos = new Datos();
        // Se instancia un objeto arbol de la clase Arbol.
        Arbol arbol = new Arbol(datos);
        // Se insertan llena el árbol con la información extraída del JSON.
        arbol.insertaNodos();

        // Se obtiene el recorrido del árbol y se imprime la información de cada nodo.
        ListaEnlazada<Nodo> recorrido = arbol.recorrerArbol();
        ListaEnlazada<Nodo> p = recorrido.getPtr();
        while (p != null) {
            System.out.println(p.getDato().getInfo());
            p = p.getLink();
        }

        System.out.println("\n========================================================================");
        System.out.println("========================================================================\n");

        // Se obtiene el nodo raíz del árbol.
        Nodo raiz = arbol.getRaiz();
        // Se introduce el código del usuario a buscar.
        int userID = 5;
        // Se verifica que sea un usuario válido.
        if (userID > datos.getUsers().getSize() || userID <= 0) {
            System.out.println("El usuario con ID " + userID + " no ha sido encontrado.");
        } else {
            // Se obtiene el nodo que contiene la información de dicho usuario.
            Nodo usuario = arbol.buscarNodo(raiz, raiz.getHijos().get(userID - 1).getInfo());
            System.out.println("Imprimiendo información del usuario: " + userID);
            System.out.println(usuario.getInfo());
            System.out.println("\n*************************************************************");
            // Mostar todos los post del usuario.                 
            ListaEnlazada<Nodo> posts = usuario.getHijos().getPtr();
            while (posts != null) {
                System.out.println(posts.getDato().getInfo());
                posts = posts.getLink();
            }
            System.out.println("\n*************************************************************");
            // Se introduce el código del post a buscar.
            int postID = 3;
            // Se obtiene el nodo que contiene el post buscado.
            Nodo usrPost = arbol.buscarNodo(usuario, usuario.getHijos().get(postID - 1).getInfo());
            System.out.println(usrPost.getInfo());
            // Se imprimen los comentarios del post dado.                 
            ListaEnlazada<Nodo> comments = usuario.getHijos().getPtr();
            while (posts != null) {
                System.out.println(comments.getDato().getInfo());
                comments = comments.getLink();
            }
        }

        // Búsqueda por información
        System.out.println("\n------------------------------------------------------------------------");
        String nombreUsr = "leann";
        // Se obtiene el nodo que contiene la información de dicho usuario.
        Nodo usuario = arbol.buscarUsuario(nombreUsr);
        if (usuario != null) {
            System.out.println(usuario.getInfo());
            System.out.println("\n*************************************************************");
            // Mostar todos los post del usuario.                 
            ListaEnlazada<Nodo> posts = usuario.getHijos().getPtr();
            while (posts != null) {
                System.out.println(posts.getDato().getInfo());
                posts = posts.getLink();
            }
            System.out.println("\n*************************************************************");
            String postInfo = "reprehenderit";
            // Se obtiene el nodo que contiene el post buscado.
            Nodo usrPost = arbol.buscarPost(usuario, postInfo);
            if (usrPost != null) {
                System.out.println(usrPost.getInfo());
                // Se imprimen los comentarios del post dado.                 
                ListaEnlazada<Nodo> comments = usrPost.getHijos().getPtr();
                while (posts != null) {
                    System.out.println(comments.getDato().getInfo());
                    comments = comments.getLink();
                }
            } else {
                System.out.println("Post no encontrado.");
            }
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
