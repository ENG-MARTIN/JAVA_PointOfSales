/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SUPERMARKET;

import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SALES extends javax.swing.JFrame {
PreparedStatement pst;
Connection conn;
ResultSet rst;
    
    public SALES() {
        this.setUndecorated(true);
        initComponents();
        conn=CONNECTION.connetsqlite();
        currentdate();
        
        this.setExtendedState(SALES.MAXIMIZED_BOTH);
    }

    private void Update_table(){
       try{
           String sql ="select * from SOLD_ITEMS";
           pst =conn.prepareStatement(sql);
           rst =pst.executeQuery();
           // jTableitemssold.setModel(DbUtils.resultSetToTableModel(rst));
            rst.close();
            pst.close();
       }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
        finally{
    try{
    rst.close();
    pst.close();}
    catch(Exception e){}
	}
       }
    
    
       public void clear() {
        BARCODE.setText("");
        NAME.setText("");
        QUANTITY.setText("");
        PRICE.setText("");
        QNTY.setText("");
        AMOUNT.setText("");
        //SOLD.setText("");
    }
 public void currentdate() {

        Thread clock = new Thread() {
            
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    DATE.setText(" "+year + "/" + (month + 1) + "/" + day);

                    //time
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    TIME.setText(" "+"0" + hour + ":" + (minute) + ":" + second);
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

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DATE = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        QUANTITY = new javax.swing.JTextField();
        CATEGORY = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        BARCODE = new javax.swing.JTextField();
        FIND = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        SUPLIER = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        NAME2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        QNTY = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        AMOUNT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        EVALUTE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ADDTOCART = new javax.swing.JButton();
        CASH = new javax.swing.JTextField();
        CHANGE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        TELLER = new javax.swing.JTextField();
        minimise = new javax.swing.JButton();
        shutdown = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("TIME :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("DATE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/SUPERMARKET LOGO(HORIZONTAL).jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        DATE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DATE.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        getContentPane().add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 230, 40));

        TIME.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TIME.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        getContentPane().add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 230, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 460, 10));

        QUANTITY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QUANTITY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        jPanel1.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 320, 60));

        CATEGORY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CATEGORY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        jPanel1.add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 320, 60));

        PRICE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PRICE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRICEActionPerformed(evt);
            }
        });
        jPanel1.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 320, 60));

        NAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        jPanel1.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 320, 60));

        BARCODE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BARCODE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        BARCODE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BARCODEKeyPressed(evt);
            }
        });
        jPanel1.add(BARCODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 70, 320, 60));

        FIND.setBackground(new java.awt.Color(51, 51, 0));
        FIND.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FIND.setForeground(new java.awt.Color(0, 255, 0));
        FIND.setText("FIND");
        FIND.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        FIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINDActionPerformed(evt);
            }
        });
        jPanel1.add(FIND, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 110, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("NAME OF ITEM");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("PRICE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel11.setText("SUPPLIED BY;");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("CATEGORY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        BACK.setBackground(new java.awt.Color(255, 51, 0));
        BACK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BACK.setText("LOGOUT");
        BACK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 140, 50));

        jLabel19.setFont(new java.awt.Font("Viner Hand ITC", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 255, 255));
        jLabel19.setText("Developed by ; Ssebakumba Martin");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 680, 390, 30));

        jSeparator8.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 550, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("QUANTITY");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        SUPLIER.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SUPLIER.setForeground(new java.awt.Color(255, 0, 204));
        SUPLIER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        jPanel1.add(SUPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 320, 60));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel8.setText("SCAN BAR CODE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 0, 51));
        jLabel23.setText("Stock details");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 390, 10));

        jSeparator10.setForeground(new java.awt.Color(204, 0, 0));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 10, 690));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAME2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NAME2.setForeground(new java.awt.Color(0, 204, 0));
        NAME2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel3.add(NAME2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 380, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ITEM ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 40));

        QNTY.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        QNTY.setForeground(new java.awt.Color(0, 204, 0));
        QNTY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        QNTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QNTYKeyTyped(evt);
            }
        });
        jPanel3.add(QNTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 380, 80));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("QUANTITY");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 51));
        jLabel25.setText("Customer's order");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 310, 40));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 580, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AMOUNT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AMOUNT.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 350, 60));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 51));
        jLabel22.setText("Bills");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("CASH");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("AMOUNT");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("CHANGE");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 50));

        EVALUTE.setBackground(new java.awt.Color(204, 255, 255));
        EVALUTE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EVALUTE.setText("EVALUATE");
        EVALUTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVALUTEActionPerformed(evt);
            }
        });
        jPanel4.add(EVALUTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, 50));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 120, 50));

        ADDTOCART.setBackground(new java.awt.Color(204, 204, 204));
        ADDTOCART.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADDTOCART.setText("ADD TO CART");
        ADDTOCART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTOCARTActionPerformed(evt);
            }
        });
        jPanel4.add(ADDTOCART, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 50));

        CASH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CASH.setForeground(new java.awt.Color(51, 0, 51));
        CASH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASHActionPerformed(evt);
            }
        });
        CASH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CASHKeyPressed(evt);
            }
        });
        jPanel4.add(CASH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 46, 350, -1));

        CHANGE.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CHANGE.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(CHANGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 350, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 590, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1180, 720));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 102));
        jTextField1.setText("ENGMARTIN001");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 52, 230, -1));

        TELLER.setEditable(false);
        TELLER.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TELLER.setForeground(new java.awt.Color(102, 0, 102));
        TELLER.setText("  001");
        TELLER.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(TELLER, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 90, 30));

        minimise.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimise.setText("Minimise");
        minimise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimiseActionPerformed(evt);
            }
        });
        jPanel2.add(minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 10, 110, 40));

        shutdown.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        shutdown.setText("SHUTDOWN");
        shutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownActionPerformed(evt);
            }
        });
        jPanel2.add(shutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 140, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("POINT OF SALES");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 300, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("ID :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 51));
        jLabel17.setText("Counter :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 830, 100));

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        receipt.setRows(5);
        receipt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 2, true));
        jScrollPane1.setViewportView(receipt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 130, 400, 720));

        jMenu1.setText("OPTIONS");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("MESSAGES");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("REPORT A PROBLEM");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("REPORT LOW STOCK");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRICEActionPerformed

    private void FINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINDActionPerformed
        // TODO add your handling code here:
        try {
            String code=BARCODE.getText();
            String sql ="select* from ITEM_STORE where BARCODE='"+code+"'";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            if(rst.next()){
                NAME.setText(rst.getString(2));
                NAME2.setText(rst.getString(2));
                PRICE.setText(rst.getString(4));
                CATEGORY.setText(rst.getString(3));
                 QUANTITY.setText(rst.getString(6));
                 SUPLIER.setText(rst.getString(7));
                rst.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid code");
            }
        } catch (Exception e) {
        }
           finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            }              
    }//GEN-LAST:event_FINDActionPerformed

    private void EVALUTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVALUTEActionPerformed
        // TODO add your handling code here:
       
        String s1 =QUANTITY.getText();
        String s2 = QNTY.getText();
        String s3 = PRICE.getText();
        String s4=CASH.getText();
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        int d4 = Integer.parseInt(s3);
        int d5 = Integer.parseInt(s4);
    //Returns the remained quantity
        int d3 = d1-d2;
        
    // checking wether the reqiured is there in the stock
        if(d1<=d2){
           JOptionPane.showMessageDialog(null, "The stock is less than the reqiured Quantity");
        }
        else{
            
            
            
            
            try {
          // total amount to pay
        int totalproductPrice = d2 * d4;
        String t=String.valueOf(totalproductPrice);
        AMOUNT.setText(t);
        AMOUNT.setEditable(false);
        
        // checking wether the cash is greater than the amount to pay
        
        if(d5>totalproductPrice){
         
            // change
        int balance=d5-totalproductPrice;
        String bal=String.valueOf(balance);
        CHANGE.setText(bal);
        CHANGE.setEditable(false);
    //***********************SUPERMARKET SOLD ITEMS************************************************************

            String sql= "Insert into SOLD_ITEMS(BARCODE,NAMEOF_PRODUCT,AMOUNT,TOTAL_AMOUNT,CASH_BROUGHT,CHANGE_GIVEN,QUANTITY,DATE,TIME,TELLER) values(?,?,?,?,?,?,?,?,?,?)";
            pst= conn.prepareStatement(sql);
            pst.setString(1,BARCODE.getText());
            pst.setString(2,NAME.getText());
            pst.setString(3, PRICE.getText());
            pst.setString(4, AMOUNT.getText());
            pst.setString(5, CASH.getText());
            pst.setString(6, CHANGE.getText());
            pst.setString(7,QNTY.getText());
            pst.setString(8, DATE.getText());
            pst.setString(9,TIME.getText());
              pst.setString(10,TELLER.getText());
            pst.execute();
             rst.close();
             pst.close();
  /////////////////updating the item_store table////////////////////////
        try {
             String code_id = BARCODE.getText();
            String quanty = QUANTITY.getText();
            String sold_no = QNTY.getText();

            int quantity_before_selling = Integer.parseInt(quanty);
            int sold_quantity = Integer.parseInt(sold_no);

            int REMAINDER_IN_STORE = quantity_before_selling-sold_quantity;
            
            String update = "update ITEM_STORE set QUANTITY ='"+REMAINDER_IN_STORE+"'where BARCODE ='"+code_id+"'";

            pst = conn.prepareStatement(update);
            pst.execute();
            
            rst.close();
            pst.close();

        Update_table();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
        }
        
        }
        else{
           JOptionPane.showMessageDialog(null, "Your cash is less");
        }  
    
///////////////////////////////////////////////////////////////////////////////////////////////////////
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            }              
         receipt.setText("        MARTEX SUPERMARKET"+"\n"+
           "      P.OBox 1113-KAMPALA_Uganda" +"\n"+
            "  Email: martinsseba3@gmail.com"+"\n"+
            "  Tel: 0700562982/0776121843"+"\n\n"+
            "                SALES RECIEPT  "+"\n\n"+
            "ITEM "+"\t"+"QNTY "+"\t"+"PRICE"+"\t"+"TOTAL"+"\n\n"+
            NAME2.getText()+"\t"+QNTY.getText()+"\t"+PRICE.getText()+"\t"+AMOUNT.getText()+"\n\n\n\n\n\n\n"+
                 "GRAND TOTAL: .........."+AMOUNT.getText()+"\n\n"+
                 "CASH  : .........................."+CASH.getText()+"\n\n"+
                 "                         "+"CHANGE: ...."+CHANGE.getText()
                 
    );
         JOptionPane.showMessageDialog(null, "THANK YOU; WELLDONE");
 clear();
        }
    
    }//GEN-LAST:event_EVALUTEActionPerformed

    private void ADDTOCARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTOCARTActionPerformed
        // TODO add your handling code here:
        String item=NAME2.getText();
        String price=PRICE.getText();
        String quantity=QNTY.getText();
        
    }//GEN-LAST:event_ADDTOCARTActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LOGIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void QNTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QNTYKeyTyped
      char c=evt.getKeyChar();
       if(!(Character.isDigit(c)))
           evt.consume();        
    }//GEN-LAST:event_QNTYKeyTyped

    private void BARCODEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BARCODEKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
          try {
            String code=BARCODE.getText();
            String sql ="select* from ITEM_STORE where BARCODE='"+code+"'";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            if(rst.next()){
                NAME.setText(rst.getString(2));
                NAME2.setText(rst.getString(2));
                PRICE.setText(rst.getString(4));
                CATEGORY.setText(rst.getString(3));
                 QUANTITY.setText(rst.getString(6));
                  SUPLIER.setText(rst.getString(7));
                rst.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid code");
            }
        } catch (Exception e) {
        }
           finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            }                
        }
    }//GEN-LAST:event_BARCODEKeyPressed

    private void shutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownActionPerformed
        // TODO add your handling code here:
          Runtime rt=Runtime.getRuntime();
        try {
     // to wait we add
          //wait(20);
          Process proc=rt.exec("shutdown -s -t 0");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_shutdownActionPerformed

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        setState(SALES.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            receipt.print();
        } catch (Exception e) {
        }
        /*
        
       
        */
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void CASHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CASHKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){
        String s1 =QUANTITY.getText();
        String s2 = QNTY.getText();
        String s3 = PRICE.getText();
        String s4=CASH.getText();
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        int d4 = Integer.parseInt(s3);
        int d5 = Integer.parseInt(s4);
    //Returns the remained quantity
        int d3 = d1-d2;
        
    // checking wether the reqiured is there in the stock
        if(d1<=d2){
           JOptionPane.showMessageDialog(null, "The stock is less than the reqiured Quantity");
        }
        else{
            try {
          // total amount to pay
        int totalproductPrice = d2 * d4;
        String t=String.valueOf(totalproductPrice);
        AMOUNT.setText(t);
        AMOUNT.setEditable(false);
    // change
        int balance=d5-totalproductPrice;
        String bal=String.valueOf(balance);
        CHANGE.setText(bal);
        CHANGE.setEditable(false);
    //***********************SUPERMARKET SOLD ITEMS************************************************************

            String sql= "Insert into SOLD_ITEMS(BARCODE,NAMEOF_PRODUCT,AMOUNT,TOTAL_AMOUNT,CASH_BROUGHT,CHANGE_GIVEN,QUANTITY,DATE,TIME,TELLER) values(?,?,?,?,?,?,?,?,?,?)";
            pst= conn.prepareStatement(sql);
            pst.setString(1,BARCODE.getText());
            pst.setString(2,NAME.getText());
            pst.setString(3, PRICE.getText());
            pst.setString(4, AMOUNT.getText());
            pst.setString(5, CASH.getText());
            pst.setString(6, CHANGE.getText());
            pst.setString(7,QNTY.getText());
            pst.setString(8, DATE.getText());
            pst.setString(9,TIME.getText());
              pst.setString(10,TELLER.getText());
            pst.execute();
             rst.close();
             pst.close();
  /////////////////updating the item_store table////////////////////////
        try {
             String code_id = BARCODE.getText();
            String quanty = QUANTITY.getText();
            String sold_no = QNTY.getText();

            int quantity_before_selling = Integer.parseInt(quanty);
            int sold_quantity = Integer.parseInt(sold_no);

            int REMAINDER_IN_STORE = quantity_before_selling-sold_quantity;
            
            String update = "update ITEM_STORE set QUANTITY ='"+REMAINDER_IN_STORE+"'where BARCODE ='"+code_id+"'";

            pst = conn.prepareStatement(update);
            pst.execute();
            
            rst.close();
            pst.close();
            
        Update_table();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
        }
        
///////////////////////////////////////////////////////////////////////////////////////////////////////
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
            rst.close();
            pst.close();
            }
            catch(Exception e){} 
            }              
        
         receipt.setText("        MARTEX SUPERMARKET"+"\n"+
           "      P.OBox 1113-KAMPALA_Uganda" +"\n"+
            "  Email: martinsseba3@gmail.com"+"\n"+
            "  Tel: 0700562982/0776121843"+"\n\n"+
            "                SALES RECIEPT  "+"\n\n"+
            "ITEM "+"\t"+"QNTY "+"\t"+"PRICE"+"\t"+"TOTAL"+"\n\n"+
            NAME2.getText()+"\t"+QNTY.getText()+"\t"+PRICE.getText()+"\t"+AMOUNT.getText()+"\n\n\n\n\n\n\n"+
                 "GRAND TOTAL: .........."+AMOUNT.getText()+"\n\n"+
                 "CASH  : .........................."+CASH.getText()+"\n\n"+
                 "                         "+"CHANGE: ...."+CHANGE.getText()
                 
    );  
       

        

        }
    JOptionPane.showMessageDialog(null, "THANK YOU; WELLDONE");
    clear();
        }
    }//GEN-LAST:event_CASHKeyPressed

    private void CASHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CASHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CASHActionPerformed

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
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTOCART;
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField BARCODE;
    private javax.swing.JTextField CASH;
    private javax.swing.JTextField CATEGORY;
    private javax.swing.JTextField CHANGE;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton EVALUTE;
    private javax.swing.JButton FIND;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField NAME2;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QNTY;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JTextField SUPLIER;
    private javax.swing.JTextField TELLER;
    private javax.swing.JTextField TIME;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minimise;
    private javax.swing.JTextArea receipt;
    private javax.swing.JButton shutdown;
    // End of variables declaration//GEN-END:variables
}
