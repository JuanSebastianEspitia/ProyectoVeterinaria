/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoVeterinaria.vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class VistaEmpleados extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaEmpleados.class.getName());

    
    public VistaEmpleados() {
        initComponents();
        jMenuBar1.setBackground(new java.awt.Color(50, 50, 50)); 
        jMenuBar1.setOpaque(true);
    }

    public String getTxtCorreoRecepcionista() {
        return txtCorreoRecepcionista.getText();
    }

    public String getTxtCorreoVeterinario() {
        return txtCorreoVeterinario.getText();
    }

    public String getTxtDocumentoRecepcionista() {
        return txtDocumentoRecepcionista.getText();
    }

    public String getTxtDocumentoVeterinario() {
        return txtDocumentoVeterinario.getText();
    }

    public String getTxtNombreRecepcionista() {
        return txtNombreRecepcionista.getText();
    }

    public String getTxtNombreVeterinario() {
        return txtNombreVeterinario.getText();
    }

    public String getTxtSalario() {
        return txtSueldoRecepcionista.getText();
    }

    public String getTxtSalarioVeterinario() {
        return txtSalarioVeterinario.getText();
    }

    public String getTxtTarjetaProfesionalVeterinario() {
        return txtTarjetaProfesionalVeterinario.getText();
    }

    public String getTxtTelefonoRecepcionista() {
        return txtTelefonoRecepcionista.getText();
    }

    public String getTxtTelefonoVeterinario() {
        return txtTelefonoVeterinario.getText();
    }

    public void addAgregarActionListenerRegistrarRecepcionista(ActionListener listener){
        this.btnRegistrarRecepcionista.addActionListener(listener);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreoRecepcionista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreRecepcionista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSueldoRecepcionista = new javax.swing.JTextField();
        txtDocumentoRecepcionista = new javax.swing.JTextField();
        txtTelefonoRecepcionista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDocumentoVeterinario = new javax.swing.JTextField();
        txtCorreoVeterinario = new javax.swing.JTextField();
        txtTelefonoVeterinario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSalarioVeterinario = new javax.swing.JTextField();
        txtNombreVeterinario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTarjetaProfesionalVeterinario = new javax.swing.JTextField();
        btnRegistrarRecepcionista = new javax.swing.JButton();
        btnRegistrarVeterinario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setText("Documento");

        jLabel4.setText("Correo");

        jLabel5.setText("Telefono");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RECEPCIONISTA");

        jLabel1.setText("Nombre");

        jLabel6.setText("Salario");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("VETERINARIO");

        jLabel8.setText("Documento");

        jLabel9.setText("Correo");

        jLabel10.setText("Telefono");

        jLabel11.setText("Salario");

        jLabel12.setText("Nombre");

        jLabel13.setText("Tarjeta Profesional");

        btnRegistrarRecepcionista.setText("REGISTRAR");
        btnRegistrarRecepcionista.addActionListener(this::btnRegistrarRecepcionistaActionPerformed);

        btnRegistrarVeterinario.setText("REGISTRAR");
        btnRegistrarVeterinario.addActionListener(this::btnRegistrarVeterinarioActionPerformed);

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Consulta/Veterinario");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Medicamentos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historiales Medicos");
        jMenuBar1.add(jMenu3);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Mascota y Dueño");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreVeterinario)
                            .addComponent(txtCorreoVeterinario)
                            .addComponent(txtSalarioVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreRecepcionista)
                                    .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarRecepcionista)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefonoRecepcionista)
                                    .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarVeterinario)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarRecepcionista)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalarioVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarVeterinario)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRecepcionistaActionPerformed

    private void btnRegistrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarVeterinarioActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaEmpleados().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarRecepcionista;
    private javax.swing.JButton btnRegistrarVeterinario;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtCorreoRecepcionista;
    private javax.swing.JTextField txtCorreoVeterinario;
    private javax.swing.JTextField txtDocumentoRecepcionista;
    private javax.swing.JTextField txtDocumentoVeterinario;
    private javax.swing.JTextField txtNombreRecepcionista;
    private javax.swing.JTextField txtNombreVeterinario;
    private javax.swing.JTextField txtSalarioVeterinario;
    private javax.swing.JTextField txtSueldoRecepcionista;
    private javax.swing.JTextField txtTarjetaProfesionalVeterinario;
    private javax.swing.JTextField txtTelefonoRecepcionista;
    private javax.swing.JTextField txtTelefonoVeterinario;
    // End of variables declaration//GEN-END:variables
}
