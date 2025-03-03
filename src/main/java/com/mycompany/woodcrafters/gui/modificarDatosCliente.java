/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.woodcrafters.gui;

import com.mycompany.woodcrafters.logica.Clientes;
import com.mycompany.woodcrafters.logica.controladora;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicol
 */
public class modificarDatosCliente extends javax.swing.JFrame {

    controladora control = null;
    int id;
    Clientes cliente;
    
    public modificarDatosCliente(int id) {
        initComponents();
        control = new controladora();
       
        cargarDatos(id);
        
    }

   private void limpiarCampos(javax.swing.JPanel panel) {
    Component[] componentes = panel.getComponents();
    for (Component componente : componentes) {
        if (componente instanceof javax.swing.JTextField) {
            ((javax.swing.JTextField) componente).setText("");
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setBackground(new java.awt.Color(102, 102, 102));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("Documento");

        txtDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDocumento.setForeground(new java.awt.Color(102, 102, 102));
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentojTextField6ActionPerformed(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresjTextField1ActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(102, 102, 102));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosjTextField7ActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(102, 102, 102));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setText("Telefono");

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonojTextField2ActionPerformed(evt);
            }
        });

        jLabel45.setBackground(new java.awt.Color(102, 102, 102));
        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionjTextField10ActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuardarTodo.png"))); // NOI18N
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarjButton17ActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar (1).png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificación de Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        jLabel46.setBackground(new java.awt.Color(102, 102, 102));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setText("Correo");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreojTextField2ActionPerformed(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(102, 102, 102));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("Contrasena");

        txtContrasena.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel47)
                                            .addComponent(jLabel46))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCorreo)
                                            .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel45))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTelefono)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(347, 347, 347)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentojTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentojTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentojTextField6ActionPerformed

    private void txtNombresjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresjTextField1ActionPerformed

    private void txtApellidosjTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosjTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosjTextField7ActionPerformed

    private void txtTelefonojTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonojTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonojTextField2ActionPerformed

    private void txtDireccionjTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionjTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionjTextField10ActionPerformed

    private void btnGuardarjButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarjButton17ActionPerformed
        String nombre = txtNombres.getText();
        String apellido = txtApellidos.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String contrasena = new String(txtContrasena.getPassword());
        int documento = 0;
        int telefono = 0;

        try {
            documento = Integer.parseInt(txtDocumento.getText());
            telefono = Integer.parseInt(txtTelefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en los campos de documento y teléfono.");
        }

        control.modificarCliente(cliente, nombre, apellido, direccion, correo, contrasena, documento, telefono);
        
        mostrarMensaje("Edicion realizada correctamente", "Info", "Edición Correcta");
        
        verDatosCliente pantalla = new verDatosCliente();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnGuardarjButton17ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos(jPanel1);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCorreojTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreojTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreojTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int id) {
        this.cliente = control.traerCliente(id);
        
        txtDocumento.setText(String.valueOf(cliente.getDocumento()));
        txtNombres.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellido());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(String.valueOf(cliente.getTelefono())); 
        txtCorreo.setText(cliente.getUnUsuario().getCorreo());
        txtContrasena.setText(cliente.getUnUsuario().getContrasena());
        
        
        
    }
    
     public void mostrarMensaje (String mensaje, String tipo, String titulo){
                JOptionPane optionPane = new JOptionPane(mensaje);
                if(tipo.equals("Info")){
                    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);  
                }
                else if(tipo.equals("Error")){
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
        
    }

   
}
