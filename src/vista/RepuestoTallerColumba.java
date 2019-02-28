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
public class RepuestoTallerColumba extends javax.swing.JFrame {

ConectarBaseDatos cc= new ConectarBaseDatos();
Connection cn= cc.conexion();

    public RepuestoTallerColumba() {
        initComponents();
        setTitle("Registro de Repuesto");
        mostrardatos("");
    }
void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CÓDIGO");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("CANTIDAD");
    modelo.addColumn("DESCRIPCCIÓN");
    tablaReouesto.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM repuesto";
    }
    else{
        sql="SELECT * FROM repuesto WHERE codigo='"+valor+"'";
    }
 
    String []datos = new String [4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            tablaReouesto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RepuestoTallerColumba.class.getName()).log(Level.SEVERE, null, ex);
        }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        borrar = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenuItem();
        menu = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btanAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReouesto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(borrar);

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(editar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 400));
        setMinimumSize(new java.awt.Dimension(750, 400));
        getContentPane().setLayout(null);

        menu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(630, 250, 100, 25);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(630, 220, 100, 25);

        btanAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btanAgregar.setText("Agregar");
        btanAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btanAgregar);
        btanAgregar.setBounds(520, 220, 100, 23);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(520, 250, 100, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 220, 100, 25);

        txtbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(280, 220, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Código");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 220, 43, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 43, 20);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(100, 10, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 50, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(100, 40, 150, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 80, 17);

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(100, 70, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descripcción");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 100, 17);

        tablaReouesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaReouesto.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablaReouesto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 10, 390, 190);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 100, 230, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/repuestos.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, 200, 290, 260);

        btnMostrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(410, 250, 100, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuTalleresColumba ir = new MenuTalleresColumba();
        ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btnMostrarActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrardatos(txtbuscar.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btanAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanAgregarActionPerformed
        try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO repuesto(codigo, nombre, cantidad, descripcion) VALUES (?,?,?,?)");
        pst.setString(1, txtCodigo.getText());
        pst.setString(2, txtNombre.getText());
        pst.setString(3, txtCantidad.getText());
        pst.setString(4, txtDescripcion.getText());
           
        pst.executeUpdate();
        mostrardatos("");
    } catch (SQLException e) {
        System.out.print(e.getMessage());
    }  
    }//GEN-LAST:event_btanAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    String borrar="";
    txtCodigo.setText(borrar);
    txtNombre.setText(borrar);
    txtCantidad.setText(borrar);
    txtDescripcion.setText(borrar);
    txtbuscar.setText(borrar);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    try {
        PreparedStatement pst = cn.prepareStatement("UPDATE repuesto SET codigo='"+txtCodigo.getText()+"',nombre='"+txtNombre.getText()+"',cantidad='"+txtCantidad.getText()+"',descripcion='"+txtDescripcion.getText()+"' WHERE codigo='"+txtCodigo.getText()+"'"); 
        pst.executeUpdate(); 
        mostrardatos("");
    } catch (SQLException e) { 
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
    int fila = tablaReouesto.getSelectedRow();
    String cod="";
    cod=tablaReouesto.getValueAt(fila, 0).toString();
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM repuesto WHERE  codigo='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (SQLException e) {
    }   
    }//GEN-LAST:event_borrarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    int fila= tablaReouesto.getSelectedRow();
    if(fila>=0){
        txtCodigo.setText(tablaReouesto.getValueAt(fila, 0).toString());
        txtNombre.setText(tablaReouesto.getValueAt(fila, 1).toString());
        txtCantidad.setText(tablaReouesto.getValueAt(fila, 2).toString());
        txtDescripcion.setText(tablaReouesto.getValueAt(fila, 3).toString());
    }
    else{
    JOptionPane.showMessageDialog(null,"No seleciono fila");
    }
    }//GEN-LAST:event_editarActionPerformed

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
            java.util.logging.Logger.getLogger(RepuestoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepuestoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepuestoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepuestoTallerColumba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepuestoTallerColumba().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem borrar;
    private javax.swing.JButton btanAgregar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem editar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu;
    private javax.swing.JTable tablaReouesto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
