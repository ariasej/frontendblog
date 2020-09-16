/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jony1
 */
class Comment {

    private static final JSONFileReader js = new JSONFileReader("src/Data/comments.json");

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
    public static ListaEnlazada<Comment> levelizer;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public Comment() {

    }

    public static void initLevelizer() {
        String data = "";
        levelizer = new ListaEnlazada<>();

        try {
            data = js.getJSONdataToString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //CREAR EXPRESIONES REGULARES
        Pattern title = Pattern.compile("[\"]name[\"]:\\s([\"])(?:(?=(\\\\?))\\2.)*?\\1"
        );
        Matcher findTitle = title.matcher(data);
        Comment c;
        String titulo;

        while (findTitle.find()) {
            c = new Comment();
            titulo = JSONFileReader.extraerContenido(findTitle.group(0), "\"");
            c.setName(titulo);
            levelizer.setPtr(levelizer.add(levelizer.getPtr(), c));
        }

        Pattern postId = Pattern.compile("[\"]postId[\"][:]\\s(\\d{1,})");
        Pattern id = Pattern.compile("[\"]id[\"][:]\\s(\\d{1,})");
        Pattern body = Pattern.compile("[\"]body[\"]:\\s([\"])(?:(?=(\\\\?))\\2.)*?\\1");
        Pattern email = Pattern
                .compile("[\"]email[\"][:]\\s[\"]([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)[\"]");
        Matcher findId = id.matcher(data);
        Matcher findPostId = postId.matcher(data);
        Matcher findBody = body.matcher(data);
        Matcher findEmail = email.matcher(data);

        int i = 0;
        while (findId.find()) {
            levelizer.get(i).setId(Integer.parseInt(findId.group(1)));
            i++;
        }
        i = 0;
        while (findEmail.find()) {
            levelizer.get(i).setEmail(findEmail.group(1));
            i++;
        }

        i = 0;
        while (findPostId.find()) {
            levelizer.get(i).setPostId(Integer.parseInt(findPostId.group(1)));
            i++;
        }

        i = 0;
        String cuerpo;
        while (findBody.find()) {
            cuerpo = JSONFileReader.extraerContenido(findBody.group(0), "\"");
            levelizer.get(i).setBody(cuerpo);
            i++;
        }
    }

    /**
     * @return the postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * @param postId the postId to set
     */
    public void setPostId(int postId) {
        this.postId = postId;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nID post: ").append(this.postId);
        sb.append("\nID comentario: ").append(this.id);
        sb.append("\nNombre: ").append(this.name);
        sb.append("\nE-mail: ").append(this.email);
        sb.append("\nCuerpo: ").append(this.body);
        return sb.toString();
    }
}
