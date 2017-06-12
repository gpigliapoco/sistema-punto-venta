/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import conexion.conexcion1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author BeltariT
 */
public class pInformes extends javax.swing.JFrame {

   java.util.Date dato = null;
   java.util.Date dato2 = null;
   
    public pInformes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jStock = new javax.swing.JRadioButton();
        jMercaderiasEntragadas = new javax.swing.JRadioButton();
        jRemitosEntregados = new javax.swing.JRadioButton();
        jTotalFletes = new javax.swing.JRadioButton();
        jTotalDescargas = new javax.swing.JRadioButton();
        jDettMercaderiaEntregadas = new javax.swing.JRadioButton();
        jListadoOperadores = new javax.swing.JRadioButton();
        jListadoProducto = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaM = new javax.swing.JFormattedTextField();
        txtFechaM1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonGroup1.add(jStock);
        jStock.setText("Stock");

        buttonGroup1.add(jMercaderiasEntragadas);
        jMercaderiasEntragadas.setText("Mercaderias Entregadas x Producto");
        jMercaderiasEntragadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMercaderiasEntragadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRemitosEntregados);
        jRemitosEntregados.setText("Remitos entregados");
        jRemitosEntregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemitosEntregadosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jTotalFletes);
        jTotalFletes.setText("Total Fletes");
        jTotalFletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalFletesActionPerformed(evt);
            }
        });

        buttonGroup1.add(jTotalDescargas);
        jTotalDescargas.setText("Total Descargas");
        jTotalDescargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalDescargasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jDettMercaderiaEntregadas);
        jDettMercaderiaEntregadas.setText("Detalle de mercaderias entregadas");
        jDettMercaderiaEntregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDettMercaderiaEntregadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jListadoOperadores);
        jListadoOperadores.setText("Listado Clientes");
        jListadoOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListadoOperadoresActionPerformed(evt);
            }
        });

        buttonGroup1.add(jListadoProducto);
        jListadoProducto.setText("Listado Productos");
        jListadoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListadoProductoActionPerformed(evt);
            }
        });

        jButton1.setText("INFORME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha");

        jLabel4.setText("Producto");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        jLabel5.setText("A");

        try {
            txtFechaM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaMActionPerformed(evt);
            }
        });

        try {
            txtFechaM1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMercaderiasEntragadas)
                    .addComponent(jRemitosEntregados)
                    .addComponent(jStock)
                    .addComponent(jListadoOperadores)
                    .addComponent(jListadoProducto)
                    .addComponent(jTotalDescargas)
                    .addComponent(jDettMercaderiaEntregadas)
                    .addComponent(jTotalFletes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMercaderiasEntragadas)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(txtFechaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRemitosEntregados)
                .addGap(9, 9, 9)
                .addComponent(jTotalFletes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTotalDescargas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDettMercaderiaEntregadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jListadoProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jListadoOperadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMercaderiasEntragadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMercaderiasEntragadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMercaderiasEntragadasActionPerformed

    private void jRemitosEntregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemitosEntregadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRemitosEntregadosActionPerformed

    private void jTotalFletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalFletesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalFletesActionPerformed

    private void jTotalDescargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalDescargasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalDescargasActionPerformed

    private void jDettMercaderiaEntregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDettMercaderiaEntregadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDettMercaderiaEntregadasActionPerformed

    private void jListadoOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListadoOperadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListadoOperadoresActionPerformed

    private void jListadoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListadoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListadoProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

obtenerFecha();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    String date = sdf.format(dato);
    String date2 = sdf.format(dato2);

        conexcion1 cn = new conexcion1();

        if (jListadoOperadores.isSelected()) {
            String path = "C:\\Users\\mike\\Desktop\\thain\\tahin\\src\\reportes\\rOperadores.jasper";
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, cn.conectar1());
                JasperViewer jw = new JasperViewer(jp, false);

                jw.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(pInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jListadoProducto.isSelected()) {
            String path = "C:\\Users\\mike\\Desktop\\thain\\tahin\\src\\reportes\\rProductos.jasper";
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, cn.conectar1());
                JasperViewer jw = new JasperViewer(jp, false);

                jw.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(pInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jStock.isSelected()) {
            String path = "I:\\tahin_2\\src\\reportes\\rStockTotal.jasper";
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, cn.conectar1());
                JasperViewer jw = new JasperViewer(jp, false);

                jw.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(pInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jRemitosEntregados.isSelected()) {
            if(txtFechaM.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "Indicar fecha");
            return;}
            String path = "I:\\tahin_2\\src\\reportes\\report_comprobantes.jasper";
            JasperReport jr = null;
            try {
                Map parametro = new HashMap();
                parametro.put("inicio", date);
                parametro.put("fin", date2);
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn.conectar1());
                JasperViewer jw = new JasperViewer(jp, false);

                jw.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(pComprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if (jDettMercaderiaEntregadas.isSelected()) {
            if(txtFechaM.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "Indicar fecha");
            return;}
            String path = "I:\\tahin_2\\src\\reportes\\rDetalleGastos.jasper";
            JasperReport jr = null;
            try {
                Map parametro = new HashMap();
                parametro.put("inicio", date);
                parametro.put("fin", date2);
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn.conectar1());
                JasperViewer jw = new JasperViewer(jp, false);

                jw.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(pComprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

      public void obtenerFecha() {

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");  ////// metodo para convertir string a date y colocarlo en jdatechooser   http://www.forosdelweb.com/f45/mysql-java-netbeans-java-sql-date-860869/
        String fecha = txtFechaM.getText();
        String fecha2 = txtFechaM1.getText();

        try {

            dato = formatoDelTexto.parse(fecha);
            dato2 = formatoDelTexto.parse(fecha2);
            

        } catch (ParseException ex) {

            ex.printStackTrace();

        }

    }
    
    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F9) {
            pProductos_ventana form = new pProductos_ventana();
            form.funcion = "informes";
            form.toFront();
            form.setVisible(true);
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtFechaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMActionPerformed

    private void txtFechaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaM1ActionPerformed

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
            java.util.logging.Logger.getLogger(pInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pInformes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jDettMercaderiaEntregadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jListadoOperadores;
    private javax.swing.JRadioButton jListadoProducto;
    private javax.swing.JRadioButton jMercaderiasEntragadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRemitosEntregados;
    private javax.swing.JRadioButton jStock;
    private javax.swing.JRadioButton jTotalDescargas;
    private javax.swing.JRadioButton jTotalFletes;
    private javax.swing.JFormattedTextField txtFechaM;
    private javax.swing.JFormattedTextField txtFechaM1;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
