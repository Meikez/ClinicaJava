/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author Meikez
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        Principal principal = new Principal();
        
        mostrarVentana(principal);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundmenu = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnAlta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBaja = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica SALVAR");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        backgroundmenu.setBackground(new java.awt.Color(255, 255, 255));
        backgroundmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side.setBackground(new java.awt.Color(185, 49, 64));
        side.setMinimumSize(new java.awt.Dimension(210, 525));
        side.setPreferredSize(new java.awt.Dimension(210, 525));
        side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipal.setBackground(new java.awt.Color(232, 71, 82));
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrincipalMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Principal");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meikez\\Desktop\\Iconos\\home-white.png")); // NOI18N

        javax.swing.GroupLayout btnPrincipalLayout = new javax.swing.GroupLayout(btnPrincipal);
        btnPrincipal.setLayout(btnPrincipalLayout);
        btnPrincipalLayout.setHorizontalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnPrincipalLayout.setVerticalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrincipalLayout.createSequentialGroup()
                .addGroup(btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        side.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 60));

        BtnAlta.setBackground(new java.awt.Color(232, 71, 82));
        BtnAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAltaMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alta paciente");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meikez\\Desktop\\Iconos\\form-white.png")); // NOI18N

        javax.swing.GroupLayout BtnAltaLayout = new javax.swing.GroupLayout(BtnAlta);
        BtnAlta.setLayout(BtnAltaLayout);
        BtnAltaLayout.setHorizontalGroup(
            BtnAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BtnAltaLayout.setVerticalGroup(
            BtnAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAltaLayout.createSequentialGroup()
                .addGroup(BtnAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnAltaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        side.add(BtnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 60));

        btnBaja.setBackground(new java.awt.Color(232, 71, 82));
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBajaMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Baja paciente");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meikez\\Desktop\\Iconos\\delete-white.png")); // NOI18N

        javax.swing.GroupLayout btnBajaLayout = new javax.swing.GroupLayout(btnBaja);
        btnBaja.setLayout(btnBajaLayout);
        btnBajaLayout.setHorizontalGroup(
            btnBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBajaLayout.setVerticalGroup(
            btnBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBajaLayout.createSequentialGroup()
                .addGroup(btnBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btnBajaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap())
        );

        side.add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 60));

        btnBusqueda.setBackground(new java.awt.Color(232, 71, 82));
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBusquedaMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Búsqueda");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meikez\\Desktop\\Iconos\\search-white.png")); // NOI18N

        javax.swing.GroupLayout btnBusquedaLayout = new javax.swing.GroupLayout(btnBusqueda);
        btnBusqueda.setLayout(btnBusquedaLayout);
        btnBusquedaLayout.setHorizontalGroup(
            btnBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnBusquedaLayout.setVerticalGroup(
            btnBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBusquedaLayout.createSequentialGroup()
                .addGroup(btnBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        side.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 60));

        btnModificar.setBackground(new java.awt.Color(232, 71, 82));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        btnModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar");
        btnModificar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 60));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meikez\\Desktop\\Iconos\\edit-white.png")); // NOI18N
        btnModificar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        side.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 60));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("SALVAR");
        side.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        backgroundmenu.add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 530));

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setMinimumSize(new java.awt.Dimension(740, 525));
        Contenido.setLayout(new java.awt.BorderLayout());
        backgroundmenu.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        getContentPane().add(backgroundmenu, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAltaMousePressed
        Altapaciente alta = new Altapaciente();
        
        mostrarVentana(alta);

    }//GEN-LAST:event_BtnAltaMousePressed

    private void btnBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMousePressed
        Bajapaciente baja = new Bajapaciente();
        
        mostrarVentana(baja);
    }//GEN-LAST:event_btnBajaMousePressed

    private void btnBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMousePressed
        Busqueda busqueda = new Busqueda();
        
        mostrarVentana(busqueda);
    }//GEN-LAST:event_btnBusquedaMousePressed

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        Modificarpaciente modificar = new Modificarpaciente();
        
        mostrarVentana(modificar);
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMousePressed
        Principal principal = new Principal();
        
        mostrarVentana(principal);
    }//GEN-LAST:event_btnPrincipalMousePressed
private void mostrarVentana(JPanel panel){

        panel.setSize(490, 500);
        panel.setLocation(0,0);
        
        Contenido.removeAll();
        
        Contenido.add(panel,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
}
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnAlta;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel backgroundmenu;
    private javax.swing.JPanel btnBaja;
    private javax.swing.JPanel btnBusqueda;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JPanel btnPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel side;
    // End of variables declaration//GEN-END:variables
}
