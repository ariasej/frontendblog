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
        // Se instancia un objeto de clase FramePrincipal y se muestra el frame.
        FramePrincipal frame = new FramePrincipal();
        frame.setVisible(true);
        frame.setBounds(0, 0, 1000, 500);
        frame.setLocationRelativeTo(null);
    }
}
