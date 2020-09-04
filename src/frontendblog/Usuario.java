/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;


import java.util.ArrayList;

/**
 *
 * @author jony1
 */
public class Usuario {
    private int id; 
    private String nombre; 
    private String userName; 
    private String email; 
 
   
    
    private ArrayList <Post> posts; 

    public Usuario(int id, String nombre, String userName, String email) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.email = email;
       
    }
    
     public Usuario(){
        posts = new ArrayList<>(); 
    }
    
 

    
    public String toString(){
        return String.format("Nombre: %s id: %d%nUsername: %s%nemail: %s%n", this.getNombre(), this.getId(), this.getUserName(), this.getEmail());
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
    public ArrayList <Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList <Post> posts) {
        this.posts = posts;
    }
    
    
}
