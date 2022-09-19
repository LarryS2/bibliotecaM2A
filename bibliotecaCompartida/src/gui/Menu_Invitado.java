/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author santi
 */
public class Menu_Invitado extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Invitado
     */
    public Menu_Invitado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backround = new javax.swing.JPanel();
        panelsuperior = new javax.swing.JPanel();
        labellibro = new javax.swing.JLabel();
        panemenu = new javax.swing.JPanel();
        btnperfil = new javax.swing.JPanel();
        btnlabelperfil = new javax.swing.JLabel();
        btnlibros = new javax.swing.JPanel();
        btnlabellibros = new javax.swing.JLabel();
        btnpedidos = new javax.swing.JPanel();
        btnlabelpedidos = new javax.swing.JLabel();
        btnvermultas = new javax.swing.JPanel();
        btnlabelmultas = new javax.swing.JLabel();
        btnlogout = new javax.swing.JPanel();
        btnlabelsalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backround.setBackground(new java.awt.Color(255, 255, 255));

        panelsuperior.setBackground(new java.awt.Color(0, 153, 153));

        labellibro.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        labellibro.setForeground(new java.awt.Color(255, 255, 255));
        labellibro.setText("BIENVENIDO INVITADO ");

        javax.swing.GroupLayout panelsuperiorLayout = new javax.swing.GroupLayout(panelsuperior);
        panelsuperior.setLayout(panelsuperiorLayout);
        panelsuperiorLayout.setHorizontalGroup(
            panelsuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labellibro)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        panelsuperiorLayout.setVerticalGroup(
            panelsuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperiorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labellibro)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panemenu.setBackground(new java.awt.Color(204, 204, 204));
        panemenu.setForeground(new java.awt.Color(153, 153, 153));

        btnperfil.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelperfil.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelperfil.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelperfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelperfil.setText("MI PERFIL");
        btnlabelperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelperfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnperfilLayout = new javax.swing.GroupLayout(btnperfil);
        btnperfil.setLayout(btnperfilLayout);
        btnperfilLayout.setHorizontalGroup(
            btnperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnperfilLayout.setVerticalGroup(
            btnperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelperfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnlibros.setBackground(new java.awt.Color(0, 153, 153));

        btnlabellibros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabellibros.setForeground(new java.awt.Color(255, 255, 255));
        btnlabellibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabellibros.setText("VER LIBROS");
        btnlabellibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabellibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabellibrosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnlibrosLayout = new javax.swing.GroupLayout(btnlibros);
        btnlibros.setLayout(btnlibrosLayout);
        btnlibrosLayout.setHorizontalGroup(
            btnlibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellibros, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnlibrosLayout.setVerticalGroup(
            btnlibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnpedidos.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelpedidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelpedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelpedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelpedidos.setText("PEDIDOS");
        btnlabelpedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelpedidosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnpedidosLayout = new javax.swing.GroupLayout(btnpedidos);
        btnpedidos.setLayout(btnpedidosLayout);
        btnpedidosLayout.setHorizontalGroup(
            btnpedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnpedidosLayout.setVerticalGroup(
            btnpedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelpedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnvermultas.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelmultas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelmultas.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelmultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelmultas.setText("VER MULTAS");
        btnlabelmultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelmultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelmultasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnvermultasLayout = new javax.swing.GroupLayout(btnvermultas);
        btnvermultas.setLayout(btnvermultasLayout);
        btnvermultasLayout.setHorizontalGroup(
            btnvermultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelmultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        btnvermultasLayout.setVerticalGroup(
            btnvermultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelmultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnlogout.setBackground(new java.awt.Color(0, 102, 102));

        btnlabelsalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelsalir.setText("LOG OUT");
        btnlabelsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelsalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnlogoutLayout = new javax.swing.GroupLayout(btnlogout);
        btnlogout.setLayout(btnlogoutLayout);
        btnlogoutLayout.setHorizontalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        btnlogoutLayout.setVerticalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panemenuLayout = new javax.swing.GroupLayout(panemenu);
        panemenu.setLayout(panemenuLayout);
        panemenuLayout.setHorizontalGroup(
            panemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panemenuLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnvermultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        panemenuLayout.setVerticalGroup(
            panemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panemenuLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvermultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout backroundLayout = new javax.swing.GroupLayout(backround);
        backround.setLayout(backroundLayout);
        backroundLayout.setHorizontalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panemenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backroundLayout.setVerticalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backroundLayout.createSequentialGroup()
                .addComponent(panelsuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlabelperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelperfilMouseClicked
        Mi_Perfil perfil = new Mi_Perfil(null, true);
        perfil.setLocationRelativeTo(null);
        perfil.setVisible(true);
    }//GEN-LAST:event_btnlabelperfilMouseClicked

    private void btnlabellibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabellibrosMouseClicked
        Ventana_Ver_Libros lib = new Ventana_Ver_Libros(null, true);
        lib.setLocationRelativeTo(null);
        lib.setVisible(true);
    }//GEN-LAST:event_btnlabellibrosMouseClicked

    private void btnlabelpedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelpedidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlabelpedidosMouseClicked

    private void btnlabelmultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelmultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlabelmultasMouseClicked

    private void btnlabelsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelsalirMouseClicked
        Login log = new Login();
        this.dispose();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }//GEN-LAST:event_btnlabelsalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backround;
    private javax.swing.JLabel btnlabellibros;
    private javax.swing.JLabel btnlabelmultas;
    private javax.swing.JLabel btnlabelpedidos;
    private javax.swing.JLabel btnlabelperfil;
    private javax.swing.JLabel btnlabelsalir;
    private javax.swing.JPanel btnlibros;
    private javax.swing.JPanel btnlogout;
    private javax.swing.JPanel btnpedidos;
    private javax.swing.JPanel btnperfil;
    private javax.swing.JPanel btnvermultas;
    private javax.swing.JLabel labellibro;
    private javax.swing.JPanel panelsuperior;
    private javax.swing.JPanel panemenu;
    // End of variables declaration//GEN-END:variables
}
