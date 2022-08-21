/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Conexion.Metodos_Sql;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Meikez
 */
public class Altapaciente extends javax.swing.JPanel {

    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
    int Dni;
    String Apellidos;
    String Nombres;
    String ObraSocial;
    String Sexo;
    Date FechaNacimiento;
    String Direccion;
    String Localidad;
    String Email;
    int Telefono;
    String Estado;
    
    
    public Altapaciente() {
        initComponents();
    }
    public void validacionCaracteres(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 255) {

            evento.consume();
            JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales");

        }

    }
    public void validacionMail(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 45
                || evento.getKeyChar() == 47 && evento.getKeyChar() == 96
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 63
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 94
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 255) {

            evento.consume();
            JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales");

        }
        
    }
    public void validacionNumeros(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 255) {

            evento.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros");

        }
       

    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmailAlta = new javax.swing.JTextField();
        txtLocalidadAlta = new javax.swing.JTextField();
        txtDireccionAlta = new javax.swing.JTextField();
        txtObraSocialAlta = new javax.swing.JTextField();
        txtNombreAlta = new javax.swing.JTextField();
        txtApellidoAlta = new javax.swing.JTextField();
        txtDniAlta = new javax.swing.JTextField();
        cbEstadoAlta = new javax.swing.JComboBox<>();
        cbSexoAlta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardarAlta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dcNacimientoAlta = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(740, 525));

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setMinimumSize(new java.awt.Dimension(490, 500));
        Bg.setPreferredSize(new java.awt.Dimension(710, 515));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Estado");
        Bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Telefono");
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 204));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Email");
        Bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 204));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Localidad");
        Bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 204));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Dirección");
        Bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Sexo");
        Bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Fecha de nacimiento");
        Bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 204));
        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Nombre");
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 204));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Apellido");
        Bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 153, 204));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(185, 49, 64));
        jLabel11.setText("ALTA PACIENTE");
        Bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        Bg.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, -1));

        txtEmailAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEmailAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmailAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailAltaKeyTyped(evt);
            }
        });
        Bg.add(txtEmailAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 200, -1));

        txtLocalidadAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtLocalidadAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLocalidadAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtLocalidadAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLocalidadAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocalidadAltaKeyTyped(evt);
            }
        });
        Bg.add(txtLocalidadAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 200, -1));

        txtDireccionAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDireccionAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccionAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccionAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionAltaKeyTyped(evt);
            }
        });
        Bg.add(txtDireccionAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 200, -1));

        txtObraSocialAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtObraSocialAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtObraSocialAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtObraSocialAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtObraSocialAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObraSocialAltaKeyTyped(evt);
            }
        });
        Bg.add(txtObraSocialAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, -1));

        txtNombreAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAltaKeyTyped(evt);
            }
        });
        Bg.add(txtNombreAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        txtApellidoAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellidoAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellidoAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoAltaKeyTyped(evt);
            }
        });
        Bg.add(txtApellidoAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        txtDniAlta.setBackground(new java.awt.Color(255, 255, 255));
        txtDniAlta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDniAlta.setForeground(new java.awt.Color(0, 0, 0));
        txtDniAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDniAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniAltaKeyTyped(evt);
            }
        });
        Bg.add(txtDniAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 20));

        cbEstadoAlta.setBackground(new java.awt.Color(255, 255, 255));
        cbEstadoAlta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbEstadoAlta.setForeground(new java.awt.Color(0, 0, 0));
        cbEstadoAlta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ACTIVO", "INACTIVO" }));
        Bg.add(cbEstadoAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 200, 20));

        cbSexoAlta.setBackground(new java.awt.Color(255, 255, 255));
        cbSexoAlta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbSexoAlta.setForeground(new java.awt.Color(0, 0, 0));
        cbSexoAlta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "MASCULINO", "FEMENINO" }));
        Bg.add(cbSexoAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 20));

        jLabel12.setBackground(new java.awt.Color(0, 153, 204));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Dni");
        Bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 690, 10));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 10));

        btnGuardarAlta.setBackground(new java.awt.Color(0, 153, 204));
        btnGuardarAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarAltaMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 153, 204));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GUARDAR");

        javax.swing.GroupLayout btnGuardarAltaLayout = new javax.swing.GroupLayout(btnGuardarAlta);
        btnGuardarAlta.setLayout(btnGuardarAltaLayout);
        btnGuardarAltaLayout.setHorizontalGroup(
            btnGuardarAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        btnGuardarAltaLayout.setVerticalGroup(
            btnGuardarAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Bg.add(btnGuardarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 180, 30));

        jLabel13.setBackground(new java.awt.Color(0, 153, 204));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Obra Social");
        Bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        dcNacimientoAlta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Bg.add(dcNacimientoAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAltaMousePressed
                if (this.txtApellidoAlta.getText().isEmpty() || this.txtNombreAlta.getText().isEmpty() || cbSexoAlta.getSelectedIndex() == 0 ||this.txtDniAlta.getText().isEmpty() || this.txtObraSocialAlta.getText().isEmpty() ||this.txtTelefono.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No se cargo los datos necesarios");
        }else {
        
        Dni = Integer.parseInt(txtDniAlta.getText());
        Apellidos = txtApellidoAlta.getText().toUpperCase();
        Nombres = txtNombreAlta.getText().toUpperCase();
        ObraSocial = txtObraSocialAlta.getText().toUpperCase();
        Sexo = cbSexoAlta.getSelectedItem().toString();
        //Sexo = 'm';
        //FechaNacimiento = (Date)dcNacimientoAlta.getDate();
        Direccion = txtDireccionAlta.getText().toUpperCase();
        Localidad = txtLocalidadAlta.getText().toUpperCase();
        Email = txtEmailAlta.getText().toUpperCase();
        Telefono = Integer.parseInt(txtTelefono.getText());
        Estado = cbEstadoAlta.getSelectedItem().toString();
        
        
        String fechatexto = formatofecha.format(dcNacimientoAlta.getDate());
        
        String AltaSql = "INSERT  INTO pacientes(dni, apellidos, nombres, obrasocial, sexo, fechanacimiento, direccion, localidad, email, telefono, estado) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        Metodos_Sql objmet = new Metodos_Sql(Nombres,Apellidos,Dni,Email,Telefono,Localidad,Direccion,fechatexto,Sexo,ObraSocial,Estado);
        objmet.altaPacientes(AltaSql);
        
        }
    }//GEN-LAST:event_btnGuardarAltaMousePressed

    private void txtDniAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAltaKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_txtDniAltaKeyTyped

    private void txtApellidoAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoAltaKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_txtApellidoAltaKeyTyped

    private void txtNombreAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAltaKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_txtNombreAltaKeyTyped

    private void txtObraSocialAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObraSocialAltaKeyTyped
        
    }//GEN-LAST:event_txtObraSocialAltaKeyTyped

    private void txtDireccionAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionAltaKeyTyped
        
    }//GEN-LAST:event_txtDireccionAltaKeyTyped

    private void txtLocalidadAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocalidadAltaKeyTyped
       
    }//GEN-LAST:event_txtLocalidadAltaKeyTyped

    private void txtEmailAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAltaKeyTyped
        validacionMail(evt);
    }//GEN-LAST:event_txtEmailAltaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
      validacionNumeros(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel btnGuardarAlta;
    private javax.swing.JComboBox<String> cbEstadoAlta;
    private javax.swing.JComboBox<String> cbSexoAlta;
    private com.toedter.calendar.JDateChooser dcNacimientoAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellidoAlta;
    private javax.swing.JTextField txtDireccionAlta;
    private javax.swing.JTextField txtDniAlta;
    private javax.swing.JTextField txtEmailAlta;
    private javax.swing.JTextField txtLocalidadAlta;
    private javax.swing.JTextField txtNombreAlta;
    private javax.swing.JTextField txtObraSocialAlta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
