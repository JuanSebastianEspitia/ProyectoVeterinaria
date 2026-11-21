/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoVeterinaria.vista;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;



/**
 *
 * @author ASUS
 */
public class VistaVeterinaria extends javax.swing.JFrame {

    /**
     * Creates new form VistaVeterinaria
     */
    public VistaVeterinaria() {
        initComponents();
    }

    
    //VARIABLES DE LA VISTA DEL PANEL DE USUARIOS
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

    public String getTxtSalarioRecepcionista() {
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

    public String getTxtEspecialidadVeterinario() {
        return txtEspecialidadVeterinario.getText();
    }

    public void setTxtCorreoRecepcionista(String txtCorreoRecepcionista) {
        this.txtCorreoRecepcionista.setText(txtCorreoRecepcionista);
    }

    public void setTxtCorreoVeterinario(String txtCorreoVeterinario) {
        this.txtCorreoVeterinario.setText(txtCorreoVeterinario);
    }

    public void setTxtDocumentoRecepcionista(String txtDocumentoRecepcionista) {
        this.txtDocumentoRecepcionista.setText(txtDocumentoRecepcionista);
    }

    public void setTxtDocumentoVeterinario(String txtDocumentoVeterinario) {
        this.txtDocumentoVeterinario.setText(txtDocumentoVeterinario);
    }

    public void setTxtNombreRecepcionista(String txtNombreRecepcionista) {
        this.txtNombreRecepcionista.setText(txtNombreRecepcionista);
    }

    public void setTxtNombreVeterinario(String txtNombreVeterinario) {
        this.txtNombreVeterinario.setText(txtNombreVeterinario);
    }

    public void setTxtSalarioVeterinario(String txtSalarioVeterinario) {
        this.txtSalarioVeterinario.setText(txtSalarioVeterinario);
    }

    public void setTxtSueldoRecepcionista(String txtSueldoRecepcionista) {
        this.txtSueldoRecepcionista.setText(txtSueldoRecepcionista);
    }

    public void setTxtTarjetaProfesionalVeterinario(String txtTarjetaProfesionalVeterinario) {
        this.txtTarjetaProfesionalVeterinario.setText(txtTarjetaProfesionalVeterinario);
    }

    public void setTxtTelefonoRecepcionista(String txtTelefonoRecepcionista) {
        this.txtTelefonoRecepcionista.setText(txtTelefonoRecepcionista);
    }

    public void setTxtTelefonoVeterinario(String txtTelefonoVeterinario) {
        this.txtTelefonoVeterinario.setText(txtTelefonoVeterinario);
    }
    
    
    public void addAgregarActionListenerRegistrarRecepcionista(ActionListener listener){
        this.btnRegistrarRecepcionista.addActionListener(listener);
    }
    
    public void addAgregarActionListenerRegistrarVeterinario(ActionListener listener){
        this.btnRegistrarVeterinario.addActionListener(listener);
    }
    
    
    //VARIABLES DE LA VISTA DEL PANEL DE DUEÑO Y MASCOTAS

    public JComboBox<String> getCmbRecepcionista() {
        return cmbRecepcionista;
    }

    public String getTxtNombreDueño(){
        return txtNombreDueño.getText();
    }
    public String getTxtDocumentoDueño(){
        return txtDocumentoDueño.getText();
    }
    public String getTxtCorreoDueño(){
        return txtCorreoDueño.getText();
    }
    public String getTxtTelefonoDueño(){
        return txtTelefonoDueño.getText();
    }
    public JComboBox<String> getCmbTipoMascota() {
        return cmbTipoMascota;
    }
    public JComboBox<String> getCmbDueñoMascota() {
        return cmbDueñoMascota;
    }
    public String getTxtNombreMascota(){
        return txtNombreMascota.getText();
    }
    public String getTxtEdadMascota(){
        return txtEdadMascota.getText();
    }
    public String getTxtPesoMascota(){
        return txtPesoMascota.getText();
    }
    public JComboBox<String> getCmbGeneroMascota() {
        return cmbGeneroMascota;
    }
    public String getTxtCitesMascota(){
        return txtCitesMascota.getText();
    }
    public String getTxtRazaMascota(){
        return txtRazaMascota.getText();
    }
    public List<String> getVacunasMascotaSeleccionadas(){
        return lstVacunasMascota.getSelectedValuesList();
    }
    public void setTxtNombreDueño(String txtNombreDueño){
        this.txtNombreDueño.setText(txtNombreDueño);
    }
    public void setTxtDocumentoDueño(String txtDocumentoDueño){
        this.txtDocumentoDueño.setText(txtDocumentoDueño);
    }
    public void setTxtCorreoDueño(String txtCorreoDueño){
        this.txtCorreoDueño.setText(txtCorreoDueño);
    }
    public void setTxtTelefonoDueño(String txtTelefonoDueño){
        this.txtTelefonoDueño.setText(txtTelefonoDueño);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelEmpleados = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarRecepcionista = new javax.swing.JButton();
        txtCorreoRecepcionista = new javax.swing.JTextField();
        btnRegistrarVeterinario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEspecialidadVeterinario = new javax.swing.JTextField();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTarjetaProfesionalVeterinario = new javax.swing.JTextField();
        panelDueñosMascotas = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbDueño = new javax.swing.JComboBox<>();
        txtNombreMascota = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        txtEdadMascota = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPesoMascota = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbGeneroMascota = new javax.swing.JComboBox<>();
        cmbRecepcionista = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtRazaMascota = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtCitesMascota = new javax.swing.JTextField();
        txtDocumentoDueño = new javax.swing.JTextField();
        txtCorreoDueño = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtTelefonoDueño = new javax.swing.JTextField();
        cmbDueñoMascota = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        spnFechaCita = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        btnRegistrarCita = new javax.swing.JButton();
        btnRegistrarDueño = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVacunasMascota = new javax.swing.JList<>();
        jLabel33 = new javax.swing.JLabel();
        cmbTipoMascota = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cmbVeterinario = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cbmCita = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaDiagnostico = new javax.swing.JTextArea();
        txtTratamientoAplicado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstVacunasAplicadas = new javax.swing.JList<>();
        chxSedacion = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        txtDueño = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txtVacuna = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtPrecioVacuna = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btnAgregarVacuna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jLabel5.setText("Telefono");

        btnRegistrarRecepcionista.setText("REGISTRAR");
        btnRegistrarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRecepcionistaActionPerformed(evt);
            }
        });

        btnRegistrarVeterinario.setText("REGISTRAR");
        btnRegistrarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVeterinarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RECEPCIONISTA");

        jLabel14.setText("Especialidad");

        jLabel1.setText("Nombre");

        jLabel6.setText("Salario");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("VETERINARIO");

        jLabel8.setText("Documento");

        jLabel9.setText("Correo");

        jLabel10.setText("Telefono");

        jLabel11.setText("Salario");

        jLabel12.setText("Nombre");

        jLabel3.setText("Documento");

        jLabel13.setText("Tarjeta Profesional");

        jLabel4.setText("Correo");

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(jLabel2)
                            .addGap(175, 175, 175))
                        .addGroup(panelEmpleadosLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                    .addGap(60, 60, 60)
                                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreVeterinario)
                                        .addComponent(txtCorreoVeterinario)
                                        .addComponent(txtSalarioVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(52, 52, 52)
                                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel4))
                                            .addGap(60, 60, 60)
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombreRecepcionista)
                                                .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(31, 31, 31)))
                                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRegistrarRecepcionista)
                                        .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5)))
                                            .addGap(33, 33, 33)
                                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTelefonoRecepcionista)
                                                .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(230, 230, 230)))))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarVeterinario)
                            .addComponent(txtEspecialidadVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarRecepcionista)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalarioVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidadVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarVeterinario)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMPLEADOS", panelEmpleados);

        jLabel20.setText("Dueño");

        jLabel15.setText("Nombre");

        jLabel21.setText("Mascota");

        jLabel16.setText("Edad");

        jLabel17.setText("Peso");

        jLabel18.setText("Género");

        jLabel19.setText("Recepcionista");

        cmbGeneroMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra" }));

        jLabel22.setText("Raza");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("DUEÑO");

        jLabel24.setText("Documento");

        jLabel25.setText("Correo");

        jLabel26.setText("Vacunas");

        jLabel27.setText("ICA (CITES)");

        jLabel28.setText("Telefono");

        jLabel29.setText("Dueño");

        jLabel30.setText("Nombre");

        jLabel31.setText("Cita");

        spnFechaCita.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("MASCOTA(S)");

        btnRegistrarCita.setText("Registrar");

        btnRegistrarDueño.setText("REGISTRAR");

        jScrollPane2.setViewportView(lstVacunasMascota);

        jLabel33.setText("Tipo de Mascota");

        cmbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONVENCIONAL", "EXÓTICA" }));

        javax.swing.GroupLayout panelDueñosMascotasLayout = new javax.swing.GroupLayout(panelDueñosMascotas);
        panelDueñosMascotas.setLayout(panelDueñosMascotasLayout);
        panelDueñosMascotasLayout.setHorizontalGroup(
            panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDueñosMascotasLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtCitesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16))
                                            .addGap(61, 61, 61)
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbGeneroMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPesoMascota)
                                                .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel29)
                                                .addComponent(jLabel33))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombreMascota)
                                                .addComponent(cmbTipoMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(jLabel22)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDueñosMascotasLayout.createSequentialGroup()
                            .addGap(528, 528, 528)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21))
                            .addGap(25, 25, 25)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrarCita)))
                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGap(211, 211, 211)
                                    .addComponent(jLabel23))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel25))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCorreoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                                    .addGap(25, 25, 25)
                                                    .addComponent(jLabel24))
                                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel28)))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDocumentoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefonoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnRegistrarDueño))))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGap(197, 197, 197)
                                    .addComponent(jLabel32)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        panelDueñosMascotasLayout.setVerticalGroup(
            panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(cmbRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(btnRegistrarDueño))
                        .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel23))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(spnFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(cmbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)))
                                .addGroup(panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24)
                                        .addComponent(txtDocumentoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(58, 58, 58)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCorreoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel28)
                                        .addComponent(txtTelefonoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(20, 20, 20)
                            .addComponent(btnRegistrarCita)
                            .addGap(39, 39, 39)
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDueñosMascotasLayout.createSequentialGroup()
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(cmbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22)
                                        .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(cmbDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(cmbGeneroMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(panelDueñosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(txtCitesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("DUEÑOS Y MASCOTAS", panelDueñosMascotas);

        jLabel44.setText("Veterinario");

        jLabel34.setText("Cita");

        jLabel35.setText("Tratamiento Aplicado");

        jLabel36.setText("Diagnóstico");

        areaDiagnostico.setColumns(20);
        areaDiagnostico.setRows(5);
        jScrollPane3.setViewportView(areaDiagnostico);

        jLabel37.setText("Vacunas Aplicadas");

        jScrollPane4.setViewportView(lstVacunasAplicadas);

        chxSedacion.setText("Sedación");
        chxSedacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxSedacionActionPerformed(evt);
            }
        });

        jLabel38.setText("Dueño");

        jLabel39.setText("Mascota");

        btnGuardar.setText("GUARDAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel34))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbmCita, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtTratamientoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel35)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(chxSedacion)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(cbmCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(txtTratamientoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(chxSedacion)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(btnGuardar)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTAS", jPanel1);

        jLabel41.setText("Vacuna");

        jLabel42.setText("Precio");

        jLabel43.setText("$");

        btnAgregarVacuna.setText("Agregar Vacuna");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarVacuna)
                    .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPrecioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtPrecioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(27, 27, 27)
                .addComponent(btnAgregarVacuna)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VACUNAS", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRecepcionistaActionPerformed

    private void btnRegistrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarVeterinarioActionPerformed

    private void chxSedacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxSedacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxSedacionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDiagnostico;
    private javax.swing.JButton btnAgregarVacuna;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrarCita;
    private javax.swing.JButton btnRegistrarDueño;
    private javax.swing.JButton btnRegistrarRecepcionista;
    private javax.swing.JButton btnRegistrarVeterinario;
    private javax.swing.JComboBox<String> cbmCita;
    private javax.swing.JCheckBox chxSedacion;
    private javax.swing.JComboBox<String> cmbDueño;
    private javax.swing.JComboBox<String> cmbDueñoMascota;
    private javax.swing.JComboBox<String> cmbGeneroMascota;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbRecepcionista;
    private javax.swing.JComboBox<String> cmbTipoMascota;
    private javax.swing.JComboBox<String> cmbVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lstVacunasAplicadas;
    private javax.swing.JList<String> lstVacunasMascota;
    private javax.swing.JPanel panelDueñosMascotas;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JSpinner spnFechaCita;
    private javax.swing.JTextField txtCitesMascota;
    private javax.swing.JTextField txtCorreoDueño;
    private javax.swing.JTextField txtCorreoRecepcionista;
    private javax.swing.JTextField txtCorreoVeterinario;
    private javax.swing.JTextField txtDocumentoDueño;
    private javax.swing.JTextField txtDocumentoRecepcionista;
    private javax.swing.JTextField txtDocumentoVeterinario;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtEdadMascota;
    private javax.swing.JTextField txtEspecialidadVeterinario;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNombreRecepcionista;
    private javax.swing.JTextField txtNombreVeterinario;
    private javax.swing.JTextField txtPesoMascota;
    private javax.swing.JTextField txtPrecioVacuna;
    private javax.swing.JTextField txtRazaMascota;
    private javax.swing.JTextField txtSalarioVeterinario;
    private javax.swing.JTextField txtSueldoRecepcionista;
    private javax.swing.JTextField txtTarjetaProfesionalVeterinario;
    private javax.swing.JTextField txtTelefonoDueño;
    private javax.swing.JTextField txtTelefonoRecepcionista;
    private javax.swing.JTextField txtTelefonoVeterinario;
    private javax.swing.JTextField txtTratamientoAplicado;
    private javax.swing.JTextField txtVacuna;
    // End of variables declaration//GEN-END:variables
}
