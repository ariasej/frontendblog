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
    private JSONFileReader js;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        inicializarComentarios();
    }

    public Post() {
        comments = new ArrayList<>();
        js = new JSONFileReader("src/Data/comments.json");
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

    void inicializarComentarios() {      
        for (Comment comment : Comment.levelizer) {
            if (comment.getPostId() == id) {
                this.comments.add(comment);
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nId post: ").append(this.id);
        sb.append("\nID creador: ").append(this.userId);
        sb.append("\nTítulo: ").append(this.title);
        sb.append("\nCuerpo: ").append(this.body);
        return sb.toString();
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }   

}
