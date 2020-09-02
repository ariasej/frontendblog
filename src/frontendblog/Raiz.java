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

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jony1
 */
public  class Raiz {
    private ArrayList<Usuario>users; 
    
    
    
    public Raiz(){
       users = new ArrayList<>(); 
       inicializarUsuarios(); 
    }
    
    //Metodo de prueba
    public void mostrarUsuarios(){
        for (Usuario user : users) {
            System.out.println("-----------------");
            System.out.println(user);
            user.mostrarPosts();
        }
    
    }
    
    public void inicializarUsuarios(){
        String path = "src/Data/users.json"; 
        
        try { 
            String data = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray users = new JSONArray(data); 
            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i); 
                this.users.add(crearUsuario(user));
            }
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        
        
        
    
    }

    private Usuario crearUsuario(JSONObject user) {
        JSONObject address = user.getJSONObject("address");
         String nombre = user.getString("name"); 
         int id = user.getInt("id"); 
         String userName = user.getString("username"); 
         String email = user.getString("email"); 
         String numeroTelefonico = user.getString("phone"); 
         String website = user.getString("website"); 
         Direccion direccion = crearDireccion(address); 
         
        return new Usuario(id, nombre, userName, email, direccion, numeroTelefonico, website); 
    }

    private Direccion crearDireccion(JSONObject address) {
        String calle = address.getString("street");
        String suite =  address.getString("suite"); 
        String ciudad = address.getString("city");
        
        
        return new Direccion(calle, suite, ciudad);  
    }
    
    
    
    
}
