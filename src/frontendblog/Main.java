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

    public static void main(String[] args) {

        //Logica Jframe
        FramePrincipal frameF = new FramePrincipal();
        frameF.setVisible(true);
        frameF.setBounds(0, 0, 720, 405);
        frameF.setLocationRelativeTo(null);

    }
}
