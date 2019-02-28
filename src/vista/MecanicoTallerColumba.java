/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConectarBaseDatos;
import modelo.Mecanico;

/**
 * CLIENTE SERVIDOR
 * Santiago Columba
 * Sexto Sistemas
 */
public class MecanicoTallerColumba extends javax.swing.JFrame {

ConectarBaseDatos cc= new ConectarBaseDatos();
Connection cn= cc.conexion();
    public MecanicoTallerColumba() {
        initComponents();
        setTitle("Registro Mecánico");
        mostrardatos("");
    }

void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CEDULA");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("APELLIDO");
    modelo.addColumn("EDAD");
    modelo.addColumn("TELÉFONO");
    modelo.addColumn("DIRECCIÓN");
    modelo.addColumn("CARGO");
    TablaMecanico.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM mecanico";
    }
    else{
        sql="SELECT * FROM mecanico WHERE cedula='"+valor+"'";
    }
 
    String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                modelo.addRow(datos);
            }
            TablaMecanico.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MecanicoTallerColumba.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtReporte = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMecanico = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbnActualizar1 = new javax.swing.JButton();

        eliminar.setText("Eliminar Empleado");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminar);

        modificar.setText("Modificar Empleado");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 525));
        setMinimumSize(new java.awt.Dimension(1000, 525));
        getContentPane().setLayout(null);

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(730, 250, 100, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cédula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 41, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(119, 40, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 70, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 100, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 130, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dirección");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(116, 160, 60, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cargo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 190, 50, 17);

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCedula);
        txtCedula.setBounds(179, 10, 120, 20);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(179, 40, 120, 20);

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtApellido);
        txtApellido.setBounds(179, 70, 120, 20);

        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtEdad);
        txtEdad.setBounds(179, 100, 120, 20);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(179, 130, 120, 20);

        txtDirecion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDirecion);
        txtDirecion.setBounds(179, 160, 120, 20);

        txtCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCargo);
        txtCargo.setBounds(179, 190, 120, 20);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(620, 220, 100, 23);

        txtReporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReporte.setText("Reporte");
        txtReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReporteActionPerformed(evt);
            }
        });
        getContentPane().add(txtReporte);
        txtReporte.setBounds(510, 250, 100, 23);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(730, 220, 100, 25);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(510, 220, 100, 25);

        TablaMecanico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        TablaMecanico.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TablaMecanico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 10, 660, 200);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mecanico.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 190, 320, 300);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(380, 220, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cédula");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 220, 41, 17);

        tbnActualizar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnActualizar1.setText("Actualizar");
        tbnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnActualizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(tbnActualizar1);
        tbnActualizar1.setBounds(620, 250, 100, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
    MenuTalleresColumba ir = new MenuTalleresColumba();
    ir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Mecanico empleado = new Mecanico(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), txtTelefono.getText(), txtDirecion.getText(), txtCargo.getText());
        empleado.imprimir_mostrat();
        try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO mecanico(cedula, nombre, apellido, edad, telf, direccion, cargo) VALUES (?,?,?,?,?,?,?)");
        pst.setString(1, txtCedula.getText());
        pst.setString(2, txtNombre.getText());
        pst.setString(3, txtApellido.getText());
        pst.setString(4, txtEdad.getText());
        pst.setString(5, txtTelefono.getText());
        pst.setString(6, txtDirecion.getText());
        pst.setString(7, txtCargo.getText());
        
        
        pst.executeUpdate();
        mostrardatos("");
    } catch (SQLException e) {
        System.out.print(e.getMessage());
    }  
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String borrar="";
        txtCedula.setText(borrar);
        txtNombre.setText(borrar);
        txtApellido.setText(borrar);
        txtEdad.setText(borrar);
        txtTelefono.setText(borrar);
        txtDirecion.setText(borrar);
        txtCargo.setText(borrar);
        txtBuscar.setText(borrar);
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void txtReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReporteActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_txtReporteActionPerformed
    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    int fila= TablaMecanico.getSelectedRow();
    if(fila>=0){
        txtCedula.setText(TablaMecanico.getValueAt(fila, 0).toString());
        txtNombre.setText(TablaMecanico.getValueAt(fila, 1).toString());
        txtApellido.setText(TablaMecanico.getValueAt(fila, 2).toString());
        txtEdad.setText(TablaMecanico.getValueAt(fila, 3).toString());
        txtTelefono.setText(TablaMecanico.getValueAt(fila, 4).toString());
        txtDirecion.setText(TablaMecanico.getValueAt(fila, 5).toString());
        txtCargo.setText(TablaMecanico.getValueAt(fila, 6).toString());
    }
    else{
    JOptionPane.showMessageDialog(null,"No seleciono fila");
    }
        
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int fila = TablaMecanico.getSelectedRow();
    String cod="";
    cod=TablaMecanico.getValueAt(fila, 0).toString();
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM mecanico WHERE  cedula='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (SQLException e) {
    }   
    }//GEN-LAST:event_eliminarActionPerformed

    private void tbnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnActualizar1ActionPerformed
    try {
        Mecanico empleado = new Mecanico(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), txtTelefono.getText(), txtDirecion.getText(), txtCargo.getText());
        empleado.imprimir_mostrat();
        PreparedStatement pst = cn.prepareStatement("UPDATE mecanico SET cedula='"+txtCedula.getText()+"',nombre='"+txtNombre.getText()+"',apellido='"+txtApellido.getText()+"',edad='"+txtEdad.getText()+"', telf='"+txtTelefono.getText()+"', direccion='"+txtDirecion.getText()+"', cargo='"+txtCargo.getText()+"' WHERE cedula='"+txtCedula.getText()+"'"); 
        pst.executeUpdate(); 
        mostrardatos("");
    } catch (SQLException e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_tbnActualizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(MecanicoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MecanicoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MecanicoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MecanicoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MecanicoTallerColumba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMecanico;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JButton tbnActualizar1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton txtReporte;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
