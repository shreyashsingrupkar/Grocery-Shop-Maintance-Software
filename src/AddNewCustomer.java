
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class AddNewCustomer extends javax.swing.JInternalFrame {

   
    public AddNewCustomer() {
        initComponents();
        AddButton.setFocusable(false);
        ClearButton.setFocusable(false);
    }
    ConnectionDatabase db=new ConnectionDatabase();
    Connection con;
    PreparedStatement stmt;
    Statement st;
    String lastbillid;
   
    String getvalue;
    int val;
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CusNameTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusAddrTF = new javax.swing.JTextArea();
        CusMobTF = new javax.swing.JTextField();
        CusEmailTF = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 163, 164));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Customer Mobile ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Customer Email");

        CusNameTF.setBackground(new java.awt.Color(255, 255, 102));
        CusNameTF.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        CusAddrTF.setBackground(new java.awt.Color(255, 255, 102));
        CusAddrTF.setColumns(20);
        CusAddrTF.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        CusAddrTF.setRows(5);
        jScrollPane1.setViewportView(CusAddrTF);

        CusMobTF.setBackground(new java.awt.Color(255, 255, 102));
        CusMobTF.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        CusEmailTF.setBackground(new java.awt.Color(255, 255, 102));
        CusEmailTF.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        ClearButton.setBackground(new java.awt.Color(241, 196, 15));
        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(241, 196, 15));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CusEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(ClearButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(CusNameTF, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(CusEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String cusid;
        String cusname=CusNameTF.getText();
        String cusaddr=CusAddrTF.getText();
        String cusmob=CusMobTF.getText();
        String cusemail=CusEmailTF.getText();
        
        
        if(!cusname.isEmpty()&&!cusaddr.isEmpty()&&!cusmob.isEmpty()&&!cusemail.isEmpty()){
            con=db.DBConnection();
            try {
                    
                String  cusidquery="SELECT MAX(CUSTOMER_ID) FROM prime_customer";
                st=con.createStatement();
                ResultSet rs=st.executeQuery(cusidquery);
                if(rs.next()){
                    getvalue=rs.getString(1);
                    if(getvalue==null){
                        val=100001;
                    }
                    else{
                        val=Integer.parseInt(getvalue)+1; 
                    } 
                }

            //  cusid="CUS"+new SimpleDateFormat("ddMMyy").format(new Date())+setvalue;
                cusid=String.valueOf(val);
                String sqlid="ALTER TABLE prime_customer DROP SR_NO";
                String sqlno="ALTER TABLE prime_customer ADD SR_NO INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
                stmt=con.prepareStatement(sqlid);
                stmt.executeUpdate();
                stmt=con.prepareStatement(sqlno);
                stmt.executeUpdate();
                    
                String query="INSERT INTO prime_customer(CUSTOMER_ID,CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_MOBILE, CUSTOMER_EMAIL) VALUES (?,?,?,?,?)";
                stmt=con.prepareStatement(query);
                
                stmt.setString(1,cusid );
                stmt.setString(2,cusname );
                stmt.setString(3,cusaddr );
                stmt.setString(4,cusmob );
                stmt.setString(5,cusemail );
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"New Prime Customer Added Sucdesfully\nCOUSTMER ID:"+cusid);
                CusNameTF.setText("");
                CusAddrTF.setText("");
                CusMobTF.setText("");
                CusEmailTF.setText("");
                CusNameTF.requestFocus();
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Some Fields Are Empty");
        }
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        CusNameTF.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        CusEmailTF.setText("");
        CusNameTF.requestFocus();
    }//GEN-LAST:event_ClearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextArea CusAddrTF;
    private javax.swing.JTextField CusEmailTF;
    private javax.swing.JTextField CusMobTF;
    private javax.swing.JTextField CusNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
