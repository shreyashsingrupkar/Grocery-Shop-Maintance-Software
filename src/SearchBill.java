

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreyash
 */
public class SearchBill extends javax.swing.JInternalFrame {

      
    ConnectionDatabase db=new ConnectionDatabase();
    Connection con;
    PreparedStatement stmt;
    Statement st;
    ResultSet rs;
    
    
   
    String billnum;
   
    DefaultListModel dm=new DefaultListModel();
    static int getselectedrow;
    String selectedrow="";
    float getDiscount1_onclick;
    float getSubTotal_onclick;
    float getquantity_onclick;
   
    
    
    public SearchBill() {
        initComponents();
        CusIDTF.setEnabled(false);
        CusNameTF.setEnabled(false);
        BillDateTF.setEnabled(false);
        CusAddrTF.setEnabled(false);
        CusMobTF.setEnabled(false);
        GstNoTF.setEnabled(false);
        CusIDTF.setDisabledTextColor(Color.black);
        CusNameTF.setDisabledTextColor(Color.black);
        BillDateTF.setDisabledTextColor(Color.black);
        CusAddrTF.setDisabledTextColor(Color.black);
        CusMobTF.setDisabledTextColor(Color.black);
        GstNoTF.setDisabledTextColor(Color.black);
        BillDateTF.setEnabled(false);
        BillDateTF.setDisabledTextColor(Color.black);
        GstNoTF.setText("GST123456789");
        DiscountTF1.setEnabled(false);
        DiscountTF1.setDisabledTextColor(Color.black);
        DiscountTF2.setEnabled(false);
        DiscountTF2.setDisabledTextColor(Color.black);
        ItemNameTF.setEnabled(false);
        ItemNameTF.setDisabledTextColor(Color.black);
        ItemPriceTF.setEnabled(false);
        ItemPriceTF.setDisabledTextColor(Color.black);
        SubTotalTF.setEnabled(false);
        SubTotalTF.setDisabledTextColor(Color.black);
        TotalTF.setEnabled(false);
        TotalTF.setDisabledTextColor(Color.black);
        GrandTotalTF.setEnabled(false);
        GrandTotalTF.setDisabledTextColor(Color.black);
        BalanceTF.setEnabled(false);
        BalanceTF.setDisabledTextColor(Color.black);

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CusNameTF = new javax.swing.JTextField();
        CusMobTF = new javax.swing.JTextField();
        BillDateTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusAddrTF = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        GstNoTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CusIDTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ItemIDTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ItemNameTF = new javax.swing.JTextField();
        ItemPriceTF = new javax.swing.JTextField();
        DiscountTF1 = new javax.swing.JTextField();
        QuantityTF = new javax.swing.JTextField();
        SubTotalTF = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TotalTF = new javax.swing.JTextField();
        AmountPaidTF = new javax.swing.JTextField();
        DiscountTF2 = new javax.swing.JTextField();
        BalanceTF = new javax.swing.JTextField();
        GrandTotalTF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        PTITF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BillNoTF = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Search Bill");

        jPanel2.setBackground(new java.awt.Color(208, 211, 212));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Customer Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mobile No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bill Date");

        CusNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CusMobTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BillDateTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CusAddrTF.setColumns(20);
        CusAddrTF.setRows(5);
        CusAddrTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(CusAddrTF);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Shop GST No");

        GstNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Coustmer ID");

        CusIDTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel18))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(CusIDTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GstNoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(BillDateTF))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BillDateTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CusIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GstNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        jPanel4.setBackground(new java.awt.Color(208, 211, 212));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("         Item ID");

        ItemIDTF.setBackground(new java.awt.Color(84, 153, 199));
        ItemIDTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ItemIDTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemIDTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemIDTFKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("                   Item Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("       Item Price");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("      Quantity");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("         Discount");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("           Total");

        ItemNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ItemPriceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DiscountTF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        QuantityTF.setBackground(new java.awt.Color(133, 193, 233));
        QuantityTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityTFKeyReleased(evt);
            }
        });

        SubTotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AddButton.setBackground(new java.awt.Color(241, 196, 15));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(241, 196, 15));
        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(241, 196, 15));
        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DiscountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(QuantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(SubTotalTF))
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveButton)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubTotalTF)
                    .addComponent(QuantityTF)
                    .addComponent(DiscountTF1)
                    .addComponent(ItemPriceTF)
                    .addComponent(ItemNameTF)
                    .addComponent(ItemIDTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(208, 211, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Total");

        jLabel13.setBackground(new java.awt.Color(208, 211, 212));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Discount");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Grand Total");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Amount Paid");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Balance");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Payment Mode");

        ClearButton.setBackground(new java.awt.Color(241, 196, 15));
        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        PrintButton.setBackground(new java.awt.Color(241, 196, 15));
        PrintButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PrintButton.setText("Print & Update");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "UPI", "Internet Banking", "Debit Card", "Credit Card" }));

        TotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AmountPaidTF.setBackground(new java.awt.Color(133, 193, 233));
        AmountPaidTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AmountPaidTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmountPaidTFKeyReleased(evt);
            }
        });

        DiscountTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BalanceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GrandTotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Payment Transiction Id");

        PTITF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TotalTF)
                        .addComponent(DiscountTF2)
                        .addComponent(GrandTotalTF)
                        .addComponent(BalanceTF)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AmountPaidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTITF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(PrintButton)
                        .addGap(27, 27, 27)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalTF, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiscountTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GrandTotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountPaidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BalanceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTITF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No", "Item Id", "Item Name", "Item Price", "Discount", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Search Bill");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Enter Bill Number");

        BillNoTF.setBackground(new java.awt.Color(84, 153, 199));
        BillNoTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BillNoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BillNoTFKeyReleased(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(241, 196, 15));
        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(20, 20, 20)
                .addComponent(BillNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(702, 702, 702))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(208, 211, 212));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void BillNoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BillNoTFKeyReleased
     
    }//GEN-LAST:event_BillNoTFKeyReleased

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
                    
        String cusname, itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        cusname=CusNameTF.getText();
        itemid=ItemIDTF.getText();
        itemname=ItemNameTF.getText();
        itemprice=ItemPriceTF.getText();
        quantity=QuantityTF.getText();
        discount1=DiscountTF1.getText();
        discount2=DiscountTF2.getText();
        subtotal=SubTotalTF.getText();
        String gettotal=TotalTF.getText(); 
      
      
        
        if(!cusname.isEmpty()&&!itemid.isEmpty()&&!itemname.isEmpty()&&!itemprice.isEmpty()&&!quantity.isEmpty()&&!discount1.isEmpty()&&!subtotal.isEmpty()&&!gettotal.isEmpty()){
            DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
            float dc=0,getdc1,getdc2;
             float subt=Float.parseFloat(subtotal);
            float ip=Float.parseFloat(itemprice);
            int qt=Integer.parseInt(quantity);
            float gett=0;
            getdc1=Float.parseFloat(discount1);
            getdc2=Float.parseFloat(discount2);
            dc=(getdc1*qt)+getdc2;  
           
            gett=Float.parseFloat(gettotal);
            float newtotal=gett+(ip*qt);
            String grandtotal;
            int getsrnum=jTable1.getRowCount();
            int setsrnum=getsrnum+1;
         
         
         
            Vector v=new Vector();
            for(int i=1;i<=7;i++){
                v.add(setsrnum);
                v.add(itemid);
                v.add(itemname);
                v.add(itemprice);
                v.add(discount1);
                v.add(quantity);
                v.add(subtotal);
             }
            df.addRow(v);  
            TotalTF.setText(String.valueOf(newtotal));
            DiscountTF2.setText(String.valueOf(dc));
            float gtotal=newtotal-dc;
            GrandTotalTF.setText(String.valueOf(gtotal));
        
            ip=0;
            gett=0;
            newtotal=0;
            dc=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            DiscountTF1.setText("");
            QuantityTF.setText("");
            SubTotalTF.setText("");
            BalanceTF.setText("");
            AmountPaidTF.setText("");
        }else{
             JOptionPane.showMessageDialog(this,"Some Fields Are Empty");
        }
         

    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        
        itemid=ItemIDTF.getText();
        itemname=ItemNameTF.getText();
        itemprice=ItemPriceTF.getText();
        quantity=QuantityTF.getText();
        discount1=DiscountTF1.getText();
        discount2=DiscountTF2.getText();
        subtotal=SubTotalTF.getText();
        String gettotal=TotalTF.getText(); 
        
      
        if(!(getselectedrow<0)&&!selectedrow.isEmpty()&&!itemid.isEmpty()&&!itemname.isEmpty()&&!itemprice.isEmpty()&&!quantity.isEmpty()&&!discount1.isEmpty()&&!subtotal.isEmpty()&&!gettotal.isEmpty()){
           
            DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        
            dt.removeRow(getselectedrow);  
            int c=jTable1.getRowCount();
            int srnum=Integer.parseInt(selectedrow)+1;
           
        
            
            float dc2=0,getdc1,getdc2,gett=0;
             int qt=Integer.parseInt(quantity);
            float subt=Float.parseFloat(subtotal);
            float ip=Float.parseFloat(itemprice);
            
            
            gett=Float.parseFloat(gettotal);
            System.out.println(gett);
            
            getdc1=Float.parseFloat(discount1);
            getdc2=Float.parseFloat(discount2);
            
            getdc2=getdc2-(getDiscount1_onclick*getquantity_onclick);
            
            gett=gett-(getSubTotal_onclick+(getDiscount1_onclick*getquantity_onclick));
            
            System.out.println(gett);
            getDiscount1_onclick=0;
            getSubTotal_onclick=0;
            getquantity_onclick=0;
            
            dc2=(getdc1*qt)+getdc2; 
           
            float newtotal=gett+(ip*qt);
            String grandtotal;
           
            Vector v=new Vector();
            for(int i=1;i<=7;i++){
                v.add(srnum);
                v.add(itemid);
                v.add(itemname);
                v.add(itemprice);
                v.add(discount1);
                v.add(quantity);
                v.add(subtotal);
             }
            dt.insertRow(getselectedrow, v);
            
            TotalTF.setText(String.valueOf(newtotal));
            DiscountTF2.setText(String.valueOf(dc2));
            float gtotal=newtotal-dc2;
            GrandTotalTF.setText(String.valueOf(gtotal));
        
            ip=0;
            gett=0;
            newtotal=0;
            dc2=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            DiscountTF1.setText("");
            QuantityTF.setText("");
            SubTotalTF.setText("");
            BalanceTF.setText("");
            AmountPaidTF.setText("");
            getselectedrow=-1;
            selectedrow="";
            AddButton.setEnabled(true);
            
        }else{
             JOptionPane.showMessageDialog(this,"Update Error");
        }
        
         
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
         String itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        
       
        if(!(getselectedrow<0)&&!selectedrow.isEmpty()){
            itemid=ItemIDTF.getText();
            itemname=ItemNameTF.getText();
            itemprice=ItemPriceTF.getText();
            quantity=QuantityTF.getText();
            discount1=DiscountTF2.getText();
            discount2=DiscountTF2.getText();
            subtotal=SubTotalTF.getText();
            String gettotal=TotalTF.getText(); 
            DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
            dt.removeRow(getselectedrow);  
            int c=dt.getRowCount();
            
            float dc2=0,getdc1=0,getdc2,gett=0;
            int qt=Integer.parseInt(quantity);
            float subt=Float.parseFloat(subtotal);
            float ip=Float.parseFloat(itemprice);
            gett=Float.parseFloat(gettotal);
            System.out.println(gett);
            dc2=Float.parseFloat(discount2);
            dc2=dc2-(getDiscount1_onclick*getquantity_onclick);
            gett=gett-(getSubTotal_onclick+(getDiscount1_onclick*getquantity_onclick));
            System.out.println(gett);
            getDiscount1_onclick=0;
            getSubTotal_onclick=0;
            getquantity_onclick=0;
            float newtotal=gett;
            String grandtotal;
            TotalTF.setText(String.valueOf(newtotal));
            DiscountTF2.setText(String.valueOf(dc2));
            float gtotal=newtotal-dc2;
            GrandTotalTF.setText(String.valueOf(gtotal));
            ip=0;
            gett=0;
            newtotal=0;
            dc2=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            DiscountTF1.setText("");
            QuantityTF.setText("");
            SubTotalTF.setText("");
            for(int i=0;i<c;i++){
                dt.setValueAt(i+1,i, 0);
            }
            getselectedrow=-1;
            selectedrow="";
            AddButton.setEnabled(true);
            
         }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        BillNoTF.setText("");
         CusIDTF.setText("");
        CusNameTF.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        ItemIDTF.setText(""); 
        ItemNameTF.setText("");
        ItemPriceTF.setText("");
        DiscountTF1.setText("");
        QuantityTF.setText("");
        SubTotalTF.setText("");
        TotalTF.setText("0");
        DiscountTF2.setText("0");
        GrandTotalTF.setText("");
       
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        
        int row=jTable1.getRowCount();
        int coloumn=jTable1.getColumnCount();
        for(int i=row-1;i>=0;i--){
                dt.removeRow(i);  
        }
                
        
        AmountPaidTF.setText("");
        BalanceTF.setText("");
        PTITF.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AmountPaidTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountPaidTFKeyReleased
         BalanceTF.setText("");
        String grandtotal=GrandTotalTF.getText();
        String amount=AmountPaidTF.getText();
        if(!grandtotal.isEmpty()){
            
            boolean res= onlyDigit(amount);
            if(res==true){
            
            float gtotal=Float.parseFloat(grandtotal);
            float amt=Float.parseFloat(amount);
            if(!(amt>gtotal)){
                float balance=gtotal-amt;
                BalanceTF.setText(String.valueOf(balance)); 
            }
            else if(amt<0){
                    BalanceTF.setText("");
                    AmountPaidTF.setText("");
                }
                else{  
                    JOptionPane.showMessageDialog(this,"Amout Should Be Less Than Or Equal To Grand Total");
                    BalanceTF.setText("");
                    AmountPaidTF.setText("");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Some Fields Are Empty");
            AmountPaidTF.setText("");       
        }
    }//GEN-LAST:event_AmountPaidTFKeyReleased

     public boolean onlyDigit( String quantity ){
        for(int i=0;i<quantity.length();i++){
            if(quantity.charAt(i) >= '0'&& quantity.charAt(i) <= '9'){
                 return true;
            }
            else{
                 return false;
            }
        }
        return false;
    }
    
    
    private void QuantityTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityTFKeyReleased
         String quantity,itemprice,discount;
        quantity=QuantityTF.getText();
        itemprice=ItemPriceTF.getText();
        discount=DiscountTF1.getText();
        if(!quantity.isEmpty()){
            boolean res= onlyDigit(quantity);
        if(res==true){     
        int  qt;
        float ip,dc,subtotal;
        qt=Integer.parseInt(quantity);
        ip=Float.parseFloat(itemprice);
        dc=Float.parseFloat(discount);
        
        subtotal=qt*(ip-dc);
        SubTotalTF.setText(String.valueOf(subtotal));
         qt=0;
         ip=0;
         dc=0;
         subtotal=0;
        }
        }    
    }//GEN-LAST:event_QuantityTFKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        getselectedrow=jTable1.getSelectedRow();
        selectedrow=String.valueOf(getselectedrow);
        ItemIDTF.setText(dt.getValueAt(getselectedrow, 1).toString()); 
        ItemNameTF.setText(dt.getValueAt(getselectedrow, 2).toString());
        ItemPriceTF.setText(dt.getValueAt(getselectedrow, 3).toString());
        DiscountTF1.setText(dt.getValueAt(getselectedrow, 4).toString());
        QuantityTF.setText(dt.getValueAt(getselectedrow, 5).toString());
        SubTotalTF.setText(dt.getValueAt(getselectedrow, 6).toString()); 
        getDiscount1_onclick=Float.parseFloat(DiscountTF1.getText());
        getquantity_onclick=Integer.parseInt(QuantityTF.getText());
        getSubTotal_onclick=Float.parseFloat(SubTotalTF.getText());
        AddButton.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

      public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =8.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
}
    
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}

public class BillPrintable implements Printable {
 
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

        //    int idPosition=0;
        //    int productPosition=idPosition + idLength + 2;
        //    int pricePosition=productPosition + prodLength +10;
        //    int qtyPosition=pricePosition + priceLength + 2;
        //    int amtPosition=qtyPosition + qtyLength + 2;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            
            ///////////////// Product names Get ///////////
            String billnumber,billdate,cusid,cusname,mobno,gstno,total,totaldiscount,grandtotal,amountpaid,balance,pti,paymentmode;
            String srnum, itemid,itemname,itemprice,itemdicount,quantity,subtotal;
            billnumber=BillNoTF.getText();
            billdate=BillDateTF.getText();
          
            cusname=CusNameTF.getText();
            mobno=CusMobTF.getText();
            gstno=GstNoTF.getText();
            total=TotalTF.getText();
            totaldiscount=DiscountTF2.getText();
            grandtotal=GrandTotalTF.getText();
            paymentmode=jComboBox1.getSelectedItem().toString();
            amountpaid=AmountPaidTF.getText();
            balance=BalanceTF.getText();
            pti=PTITF.getText();
            
            DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
          
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("----------------------------------------",10,y);y+=yShift;
            g2d.drawString("          Grocery Bill Receipt          ",12,y);y+=yShift;
            g2d.drawString("----------------------------------------",10,y);y+=yShift;
            g2d.drawString("GST Number-"+gstno,12,y);y+=yShift;
            
            g2d.drawString("BillNo-"+billnumber+" Date-"+billdate,12,y);y+=yShift;
            g2d.drawString("Customer Name-"+cusname,12,y);y+=yShift;
            g2d.drawString("Mobile No-"+mobno,12,y);y+=yShift;
            g2d.drawString("----------------------------------------",10,y);y+=yShift;
            g2d.drawString("----------------------------------------",10,y);y+=yShift;
            g2d.drawString("sr Id ItemName      Price Dis Qt Subtotal",10,y);y+=yShift;
            g2d.drawString("----------------------------------------",10,y);y+=yShift;
            for(int i=0;i<dt.getRowCount();i++){
                srnum=dt.getValueAt(i, 0).toString();
                itemid=dt.getValueAt(i, 1).toString();
                itemname=dt.getValueAt(i, 2).toString();
                itemprice=dt.getValueAt(i, 3).toString();
                itemdicount=dt.getValueAt(i, 4).toString();
                quantity=dt.getValueAt(i, 5).toString();
                subtotal=dt.getValueAt(i, 6).toString();
                g2d.drawString(""+srnum+"  "+itemid+" "+itemname+" "+itemprice+" "+itemdicount+" "+quantity+"  "+subtotal,10,y);y+=yShift;
                        
            }
             g2d.drawString("----------------------------------------",10,y);y+=yShift;
             g2d.setFont(new Font("Monospaced",Font.BOLD,8));
            g2d.drawString("Total-"+total+"          Discount-"+totaldiscount,10,y);y+=yShift;
            g2d.drawString("Grand Total-"+grandtotal,10,y);y+=yShift;
            g2d.drawString("Payment Mode-" +paymentmode,10,y);y+=yShift;
            g2d.drawString("Paid Amount-"+grandtotal,10,y);y+=yShift;
            g2d.drawString("Balance-"+balance,10,y);y+=yShift;
            g2d.drawString("Transiction Id-"+pti,10,y);y+=yShift;
             g2d.setFont(new Font("Monospaced",Font.PLAIN,8));
            g2d.drawString("---------------------------------------------",10,y);y+=yShift;
            g2d.drawString("             FREE HOME DELIVERY              ",12,y);y+=yShift;
            g2d.drawString("                 9820000000                  ",12,y);y+=yShift; 
            g2d.drawString("*********************************************",12,y);y+=yShift;
            g2d.drawString("           THANKS TO VISIT OUR SHOP          ",12,y);y+=yShift;
            g2d.drawString("*********************************************",12,y);y+=yShift;
           
    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
  
    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
         String billnumber,billdate,cusname,cusaddr,cusmob,total,totaldiscount,grandtotal,amountpaid,balance,pti,paymentmode;
            String itemid,itemprice,itemdicount,quantity,subtotal;
            
            billnumber=BillNoTF.getText();
            billdate=BillDateTF.getText();
            cusname=CusNameTF.getText();
            cusaddr=CusMobTF.getText();
            cusmob=CusMobTF.getText();
            total=TotalTF.getText();   
            totaldiscount=DiscountTF2.getText();
            grandtotal=GrandTotalTF.getText();
            paymentmode=jComboBox1.getSelectedItem().toString();
            amountpaid=AmountPaidTF.getText();
            balance=BalanceTF.getText();
            pti=BillNoTF.getText();
            
            itemid=ItemIDTF.getText();
            quantity=QuantityTF.getText();
     
            if(!billnumber.isEmpty()&& !billdate.isEmpty()&& !cusname.isEmpty()&& !total.isEmpty()&& !grandtotal.isEmpty()&&!amountpaid.isEmpty()&&!balance.isEmpty()){
               
                
                PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                     con=db.DBConnection();
            try {
                
                
                ArrayList<String>itemidlist=new ArrayList();
                ArrayList<String>itempricelist=new ArrayList();
                ArrayList<String>itemdiscountlist=new ArrayList();
                ArrayList<String>itemquantitylist=new ArrayList();
                ArrayList<String>itemsubtotallist=new ArrayList();
              
                DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
              //  String itemidlist[];
                int row=jTable1.getRowCount();
                int coloumn=jTable1.getColumnCount();
                
               
                for(int i=0;i<row;i++){
                    
                     itemidlist.add(dt.getValueAt(i, 1).toString());
                     itempricelist.add(dt.getValueAt(i, 3).toString());
                     itemdiscountlist.add(dt.getValueAt(i, 4).toString());
                     itemquantitylist.add(dt.getValueAt(i, 5).toString());
                     itemsubtotallist.add(dt.getValueAt(i, 6).toString());
                       
                     
                      
                }
                StringBuilder allitemid = new StringBuilder();
                String comma1="";
                for(String id:itemidlist){
                    allitemid.append(comma1);
                    allitemid.append(id);
                    comma1=",";
                }
                StringBuilder allitemprice = new StringBuilder();
                String comma2="";
                for(String price:itempricelist){
                    allitemprice.append(comma2);
                    allitemprice.append(price);
                    comma2=",";
                }
                StringBuilder allitemdiscount = new StringBuilder();
               String comma3="";
                for(String dc:itemdiscountlist){
                    allitemdiscount.append(comma3);
                    allitemdiscount.append(dc);
                    comma3=",";
                }
                StringBuilder allitemquantity = new StringBuilder();
             String comma4="";
                for(String qt:itemquantitylist){
                    allitemquantity.append(comma4);
                    allitemquantity.append(qt);
                    comma4=",";
                }
                StringBuilder allitemsubtotal = new StringBuilder();
               String comma5="";
                for(String st:itemsubtotallist){
                    allitemsubtotal.append(comma5);
                    allitemsubtotal.append(st);
                    comma5=",";
                }
                
                 boolean res=billnumber.startsWith("P");
                 if(res==true){
                     stmt=con.prepareStatement("UPDATE `prime_bill` SET `TOTAL`=?,`DISCOUNT`=?,`GRAND_TOTAL`=?,`PAYMENT_MODE`=?,`AMOUNT_PAID`=?,`BALANCE`=?,`P_T_N`=? WHERE BILL_NUMBER=?");
                stmt.setString(1, total);
                stmt.setString(2, totaldiscount);
                stmt.setString(3, grandtotal);
                stmt.setString(4, paymentmode);
                stmt.setString(5, amountpaid);
                stmt.setString(6, balance);
                stmt.setString(7, pti);
                stmt.setString(8, billnumber);
                
               stmt.executeUpdate();
              
              
              
               stmt=con.prepareStatement("UPDATE `prime_bill_items` SET `ITEM_PRICE`=?,`DISCOUNT`=?,`QUANTITY`=?,`SUB_TOTAL`=? WHERE BILL_NUMBER=?");
                
                
               stmt.setString(1, allitemprice.toString());
                stmt.setString(2, allitemdiscount.toString());
                stmt.setString(3, allitemquantity.toString());
                stmt.setString(4, allitemsubtotal.toString());
                stmt.setString(5, billnumber);
              
               stmt.executeUpdate();
                
                
                
                JOptionPane.showMessageDialog(this,"Items Added Sucdesfully");
               
                     
                 }else{
                     stmt=con.prepareStatement("UPDATE `general_bill` SET `TOTAL`=?,`DISCOUNT`=?,`GRAND_TOTAL`=?,`PAYMENT_MODE`=?,`AMOUNT_PAID`=?,`BALANCE`=?,`P_T_N`=? WHERE BILL_NUMBER=?");
                stmt.setString(1, total);
                stmt.setString(2, totaldiscount);
                stmt.setString(3, grandtotal);
                stmt.setString(4, paymentmode);
                stmt.setString(5, amountpaid);
                stmt.setString(6, balance);
                stmt.setString(7, pti);
                stmt.setString(8, billnumber);
                
               stmt.executeUpdate();
              
              
              
               stmt=con.prepareStatement("UPDATE `general_bill_item` SET `ITEM_PRICE`=?,`DISCOUNT`=?,`QUANTITY`=?,`SUB_TOTAL`=? WHERE BILL_NUMBER=?");
                
                
               stmt.setString(1, allitemprice.toString());
                stmt.setString(2, allitemdiscount.toString());
                stmt.setString(3, allitemquantity.toString());
                stmt.setString(4, allitemsubtotal.toString());
                stmt.setString(5, billnumber);
              
               stmt.executeUpdate();
                
                
                
                JOptionPane.showMessageDialog(this,"Items Added Sucdesfully");
               
                 }
       
                
              
                 pj.print();
                 
                
                
                
                
                
               BillNoTF.setText("");
               BillDateTF.setText("");
                CusNameTF.setText("");
                CusAddrTF.setText("");
                CusMobTF.setText("");
                ItemIDTF.setText(""); 
                ItemNameTF.setText("");
                ItemPriceTF.setText("");
                DiscountTF1.setText("");
                QuantityTF.setText("");
                SubTotalTF.setText("");
                TotalTF.setText("0");
                DiscountTF2.setText("0");
                GrandTotalTF.setText("");
              //  DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        
             //   int row=jTable1.getRowCount();
              //  int coloumn=jTable1.getColumnCount();
                for(int i=row-1;i>=0;i--){
                    dt.removeRow(i);  
                }
                
                AmountPaidTF.setText("");
                BalanceTF.setText("");
                PTITF.setText("");
         
                }
                catch (PrinterException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }else{
                JOptionPane.showMessageDialog(this,"Some Fields Are Empty");

            }
           
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void ItemIDTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemIDTFKeyReleased
        String itemid,itemname,itemprice,discount;
        itemid=ItemIDTF.getText();
        ItemNameTF.setText("");
        ItemPriceTF.setText("");
        DiscountTF1.setText("");
        QuantityTF.setText("");
        SubTotalTF.setText("");
         boolean res= onlyDigit(itemid);
        if(res==true){
             try {
            con=db.DBConnection();           
            String queryselect="SELECT `ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT` FROM `item_table` WHERE ITEM_ID='"+itemid+"'";
            st=con.createStatement();
            rs=st.executeQuery(queryselect);
            if(rs.next()){
                itemname=rs.getString(1);
                itemprice=rs.getString(2);
                discount=rs.getString(3);
                 ItemNameTF.setText(itemname);
                 float dc=Float.parseFloat(discount);
            ItemPriceTF.setText(itemprice);
            DiscountTF1.setText(String.valueOf(dc));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_ItemIDTFKeyReleased

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String cusid="",cusname,billdate,cusaddr,cusmob,total,grandtotal,discount2,amountpaid,balance,pti;
        String itemid,itemname,itemprice,discount1,quantity,subtotal;
        String billnumber=BillNoTF.getText();
        CusIDTF.setText("");
        CusNameTF.setText("");
        BillDateTF.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        CusIDTF.setText("");
        TotalTF.setText("");
        DiscountTF2.setText("");
        GrandTotalTF.setText("");
        AmountPaidTF.setText("");
        BalanceTF.setText("");
        PTITF.setText("");
        itemid=ItemIDTF.getText();
        
        boolean res=billnumber.startsWith("P");
        con=db.DBConnection(); 
        if(!billnumber.isEmpty()){
            
            try {
                   
                if(res==true){
                    String queryselect1="SELECT  `BILL_DATE`, `CUSTOMER_ID`, `TOTAL`, `DISCOUNT`, `GRAND_TOTAL`, `AMOUNT_PAID`, `BALANCE`, `P_T_N` FROM `prime_bill` WHERE BILL_NUMBER='"+billnumber+"'";
                    st=con.createStatement();
                    rs=st.executeQuery(queryselect1);
                    if(rs.next()){
                        billdate=rs.getString(1);
                        cusid=rs.getString(2);
                        total=rs.getString(3);
                        discount2=rs.getString(4);
                        grandtotal=rs.getString(5);
                        amountpaid=rs.getString(6);
                        balance=rs.getString(7);
                        pti=rs.getString(8);
                        BillDateTF.setText(billdate);               
                        CusIDTF.setText(cusid);
                        TotalTF.setText(total);
                        DiscountTF2.setText(discount2);
                        GrandTotalTF.setText(grandtotal);
                        AmountPaidTF.setText(amountpaid);
                        BalanceTF.setText(balance);
                        PTITF.setText(pti);
                    }
                    String cusid1=CusIDTF.getText();
                    if(!cusid1.isEmpty()){
                        String queryselect2="SELECT  `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_MOBILE`FROM `prime_customer` WHERE CUSTOMER_ID='"+cusid1+"'";
                        st=con.createStatement();
                        rs=st.executeQuery(queryselect2);
                        if(rs.next()){
                           cusname=rs.getString(1);
                           cusaddr=rs.getString(2);
                           cusmob=rs.getString(3);
                           CusNameTF.setText(cusname);
                           CusAddrTF.setText(cusaddr);
                           CusMobTF.setText(cusmob);
                        }
                        ArrayList<String>itemidlist=new ArrayList();
                         ArrayList<String>itemnamelist=new ArrayList();
                        ArrayList<String>itempricelist=new ArrayList();
                        ArrayList<String>itemdiscountlist=new ArrayList();
                        ArrayList<String>itemquantitylist=new ArrayList();
                        ArrayList<String>itemsubtotallist=new ArrayList();
                    
                        String queryselect3="SELECT `ITEM_ID`,`ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `QUANTITY`, `SUB_TOTAL` FROM `prime_bill_items`  WHERE BILL_NUMBER='"+billnumber+"'";
                        st=con.createStatement();
                        rs=st.executeQuery(queryselect3);
                    
                        if(rs.next()){
                            itemid=rs.getString(1);
                            for(String id:itemid.split(",")){
                                itemidlist.add(id);
                            }
                         itemname=rs.getString(2);
                        for(String name:itemname.split(",")){
                            itemnamelist.add(name);
                        }
                        
                            itemprice=rs.getString(3);
                            for(String price:itemprice.split(",")){
                                itempricelist.add(price);
                            }
                            discount1=rs.getString(4);
                            for(String dc:discount1.split(",")){
                                itemdiscountlist.add(dc);
                            }
                            quantity=rs.getString(5);
                            for(String qt:quantity.split(",")){
                                itemquantitylist.add(qt);
                            }
                            subtotal=rs.getString(6);
                            for(String st:subtotal.split(",")){
                                itemsubtotallist.add(st);
                            }   
                        }
                        
                        int rowcount=itemidlist.size();
                        int getsrnum=jTable1.getRowCount();
                        int setsrnum=getsrnum+1;
                        DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                        Vector v=new Vector();
                        Object rowData[] = new Object[7];
                        for(int i=0;i<rowcount;i++){
                            
                            rowData[0]=i+1;
                           // System.out.println(setsrnum);
                            rowData[1]=itemidlist.get(i);
                            //v.add(id); 
                            
                            rowData[2]=itemnamelist.get(i);
                          //  v.add(name);
                           // System.out.println(name);
                            
                            rowData[3]=itempricelist.get(i);
                          //  v.add(price); 
                            
                            rowData[4]=itemdiscountlist.get(i);
                            //v.add(dc); 
                            
                           rowData[5]=itemquantitylist.get(i);
                           // v.add(qt); 
                            rowData[6]=itemsubtotallist.get(i);
                           // v.add(st); 
                            df.addRow(rowData);
                              
                       }
                        
                       
                        
                        
                   } 
                    
                }else{
                   
                    String queryselect4="SELECT `BILL_DATE`, `CUSTOMER_NAME`, `CUSTOMER_MOBILE`, `CUSTOMER_ADDR`, `TOTAL`, `DISCOUNT`, `GRAND_TOTAL`, `AMOUNT_PAID`, `BALANCE`, `P_T_N` FROM `general_bill` WHERE BILL_NUMBER='"+billnumber+"'";
                    st=con.createStatement();
                    rs=st.executeQuery(queryselect4);
                    if(rs.next()){
                        billdate=rs.getString(1);
                        cusname=rs.getString(2);
                        cusmob=rs.getString(3);
                        cusaddr=rs.getString(4);
                        total=rs.getString(5);
                        discount2=rs.getString(6);
                        grandtotal=rs.getString(7);
                        amountpaid=rs.getString(8);
                        balance=rs.getString(9);
                        pti=rs.getString(10);
                        BillDateTF.setText(billdate);
                       
                        CusNameTF.setText(cusname);
                        CusAddrTF.setText(cusaddr);
                        CusMobTF.setText(cusmob);
                        TotalTF.setText(total);
                        DiscountTF2.setText(discount2);
                        GrandTotalTF.setText(grandtotal);
                        AmountPaidTF.setText(amountpaid);
                        BalanceTF.setText(balance);
                        PTITF.setText(pti); 
                    }    
                    ArrayList<String>itemidlist=new ArrayList();
                    ArrayList<String>itemnamelist=new ArrayList();
                    ArrayList<String>itempricelist=new ArrayList();
                    ArrayList<String>itemdiscountlist=new ArrayList();
                    ArrayList<String>itemquantitylist=new ArrayList();
                    ArrayList<String>itemsubtotallist=new ArrayList();
                    
                    
                    String queryselect5="SELECT `ITEM_ID`,`ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `QUANTITY`, `SUB_TOTAL` FROM `general_bill_item`  WHERE BILL_NUMBER='"+billnumber+"'";
                    st=con.createStatement();
                    rs=st.executeQuery(queryselect5);
                    
                    if(rs.next()){
                        itemid=rs.getString(1);
                        for(String id:itemid.split(",")){
                            itemidlist.add(id);
                        }
                        itemname=rs.getString(2);
                        for(String name:itemname.split(",")){
                            itemnamelist.add(name);
                        }
                        
                        itemprice=rs.getString(3);
                        for(String price:itemprice.split(",")){
                            itempricelist.add(price);
                        }
                        discount1=rs.getString(4);
                        for(String dc:discount1.split(",")){
                            itemdiscountlist.add(dc);
                        }
                        quantity=rs.getString(5);
                        for(String qt:quantity.split(",")){
                            itemquantitylist.add(qt);
                        }
                        subtotal=rs.getString(6);
                        for(String st:subtotal.split(",")){
                            itemsubtotallist.add(st);
                        }
                        
                    }
                   
                        int rowcount=itemidlist.size();
                        int getsrnum=jTable1.getRowCount();
                        int setsrnum=getsrnum+1;
                        DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                        Vector v=new Vector();
                        Object rowData[] = new Object[7];
                        for(int i=0;i<rowcount;i++){
                            
                            rowData[0]=i+1;
                           // System.out.println(setsrnum);
                            rowData[1]=itemidlist.get(i);
                            //v.add(id); 
                            
                            rowData[2]=itemnamelist.get(i);
                          //  v.add(name);
                           // System.out.println(name);
                            
                            rowData[3]=itempricelist.get(i);
                          //  v.add(price); 
                            
                            rowData[4]=itemdiscountlist.get(i);
                            //v.add(dc); 
                            
                           rowData[5]=itemquantitylist.get(i);
                           // v.add(qt); 
                            rowData[6]=itemsubtotallist.get(i);
                           // v.add(st); 
                            df.addRow(rowData);
                              
                       }
                        
                       
                        
               
                                              
                       
                      
                       
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AmountPaidTF;
    private javax.swing.JTextField BalanceTF;
    private javax.swing.JTextField BillDateTF;
    private javax.swing.JTextField BillNoTF;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextArea CusAddrTF;
    private javax.swing.JTextField CusIDTF;
    private javax.swing.JTextField CusMobTF;
    private javax.swing.JTextField CusNameTF;
    private javax.swing.JTextField DiscountTF1;
    private javax.swing.JTextField DiscountTF2;
    private javax.swing.JTextField GrandTotalTF;
    private javax.swing.JTextField GstNoTF;
    private javax.swing.JTextField ItemIDTF;
    private javax.swing.JTextField ItemNameTF;
    private javax.swing.JTextField ItemPriceTF;
    private javax.swing.JTextField PTITF;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextField QuantityTF;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SubTotalTF;
    private javax.swing.JTextField TotalTF;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
