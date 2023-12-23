/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.database_pro;

/**
 *
 * @author Google Tech
 */
public class EXHIBITION extends javax.swing.JFrame {

    /**
     * Creates new form EXHIBITION
     */
    public EXHIBITION() {
        initComponents();
        setSize(1080, 749);

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SHOW = new javax.swing.JButton();
        BACKE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setText("                   DATA  ABOUTE  THE  EXHIBITION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 60, 650, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUMBER OF EXHIBITION", "NAME OF EXHIBITION", "CITY", "STREET", "EMPLOYEE SSN"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 160, 970, 470);

        SHOW.setBackground(new java.awt.Color(204, 204, 204));
        SHOW.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        SHOW.setText("SHOW DATA");
        SHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWActionPerformed(evt);
            }
        });
        getContentPane().add(SHOW);
        SHOW.setBounds(850, 660, 150, 27);

        BACKE.setBackground(new java.awt.Color(204, 204, 204));
        BACKE.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        BACKE.setText("BACKE");
        BACKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKEActionPerformed(evt);
            }
        });
        getContentPane().add(BACKE);
        BACKE.setBounds(20, 660, 120, 27);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-50.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(990, 80, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-50.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 80, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1b.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, 0, 1080, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SHOWActionPerformed

    private void BACKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKEActionPerformed
        dispose();// to close the curent frame
        exhibitionFrame R = new exhibitionFrame ();// next GUI....
        R.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BACKEActionPerformed

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
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EXHIBITION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKE;
    private javax.swing.JButton SHOW;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}