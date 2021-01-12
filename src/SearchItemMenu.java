
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class SearchItemMenu extends javax.swing.JInternalFrame {

   
    ConnectionDatabase db=new ConnectionDatabase();
    Connection con;
    PreparedStatement stmt;
    Statement st;
    ResultSet rs;
    String itemname,itemsection,itemrow,itemprice,discount,itemcompany;
     DefaultListModel dm=new DefaultListModel();
       
   
    public SearchItemMenu() {
        initComponents();
        List1.setVisible(false);
        
        List1.setModel(dm);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ItemNameTF1 = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        List1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ItemSectionTF = new javax.swing.JTextField();
        ItemRowTF = new javax.swing.JTextField();
        CompanyTF = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ItemPriceTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DiscountTF = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ItemNameTF2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 163, 164));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Item");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Name");

        ItemNameTF1.setBackground(new java.awt.Color(255, 255, 102));
        ItemNameTF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemNameTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameTF1ActionPerformed(evt);
            }
        });
        ItemNameTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemNameTF1KeyReleased(evt);
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

        List1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ItemNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(232, 232, 232)
                    .addComponent(List1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(77, Short.MAX_VALUE)
                    .addComponent(List1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(153, 163, 164));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Item Section");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Item Row");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Item Company");

        ItemSectionTF.setBackground(new java.awt.Color(255, 255, 102));
        ItemSectionTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ItemRowTF.setBackground(new java.awt.Color(255, 255, 102));
        ItemRowTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CompanyTF.setBackground(new java.awt.Color(255, 255, 102));
        CompanyTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DeleteButton.setBackground(new java.awt.Color(241, 196, 15));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Item Price(Rs)");

        ItemPriceTF.setBackground(new java.awt.Color(255, 255, 102));
        ItemPriceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPriceTFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Item Discount");

        DiscountTF.setBackground(new java.awt.Color(255, 255, 102));
        DiscountTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setBackground(new java.awt.Color(241, 196, 15));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Item Name");

        ItemNameTF2.setBackground(new java.awt.Color(255, 255, 102));
        ItemNameTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemNameTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameTF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DiscountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CompanyTF)
                            .addComponent(ItemSectionTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(ItemPriceTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemRowTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemNameTF2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemNameTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemSectionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemRowTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
         itemname=ItemNameTF1.getText();
        String newitemname=ItemNameTF2.getText();
        String newitemsection=ItemSectionTF.getText();
        String newitemrow=ItemRowTF.getText();
        String newitemprice=ItemPriceTF.getText();
        String newdiscount=DiscountTF.getText();
        String newcompany=CompanyTF.getText();
       
        
        if(!newitemname.isEmpty()&&!newitemsection.isEmpty()&&!newitemrow.isEmpty()&&!newitemprice.isEmpty()&&!newdiscount.isEmpty()&&!newcompany.isEmpty()){
         
            int dialogresult=JOptionPane.showConfirmDialog(this, "Do you Want to Delete", "", JOptionPane.YES_NO_OPTION);
            if(dialogresult==JOptionPane.YES_OPTION){
                try {
                    stmt=con.prepareStatement("DELETE FROM item_table WHERE ITEM_NAME=?");
                    stmt.setString(1,itemname );
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Item Deleted Succesfully");
                    String sqlid="ALTER TABLE item_table DROP SR_NO";
                    String sqlno="ALTER TABLE item_table ADD SR_NO INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
                    stmt.execute(sqlid);
                    stmt.execute(sqlno);

                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this,ex);
                }
                ItemNameTF1.setText("");
                ItemNameTF2.setText("");
                ItemSectionTF.setText("");
                ItemRowTF.setText("");
                ItemPriceTF.setText("");
                DiscountTF.setText("");
                CompanyTF.setText("");
                itemname="";
                itemprice="";
                itemsection="";
                itemrow="";
                discount="";
                itemcompany="";
                 ItemNameTF1.setText("");
        ItemNameTF2.setText("");
        ItemSectionTF.setText("");
        ItemRowTF.setText("");
        ItemPriceTF.setText("");
        DiscountTF.setText("");
        CompanyTF.setText("");
        itemname="";
        itemprice="";
        itemsection="";
        itemrow="";
        discount="";
        itemcompany="";
        ItemNameTF1.requestFocus();
            }
        } 
        else{
                JOptionPane.showMessageDialog(this,"Fields Are Empty");
        }


    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       
        con=db.DBConnection();
        itemname=ItemNameTF1.getText();
        if(!itemname.isEmpty()){
             try {
            String itemselectquery="SELECT `ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `ITEM_COMPANY`, `ITEM_SECTION`, `ITEM_ROW` FROM `item_table` WHERE ITEM_NAME='"+itemname+"'";
            st=con.createStatement();
            rs=st.executeQuery(itemselectquery);
            if(rs.next()){
                itemname=rs.getString(1);
                itemprice=rs.getString(2);
                discount=rs.getString(3);
                itemcompany=rs.getString(4);
                itemsection=rs.getString(5);
                itemrow=rs.getString(6);
               
            }
        ItemNameTF2.setText(itemname);
        ItemSectionTF.setText(itemsection);
        ItemRowTF.setText(itemrow);
        ItemPriceTF.setText(itemprice);
        DiscountTF.setText(discount);
        CompanyTF.setText(itemcompany);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"Please Enter ItemID OR Item Name");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ItemPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemPriceTFActionPerformed

    private void ItemNameTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNameTF2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ItemNameTF1.setText("");
        ItemNameTF2.setText("");
        ItemSectionTF.setText("");
        ItemRowTF.setText("");
        ItemPriceTF.setText("");
        DiscountTF.setText("");
        CompanyTF.setText("");
        itemname="";
        itemprice="";
        itemsection="";
        itemrow="";
        discount="";
        itemcompany="";
                     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        itemname=ItemNameTF1.getText();
        String newitemname=ItemNameTF2.getText();
        String newitemsection=ItemSectionTF.getText();
        String newitemrow=ItemRowTF.getText();
        String newitemprice=ItemPriceTF.getText();
        String newdiscount=DiscountTF.getText();
        String newcompany=CompanyTF.getText();
        con=db.DBConnection();
        if(!newitemname.isEmpty()&&!newitemsection.isEmpty()&&!newitemrow.isEmpty()&&!newitemprice.isEmpty()&&!newdiscount.isEmpty()&&!newcompany.isEmpty()){
           try {
            String update_query="UPDATE item_table SET ITEM_NAME=?,ITEM_PRICE=?,DISCOUNT=?,ITEM_COMPANY=?,ITEM_SECTION=?,ITEM_ROW=? WHERE ITEM_NAME=?";
            stmt=con.prepareStatement(update_query);
            stmt.setString(1, newitemname);
            stmt.setString(2, newitemprice);
            stmt.setString(3, newdiscount);
            stmt.setString(4, newcompany);
            stmt.setString(5, newitemsection);
            stmt.setString(6, newitemrow);
            stmt.setString(7, itemname);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"ITEM Information Updated Succesfully");
             ItemNameTF1.setText("");
        ItemNameTF2.setText("");
        ItemSectionTF.setText("");
        ItemRowTF.setText("");
        ItemPriceTF.setText("");
        DiscountTF.setText("");
        CompanyTF.setText("");
        itemname="";
        itemprice="";
        itemsection="";
        itemrow="";
        discount="";
        itemcompany="";
        ItemNameTF1.requestFocus();
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,ex); 
        }  
       }
       else{
         JOptionPane.showMessageDialog(this,"Fields Are Empty");  
       }
      
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ItemNameTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNameTF1ActionPerformed

    private void ItemNameTF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemNameTF1KeyReleased
        con=db.DBConnection();
       
   
       
            
           
            String itemname=ItemNameTF1.getText();
            dm.removeAllElements();
            if(!itemname.isEmpty()){
               try{   
                    String selectlikequery="SELECT ITEM_NAME FROM item_table WHERE ITEM_NAME LIKE '"+itemname+"%'";
                    st=con.createStatement();
                    rs=st.executeQuery(selectlikequery);
                   
                    
                    int v=0;
                    while(rs.next()&& v<3){
                      
                      dm.addElement(rs.getString(1)); 
                      v++;
                    } 
                    
                   
                    if(v>=1){
                        List1.setVisible(true);
                        
                    }else{
                        List1.setVisible(false);
                    }
                } catch (SQLException ex) {
                        Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
                    }
               
               
            }else{
                List1.setVisible(false);
                dm.removeAllElements();
            }
            
                   
    }//GEN-LAST:event_ItemNameTF1KeyReleased

    private void List1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List1MouseClicked
         String s=(String)List1.getSelectedValue();
            ItemNameTF1.setText(s);
            List1.setVisible(false);
            dm.removeAllElements();
    }//GEN-LAST:event_List1MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompanyTF;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DiscountTF;
    private javax.swing.JTextField ItemNameTF1;
    private javax.swing.JTextField ItemNameTF2;
    private javax.swing.JTextField ItemPriceTF;
    private javax.swing.JTextField ItemRowTF;
    private javax.swing.JTextField ItemSectionTF;
    private javax.swing.JList<String> List1;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
