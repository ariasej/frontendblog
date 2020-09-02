/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jony1
 */
public class Usuario {
    private int id; 
    private String nombre; 
    private String userName; 
    private String email; 
    private Direccion direccion; 
    private String numeroTelefonico; 
    private String website; 
    
    private ArrayList <Post> posts; 

    public Usuario(int id, String nombre, String userName, String email, Direccion direccion, String numeroTelefonico, String website) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.email = email;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.website = website;
        inicializarPosts(); 
    }
    
    public void inicializarPosts(){
        posts = new ArrayList<>(); 
        String path = "src/Data/posts.json"; 
        String data;
        try {
            data = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray posts = new JSONArray(data);
             for (int i = 0; i < posts.length(); i++) {
                JSONObject post = posts.getJSONObject(i);
                
                if(post.getInt("userId") == this.id)
                    this.posts.add(crearPost(post));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        
    }

    private Post crearPost(JSONObject post) {
        int userId = post.getInt("userId"); 
        int id = post.getInt("id"); 
        String title = post.getString("title"); 
        String body = post.getString("body"); 
        
        return new Post(userId, id, title, body); 
    }
    
    public String toString(){
        return String.format("NOMBRE: %s - %s%nCONTACTO: %s%n", this.nombre, this.email, this.numeroTelefonico);
    }
    //METODO DE PRUEBA
    public void mostrarPosts(){
        for (Post post : posts) {
            System.out.println(post);
        }
    }
    
    
}
