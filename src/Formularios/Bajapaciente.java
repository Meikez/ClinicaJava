
package Formularios;

import Conexion.Metodos_Sql;

/**
 *
 * @author Meikez
 */
public class Bajapaciente extends javax.swing.JPanel {


    public Bajapaciente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtObrasocial = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txt_Baja_Dni = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBaja = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setMinimumSize(new java.awt.Dimension(490, 500));
        Bg.setPreferredSize(new java.awt.Dimension(490, 500));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Sexo");
        Bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 204));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Obra Social");
        Bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 204));
        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Nombre");
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 204));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Apellido");
        Bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 153, 204));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Dni");
        Bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        txtObrasocial.setBackground(new java.awt.Color(255, 255, 255));
        txtObrasocial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtObrasocial.setForeground(new java.awt.Color(0, 0, 0));
        txtObrasocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtObrasocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 200, -1));

        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(0, 0, 0));
        txtSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 200, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, -1));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 20));

        txt_Baja_Dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_Baja_Dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Baja_Dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_Baja_Dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txt_Baja_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 20));

        jLabel12.setBackground(new java.awt.Color(185, 49, 64));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(185, 49, 64));
        jLabel12.setText("Buscar paciente a dar de baja:");
        Bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 153, 204));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Dni");
        Bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 350, 20));

        btnBaja.setBackground(new java.awt.Color(0, 153, 204));
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBajaMousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BAJAR");

        javax.swing.GroupLayout btnBajaLayout = new javax.swing.GroupLayout(btnBaja);
        btnBaja.setLayout(btnBajaLayout);
        btnBajaLayout.setHorizontalGroup(
            btnBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        btnBajaLayout.setVerticalGroup(
            btnBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Bg.add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 180, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Metodos_Sql objmet = new Metodos_Sql();
            
            String bDni = txt_Baja_Dni.getText();
            
            int encontrado = objmet.asignarDatos(bDni);
            if (encontrado==0){
                txtDni.setText("");
                txtApellido.setText("");
                txtNombre.setText("");
                txtObrasocial.setText("");

                txtSexo.setText("'");
            }else{

                txtDni.setText(String.valueOf(objmet.getDni()));
                txtApellido.setText(objmet.getApe());
                txtSexo.setText(objmet.getNom());
                txtObrasocial.setText(objmet.getOs());
                txtSexo.setText(objmet.getSexo());
                
                btnBaja.setEnabled(true);
 
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMousePressed
        String bDni = txt_Baja_Dni.getText();
        Metodos_Sql objmet = new Metodos_Sql();
        objmet.Baja(bDni);
    }//GEN-LAST:event_btnBajaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel btnBaja;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObrasocial;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txt_Baja_Dni;
    // End of variables declaration//GEN-END:variables
}
