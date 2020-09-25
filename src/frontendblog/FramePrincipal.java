package frontendblog;

import static frontendblog.Main.arbol;
import static frontendblog.Main.datos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * Clase que contiene todos los componentes graficos del programa.
 *
 * @author JDAM222
 */
public class FramePrincipal extends javax.swing.JFrame {

    // Se realiza la lectura de datos del JSONFileReader.
    // Se instancia un objeto arbol de la clase ArbolT (Nodos genéricos).
    static ArbolT arbol;

    boolean paneli;

    static DefaultListModel modelo2;
    static DefaultListModel modelo3;
    static DefaultListModel modelo4;
    static DefaultListModel modelo5;
    static DefaultListModel modelo6;
    static ListaEnlazada<NodoT> resultadosBusqPost;
    static ListaEnlazada<NodoT> busqueda;
    static ListaEnlazada<Integer> idComments;
    static ListaEnlazada<Integer> idPosts;
    // Declaración de variables para dibujo:
    int separacionHorizontal = 750;
    int separacionVertical = 180;
    static int idUsuarioG;
    static int idPostArbol;
    static boolean arbolCreado = false;

    int x1 = 0;
    int x2 = 0;
    int radio = 30;
    static int tamHijos = 0;
    static int tamNietos = 0;

    /**
     * Metodo contstructor
     *
     */
    public FramePrincipal() {
        initComponents();

        DefaultListModel modelo = new DefaultListModel();
        listaPosts.setModel(modelo);
        DefaultListModel mode = new DefaultListModel();
        listaPost.setModel(mode);
        DefaultListModel model = new DefaultListModel();
        listaComments.setModel(model);

        Panel2.setVisible(false);
        Panel3.setVisible(false);

        areaUsuario.setVisible(false);
        listaPosts.setVisible(false);
        listaComments.setVisible(false);

        PanelPost.setVisible(false);
        PanelUsuario.setVisible(false);

        // Se realiza la lectura de datos del JSONFileReader.
        Datos datos = new Datos();
        // Se instancia un objeto arbol de la clase ArbolT (Nodos genéricos).
        arbol = new ArbolT(datos);
        // Se insertan llena el árbol con la información extraída del JSON.
        arbol.insertarNodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeparadorDeBusquedas = new javax.swing.JTabbedPane();
        PanelU = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        usuarioButton = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        separador2 = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        fondoPrimario = new javax.swing.JLabel();
        PanelP = new javax.swing.JPanel();
        Cerrar3 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        postButton = new javax.swing.JLabel();
        postTextField = new javax.swing.JTextField();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        icono1 = new javax.swing.JLabel();
        fondoPrimario1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        atras2 = new javax.swing.JLabel();
        verMas = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        post = new javax.swing.JLabel();
        cmm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        areaUsuario = new javax.swing.JLabel();
        panelArbol = new javax.swing.JPanel();
        separador = new javax.swing.JLabel();
        Cerrar2 = new javax.swing.JLabel();
        mostrar = new javax.swing.JLabel();
        mostrarArbol = new javax.swing.JLabel();
        avisoArbol = new javax.swing.JLabel();
        tree = new javax.swing.JLabel();
        sugerencias = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        lista = new javax.swing.JScrollPane();
        listaPost = new javax.swing.JList<>();
        FondoSecundario = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        panel3principal = new javax.swing.JPanel();
        PanelUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombrePanelU = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPosts = new javax.swing.JList<>();
        correoPanelU = new javax.swing.JLabel();
        usrPanelU = new javax.swing.JLabel();
        idPanelU = new javax.swing.JLabel();
        PanelPost = new javax.swing.JPanel();
        areaTitulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idPPanelP = new javax.swing.JTextField();
        idCPanelP = new javax.swing.JTextField();
        listaCM = new javax.swing.JScrollPane();
        listaComments = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        areaCuerpo = new javax.swing.JLabel();
        atras3 = new javax.swing.JLabel();
        Cerrar1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FondoTerciario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelSeparadorDeBusquedas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        PanelU.setLayout(null);

        Cerrar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        PanelU.add(Cerrar);
        Cerrar.setBounds(970, 0, 30, 40);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Realice su busqueda(Por Id o nombre de usuario):");
        PanelU.add(titulo);
        titulo.setBounds(240, 210, 500, 30);

        usuarioButton.setBackground(new java.awt.Color(255, 255, 255));
        usuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_search_white_18dpe.png"))); // NOI18N
        usuarioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioButtonMouseClicked(evt);
            }
        });
        PanelU.add(usuarioButton);
        usuarioButton.setBounds(710, 250, 30, 30);

        usuarioTextField.setBackground(new java.awt.Color(0, 0, 0));
        usuarioTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setOpaque(false);
        usuarioTextField.setSelectedTextColor(new java.awt.Color(31, 78, 121));
        PanelU.add(usuarioTextField);
        usuarioTextField.setBounds(240, 250, 460, 30);

        separador2.setBackground(new java.awt.Color(255, 255, 255));
        separador2.setOpaque(true);
        PanelU.add(separador2);
        separador2.setBounds(-10, 140, 1010, 10);

        separador1.setBackground(new java.awt.Color(255, 255, 255));
        separador1.setOpaque(true);
        PanelU.add(separador1);
        separador1.setBounds(0, 360, 1010, 10);

        icono.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setText("Icono");
        PanelU.add(icono);
        icono.setBounds(10, 10, 140, 100);

        fondoPrimario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network-concept-4k-blue-background-lines-social-network.jpg"))); // NOI18N
        PanelU.add(fondoPrimario);
        fondoPrimario.setBounds(-210, -40, 1220, 730);

        panelSeparadorDeBusquedas.addTab("Busqueda por Usuario", PanelU);

        PanelP.setLayout(null);

        Cerrar3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Cerrar3.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar3.setText("X");
        Cerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar3MouseClicked(evt);
            }
        });
        PanelP.add(Cerrar3);
        Cerrar3.setBounds(960, 0, 40, 40);

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Realice su busqueda(Por ID o nombre del post):");
        PanelP.add(titulo1);
        titulo1.setBounds(240, 210, 450, 30);

        postButton.setBackground(new java.awt.Color(255, 255, 255));
        postButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_search_white_18dpe.png"))); // NOI18N
        postButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postButtonMouseClicked(evt);
            }
        });
        PanelP.add(postButton);
        postButton.setBounds(710, 250, 30, 30);

        postTextField.setBackground(new java.awt.Color(0, 0, 0));
        postTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postTextField.setForeground(new java.awt.Color(255, 255, 255));
        postTextField.setOpaque(false);
        postTextField.setSelectedTextColor(new java.awt.Color(31, 78, 121));
        PanelP.add(postTextField);
        postTextField.setBounds(240, 250, 460, 30);

        separador3.setBackground(new java.awt.Color(255, 255, 255));
        separador3.setOpaque(true);
        PanelP.add(separador3);
        separador3.setBounds(-10, 140, 1010, 10);

        separador4.setBackground(new java.awt.Color(255, 255, 255));
        separador4.setOpaque(true);
        PanelP.add(separador4);
        separador4.setBounds(0, 360, 1010, 10);

        icono1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        icono1.setForeground(new java.awt.Color(255, 255, 255));
        icono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono1.setText("Icono");
        PanelP.add(icono1);
        icono1.setBounds(10, 10, 140, 100);

        fondoPrimario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network-concept-4k-blue-background-lines-social-network.jpg"))); // NOI18N
        PanelP.add(fondoPrimario1);
        fondoPrimario1.setBounds(-210, -40, 1220, 730);

        panelSeparadorDeBusquedas.addTab("Busqueda por Post", PanelP);

        getContentPane().add(panelSeparadorDeBusquedas);
        panelSeparadorDeBusquedas.setBounds(-8, -6, 1010, 510);

        Panel2.setLayout(null);

        atras2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        atras2.setForeground(new java.awt.Color(31, 78, 121));
        atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_navigate_before_white_18dp.png"))); // NOI18N
        atras2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras2MouseClicked(evt);
            }
        });
        Panel2.add(atras2);
        atras2.setBounds(0, 454, 60, 40);

        verMas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verMas.setForeground(new java.awt.Color(255, 255, 255));
        verMas.setText("Ver más...");
        verMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMasMouseClicked(evt);
            }
        });
        Panel2.add(verMas);
        verMas.setBounds(890, 450, 100, 50);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twotone_account_circle_white_36dp.png"))); // NOI18N
        Panel2.add(user);
        user.setBounds(60, 70, 70, 60);

        post.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twotone_markunread_mailbox_white_36dp.png"))); // NOI18N
        Panel2.add(post);
        post.setBounds(190, 60, 70, 70);

        cmm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twotone_chat_white_36dp.png"))); // NOI18N
        Panel2.add(cmm);
        cmm.setBounds(330, 70, 70, 60);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Icono");
        Panel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 90, 50);

        areaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        areaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel2.add(areaUsuario);
        areaUsuario.setBounds(50, 170, 450, 260);
        Panel2.add(panelArbol);
        panelArbol.setBounds(590, 170, 360, 260);

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        Panel2.add(separador);
        separador.setBounds(540, 0, 10, 520);

        Cerrar2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Cerrar2.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar2.setText("X");
        Cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar2MouseClicked(evt);
            }
        });
        Panel2.add(Cerrar2);
        Cerrar2.setBounds(960, 0, 40, 40);

        mostrar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar:");
        Panel2.add(mostrar);
        mostrar.setBounds(60, 440, 80, 16);

        mostrarArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twotone_visibility_white_18dp.png"))); // NOI18N
        mostrarArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarArbolMouseClicked(evt);
            }
        });
        Panel2.add(mostrarArbol);
        mostrarArbol.setBounds(130, 430, 36, 30);

        avisoArbol.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        avisoArbol.setForeground(new java.awt.Color(255, 255, 255));
        Panel2.add(avisoArbol);
        avisoArbol.setBounds(590, 130, 360, 40);

        tree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twotone_account_tree_white_24dpe.png"))); // NOI18N
        Panel2.add(tree);
        tree.setBounds(740, 80, 60, 40);

        sugerencias.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sugerencias.setForeground(new java.awt.Color(255, 255, 255));
        sugerencias.setText("Sugerencias:");
        Panel2.add(sugerencias);
        sugerencias.setBounds(50, 134, 120, 40);

        panelTabla.setLayout(null);

        listaPost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaPost.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostValueChanged(evt);
            }
        });
        lista.setViewportView(listaPost);

        panelTabla.add(lista);
        lista.setBounds(0, 0, 450, 260);

        Panel2.add(panelTabla);
        panelTabla.setBounds(50, 170, 450, 260);

        FondoSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network-concept-4k-blue-background-lines-social-network.jpg"))); // NOI18N
        Panel2.add(FondoSecundario);
        FondoSecundario.setBounds(0, -10, 1000, 510);

        getContentPane().add(Panel2);
        Panel2.setBounds(0, 0, 1000, 500);

        Panel3.setLayout(null);

        panel3principal.setLayout(null);

        PanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        PanelUsuario.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 78, 121));
        jLabel1.setText("Posts:");
        PanelUsuario.add(jLabel1);
        jLabel1.setBounds(20, 180, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 78, 121));
        jLabel2.setText("Nombre:");
        PanelUsuario.add(jLabel2);
        jLabel2.setBounds(20, 10, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 78, 121));
        jLabel3.setText("ID:");
        PanelUsuario.add(jLabel3);
        jLabel3.setBounds(20, 50, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 78, 121));
        jLabel6.setText("Username:");
        PanelUsuario.add(jLabel6);
        jLabel6.setBounds(20, 90, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(31, 78, 121));
        jLabel7.setText("Correo:");
        PanelUsuario.add(jLabel7);
        jLabel7.setBounds(20, 130, 80, 30);

        nombrePanelU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelUsuario.add(nombrePanelU);
        nombrePanelU.setBounds(120, 10, 400, 30);

        listaPosts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaPosts);

        PanelUsuario.add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 500, 150);

        correoPanelU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelUsuario.add(correoPanelU);
        correoPanelU.setBounds(120, 130, 400, 30);

        usrPanelU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelUsuario.add(usrPanelU);
        usrPanelU.setBounds(120, 90, 400, 30);

        idPanelU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelUsuario.add(idPanelU);
        idPanelU.setBounds(120, 50, 400, 30);

        panel3principal.add(PanelUsuario);
        PanelUsuario.setBounds(0, 0, 540, 390);

        PanelPost.setBackground(new java.awt.Color(255, 255, 255));
        PanelPost.setLayout(null);

        areaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PanelPost.add(areaTitulo);
        areaTitulo.setBounds(30, 10, 480, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 78, 121));
        jLabel9.setText("ID Creador:");
        PanelPost.add(jLabel9);
        jLabel9.setBounds(30, 80, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(31, 78, 121));
        jLabel10.setText("ID Post:");
        PanelPost.add(jLabel10);
        jLabel10.setBounds(30, 110, 90, 20);

        idPPanelP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idPPanelP.setForeground(new java.awt.Color(31, 78, 121));
        idPPanelP.setBorder(null);
        idPPanelP.setDisabledTextColor(new java.awt.Color(31, 78, 121));
        idPPanelP.setEnabled(false);
        idPPanelP.setOpaque(false);
        idPPanelP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPPanelPActionPerformed(evt);
            }
        });
        PanelPost.add(idPPanelP);
        idPPanelP.setBounds(130, 110, 380, 20);

        idCPanelP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idCPanelP.setForeground(new java.awt.Color(31, 78, 121));
        idCPanelP.setBorder(null);
        idCPanelP.setDisabledTextColor(new java.awt.Color(31, 78, 121));
        idCPanelP.setEnabled(false);
        idCPanelP.setOpaque(false);
        PanelPost.add(idCPanelP);
        idCPanelP.setBounds(130, 80, 380, 20);

        listaComments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaCM.setViewportView(listaComments);

        PanelPost.add(listaCM);
        listaCM.setBounds(30, 230, 480, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(31, 78, 121));
        jLabel8.setText("Comentarios:");
        PanelPost.add(jLabel8);
        jLabel8.setBounds(30, 204, 100, 30);

        areaCuerpo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelPost.add(areaCuerpo);
        areaCuerpo.setBounds(30, 130, 480, 70);

        panel3principal.add(PanelPost);
        PanelPost.setBounds(0, 0, 540, 390);

        Panel3.add(panel3principal);
        panel3principal.setBounds(250, 50, 540, 390);

        atras3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        atras3.setForeground(new java.awt.Color(229, 229, 229));
        atras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_navigate_before_white_18dp.png"))); // NOI18N
        atras3.setText("<--");
        atras3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras3MouseClicked(evt);
            }
        });
        Panel3.add(atras3);
        atras3.setBounds(0, 454, 50, 40);

        Cerrar1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar1.setText("X");
        Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar1MouseClicked(evt);
            }
        });
        Panel3.add(Cerrar1);
        Cerrar1.setBounds(950, 0, 50, 50);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Icono");
        Panel3.add(jLabel5);
        jLabel5.setBounds(10, 10, 120, 90);

        FondoTerciario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network-concept-4k-blue-background-lines-social-network.jpg"))); // NOI18N
        Panel3.add(FondoTerciario);
        FondoTerciario.setBounds(0, 0, 1000, 500);

        getContentPane().add(Panel3);
        Panel3.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método encargado de pintar el árbol de un Usuario y de un Post.
     *
     * @param h Posición horizontal.
     * @param v Posición vertical.
     * @param r Radio de circulo
     * @param tamhijos Numero de posts.
     * @param tamNietos Numero de comentarios
     */
    public void Pintar(int h, int v, int r, int tamhijos, int tamNietos) {
        Graphics g = this.getGraphics();

        g.setColor(Color.BLACK);
        g.drawOval(h, v, r, r);

        g.setColor(Color.WHITE);
        g.fillOval(h, v, r, r);

        if (paneli) {
            if (arbolCreado) {
                avisoArbol.setText("Árbol de IDs para un usuario y sus posts:");
                String id = Integer.toString(idUsuarioG);
                g.setColor(Color.BLACK);
                g.drawOval(h, v, r, r);

                g.setColor(Color.WHITE);
                g.fillOval(h, v, r, r);

                g.setColor(Color.BLACK);
                g.drawString(id, h + 10, v + 20);
                for (int i = 0; i < tamhijos; i++) {
                    g.setColor(Color.BLUE);
                    g.drawOval(h - 120 + 30 * i, v + 80, r, r);

                    g.setColor(Color.WHITE);
                    g.fillOval(h - 120 + 30 * i, v + 80, r, r);

                    g.setColor(Color.BLACK);
                    g.drawString(Integer.toString(idPosts.get(i)), h - 112 + 30 * i, v + 100);

                    g.setColor(Color.BLUE);
                    g.drawLine(h + 15, v + 30, h - 97 + 30 * i, v + 80);
                }
            }
        } else {
            if (arbolCreado) {
                avisoArbol.setText("Árbol de IDs para un post y comentarios:");
                String id = Integer.toString(idPostArbol);
                g.setColor(Color.BLACK);
                g.drawOval(h, v, r, r);

                g.setColor(Color.WHITE);
                g.fillOval(h, v, r, r);

                g.setColor(Color.BLACK);
                g.drawString(id, h + 10, v + 20);
                for (int i = 0; i < tamNietos; i++) {
                    g.setColor(Color.BLUE);
                    g.drawOval(h - 120 + 60 * i, v + 80, r, r);

                    g.setColor(Color.WHITE);
                    g.fillOval(h - 120 + 60 * i, v + 80, r, r);

                    g.setColor(Color.BLACK);
                    g.drawString(Integer.toString(idComments.get(i)), h - 115 + 60 * i, v + 100);

                    g.setColor(Color.BLUE);
                    g.drawLine(h + 15, v + 30, h - 97 + 60 * i, v + 80);
                }
            }
        }

    }

    /**
     * Se escoge el método de búsqueda del Usuario, dependiendo si se recibe un
     * nombre o ID.
     *
     */
    public void buscarU() {
        String usrInfo = usuarioTextField.getText().trim();
        try {
            int userID = Integer.parseInt(usrInfo);
            busquedaUsuario(userID);
        } catch (NumberFormatException e) {
            busquedaUsuario(usrInfo);
        }
    }

    /**
     * Se escoge el método de búsqueda del post, dependiendo si se recibe un
     * String o ID.
     *
     */
    public void buscarP() {
        String postInfo = postTextField.getText().trim();
        try {
            int postID = Integer.parseInt(postInfo);
            busquedaPost(postID);
        } catch (NumberFormatException excepcion) {
            busquedaPost(postInfo);
        }
    }
    // Algortimos de busqueda(USUARIO):

    /**
     * Se realiza la búsqueda de un Usuario de acuerdo a su nombre.
     *
     * @param name Nombre del usuario a buscar.
     */
    public static void busquedaUsuario(String name) {
        ArbolT arbolito = new ArbolT(datos);
        arbolito.insertarNodos();
        NodoT usuario = arbolito.buscarUsuario(name);
        if (usuario != null) {
            // Información del usuario.
            Usuario usr = (Usuario) usuario.getInfo();
            idUsuarioG = usr.getId();
            imprimirUsuario(usr);
            // Mostar todos los post del usuario.

            ListaEnlazada<NodoT> post = usuario.getHijos().getPtr();
            tamHijos = usuario.getHijos().getSize();
            NodoT pstt = (NodoT) post.getDato();
            Post p = (Post) pstt.getInfo();
            tamNietos = p.getComments().getSize();
            listaPost.setVisible(false);
            modelo3 = (DefaultListModel) listaPosts.getModel();
            modelo3.clear();
            idPosts = new ListaEnlazada<>();
            arbolCreado = true;
            while (post != null) {
                Post pst = (Post) post.getDato().getInfo();
                String texto = String.format("<html>PostID: %s <br/>ID Creador: %s <br/>Título: %s <br/>Cuerpo: %s <br/> </html>", pst.getId(), pst.getUserId(), pst.getTitle(), pst.getBody());
                modelo3.addElement(texto);
                idPosts.setPtr(idPosts.add(idPosts.getPtr(), pst.getId()));
                post = post.getLink();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario con referencia " + name + " no ha sido encontrado.", "¡ERROR!", 1);
        }
    }

    /**
     * Se realiza la búsqueda de un Usuario de acuerdo a su id.
     *
     * @param id Id del Usuario a buscar.
     */
    public static void busquedaUsuario(int id) {
        ArbolT arbolito = new ArbolT(datos);
        arbolito.insertarNodos();
        NodoT usuario = arbolito.buscarUsuario(id);
        if (usuario != null) {
            // Información del usuario.
            Usuario usr = (Usuario) usuario.getInfo();
            idUsuarioG = usr.getId();
            imprimirUsuario(usr);
            // Mostar todos los post del usuario.
            ListaEnlazada<NodoT> post = usuario.getHijos().getPtr();
            tamHijos = usuario.getHijos().getSize();
            NodoT pstt = (NodoT) post.getDato();
            Post p = (Post) pstt.getInfo();
            tamNietos = p.getComments().getSize();
            arbolCreado = true;
            listaPost.setVisible(false);
            modelo2 = (DefaultListModel) listaPosts.getModel();
            modelo2.clear();
            idPosts = new ListaEnlazada<>();
            while (post != null) {
                Post pst = (Post) post.getDato().getInfo();
                String texto = String.format("<html>PostID: %s <br/>ID Creador: %s <br/>Título: %s <br/>Cuerpo: %s <br/> </html>", pst.getId(), pst.getUserId(), pst.getTitle(), pst.getBody());
                modelo2.addElement(texto);
                idPosts.setPtr(idPosts.add(idPosts.getPtr(), pst.getId()));
                post = post.getLink();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario con id " + id + " no encontrado.", "¡ERROR!", 1);
        }
    }

    // Algortimos de busqueda(POSTS):
    /**
     * Se realiza la búsqueda de todos los Post que coincidan con la palabra
     * ingresada.
     *
     * @param info Información del Post a buscar.
     */
    public static void busquedaPost(String info) {
        ArbolT arbolito = new ArbolT(datos);
        arbolito.insertarNodos();
        // Se obtiene el nodo que contiene el post buscado.
        ListaEnlazada<NodoT> usuarios = arbolito.getRaiz().getHijos().getPtr();
        while (usuarios != null) {
            arbolito.buscarPost(usuarios.getDato(), info);
            usuarios = usuarios.getLink();
        }
        busqueda = arbolito.getPost_busqueda();
        // Se obtiene la lista enlazada con los Post que coincidieron con la búsqueda.
        resultadosBusqPost = arbolito.getPost_busqueda().getPtr();
        areaUsuario.setVisible(false);
        listaPost.setVisible(true);
        listaPost.setEnabled(true);
        DefaultListModel model = (DefaultListModel) listaPost.getModel();
        model.clear();
        // Se verifica que no esté vacía.
        if (!arbolito.getPost_busqueda().isEmpty()) {
            while (resultadosBusqPost != null) {
                Post pst = (Post) resultadosBusqPost.getDato().getInfo();
                String texto = String.format("<html>PostID: %s <br/>Título: %s <br/> </html>", pst.getId(), pst.getTitle());
                model.addElement(texto);
                resultadosBusqPost = resultadosBusqPost.getLink();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún post con el criterio de búsqueda.", "¡ERROR!", 1);
        }
    }

    /**
     * Se muestran los comentarios de un Post seleccionado.
     *
     */
    public static void mostrarComentariosPost() {
        int index = listaPost.getSelectedIndex();
        if (index != -1) {
            Post pst = (Post) busqueda.get(index).getInfo();
            idPostArbol = pst.getId();
            tamNietos = pst.getComments().getSize();
            imprimirPost(pst);
            // Se imprimen los comentarios del post dado.   
            listaComments.setVisible(true);
            listaComments.setEnabled(true);
            DefaultListModel model = (DefaultListModel) listaComments.getModel();
            model.clear();
            idComments = new ListaEnlazada<>();
            arbolCreado = true;
            ListaEnlazada<NodoT> comments = busqueda.get(index).getHijos().getPtr();
            while (comments != null) {
                Comment comment = (Comment) comments.getDato().getInfo();
                String texto = String.format("<html>CommentID: %s <br/>Nombre: %s <br/>Email: %s <br/>Cuerpo: %s<br/></html>", comment.getId(), comment.getName(), comment.getEmail(), comment.getBody());
                model.addElement(texto);
                idComments.setPtr(idComments.add(idComments.getPtr(), comment.getId()));
                comments = comments.getLink();
            }
        }
    }

    /**
     * Se realiza la búsqueda de un Post de acuerdo con su id.
     *
     * @param id Id del Post a buscar.
     */
    public static void busquedaPost(int id) {
        ArbolT arbolito = new ArbolT(datos);
        arbolito.insertarNodos();
        // Se obtiene el nodo que contiene el post buscado.
        NodoT usrPost = null;
        // Se obtienen los usuarios.
        ListaEnlazada<NodoT> usuarios = arbolito.getRaiz().getHijos().getPtr();
        // Se verifica en cada usuario que el Post coincida con el ID dado.
        while (usrPost == null && usuarios != null) {
            usrPost = arbolito.buscarPost(usuarios.getDato(), id);
            usuarios = usuarios.getLink();
        }
        // Verifica si se encontró el ID.
        if (usrPost != null) {
            JOptionPane.showMessageDialog(null, "El Post fue encontrado.", "¡ÉXITO!", 1);
            Post pst = (Post) usrPost.getInfo();
            idPostArbol = pst.getId();
            tamNietos = pst.getComments().getSize();
            imprimirPost(pst);
            // Se imprimen los comentarios del post dado.  
            DefaultListModel mo5 = (DefaultListModel) listaComments.getModel();
            mo5.clear();
            listaPost.setVisible(false);
            listaPost.setEnabled(false);
            listaComments.setVisible(true);
            listaComments.setEnabled(true);
            idComments = new ListaEnlazada<>();
            arbolCreado = true;
            ListaEnlazada<NodoT> comments = usrPost.getHijos().getPtr();
            while (comments != null) {
                Comment comment = (Comment) comments.getDato().getInfo();
                String texto = String.format("<html>CommentID: %s <br/>Nombre: %s <br/>Email: %s <br/>Cuerpo: %s<br/></html>", comment.getId(), comment.getName(), comment.getEmail(), comment.getBody());
                mo5.addElement(texto);
                idComments.setPtr(idComments.add(idComments.getPtr(), comment.getId()));
                comments = comments.getLink();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún post con el criterio de búsqueda.", "¡ERROR!", 1);
        }
    }

    /**
     * Método que se encarga de imprimir la informacon de un usuario.
     *
     * @param usr Usuario
     */
    public static void imprimirUsuario(Usuario usr) {
        String texto = String.format("<html>Nombre: %s <br/>ID Usuario: %s </hmtl>", usr.getNombre(), usr.getId());
        areaUsuario.setText(texto);
        nombrePanelU.setText(usr.getNombre());
        String ide = Integer.toString(usr.getId());
        idPanelU.setText(ide);
        usrPanelU.setText(usr.getUserName());
        correoPanelU.setText(usr.getEmail());
    }

    /**
     * Se imprime la información de un post.
     *
     * @param post Post a imprimir.
     */
    public static void imprimirPost(Post post) {
        String posUsrIde = Integer.toString(post.getUserId());
        String posIde = Integer.toString(post.getId());
        idCPanelP.setText(posUsrIde);
        idPPanelP.setText(posIde);

        areaTitulo.setText("<html>" + post.getTitle() + "<html>");
        areaCuerpo.setText("<html>" + post.getBody() + "<html>");
    }

    /**
     * El boton cerra hace llamado a un metodo de salida el cual hace que el
     * programa deje de ejecutarse.
     *
     * @param evt
     */
    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked
    /**
     * El boton cerra hace llamado a un metodo de salida el cual hace que el
     * programa deje de ejecutarse.
     *
     * @param evt
     */
    private void Cerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Cerrar3MouseClicked
    /**
     * El boton cerra hace llamado a un metodo de salida el cual hace que el
     * programa deje de ejecutarse.
     *
     * @param evt
     */
    private void Cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Cerrar2MouseClicked
    /**
     * El boton cerra hace llamado a un metodo de salida el cual hace que el
     * programa deje de ejecutarse.
     *
     * @param evt
     */
    private void Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Cerrar1MouseClicked
    /**
     * El siguiente boton realiza una transicion entre el panel1 y el panel2,
     * además de hacer llamado a un metodo que se encarga de buscar por
     * conicidencia con respecto a un usuario.
     *
     * @param evt
     */
    private void usuarioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioButtonMouseClicked
        panelSeparadorDeBusquedas.setVisible(false);
        Panel2.setVisible(true);
        PanelUsuario.setVisible(true);
        PanelPost.setVisible(false);
        paneli = true;
        areaUsuario.setVisible(true);
        listaPosts.setVisible(true);
        arbolCreado = false;
        buscarU();
    }//GEN-LAST:event_usuarioButtonMouseClicked
    /**
     * El siguiente boton realiza una transicion entre el panel1 y el panel2,
     * además de hacer llamado a un metodo que se encarga de buscar por
     * conicidencia con respecto a un post.
     *
     * @param evt
     */
    private void postButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseClicked
        panelSeparadorDeBusquedas.setVisible(false);
        Panel2.setVisible(true);
        PanelPost.setVisible(true);
        PanelUsuario.setVisible(false);
        paneli = false;
        areaUsuario.setVisible(false);
        listaPost.setVisible(true);
        arbolCreado = false;
        buscarP();
    }//GEN-LAST:event_postButtonMouseClicked
    /**
     * Se hace llamado al boton atras, reepresentado por jlabel; este permite
     * volver a un panel anterior, en este caso hace una transición del panel2
     * al panel1.
     *
     * @param evt
     */
    private void atras2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras2MouseClicked
        Panel2.setVisible(false);
        panelSeparadorDeBusquedas.setVisible(true);
        areaUsuario.setText("");

        nombrePanelU.setText("");
        idPanelU.setText("");
        usrPanelU.setText("");
        correoPanelU.setText("");

        nombrePanelU.setText("");
        idPanelU.setText("");
        usrPanelU.setText("");
        correoPanelU.setText("");
    }//GEN-LAST:event_atras2MouseClicked
    /**
     * Se llama al boton "verMas" el cual está representado por un jlabel y
     * permite una transición entre el panel 2 y panel3 con el objetivo de tener
     * mayor informacion a disposioción.
     *
     * @param evt
     */
    private void verMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMasMouseClicked
        Panel2.setVisible(false);
        Panel3.setVisible(true);
        if (paneli) {
            PanelUsuario.setVisible(true);
            PanelPost.setVisible(false);
        } else {
            PanelUsuario.setVisible(false);
            PanelPost.setVisible(true);
        }
    }//GEN-LAST:event_verMasMouseClicked
    /**
     * Se llama al boton que efectua las transiciones entre el panel3 y el
     * panel2.
     *
     * @param evt
     */
    private void atras3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras3MouseClicked
        Panel3.setVisible(false);
        idCPanelP.setText("");
        idPPanelP.setText("");
        areaCuerpo.setText("");
        areaTitulo.setText("");
        PanelUsuario.setVisible(false);
        Panel2.setVisible(true);
    }//GEN-LAST:event_atras3MouseClicked

    private void idPPanelPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPPanelPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPPanelPActionPerformed
    /**
     * Se llama al metodo para mostar los comentarios del post seleccionado.
     *
     * @param evt
     */
    private void listaPostValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostValueChanged
        mostrarComentariosPost();
    }//GEN-LAST:event_listaPostValueChanged
    /**
     * Se llama al metodo pintar mediante un boton en el panel2.
     *
     * @param evt
     */
    private void mostrarArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarArbolMouseClicked
        Pintar(separacionHorizontal, separacionVertical, radio, tamHijos, tamNietos);
    }//GEN-LAST:event_mostrarArbolMouseClicked

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
    private javax.swing.JLabel Cerrar1;
    private javax.swing.JLabel Cerrar2;
    private javax.swing.JLabel Cerrar3;
    private javax.swing.JLabel FondoSecundario;
    private javax.swing.JLabel FondoTerciario;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel PanelP;
    private javax.swing.JPanel PanelPost;
    private javax.swing.JPanel PanelU;
    private javax.swing.JPanel PanelUsuario;
    private static javax.swing.JLabel areaCuerpo;
    private static javax.swing.JLabel areaTitulo;
    private static javax.swing.JLabel areaUsuario;
    private javax.swing.JLabel atras2;
    private javax.swing.JLabel atras3;
    private javax.swing.JLabel avisoArbol;
    private javax.swing.JLabel cmm;
    private static javax.swing.JLabel correoPanelU;
    private javax.swing.JLabel fondoPrimario;
    private javax.swing.JLabel fondoPrimario1;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono1;
    private static javax.swing.JTextField idCPanelP;
    private static javax.swing.JTextField idPPanelP;
    private static javax.swing.JLabel idPanelU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane lista;
    private javax.swing.JScrollPane listaCM;
    private static javax.swing.JList<String> listaComments;
    private static javax.swing.JList<String> listaPost;
    private static javax.swing.JList<String> listaPosts;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel mostrarArbol;
    private static javax.swing.JLabel nombrePanelU;
    private javax.swing.JPanel panel3principal;
    private javax.swing.JPanel panelArbol;
    private javax.swing.JTabbedPane panelSeparadorDeBusquedas;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JLabel post;
    private javax.swing.JLabel postButton;
    private javax.swing.JTextField postTextField;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private javax.swing.JLabel sugerencias;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel tree;
    private javax.swing.JLabel user;
    private static javax.swing.JLabel usrPanelU;
    private javax.swing.JLabel usuarioButton;
    private javax.swing.JTextField usuarioTextField;
    private javax.swing.JLabel verMas;
    // End of variables declaration//GEN-END:variables

}
