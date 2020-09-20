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
        String usrInfo = "len";
        try {
            int userID = Integer.parseInt(usrInfo);
            busquedaUsuario(userID);
        } catch (NumberFormatException e) {
            busquedaUsuario(usrInfo);
        }
        // Se introduce la información del post a buscar.  
        String postInfo = "dolor";
        try {
            int postID = Integer.parseInt(postInfo);
            busquedaPost(postID);
        } catch (NumberFormatException excepcion) {
            busquedaPost(postInfo);
        }
    }

    /**
     * Se imprimen los datos del Usuario.
     * 
     * @param usr Usuario a imprimir.
     */
    public static void imprimirUsuario(Usuario usr) {
        System.out.println("");
        System.out.println("Name: " + usr.getNombre());
        System.out.println("Id: " + usr.getId());
        System.out.println("Username: " + usr.getUserName());
        System.out.println("Email: " + usr.getEmail());
        System.out.println("Cantidad de Post del usuario: " + usr.getPosts().getSize());
    }

    /**
     * Se imprime la información de un post.
     * 
     * @param post Post a imprimir.
     */
    public static void imprimirPost(Post post) {
        System.out.println("");
        System.out.println("Id creador: " + post.getUserId());
        System.out.println("PostID: " + post.getId());
        System.out.println("Título: " + post.getTitle());
        System.out.println("Cuerpo: " + post.getBody());
        System.out.println("Cantidad de Comments del post: " + post.getComments().getSize());
    }
    
    /**
     * Se imprime la información de un comentario.
     * 
     * @param comment Comentario a imprimir.
     */
    public static void imprimirComment(Comment comment) {
        System.out.println("");
        System.out.println("PostID: " + comment.getPostId());
        System.out.println("CommentID: " + comment.getId());
        System.out.println("Nombre: " + comment.getName());
        System.out.println("Email: " + comment.getEmail());
        System.out.println("Cuerpo: " + comment.getBody());
    }

    /**
     * Se realiza la búsqueda de un Usuario de acuerdo a su nombre.
     * 
     * @param name Nombre del usuario a buscar.
     */
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

    /**
     * Se realiza la búsqueda de un Usuario de acuerdo a su id.
     * 
     * @param id Id del Usuario a buscar.
     */
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

    /**
     * Se realiza la búsqueda de todos los Post que coincidan con la palabra ingresada.
     * 
     * @param info Información del Post a buscar.
     */
    public static void busquedaPost(String info) {
        // Se obtiene el nodo que contiene el post buscado.
        ListaEnlazada<NodoT> usuarios = arbol.getRaiz().getHijos().getPtr();  
        while (usuarios != null){
            arbol.buscarPost(usuarios.getDato(), info);
            usuarios = usuarios.getLink();
        }        
        // Se obtiene la lista enlazada con los Post que coincidieron con la búsqueda.
        ListaEnlazada<NodoT> resulatadosPost = arbol.getPost_busqueda().getPtr(); 
        // Se verifica que no esté vacía.
        if (!arbol.getPost_busqueda().isEmpty()) {
            while (resulatadosPost != null){
                Post pst = (Post) resulatadosPost.getDato().getInfo();
                System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                imprimirPost(pst);
                // Se imprimen los comentarios del post dado.                 
                ListaEnlazada<NodoT> comments = resulatadosPost.getDato().getHijos().getPtr();
                while (comments != null) {
                    Comment comment = (Comment) comments.getDato().getInfo();
                    imprimirComment(comment);
                    comments = comments.getLink();
                }
                resulatadosPost = resulatadosPost.getLink();
            }            
        } else {
            System.out.println("No se encontró ningún post con el criterio de búsqueda.");
        }
    }
    
    /**
     * Se realiza la búsqueda de un Post de acuerdo con su id.
     * 
     * @param id Id del Post a buscar.
     */
    public static void busquedaPost(int id) {
        // Se obtiene el nodo que contiene el post buscado.
        NodoT usrPost = null;
        // Se obtienen los usuarios.
        ListaEnlazada<NodoT> usuarios = arbol.getRaiz().getHijos().getPtr();
        // Se verifica en cada usuario que el Post coincida con el ID dado.
        while (usrPost == null && usuarios != null) {
            usrPost = arbol.buscarPost(usuarios.getDato(), id);
            usuarios = usuarios.getLink();
        }
        // Verifica si se encontró el ID.
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
