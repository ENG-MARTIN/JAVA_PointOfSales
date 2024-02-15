
package SUPERMARKET;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class SALES_DETAILS extends javax.swing.JFrame {
PreparedStatement pst;
ResultSet rst;
Connection conn;
    public SALES_DETAILS() {
        initComponents();
        conn=CONNECTION.connetsqlite();
        this.setExtendedState(SALES_DETAILS.MAXIMIZED_BOTH);
    }
public void search(){
     
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BARCODE = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        AMOUNT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        T_SEARCH = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SALES = new javax.swing.JTable();
        SEARCHING_DATE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        QNTY = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        CHANGE = new javax.swing.JTextField();
        DATE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        daily_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ADD_INCOME = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TELLER1_IN = new javax.swing.JTextField();
        TELLER2_IN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(153, 51, 0));
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 100, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/down16.png"))); // NOI18N
        jLabel1.setText("CLICK ON THE TABLE TO SHOW HERE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("SEARCH BY TELLER NUMBER :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1600, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 13, 710));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("ITEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("CASH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("OR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, -1, 30));

        BARCODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BARCODEActionPerformed(evt);
            }
        });
        getContentPane().add(BARCODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, 40));

        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        getContentPane().add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 40));

        AMOUNT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMOUNTActionPerformed(evt);
            }
        });
        getContentPane().add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("DAILY INCOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        T_SEARCH.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        T_SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_SEARCHKeyPressed(evt);
            }
        });
        getContentPane().add(T_SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 210, 50));

        SEARCH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 150, 130, 40));

        SALES.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SALES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BARCODE", "NAME", "PRICE", "AMOUNT", "TOTAL AMOUNT", "CHANGE", "QUANTITY", "DATE", "TIME", "TELLER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SALES.setSelectionBackground(new java.awt.Color(255, 255, 255));
        SALES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SALES);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 1030, 550));

        SEARCHING_DATE.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SEARCHING_DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHING_DATEActionPerformed(evt);
            }
        });
        SEARCHING_DATE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SEARCHING_DATEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCHING_DATEKeyTyped(evt);
            }
        });
        getContentPane().add(SEARCHING_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 220, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("(in year/month/day-format)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("BARCODE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("TOTAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("QUANTITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("CHANGE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("PRICE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("TIME");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 60, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("DATE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 60, -1));

        TOTAL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        getContentPane().add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 230, 40));

        QNTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QNTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QNTYActionPerformed(evt);
            }
        });
        getContentPane().add(QNTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 230, 40));

        PRICE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRICEActionPerformed(evt);
            }
        });
        getContentPane().add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 230, 40));

        TIME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIMEActionPerformed(evt);
            }
        });
        getContentPane().add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 230, 40));

        CHANGE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CHANGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHANGEActionPerformed(evt);
            }
        });
        getContentPane().add(CHANGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 230, 40));

        DATE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });
        getContentPane().add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 230, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/FULL LOGO.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 270, 90));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 51));
        jLabel16.setText("SEARCH BY DATE :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        daily_total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        daily_total.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(daily_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, 350, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("SHOW ALL SALES");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 760, 180, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("PRINT REPORT");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, 180, 40));

        ADD_INCOME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADD_INCOME.setText("FILL");
        ADD_INCOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_INCOMEActionPerformed(evt);
            }
        });
        getContentPane().add(ADD_INCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 100, 40));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 550, 10));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_gmail_40px.png"))); // NOI18N
        jLabel17.setText("-");
        jPanel1.add(jLabel17);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("martinsseba3@gmail.com");
        jPanel1.add(jLabel23);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_whatsapp_40px.png"))); // NOI18N
        jLabel19.setText("-");
        jPanel1.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("+256 776 121843");
        jPanel1.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_phone_50px.png"))); // NOI18N
        jPanel1.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("+56 700 562982");
        jPanel1.add(jLabel22);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 810, 600, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("REACH ME AT:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 830, 100, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Developed by ;Ssebakumba ;");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 820, 240, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, 1590, 10));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("TOTAL INCOME");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 150, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("TELLER 1");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 80, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("TELLER 2");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 80, 30));

        TELLER1_IN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(TELLER1_IN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 210, 40));

        TELLER2_IN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(TELLER2_IN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ADMIN_FORM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void BARCODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BARCODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BARCODEActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMOUNTActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        try {
         String dt=SEARCHING_DATE.getText();
        String sql="select * from SOLD_ITEMS WHERE DATE='"+dt+"'";
        pst= conn.prepareStatement(sql);
        rst= pst.executeQuery();
        if(rst.next()){
            SALES.setModel(DbUtils.resultSetToTableModel(rst));
        }
        else{
            JOptionPane.showMessageDialog(null, "No sales was made on this date");
        } 
    } catch (Exception e) {
    
        }
    }//GEN-LAST:event_SEARCHActionPerformed

    private void SEARCHING_DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHING_DATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCHING_DATEActionPerformed

    private void SEARCHING_DATEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHING_DATEKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SEARCHING_DATEKeyTyped

    private void SEARCHING_DATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHING_DATEKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
          String dt=SEARCHING_DATE.getText();

    try {
        String sql="select * from SOLD_ITEMS WHERE DATE='"+dt+"'";
        pst= conn.prepareStatement(sql);
        rst= pst.executeQuery();
        if(rst.next()){
            SALES.setModel(DbUtils.resultSetToTableModel(rst));
        }
        else{
            JOptionPane.showMessageDialog(null, "No sales was made on this date");
        } 
    } catch (Exception e) {
    
        }}
    }//GEN-LAST:event_SEARCHING_DATEKeyPressed

    private void T_SEARCHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_SEARCHKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
          String TELLER_NO=T_SEARCH.getText();

    try {
        String sql="select * from SOLD_ITEMS WHERE TELLER='"+TELLER_NO+"'";
        pst= conn.prepareStatement(sql);
        rst= pst.executeQuery();
        if(rst.next()){
            SALES.setModel(DbUtils.resultSetToTableModel(rst));
        }
        else{
            JOptionPane.showMessageDialog(null, "INVALID TEELER_NO.");
        } 
    } catch (Exception e) {
    
        }}
    }//GEN-LAST:event_T_SEARCHKeyPressed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALActionPerformed

    private void QNTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QNTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QNTYActionPerformed

    private void PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRICEActionPerformed

    private void TIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIMEActionPerformed

    private void CHANGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHANGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHANGEActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DATEActionPerformed

    private void SALESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseClicked
    // TODO add your handling code here:
        try {
            DefaultTableModel t = (DefaultTableModel) SALES.getModel();
    int i = SALES.getSelectedRow();
    BARCODE.setText(t.getValueAt(i, 0).toString());
    NAME.setText(t.getValueAt(i, 1).toString());
    PRICE.setText(t.getValueAt(i, 2).toString());
    AMOUNT.setText(t.getValueAt(i, 3).toString());
    TOTAL.setText(t.getValueAt(i, 4).toString());
    CHANGE.setText(t.getValueAt(i, 5).toString());
    QNTY.setText(t.getValueAt(i, 6).toString());
    DATE.setText(t.getValueAt(i, 7).toString());
    TIME.setText(t.getValueAt(i, 8).toString());
        } catch (Exception e) {
        }
    
         
    }//GEN-LAST:event_SALESMouseClicked

    private void ADD_INCOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_INCOMEActionPerformed
        // TODO add your handling code here:
        try {
            String sql="select SUM(TOTAL_AMOUNT) as sales_perDay from SOLD_ITEMS";
            pst= conn.prepareStatement(sql);
            rst= pst.executeQuery();
            if(rst.next()){
            double a=Double.parseDouble(rst.getString(sql));
            daily_total.setText(Double.toString(a));
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_ADD_INCOMEActionPerformed

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
            java.util.logging.Logger.getLogger(SALES_DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES_DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES_DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES_DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALES_DETAILS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_INCOME;
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField BARCODE;
    private javax.swing.JTextField CHANGE;
    private javax.swing.JTextField DATE;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QNTY;
    private javax.swing.JTable SALES;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField SEARCHING_DATE;
    private javax.swing.JTextField TELLER1_IN;
    private javax.swing.JTextField TELLER2_IN;
    private javax.swing.JTextField TIME;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JTextField T_SEARCH;
    private javax.swing.JTextField daily_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
