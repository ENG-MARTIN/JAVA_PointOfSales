/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SUPERMARKET;

/**
 *
 * @author HP
 */
public class SUPPLIERS extends javax.swing.JFrame {

    /**
     * Creates new form SUPPLIERS
     */
    public SUPPLIERS() {
        this.setUndecorated(true);
        initComponents();
        setExtendedState(SUPPLIERS.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        BACK2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BACK1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BACK3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        REF_1 = new javax.swing.JTextField();
        REF_2 = new javax.swing.JTextField();
        NIN = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        min = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK2.setBackground(new java.awt.Color(255, 0, 0));
        BACK2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BACK2.setText("BACK");
        BACK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK2ActionPerformed(evt);
            }
        });
        jPanel4.add(BACK2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 710, 140, -1));

        jTabbedPane1.addTab("REMOVE", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK1.setBackground(new java.awt.Color(255, 0, 0));
        BACK1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BACK1.setText("BACK");
        BACK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK1ActionPerformed(evt);
            }
        });
        jPanel5.add(BACK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 720, 140, -1));

        jTabbedPane1.addTab("SUPERVISION", jPanel5);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK3.setBackground(new java.awt.Color(255, 0, 0));
        BACK3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BACK3.setText("BACK");
        BACK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK3ActionPerformed(evt);
            }
        });
        jPanel3.add(BACK3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 720, 140, -1));

        jTabbedPane1.addTab("EDIT INFO", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("ENTER THE INFORMATION OF THE NEW SUPPLIER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 669, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel2.setText("ADDRESS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel3.setText("PARTICULARS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 140, 62));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("NIN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel6.setText("REFEREE 2");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 110, 50));
        jPanel2.add(REF_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 320, 60));
        jPanel2.add(REF_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 320, 60));

        NIN.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        NIN.setForeground(new java.awt.Color(0, 0, 153));
        NIN.setText("NIN");
        jPanel2.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel8.setText("REFEREE 1");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 120, 50));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 350, 60));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 350, 60));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 350, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel7.setText("NAME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 40));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 350, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setText("NIN");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 40));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 340, 70));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 10, 380));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 350, 60));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 340, 70));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("BANK STATEMENT");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 480, 180, 50));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("CLICK TO SCAN ID");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 180, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("BANK STATEMENT");
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 510, 180, 50));

        BACK.setBackground(new java.awt.Color(255, 0, 0));
        BACK.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel2.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 720, 140, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 320, 330));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 340, 330));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel11.setText("FRONT");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel12.setText("FRONT");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 100, 30));

        jTabbedPane1.addTab("ADD NEW", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1580, 820));

        close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 10, -1, -1));

        min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min.setText("mini");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ADMIN_FORM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void BACK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BACK1ActionPerformed

    private void BACK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BACK2ActionPerformed

    private void BACK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BACK3ActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        // TODO add your handling code here:
        setState(SUPPLIERS.ICONIFIED);
    }//GEN-LAST:event_minActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUPPLIERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton BACK1;
    private javax.swing.JButton BACK2;
    private javax.swing.JButton BACK3;
    private javax.swing.JLabel NIN;
    private javax.swing.JTextField REF_1;
    private javax.swing.JTextField REF_2;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton min;
    // End of variables declaration//GEN-END:variables
}
