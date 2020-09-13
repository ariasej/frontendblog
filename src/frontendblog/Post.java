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
class Post {

    private int userId;
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        inicializarComentarios();
    }
    
    public Post(){
        comments = new ArrayList<>(); 
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    private void inicializarComentarios() {
      
    }

<<<<<<< HEAD
    private Comment crearComentario(JSONObject comment) {
        int postId = comment.getInt("postId");
        int id = comment.getInt("id");
        String name = comment.getString("name");
        String email = comment.getString("email");
        String body = comment.getString("body");

        return new Comment(postId, id, name, email, body);
    }

    @Override
    public String toString() {
        return String.format("Titulo:%s%nCUERPO%n%s%n", this.title, this.body);

=======
  
    
    @Override
    public String toString(){
        return String.format("Titulo:%s ID CREADOR: %d%nCUERPO%n%s%n",this.title,this.userId, this.body); 
        
>>>>>>> a40fc375cbc7ce572341b3732afa5df2e4472c9e
    }

}
