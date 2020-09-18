package frontendblog;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FramePrincipal extends javax.swing.JFrame {

    Main obj = new Main();
    Datos data = new Datos();
    Arbol ab = new Arbol(data);

    static String datoVentanaPrimera;
    static String datoSegundo;
    int userID;
    int postID;

    Nodo raiz = ab.getRaiz();
    static Nodo usuario;

    int numPost = 0;
    int numComent = 0;

    public FramePrincipal() {
        initComponents();
        ab.insertaNodos();
        areaComentarios.setLineWrap(true);
        Panel2.setVisible(false);
        Panel3.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        tituloEmpresa = new javax.swing.JLabel();
        principalTextField = new javax.swing.JTextField();
        iconoEmpresa = new javax.swing.JLabel();
        principalButton = new javax.swing.JLabel();
        sugerencia = new javax.swing.JLabel();
        FondoPrincipal = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        tituloEmpresa2 = new javax.swing.JLabel();
        atras3 = new javax.swing.JLabel();
        iconoEmpresa1 = new javax.swing.JLabel();
        nameUser = new javax.swing.JLabel();
        busqueda2Button = new javax.swing.JLabel();
        searchPostUser = new javax.swing.JLabel();
        buscarPostTextField = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaInfoNormal = new javax.swing.JTextArea();
        masInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComentarios = new javax.swing.JTextArea();
        FondoTerciario = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        tituloEmpresa1 = new javax.swing.JLabel();
        atras2 = new javax.swing.JLabel();
        verMas = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        post = new javax.swing.JLabel();
        cmm = new javax.swing.JLabel();
        nombreUSUARIO = new javax.swing.JTextField();
        numPOSTS = new javax.swing.JTextField();
        numCOMENTARIOS = new javax.swing.JTextField();
        IconoEmpresa = new javax.swing.JLabel();
        FondoSecundario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        Panel1.setLayout(null);

        Cerrar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(31, 78, 121));
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Panel1.add(Cerrar);
        Cerrar.setBounds(700, 0, 20, 20);

        titulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Realice su busqueda:");
        Panel1.add(titulo);
        titulo.setBounds(280, 100, 170, 20);

        tituloEmpresa.setFont(new java.awt.Font("Dubai", 1, 9)); // NOI18N
        tituloEmpresa.setForeground(new java.awt.Color(31, 78, 121));
        tituloEmpresa.setText("BIK SOLUTIONS");
        Panel1.add(tituloEmpresa);
        tituloEmpresa.setBounds(50, 10, 70, 16);

        principalTextField.setBackground(new java.awt.Color(255, 255, 255));
        principalTextField.setForeground(new java.awt.Color(31, 78, 121));
        principalTextField.setSelectedTextColor(new java.awt.Color(31, 78, 121));
        principalTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalTextFieldMouseClicked(evt);
            }
        });
        principalTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                principalTextFieldKeyTyped(evt);
            }
        });
        Panel1.add(principalTextField);
        principalTextField.setBounds(200, 160, 330, 24);

        iconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brain1.png"))); // NOI18N
        Panel1.add(iconoEmpresa);
        iconoEmpresa.setBounds(0, 0, 50, 50);

        principalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        principalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalButtonMouseClicked(evt);
            }
        });
        principalButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                principalButtonKeyPressed(evt);
            }
        });
        Panel1.add(principalButton);
        principalButton.setBounds(340, 190, 40, 40);

        sugerencia.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        sugerencia.setForeground(new java.awt.Color(255, 255, 255));
        sugerencia.setText("(Introduzca palabra clave:  ID de usuario)");
        Panel1.add(sugerencia);
        sugerencia.setBounds(210, 130, 310, 21);

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diap1.png"))); // NOI18N
        FondoPrincipal.setText("X");
        Panel1.add(FondoPrincipal);
        FondoPrincipal.setBounds(0, 0, 720, 405);

        getContentPane().add(Panel1);
        Panel1.setBounds(0, 0, 720, 410);

        Panel3.setLayout(null);

        tituloEmpresa2.setFont(new java.awt.Font("Dubai", 1, 9)); // NOI18N
        tituloEmpresa2.setForeground(new java.awt.Color(229, 229, 229));
        tituloEmpresa2.setText("BIK SOLUTIONS");
        Panel3.add(tituloEmpresa2);
        tituloEmpresa2.setBounds(50, 10, 70, 16);

        atras3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        atras3.setForeground(new java.awt.Color(229, 229, 229));
        atras3.setText("<--");
        atras3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras3MouseClicked(evt);
            }
        });
        Panel3.add(atras3);
        atras3.setBounds(10, 380, 30, 24);

        iconoEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brain2.png"))); // NOI18N
        Panel3.add(iconoEmpresa1);
        iconoEmpresa1.setBounds(0, 0, 50, 50);

        nameUser.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        nameUser.setForeground(new java.awt.Color(31, 78, 121));
        nameUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameUser.setText("Nombre de usuario, ID, Email:");
        Panel3.add(nameUser);
        nameUser.setBounds(30, 60, 230, 21);

        busqueda2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        busqueda2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busqueda2ButtonMouseClicked(evt);
            }
        });
        busqueda2Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                busqueda2ButtonKeyPressed(evt);
            }
        });
        Panel3.add(busqueda2Button);
        busqueda2Button.setBounds(270, 240, 41, 30);

        searchPostUser.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        searchPostUser.setForeground(new java.awt.Color(31, 78, 121));
        searchPostUser.setText("Buscar Post:");
        Panel3.add(searchPostUser);
        searchPostUser.setBounds(30, 240, 80, 21);

        buscarPostTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarPostTextFieldKeyTyped(evt);
            }
        });
        Panel3.add(buscarPostTextField);
        buscarPostTextField.setBounds(140, 240, 130, 24);

        Separador.setForeground(new java.awt.Color(31, 78, 121));
        Panel3.add(Separador);
        Separador.setBounds(20, 210, 360, 10);

        areaInfoNormal.setColumns(20);
        areaInfoNormal.setRows(5);
        areaInfoNormal.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaInfoNormal);

        Panel3.add(jScrollPane2);
        jScrollPane2.setBounds(30, 80, 230, 120);

        masInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diap3_1.png"))); // NOI18N
        Panel3.add(masInfo);
        masInfo.setBounds(20, 60, 360, 310);

        areaComentarios.setColumns(20);
        areaComentarios.setRows(5);
        jScrollPane1.setViewportView(areaComentarios);

        Panel3.add(jScrollPane1);
        jScrollPane1.setBounds(390, 60, 310, 310);

        FondoTerciario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diap3.png"))); // NOI18N
        Panel3.add(FondoTerciario);
        FondoTerciario.setBounds(0, 0, 720, 410);

        getContentPane().add(Panel3);
        Panel3.setBounds(0, 0, 720, 410);

        Panel2.setLayout(null);

        tituloEmpresa1.setFont(new java.awt.Font("Dubai", 1, 9)); // NOI18N
        tituloEmpresa1.setForeground(new java.awt.Color(31, 78, 121));
        tituloEmpresa1.setText("BIK SOLUTIONS");
        Panel2.add(tituloEmpresa1);
        tituloEmpresa1.setBounds(50, 10, 70, 16);

        atras2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        atras2.setForeground(new java.awt.Color(31, 78, 121));
        atras2.setText("<--");
        atras2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras2MouseClicked(evt);
            }
        });
        Panel2.add(atras2);
        atras2.setBounds(10, 380, 30, 24);

        verMas.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        verMas.setForeground(new java.awt.Color(31, 78, 121));
        verMas.setText("Ver más...");
        verMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMasMouseClicked(evt);
            }
        });
        Panel2.add(verMas);
        verMas.setBounds(220, 330, 70, 16);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        Panel2.add(user);
        user.setBounds(220, 80, 62, 60);

        post.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/note.png"))); // NOI18N
        Panel2.add(post);
        post.setBounds(220, 160, 70, 70);

        cmm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cmm.png"))); // NOI18N
        Panel2.add(cmm);
        cmm.setBounds(220, 260, 70, 60);

        nombreUSUARIO.setBackground(new java.awt.Color(255, 255, 255));
        nombreUSUARIO.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        nombreUSUARIO.setForeground(new java.awt.Color(31, 78, 121));
        nombreUSUARIO.setDisabledTextColor(new java.awt.Color(31, 78, 121));
        Panel2.add(nombreUSUARIO);
        nombreUSUARIO.setBounds(300, 110, 120, 24);

        numPOSTS.setBackground(new java.awt.Color(255, 255, 255));
        numPOSTS.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        numPOSTS.setForeground(new java.awt.Color(31, 78, 121));
        numPOSTS.setDisabledTextColor(new java.awt.Color(31, 78, 121));
        Panel2.add(numPOSTS);
        numPOSTS.setBounds(300, 190, 120, 24);

        numCOMENTARIOS.setBackground(new java.awt.Color(255, 255, 255));
        numCOMENTARIOS.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        numCOMENTARIOS.setForeground(new java.awt.Color(31, 78, 121));
        numCOMENTARIOS.setDisabledTextColor(new java.awt.Color(31, 78, 121));
        Panel2.add(numCOMENTARIOS);
        numCOMENTARIOS.setBounds(300, 280, 120, 24);

        IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brain1.png"))); // NOI18N
        Panel2.add(IconoEmpresa);
        IconoEmpresa.setBounds(0, 0, 50, 50);

        FondoSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diap2.png"))); // NOI18N
        Panel2.add(FondoSecundario);
        FondoSecundario.setBounds(0, -10, 720, 420);

        getContentPane().add(Panel2);
        Panel2.setBounds(0, 0, 720, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Primer panel boton de cerrar
    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked
    // Primer panel; textField
    private void principalTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalTextFieldMouseClicked
        principalTextField.setText("");
    }//GEN-LAST:event_principalTextFieldMouseClicked
    // Primer panel; Jlabel que cumple la funcion de boton
    private void principalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalButtonMouseClicked
        primerRegistro();

    }//GEN-LAST:event_principalButtonMouseClicked
    // Metodo mostrar info en el panel 2
    public void primerRegistro() {
        if (principalTextField.getText().isEmpty() || "(Introduzca palabra clave: Usuario, Id post o Id Comentario)".equals(datoVentanaPrimera)) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos", "¡ERROR!", 1);
        } else {
            datoVentanaPrimera = principalTextField.getText();
            userID = Integer.parseInt(datoVentanaPrimera);

            if (userID > data.getUsers().getSize() || userID <= 0) {
                JOptionPane.showMessageDialog(null, "El usuario con ID " + userID + " no ha sido encontrado.", "INDICACION", 1);
                getToolkit().beep();
                principalTextField.setText("");

            } else {
                principalTextField.setText("");

                Panel1.setVisible(false);
                Panel2.setVisible(true);
                // Se obtiene el nodo que contiene la información de dicho usuario.
                usuario = ab.buscarNodo(raiz, raiz.getHijos().get(userID - 1).getInfo());
                areaInfoNormal.setText(usuario.getInfo());
                //Se muestran los posts del usuario
                ListaEnlazada<Nodo> posts = usuario.getHijos().getPtr();
                numPost = 0;
                numComent = 0;
                //Conteo de posts y comentarios
                areaComentarios.setText("");
                areaComentarios.setText("POST DEL USUARIO CON ID:" + userID);
                ListaEnlazada<Nodo> comments;
                while (posts != null) {
                    comments = posts.getDato().getHijos().getPtr();
                    while (comments != null) {
                        numComent++;
                        comments = comments.getLink();
                    }
                    numPost++;
                    areaComentarios.setText(areaComentarios.getText() + "\n" + posts.getDato().getInfo());
                    posts = posts.getLink();
                }

                nombreUSUARIO.setText("");
                nombreUSUARIO.setEnabled(false);

                numPOSTS.setText(Integer.toString(numPost));
                numPOSTS.setEnabled(false);

                numCOMENTARIOS.setText(Integer.toString(numComent));
                numCOMENTARIOS.setEnabled(false);

            }
        }
    }

    // Metodo de mostrar info en los textAreas del panel 3
    public void segundoRegistro() {
        if (buscarPostTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar al menos uno de los campos", "¡ERROR!", 1);
        } else {
            datoSegundo = buscarPostTextField.getText();
            postID = Integer.parseInt(datoSegundo);
            if (postID > usuario.getHijos().getSize() || postID <= 0) {
                JOptionPane.showMessageDialog(null, "El post con ID " + postID + " no ha sido encontrado.", "INDICACION", 1);
                getToolkit().beep();
                buscarPostTextField.setText("");
            } else {
                Nodo usrPost = ab.buscarNodo(usuario, usuario.getHijos().get(postID - 1).getInfo());
                ListaEnlazada<Nodo> comments = usrPost.getHijos().getPtr();
                areaComentarios.setText("");
                areaComentarios.setText(usrPost.getInfo() + "\n" + "-----------------------------");
                while (comments != null) {
                    areaComentarios.setText(areaComentarios.getText() + "\n" + comments.getDato().getInfo());
                    comments = comments.getLink();
                }

            }

        }
    }

    //  Transiciones entre Paneles 1,2 y 3
    private void atras2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras2MouseClicked

        Panel2.setVisible(false);
        Panel1.setVisible(true);

    }//GEN-LAST:event_atras2MouseClicked

    private void verMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMasMouseClicked

        Panel2.setVisible(false);
        Panel3.setVisible(true);


    }//GEN-LAST:event_verMasMouseClicked

    private void atras3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras3MouseClicked
        numPost = 0;
        numComent = 0;
        buscarPostTextField.setText("");
        nombreUSUARIO.setText("");
        numPOSTS.setText("");
        numCOMENTARIOS.setText("");
        Panel3.setVisible(false);
        areaComentarios.setText("");
        Panel1.setVisible(true);

    }//GEN-LAST:event_atras3MouseClicked

    private void busqueda2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busqueda2ButtonMouseClicked
        segundoRegistro();

    }//GEN-LAST:event_busqueda2ButtonMouseClicked
    // Validaciones en TextFields
    private void principalTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_principalTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Asegurese que el ID este escrito con numeros", "¡ERROR!", 1);
        }
        
        
    }//GEN-LAST:event_principalTextFieldKeyTyped

    private void buscarPostTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPostTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Asegurese que el ID este escrito con numeros", "¡ERROR!", 1);
        }
    }//GEN-LAST:event_buscarPostTextFieldKeyTyped
    // Llamado a los metodos principales desde un KeyEvent
    private void busqueda2ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busqueda2ButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            segundoRegistro();
        }
    }//GEN-LAST:event_busqueda2ButtonKeyPressed

    private void principalButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_principalButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            primerRegistro();
        }
    }//GEN-LAST:event_principalButtonKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JLabel FondoSecundario;
    private javax.swing.JLabel FondoTerciario;
    private javax.swing.JLabel IconoEmpresa;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JSeparator Separador;
    private javax.swing.JTextArea areaComentarios;
    private javax.swing.JTextArea areaInfoNormal;
    private javax.swing.JLabel atras2;
    private javax.swing.JLabel atras3;
    private javax.swing.JTextField buscarPostTextField;
    private javax.swing.JLabel busqueda2Button;
    private javax.swing.JLabel cmm;
    private javax.swing.JLabel iconoEmpresa;
    private javax.swing.JLabel iconoEmpresa1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel masInfo;
    private javax.swing.JLabel nameUser;
    private javax.swing.JTextField nombreUSUARIO;
    private javax.swing.JTextField numCOMENTARIOS;
    private javax.swing.JTextField numPOSTS;
    private javax.swing.JLabel post;
    private javax.swing.JLabel principalButton;
    private javax.swing.JTextField principalTextField;
    private javax.swing.JLabel searchPostUser;
    private javax.swing.JLabel sugerencia;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloEmpresa;
    private javax.swing.JLabel tituloEmpresa1;
    private javax.swing.JLabel tituloEmpresa2;
    private javax.swing.JLabel user;
    private javax.swing.JLabel verMas;
    // End of variables declaration//GEN-END:variables
}
