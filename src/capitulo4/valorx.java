package capitulo4;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgeeduardo
 */
public class valorx extends javax.swing.JFrame {

    /**
     * Creates new form valorx
     */
    public valorx() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtresultado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 340));
        setMinimumSize(new java.awt.Dimension(400, 340));
        setPreferredSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        jLabel1.setText("    HALLAR VALOR \"X\"");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 310, 39);

        jLabel2.setText("Digite valor Y");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 48, 63, 14);

        txty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyActionPerformed(evt);
            }
        });
        getContentPane().add(txty);
        txty.setBounds(83, 45, 101, 20);

        jLabel3.setText("Digite valor A");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 79, 64, 14);

        txta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaActionPerformed(evt);
            }
        });
        getContentPane().add(txta);
        txta.setBounds(84, 76, 100, 20);

        jLabel4.setText("Digite valor B");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 63, 14);
        getContentPane().add(txtb);
        txtb.setBounds(83, 107, 101, 20);

        jLabel5.setText("Digite valor C");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 141, 64, 14);

        txtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcActionPerformed(evt);
            }
        });
        getContentPane().add(txtc);
        txtc.setBounds(84, 138, 100, 20);

        jButton1.setText("CALCAULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 228, 102, 53);

        txtresultado.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(txtresultado);
        txtresultado.setBounds(118, 228, 127, 53);

        jButton2.setText("LIMPPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 230, 94, 48);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/bandera-colombia-400x400.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyActionPerformed

    private void txtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaActionPerformed

    private void txtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int valorx;
            double a = Double.parseDouble(txta.getText());
            double b = Double.parseDouble(txtb.getText());
             double c = Double.parseDouble(txtc.getText());
            double y = Double.parseDouble(txty.getText());
            int x;
      
            if (y < a && a < b && b < c) {
            x = 0;
        } 
        else if (a <= y && y < b) {
            x = 1;
        }
        else if ((b <= y && y < c)) {
            x = 2;
        } 
        else if (c <= y) {
            x = 3;
        }
        else 
            x = 4;
        valorx = x;
        
        txtresultado.setText(String.valueOf(valorx));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "///ERROR///", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           txta.setText(" ");
        txtb.setText(" ");
           txtc.setText(" ");
        txty.setText(" ");
        txtresultado.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(valorx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(valorx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(valorx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(valorx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new valorx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txty;
    // End of variables declaration//GEN-END:variables
}
