/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

import java.io.IOException;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jony1
 */
public class Raiz {

    private ArrayList<Usuario> users;

    private JSONFileReader js;

    public Raiz() {
        js = new JSONFileReader("src/Data/users.json");
        users = new ArrayList<>();
        Comment.initLevelizer();
        inicializarUsuarios();
    }

    private void inicializarUsuarios() {
        String entrada = "";

        try {
            entrada = js.getJSONdataToString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Pattern name = Pattern
                .compile("[\"]name[\"][:]\\s[\"]([a-zA-Z]{0,}[.]\\s[a-zA-Z]{1,}\\s[a-zA-Z]{1,}|[a-zA-Z]{1,}(-|\\s)[a-zA-Z]{1,}\\s{0,}[a-zA-Z]{0,})[\"]"
                );

        Pattern username = Pattern
                .compile("[\"]username[\"][:]\\s[\"](\\b[a-zA-Z][a-zA-Z0-9\\-._]{3,}\\b)[\"]");

        Pattern email = Pattern
                .compile("[\"]email[\"][:]\\s[\"]([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)[\"]");

        Pattern id = Pattern.compile("[\"]id[\"][:]\\s(\\d{1,2})");

        Matcher buscarUsername = username.matcher(entrada);
        Matcher buscarName = name.matcher(entrada);
        Matcher buscarId = id.matcher(entrada);
        Matcher buscarEmail = email.matcher(entrada);
        int aux = 1;
        int i = 0;

        while (buscarId.find()) {
            Usuario usr = new Usuario();
            usr.setId(Integer.parseInt(buscarId.group(1)));
            usr.inicializarPosts();
            users.add(usr);
        }

        while (buscarName.find()) {
            if (aux % 2 != 0) {
                users.get(i).setNombre(buscarName.group(1));
                i++;
            }
            aux++;
        }

        i = 0;
        while (buscarUsername.find()) {
            users.get(i).setUserName(buscarUsername.group(1));
            i++;
        }

        i = 0;
        while (buscarEmail.find()) {
            users.get(i).setEmail(buscarEmail.group(1));
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Usuario user : users) {
            sb.append("\n--------------------------------------------------------------\n");
            sb.append(user);
        }
        return sb.toString();
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

}
