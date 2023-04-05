/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;



import java.awt.Menu;
import java.util.EventObject;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class InterfazMoneda extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMoneda
     */
    public InterfazMoneda() {
        initComponents();
        
        setLocationRelativeTo(null);
        jBConvertir.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBconvertira = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBconvertirde = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBConvertir = new javax.swing.JButton();
        jTFvalorconvertir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conversor de Moneda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jCBconvertira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Pesos", "Dolares", "Euros", "Soles" }));
        jPanel2.add(jCBconvertira, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Selecciona un tipo de conversion de moneda");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 400, 50));

        jCBconvertirde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Pesos", "Dolares", "Euros", "Soles" }));
        jPanel2.add(jCBconvertirde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 220, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("A :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Valor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Regresar a Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jBConvertir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBConvertir.setText("Convertir");
        jBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConvertirActionPerformed(evt);
            }
        });
        jPanel2.add(jBConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, 40));

        jTFvalorconvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFvalorconvertirActionPerformed(evt);
            }
        });
        jTFvalorconvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFvalorconvertirKeyTyped(evt);
            }
        });
        jPanel2.add(jTFvalorconvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 220, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("De :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
    
    private void jBConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConvertirActionPerformed
        // TODO add your handling code here:
        
        String convertirde = (String) jCBconvertirde. getSelectedItem();
        String convertira = (String) jCBconvertira. getSelectedItem();
        
        int valorcon = Integer.parseInt(jTFvalorconvertir.getText());
        
        double total = 0;
            
            if (convertirde == "Pesos" && convertira == "Dolares"){
                
                total = (double) (valorcon * 0.00021);
                
                JOptionPane.showMessageDialog(null, "El resultador es: " + total  + convertira);
            }

                    if( convertirde == "Pesos" && convertira == "Euros"){
                        
                        total = (double) (valorcon * 0.00020);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        }

                    if( convertirde == "Pesos" && convertira == "Soles"){
                        
                        total = (double) (valorcon * 0.00080);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        }

                    if( convertirde == "Dolares" && convertira == "Pesos"){
                        
                        
                        total = (double) (valorcon * 4750.23);
                        
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        
                        }

                    if( convertirde == "Dolares" && convertira == "Euros"){
                        
                        total = (double) (valorcon * 0.93);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        
                        }
                    if( convertirde == "Dolares" && convertira == "Soles"){
                        
                        total = (double) (valorcon * 3.77);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);

                        }
                    if( convertirde == "Euros" && convertira == "Pesos"){
                        
                        total = (double) (valorcon * 5121.94);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);

                        }
                    
                    if( convertirde == "Euros" && convertira == "Soles"){
                        
                        total = (double) (valorcon * 4.07);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        
                        }
                    if( convertirde == "Euros" && convertira == "Dolares"){
                        
                        total = (double) (valorcon * 1.08);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);

                        }
                    
                    if( convertirde == "Soles" && convertira == "Pesos"){
                        
                        total = (double) (valorcon * 1261.07);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);

                        }

                    if( convertirde == "Soles" && convertira == "Dolares"){
                        
                        total = (double) (valorcon * 0.27);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);
                        
                        }
                    if( convertirde == "Soles" && convertira == "Euros"){
                        
                        total = (double) (valorcon * 0.025);
                        JOptionPane.showMessageDialog(null, "El resultador es:" + total + convertira);

                    }

                    if(convertirde == convertira){

                        JOptionPane.showMessageDialog(null, "Opción no validad");
                    
                    } else {
                
//                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                        }
    
    
       
    }//GEN-LAST:event_jBConvertirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        interfaz_menuprincipal menu = new interfaz_menuprincipal();
        menu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTFvalorconvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFvalorconvertirActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTFvalorconvertirActionPerformed

    private void jTFvalorconvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFvalorconvertirKeyTyped
        // TODO add your handling code here:
       
        
        if((evt.getKeyChar()>=33 && evt.getKeyChar()<=42) || (jTFvalorconvertir.equals(""))){
    
            JOptionPane.showMessageDialog(null, "Caracteres no permitidos");
        }        
    
    }//GEN-LAST:event_jTFvalorconvertirKeyTyped

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
            java.util.logging.Logger.getLogger(InterfazMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConvertir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    public javax.swing.JComboBox<String> jCBconvertira;
    public javax.swing.JComboBox<String> jCBconvertirde;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFvalorconvertir;
    // End of variables declaration//GEN-END:variables
}
