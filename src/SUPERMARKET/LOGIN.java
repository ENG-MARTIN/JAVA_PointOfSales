
package SUPERMARKET;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {
Connection conn;
ResultSet rst;
PreparedStatement pst;

    
    public LOGIN() {
        setUndecorated(true);
        initComponents();
        conn=CONNECTION.connetsqlite();
        currentdate();
       
    }

    public void currentdate() {

        Thread clock = new Thread() {
            
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    //DATE.setText(year + "/" + (month + 1) + "/" + day);

                    //time
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                   // TIME.setText("0" + hour + ":" + (minute) + ":" + second);
                    //TIME.setEditable(false);
                    //DATE.setEditable(false);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } 
                }

            }
        };
        clock.start();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LOGIN = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        minimise = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGIN.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel2.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 140, 40));

        name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 204), 1, true));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 320, 56));

        id.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 204), 1, true));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 320, 53));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 120, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, 37));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 270, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 890, 10));

        close.setBackground(new java.awt.Color(204, 204, 204));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_close_window_30px.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 50, 40));

        minimise.setBackground(new java.awt.Color(255, 255, 153));
        minimise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_reduce_30px.png"))); // NOI18N
        minimise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimiseActionPerformed(evt);
            }
        });
        jPanel2.add(minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/FULL LOGO.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 280, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/login 1.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 800, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        // TODO add your handling code here:
          SALES e = new SALES();
                e.setVisible(true);
           /*  String sql="select * from LOGIN where ID=? and USERNAME=?";
             String sql2="select * from ADMIN_LOGIN where ID=? and USERNAME=?";
            try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,id.getText());
            pst.setString(2, name.getText());
            rst = pst.executeQuery();
            if(rst.next()){
                rst.close();
                pst.close();
                this.setVisible(false);
                 JOptionPane.showMessageDialog(null, "ALERT!", "YOU ARE UNDER SUPERVISION",5);
             SALES e = new SALES();
            e.setVisible(true);               
           }
            
            /////////////////////
            pst = conn.prepareStatement(sql2);
            pst.setString(1,id.getText());
            pst.setString(2, name.getText());
            rst = pst.executeQuery();
            if(rst.next()){
            
                rst.close();
                pst.close();
                this.setVisible(false);
                ADMIN_FORM e = new ADMIN_FORM();
                e.setVisible(true); 
                 JOptionPane.showMessageDialog(null, "good");
           }
           
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    SALES e = new SALES();
                e.setVisible(true); 
                    }
            finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            } 
         
        */
    }//GEN-LAST:event_LOGINActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode()==KeyEvent.VK_DOWN){
           name.requestFocus();
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           name.requestFocus();
       }
    }//GEN-LAST:event_idKeyPressed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_idKeyTyped

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
       String sql="select * from LOGIN where ID=? and USERNAME=?";
             String sql2="select * from ADMIN_LOGIN where ID=? and USERNAME=?";
            try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,id.getText());
            pst.setString(2, name.getText());
            rst = pst.executeQuery();
            if(rst.next()){
                rst.close();
                pst.close();
                this.setVisible(false);
                 //JOptionPane.showMessageDialog(null, "ALERT!", "YOU ARE UNDER SUPERVISION",5);
                SALES e = new SALES();
                e.setVisible(true); 
               
           }
            
            /////////////////////
            pst = conn.prepareStatement(sql2);
            pst.setString(1,id.getText());
            pst.setString(2, name.getText());
            rst = pst.executeQuery();
            if(rst.next()){
            
                rst.close();
                pst.close();
                this.setVisible(false);
                ADMIN_FORM e = new ADMIN_FORM();
                e.setVisible(true); 
                 JOptionPane.showMessageDialog(null, "good");
           }
           
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
            finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            } 
         
    }//GEN-LAST:event_nameKeyPressed

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        setState(SALES.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton close;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton minimise;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
