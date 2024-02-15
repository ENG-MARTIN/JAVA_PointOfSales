
package SUPERMARKET;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ADD_ITEM extends javax.swing.JFrame {
PreparedStatement pst;
Connection conn;
ResultSet rst;
   
    public ADD_ITEM() {
        this.setUndecorated(true);
        this.setExtendedState(ADD_ITEM.MAXIMIZED_BOTH);
        initComponents();
        conn=CONNECTION.connetsqlite();
        Update_table();
        this.setExtendedState(ADD_ITEM.MAXIMIZED_BOTH);
    }

    private void  Update_table(){
        try{
    String sql = "select * from ITEM_STORE";
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
     //tblBarcode.setModel(DbUtils.resultSetToTableModel(rst));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    finally{
        try{
          
            rst.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   }
       public void clear(){
    barcodeTxt.setText("");
     NAME.setText("");
      QUANTITY.setText("");
       PRICE.setText("");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        CLOSE = new javax.swing.JMenuItem();
        PREVIOUS = new javax.swing.JMenuItem();
        MINIMISE = new javax.swing.JMenuItem();
        ADVANCED = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DELETE = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        RENAME = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        UPDATE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CATEGORY = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        STOCK_AMNT = new javax.swing.JTextField();
        QUANTITY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        SUPPLIER = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TABLE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        barcodeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        minimise = new javax.swing.JButton();
        shutdown = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPopupMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CLOSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 51, 51));
        CLOSE.setText("Close");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPopupMenu1.add(CLOSE);

        PREVIOUS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PREVIOUS.setForeground(new java.awt.Color(0, 51, 204));
        PREVIOUS.setText("Back");
        PREVIOUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUSActionPerformed(evt);
            }
        });
        jPopupMenu1.add(PREVIOUS);

        MINIMISE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MINIMISE.setForeground(new java.awt.Color(51, 204, 0));
        MINIMISE.setText("Minimise");
        MINIMISE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINIMISEActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MINIMISE);

        ADVANCED.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADVANCED.setForeground(new java.awt.Color(204, 0, 204));
        ADVANCED.setText("Advanced");
        ADVANCED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADVANCEDActionPerformed(evt);
            }
        });
        jPopupMenu1.add(ADVANCED);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, null));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DELETE.setBackground(new java.awt.Color(153, 153, 255));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DELETE.setForeground(new java.awt.Color(153, 0, 0));
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_delete_graph_report_30px.png"))); // NOI18N
        DELETE.setText("DELETE ITEM");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel2.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 60));

        SAVE.setBackground(new java.awt.Color(204, 204, 204));
        SAVE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SAVE.setForeground(new java.awt.Color(0, 153, 0));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_save_as_30px.png"))); // NOI18N
        SAVE.setText("SAVE ITEM");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        jPanel2.add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 60));

        RENAME.setBackground(new java.awt.Color(204, 204, 255));
        RENAME.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RENAME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_rename_50px.png"))); // NOI18N
        RENAME.setText("RENAME ");
        RENAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RENAMEActionPerformed(evt);
            }
        });
        jPanel2.add(RENAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 70));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_lightning_bolt_30px.png"))); // NOI18N
        jLabel3.setText("COMMANDS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, 10));

        UPDATE.setBackground(new java.awt.Color(204, 255, 204));
        UPDATE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UPDATE.setText("UPDATE ITEM");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel2.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 260, 550));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("NAME OF THE ITEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PRICE TO SELL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        CATEGORY.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        CATEGORY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SPICES", "SNACK", "LAUNDRY", "MECHANICS", "CONSTRUCTION", "BEDDINGS", "SCHOOL MATERIAL", "KITCHEN WARE", "ELECTRONICS" }));
        jPanel1.add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 290, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("DATE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 40));

        jPanel1.add(STOCK_AMNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 290, 70));

        jPanel1.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 290, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUANTITY STOCKED");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 30));

        NAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255)));
        jPanel1.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 60));

        jPanel1.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 290, 60));

        BACK.setBackground(new java.awt.Color(51, 0, 51));
        BACK.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        BACK.setForeground(new java.awt.Color(0, 102, 102));
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_logout_rounded_left_30px.png"))); // NOI18N
        BACK.setText("LOGOUT");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 200, -1));

        SUPPLIER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SUPPLIER.setForeground(new java.awt.Color(51, 153, 255));
        SUPPLIER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.Kasolo", "Mr.Kaggwa", "M&R Suppliers", "D.K Events", "Producer", "Coca cola", "Pepsi", " " }));
        SUPPLIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUPPLIERActionPerformed(evt);
            }
        });
        jPanel1.add(SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 290, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("STOCKED AT ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Supplied by ;");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 160, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("CATEGORY");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 40));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        TABLE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setBackground(new java.awt.Color(204, 204, 204));
        details.setBorder(new javax.swing.border.MatteBorder(null));
        details.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "SUPLLIER", "COST", "TOTAL"
            }
        ));
        details.setGridColor(new java.awt.Color(0, 255, 0));
        details.setSelectionForeground(new java.awt.Color(204, 51, 0));
        jScrollPane1.setViewportView(details);

        TABLE.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 670, 330));

        jTabbedPane1.addTab("IN TABLE", TABLE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Search by Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Search by Barcode");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        code.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        code.setForeground(new java.awt.Color(255, 0, 204));
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });
        jPanel5.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 270, 50));

        name2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("LAST  STOCK :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("MAXIMUM DATE :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("SUPLLIERS' CONTACT :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("QUANTITY :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 230, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 204));
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 230, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 204));
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 230, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_phone_40px.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 50, 50));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_whatsapp_32px.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 40, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_whatsapp_32px.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 60, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/icons8_whatsapp_32px.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 50, 50));

        jTabbedPane1.addTab("CHECK STOCK", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 670, 620));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1570, 700));

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jButton1.setText("READ BARCODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 220, 50));

        barcodeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barcodeTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, null));
        barcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTxtActionPerformed(evt);
            }
        });
        barcodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeTxtKeyPressed(evt);
            }
        });
        jPanel3.add(barcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 300, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUPERMARKET/FULL LOGO.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 290, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("FOR ADMIN USE ONLY");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 450, 40));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 760, 10));

        minimise.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimise.setText("Minimise");
        minimise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimiseActionPerformed(evt);
            }
        });
        jPanel3.add(minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, 40));

        shutdown.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        shutdown.setText("CLOSE");
        shutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownActionPerformed(evt);
            }
        });
        jPanel3.add(shutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, 100, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1590, 870));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
       /* if(barcodeTxt.getText()==""){
              JOptionPane.showConfirmDialog(null, "THERE IS AN INVALID FIELD PLEASE CHECK!!");
            if(NAME.getText()==""){
                  JOptionPane.showConfirmDialog(null, "THERE IS AN INVALID FIELD PLEASE CHECK!!");
                if(QUANTITY.getText()==""){
                      JOptionPane.showConfirmDialog(null, "THERE IS AN INVALID FIELD PLEASE CHECK!!");
                    if(PRICE.getText()==""){
                        JOptionPane.showConfirmDialog(null, "THERE IS AN INVALID FIELD PLEASE CHECK!!");
                    }
            }
        }}
        else{
             */
       try{
            String sql= "Insert into ITEM_STORE (BARCODE,NAME,CATEGORY,PRICE,DATE,QUANTITY,SUPPLIER) values(?,?,?,?,?,?,?)";
            pst= conn.prepareStatement(sql);
            pst.setString(1,barcodeTxt.getText());
            pst.setString(2,NAME.getText());
            pst.setString(3, CATEGORY.getSelectedItem().toString());
            pst.setString(4, PRICE.getText());
            pst.setString(5, DATE.getDate().toString());
            pst.setString(6,QUANTITY.getText());
            pst.setString(7, SUPPLIER.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Successful");
            details.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();

        clear();  
    }                                   

    private void RenameActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try{
            String value1 = barcodeTxt.getText();
            String value2 = NAME.getText();
            String value3 = QUANTITY.getText();
            String value4 = PRICE.getText();

            String sql= "update ITEM_STORE set NAME ='"+value2+"', QUANTITY='"+value3+"',PRICE='"+value4+"' where BARCODE='"+value1+"' ";

            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Renamed");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
        clear();

    }//GEN-LAST:event_SAVEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void RENAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RENAMEActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RENAMEActionPerformed

    private void barcodeTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeTxtKeyPressed
        // TODO add your handling code here:
                String sb = barcodeTxt.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            JOptionPane.showMessageDialog(null, "barcode studied as:"+sb);
            NAME.requestFocus();
        }
        
    }//GEN-LAST:event_barcodeTxtKeyPressed

    private void barcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LOGIN().setVisible(true);
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void PREVIOUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUSActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new LOGIN().setVisible(true);
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_PREVIOUSActionPerformed

    private void MINIMISEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINIMISEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MINIMISEActionPerformed

    private void ADVANCEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADVANCEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADVANCEDActionPerformed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            jPopupMenu1.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jPanel3MouseReleased

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
         try{
            String value1 = barcodeTxt.getText();
            String value2 = NAME.getText();
            String value3 = QUANTITY.getText();
            String value4 = PRICE.getText();

            String sql= "update ITEM_STORE set QUANTITY='"+value3+"',PRICE='"+value4+"' where BARCODE='"+value1+"' ";

            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"ITEM UPDATED ONLY BY QUANTITY AND PRICE");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
        clear();

    }//GEN-LAST:event_UPDATEActionPerformed

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        setState(SALES.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

    private void shutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownActionPerformed
        // TODO add your handling code here:
       System.exit(WIDTH);
    }//GEN-LAST:event_shutdownActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "+256 700562982");
        JOptionPane.showMessageDialog(null, "this is the contact +256 700562982", "WHATSAPP CONTACT", HEIGHT);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "this is the contact +256 700562982", "WHATSAPP CONTACT", HEIGHT);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void SUPPLIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUPPLIERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUPPLIERActionPerformed

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
        }
    }//GEN-LAST:event_codeKeyPressed

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
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_ITEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ADVANCED;
    private javax.swing.JButton BACK;
    private javax.swing.JComboBox<String> CATEGORY;
    private javax.swing.JMenuItem CLOSE;
    private javax.swing.JButton DELETE;
    private javax.swing.JMenuItem MINIMISE;
    private javax.swing.JTextField NAME;
    private javax.swing.JMenuItem PREVIOUS;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JButton RENAME;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField STOCK_AMNT;
    private javax.swing.JComboBox<String> SUPPLIER;
    private javax.swing.JPanel TABLE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JTextField code;
    private javax.swing.JTable details;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton minimise;
    private javax.swing.JTextField name2;
    private javax.swing.JButton shutdown;
    // End of variables declaration//GEN-END:variables
}
