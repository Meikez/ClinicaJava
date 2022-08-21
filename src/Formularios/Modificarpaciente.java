
package Formularios;

import Conexion.Metodos_Sql;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Meikez
 */
public class Modificarpaciente extends javax.swing.JPanel {

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
    public Modificarpaciente() {
        initComponents();
        btnGuardarCambio.setEnabled(false);
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
        System.out.print("soy la letra: " + evento.getKeyChar() + "y tengo el numero ASCII corresponde a: " + evento.getKeyChar() + 0);

    }
    public void validacionNumeros(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 255) {

            evento.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros");

        }
        System.out.print("soy el numero : " + evento.getKeyChar() + "y tengo el numero ASCII corresponde a: " + evento.getKeyChar() + 0);

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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtObraSocial = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbEstado = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txt_Modf_Dni = new javax.swing.JTextField();
        btnGuardarCambio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(740, 525));

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setMinimumSize(new java.awt.Dimension(490, 500));
        Bg.setPreferredSize(new java.awt.Dimension(710, 515));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Estado");
        Bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Telefono");
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 204));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Email");
        Bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 204));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Localidad");
        Bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 204));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Dirección");
        Bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Sexo");
        Bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 204));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Obra Social");
        Bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Fecha de nacimiento");
        Bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 204));
        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Nombre");
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 204));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Apellido");
        Bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 153, 204));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(185, 49, 64));
        jLabel11.setText("MODIFICAR PACIENTE");
        Bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 200, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, -1));

        txtLocalidad.setBackground(new java.awt.Color(255, 255, 255));
        txtLocalidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLocalidad.setForeground(new java.awt.Color(0, 0, 0));
        txtLocalidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 200, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 200, -1));

        txtObraSocial.setBackground(new java.awt.Color(255, 255, 255));
        txtObraSocial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtObraSocial.setForeground(new java.awt.Color(0, 0, 0));
        txtObraSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtObraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 200, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, 20));

        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 120, -1));

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ACTIVO", "INACTIVO" }));
        Bg.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 200, 20));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "MASCULINO", "FEMENINO" }));
        Bg.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 200, 20));

        jLabel12.setBackground(new java.awt.Color(0, 153, 204));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Dni");
        Bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 690, 10));

        jLabel13.setBackground(new java.awt.Color(0, 153, 204));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Buscar por dni");
        Bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt_Modf_Dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_Modf_Dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Modf_Dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_Modf_Dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bg.add(txt_Modf_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 20));

        btnGuardarCambio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardarCambio.setText("GUARDAR");
        btnGuardarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambioActionPerformed(evt);
            }
        });
        Bg.add(btnGuardarCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 150, -1));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 10));
        Bg.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              
            Metodos_Sql objmet = new Metodos_Sql();
            
            String bDni = txt_Modf_Dni.getText();
            
            int encontrado = objmet.asignarDatos(bDni);
            if (encontrado==0){
                txtDni.setText("");
                txtApellido.setText("");
                txtNombre.setText("");
                txtObraSocial.setText("");
                txtDireccion.setText("");
                txtLocalidad.setText("");
                txtEmail.setText("");
                txtTelefono.setText("");
                dcFechaNacimiento.setCalendar(null);
                cbSexo.setSelectedIndex(0);
            }else{
                String mifecha;
                mifecha=objmet.getNacimiento();

                SimpleDateFormat fechajd =new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date mifecha2 = null;
                System.out.print("/n");


                txtDni.setText(String.valueOf(objmet.getDni()));
                txtApellido.setText(objmet.getApe());
                txtNombre.setText(objmet.getNom());
                txtObraSocial.setText(objmet.getOs());
                txtDireccion.setText(objmet.getDire());
                txtLocalidad.setText(objmet.getLoca());
                txtEmail.setText(objmet.getCorreo());
                txtTelefono.setText(String.valueOf(objmet.getTel()));

                cbSexo.setSelectedItem(objmet.getSexo());
                btnGuardarCambio.setEnabled(true);
                try{ 

                    mifecha2 = fechajd.parse(mifecha);
                   // System.out.print(mifecha2);
                    dcFechaNacimiento.setDate(mifecha2);
                }catch(ParseException ex){
                    System.out.print(ex);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambioActionPerformed
        Dni = Integer.parseInt(txtDni.getText());
        Apellidos = txtApellido.getText().toUpperCase();
        Nombres = txtNombre.getText().toUpperCase();
        ObraSocial = txtObraSocial.getText().toUpperCase();
        Sexo = cbSexo.getSelectedItem().toString();
        FechaNacimiento = dcFechaNacimiento.getDate();
        Direccion = txtDireccion.getText().toUpperCase();
        Localidad = txtLocalidad.getText().toUpperCase();
        Email = txtEmail.getText().toUpperCase();
        Telefono = Integer.parseInt(txtTelefono.getText());
        Estado = "ACTIVO";
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechatexto = formatofecha.format(dcFechaNacimiento.getDate());
        
        String bDni = txt_Modf_Dni.getText();
        Metodos_Sql objmet = new Metodos_Sql(Nombres,Apellidos,Dni,Email,Telefono,Localidad,Direccion,fechatexto,Sexo,ObraSocial,Estado);
        objmet.actualizarDatos(bDni);
    }//GEN-LAST:event_btnGuardarCambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton btnGuardarCambio;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObraSocial;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_Modf_Dni;
    // End of variables declaration//GEN-END:variables
}
