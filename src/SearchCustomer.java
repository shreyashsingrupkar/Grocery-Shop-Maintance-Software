
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchCustomer extends javax.swing.JInternalFrame {
    ConnectionDatabase db=new ConnectionDatabase();
    Connection con;
    PreparedStatement stmt;
    Statement st;
    ResultSet rs;
    String cusname;
    String cusid,cusaddr,cusmob,cusemail,cusbalance;
    public SearchCustomer() {
        initComponents();
        jLayeredPane1.setVisible(false);
        Balance1TF.setEnabled(false);
        Balance1TF.setDisabledTextColor(Color.black);
        Balance2TF.setEnabled(false);
        Balance2TF.setDisabledTextColor(Color.black);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CusNameTF1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CusNameTF2 = new javax.swing.JTextField();
        CusAddrTF = new javax.swing.JTextField();
        CusMobTF = new javax.swing.JTextField();
        CusEmailTF = new javax.swing.JTextField();
        Balance1TF = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        PayAmtTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Balance2TF = new javax.swing.JTextField();
        PayButton2 = new javax.swing.JButton();
        PayButton1 = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Customer Name");

        CusNameTF1.setBackground(new java.awt.Color(255, 255, 102));
        CusNameTF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search Customer");

        SearchButton.setBackground(new java.awt.Color(241, 196, 15));
        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CusNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CusNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 163, 164));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Customer Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Customer Mobile");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Customer Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Balance Amount");

        CusNameTF2.setBackground(new java.awt.Color(255, 255, 102));
        CusNameTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CusNameTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameTF2ActionPerformed(evt);
            }
        });

        CusAddrTF.setBackground(new java.awt.Color(255, 255, 102));
        CusAddrTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CusAddrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusAddrTFActionPerformed(evt);
            }
        });

        CusMobTF.setBackground(new java.awt.Color(255, 255, 102));
        CusMobTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CusEmailTF.setBackground(new java.awt.Color(255, 255, 102));
        CusEmailTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CusEmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusEmailTFActionPerformed(evt);
            }
        });

        Balance1TF.setBackground(new java.awt.Color(255, 255, 102));
        Balance1TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Balance1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance1TFActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Pay Amount");

        PayAmtTF.setBackground(new java.awt.Color(255, 255, 102));
        PayAmtTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Balance Amount");

        Balance2TF.setBackground(new java.awt.Color(255, 255, 102));
        Balance2TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PayButton2.setBackground(new java.awt.Color(241, 196, 15));
        PayButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PayButton2.setText("Pay");
        PayButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButton2ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PayAmtTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Balance2TF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PayButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(PayAmtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(Balance2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PayButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Balance2TF)
                    .addComponent(PayButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(PayAmtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(30, 30, 30))
        );

        PayButton1.setBackground(new java.awt.Color(241, 196, 15));
        PayButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PayButton1.setText("Pay Balance");
        PayButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButton1ActionPerformed(evt);
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

        DeleteButton.setBackground(new java.awt.Color(241, 196, 15));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(241, 196, 15));
        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CusNameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CusAddrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CusEmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Balance1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PayButton1)))
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CusNameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CusAddrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CusEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Balance1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CusEmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusEmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusEmailTFActionPerformed

    private void CusAddrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusAddrTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusAddrTFActionPerformed

    private void Balance1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Balance1TFActionPerformed

    private void PayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButton1ActionPerformed
        // TODO add your handling code here:
        String bal=Balance1TF.getText();
        if("0".equals(bal)||"".equals(bal)){
             JOptionPane.showMessageDialog(this,"No Balance Amount");
        }
        else{
            jLayeredPane1.setVisible(true); 
        }
       
    }//GEN-LAST:event_PayButton1ActionPerformed

    private void PayButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButton2ActionPerformed
        
    }//GEN-LAST:event_PayButton2ActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String  newcusname=CusNameTF2.getText();
        String newcusaddr=CusAddrTF.getText();
        String newcusmob=CusMobTF.getText();
        String newcusemail=CusEmailTF.getText();
        String newcusbalance=Balance1TF.getText();
        con=db.DBConnection();
        if(!newcusname.isEmpty()&&!newcusaddr.isEmpty()&&!newcusmob.isEmpty()&&!newcusemail.isEmpty()&&!newcusbalance.isEmpty()){
           try {
            String update_query="UPDATE prime_customer SET CUSTOMER_NAME=?,CUSTOMER_ADDRESS=?,CUSTOMER_MOBILE=?,CUSTOMER_EMAIL=?,BALANCE=? WHERE CUSTOMER_NAME=?";
            stmt=con.prepareStatement(update_query);
            stmt.setString(1, newcusname);
            stmt.setString(2, newcusaddr);
            stmt.setString(3, newcusmob);
            stmt.setString(4, newcusemail);
            stmt.setString(5, newcusbalance);
            stmt.setString(6, cusname);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Information Updated Succesfully");
             CusNameTF1.setText("");
        CusNameTF2.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        CusEmailTF.setText("");
        Balance1TF.setText("");
        Balance2TF.setText("");
        PayAmtTF.setText("");
        CusNameTF1.requestFocus();
        cusname="";
        cusaddr="";
        cusmob="";
        cusemail="";
        cusbalance="";
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }  
       }
       else{
         JOptionPane.showMessageDialog(this,"Fields Are Empty");  
       }
      
       
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CusNameTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameTF2ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        cusname=CusNameTF1.getText();
        con=db.DBConnection();
        if(!cusname.isEmpty()){
             try {
            String cusnamequery="SELECT `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_MOBILE`, `CUSTOMER_EMAIL`, `BALANCE` FROM `prime_customer` WHERE CUSTOMER_NAME='"+cusname+"'";
            st=con.createStatement();
            rs=st.executeQuery(cusnamequery);
            if(rs.next()){
                cusname=rs.getString(1);
                cusaddr=rs.getString(2);
                cusmob=rs.getString(3);
                cusemail=rs.getString(4);
                cusbalance=rs.getString(5);
                if(cusbalance==null){
                    cusbalance="0";
                } 
            }
        CusNameTF2.setText(cusname);
        CusAddrTF.setText(cusaddr);
        CusMobTF.setText(cusmob);
        CusEmailTF.setText(cusemail);
        Balance1TF.setText(cusbalance);
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"Please Enter Customer Name OR Mobile Number");
        }
       
     
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        CusNameTF1.setText("");
        CusNameTF2.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        CusEmailTF.setText("");
        Balance1TF.setText("");
        Balance2TF.setText("");
        PayAmtTF.setText("");
        CusNameTF1.requestFocus();
        cusname="";
        cusaddr="";
        cusmob="";
        cusemail="";
        cusbalance="";
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        con=db.DBConnection();
        cusname=CusNameTF1.getText();
        String  newcusname=CusNameTF2.getText();
        String newcusaddr=CusAddrTF.getText();
        String newcusmob=CusMobTF.getText();
        String newcusemail=CusEmailTF.getText();
        String newcusbalance=Balance1TF.getText();
       
        
        if(!newcusname.isEmpty()&&!newcusaddr.isEmpty()&&!newcusmob.isEmpty()&&!newcusemail.isEmpty()&&!newcusbalance.isEmpty()){
         
            int dialogresult=JOptionPane.showConfirmDialog(null, "Do you Want to Delete", "", JOptionPane.YES_NO_OPTION);
            if(dialogresult==JOptionPane.YES_OPTION){
                try {
                    stmt=con.prepareStatement("DELETE FROM prime_customer WHERE CUSTOMER_NAME=?");
                    stmt.setString(1,cusname );
                    stmt.executeUpdate();
                    String sqlid="ALTER TABLE prime_customer DROP SR_NO";
                    String sqlno="ALTER TABLE prime_customer ADD SR_NO INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
                    stmt.execute(sqlid);
                    stmt.execute(sqlno);

                } catch (SQLException ex) {
                    Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
                CusNameTF1.setText("");
                CusNameTF2.setText("");
                CusAddrTF.setText("");
                CusMobTF.setText("");
                CusEmailTF.setText("");
                Balance1TF.setText("");
                Balance2TF.setText("");
                PayAmtTF.setText("");
                CusNameTF1.requestFocus();
                cusname="";
                cusaddr="";
                cusmob="";
                cusemail="";
                cusbalance="";
            }
        } 
        else{
                JOptionPane.showMessageDialog(this,"Fields Are Empty");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Balance1TF;
    private javax.swing.JTextField Balance2TF;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField CusAddrTF;
    private javax.swing.JTextField CusEmailTF;
    private javax.swing.JTextField CusMobTF;
    private javax.swing.JTextField CusNameTF1;
    private javax.swing.JTextField CusNameTF2;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField PayAmtTF;
    private javax.swing.JButton PayButton1;
    private javax.swing.JButton PayButton2;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
