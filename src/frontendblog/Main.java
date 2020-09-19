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

    // Se realiza la lectura de datos del JSONFileReader.
    static Datos datos;
    // Se instancia un objeto arbol de la clase ArbolT (Nodos genéricos).
    static ArbolT arbol;

    public static void main(String[] args) {
        // Se realiza la lectura de datos del JSONFileReader.
        datos = new Datos();
        // Se instancia un objeto arbol de la clase ArbolT (Nodos genéricos).
        arbol = new ArbolT(datos);
        // Se insertan llena el árbol con la información extraída del JSON.
        arbol.insertarNodos();
        
        // Se introduce la información del usuario a buscar.
        String usrInfo = "lean";
        try {
            int userID = Integer.parseInt(usrInfo);
            busquedaUsuario(userID);
        } catch (NumberFormatException e) {
            busquedaUsuario(usrInfo);
        }
        System.out.println("\n*************************************************************");
        // Se introduce la información del post a buscar.  
        String postInfo = "100";
        try {
            int postID = Integer.parseInt(postInfo);
            busquedaPost(postID);
        } catch (NumberFormatException excepcion) {
            busquedaPost(postInfo);
        }
    }

    public static void imprimirUsuario(Usuario usr) {
        System.out.println("");
        System.out.println("Name: " + usr.getNombre());
        System.out.println("Id: " + usr.getId());
        System.out.println("Username: " + usr.getUserName());
        System.out.println("Email: " + usr.getEmail());
    }

    public static void imprimirPost(Post post) {
        System.out.println("");
        System.out.println("Id creador: " + post.getUserId());
        System.out.println("PostID: " + post.getId());
        System.out.println("Título: " + post.getTitle());
        System.out.println("Cuerpo: " + post.getBody());
    }

    public static void imprimirComment(Comment comment) {
        System.out.println("");
        System.out.println("PostID: " + comment.getPostId());
        System.out.println("CommentID: " + comment.getId());
        System.out.println("Nombre: " + comment.getName());
        System.out.println("Email: " + comment.getEmail());
        System.out.println("Cuerpo: " + comment.getBody());
    }

    public static void busquedaUsuario(String name) {
        NodoT usuario = arbol.buscarUsuario(name);
        if (usuario != null) {
            // Información del usuario.
            Usuario usr = (Usuario) usuario.getInfo();
            imprimirUsuario(usr);
            // Mostar todos los post del usuario.                 
            ListaEnlazada<NodoT> post = usuario.getHijos().getPtr();
            while (post != null) {
                Post pst = (Post) post.getDato().getInfo();
                imprimirPost(pst);
                post = post.getLink();
            }
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void busquedaUsuario(int id) {
        NodoT usuario = arbol.buscarUsuario(id);
        if (usuario != null) {
            // Información del usuario.
            Usuario usr = (Usuario) usuario.getInfo();
            imprimirUsuario(usr);
            // Mostar todos los post del usuario.                 
            ListaEnlazada<NodoT> post = usuario.getHijos().getPtr();
            while (post != null) {
                Post pst = (Post) post.getDato().getInfo();
                imprimirPost(pst);
                post = post.getLink();
            }
        } else {
            System.out.println("Usuario con id " + id + " no encontrado.");
        }
    }

    public static void busquedaPost(String postTitle) {
        // Se obtiene el nodo que contiene el post buscado.
        NodoT usrPost = null;
        ListaEnlazada<NodoT> usuarios = arbol.getRaiz().getHijos().getPtr();
        while (usrPost == null && usuarios != null) {
            usrPost = arbol.buscarPost(usuarios.getDato(), postTitle);
            usuarios = usuarios.getLink();
        }
        if (usrPost != null) {
            Post pst = (Post) usrPost.getInfo();
            imprimirPost(pst);
            // Se imprimen los comentarios del post dado.                 
            ListaEnlazada<NodoT> comments = usrPost.getHijos().getPtr();
            while (comments != null) {
                Comment comment = (Comment) comments.getDato().getInfo();
                imprimirComment(comment);
                comments = comments.getLink();
            }
        } else {
            System.out.println("Post no encontrado.");
        }
    }
    
    public static void busquedaPost(int id) {
        // Se obtiene el nodo que contiene el post buscado.
        NodoT usrPost = null;
        ListaEnlazada<NodoT> usuarios = arbol.getRaiz().getHijos().getPtr();
        while (usrPost == null && usuarios != null) {
            usrPost = arbol.buscarPost(usuarios.getDato(), id);
            usuarios = usuarios.getLink();
        }
        if (usrPost != null) {
            Post pst = (Post) usrPost.getInfo();
            imprimirPost(pst);
            // Se imprimen los comentarios del post dado.                 
            ListaEnlazada<NodoT> comments = usrPost.getHijos().getPtr();
            while (comments != null) {
                Comment comment = (Comment) comments.getDato().getInfo();
                imprimirComment(comment);
                comments = comments.getLink();
            }
        } else {
            System.out.println("Post con id " + id + " no encontrado.");
        }
    }
}
