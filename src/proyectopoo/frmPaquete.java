/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
*/
/**
 *
 * @author Manuel
 */
public class frmPaquete extends javax.swing.JFrame {

    /**
     * Creates new form frmPaquete
     */

   public frmPaquete() throws ClassNotFoundException, SQLException {
        initComponents();
        
        Conexion cnn = new Conexion();
         
         ResultSet rs = cnn.ejecutarSQL("select * from paquetes");
         rs.next();
            DefaultTableModel modelo = (DefaultTableModel) tblPaquete.getModel();
            while(rs.next()){
                Object[] fila = new Object[4];
                for (int i=0;i < fila.length; i++){
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            tblPaquete.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaquete = new javax.swing.JTable();

        tblPaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Paquete", "Ambientacion", "Entretenimiento", "Area"
            }
        ));
        jScrollPane1.setViewportView(tblPaquete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaquete;
    // End of variables declaration//GEN-END:variables
   }