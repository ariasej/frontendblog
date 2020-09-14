/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jony1
 */
public class Usuario {

    private int id;
    private String nombre;
    private String userName;
    private String email;
    private JSONFileReader js;

    private ArrayList<Post> posts;

    public Usuario(int id, String nombre, String userName, String email) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.email = email;
    }

    public Usuario() {
        posts = new ArrayList<>();
        js = new JSONFileReader("src/Data/posts.json");
    }

    public void inicializarPosts() {
        String data = "";
        ArrayList<Post> allPosts = new ArrayList<>(); // Leerá todos los posts del JSON para luego comparar cuál le pertene

        try {
            data = js.getJSONdataToString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //CREAR EXPRESIONES REGULARES
        Pattern title = Pattern.compile("[\"]title[\"]:\\s([\"])(?:(?=(\\\\?))\\2.)*?\\1"
        );
        Matcher findTitle = title.matcher(data);

        Post p;
        String titulo;
        while (findTitle.find()) {
            p = new Post();
            titulo = JSONFileReader.extraerContenido(findTitle.group(0), "\"");
            p.setTitle(titulo);
            allPosts.add(p);
        }

        Pattern userId = Pattern.compile("[\"]userId[\"][:]\\s(\\d{1,})");
        Pattern id = Pattern.compile("[\"]id[\"][:]\\s(\\d{1,})");
        Pattern body = Pattern.compile("[\"]body[\"]:\\s([\"])(?:(?=(\\\\?))\\2.)*?\\1");

        Matcher findId = id.matcher(data);
        Matcher findUserId = userId.matcher(data);
        Matcher findBody = body.matcher(data);

        int i = 0;
        while (findId.find()) {
            allPosts.get(i).setId(Integer.parseInt(findId.group(1)));

            i++;

        }

        i = 0;

        while (findUserId.find()) {
            allPosts.get(i).setUserId(Integer.parseInt(findUserId.group(1)));
            i++;
        }

        i = 0;
        String cuerpo;
        while (findBody.find()) {
            cuerpo = JSONFileReader.extraerContenido(findBody.group(0), "\"");
            allPosts.get(i).setBody(cuerpo);
            i++;
        }

        for (Post post : allPosts) {
            if (post.getUserId() == this.id) {
                post.inicializarComentarios();
                posts.add(post);
            }
        }
    }

    public String extraerContenido(String target, String delete) {
        int i = 0;
        while (target.contains(delete)) {
            target = target.substring(target.indexOf(delete) + 1);
            i++;
            if (i == 3) {
                break;
            }
        }
        target = target.replaceAll("\"", "");
        return target;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNombre: ").append(this.getNombre());
        sb.append("\nID: ").append(this.getId());
        sb.append("\nCantidad de posts de este usuario: ").append(posts.size());
        sb.append("\nUsername: ").append(this.getUserName());
        sb.append("\nE-mail: ").append(this.getEmail());
        return sb.toString();
    }

    public String postUsuario() {
        StringBuffer sb = new StringBuffer();
        for (Post post : posts) {
            sb.append("\n--------------------------------------------------------------");
            sb.append(post);
        }
        return sb.toString();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the posts
     */
    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

}
