import java.awt.Toolkit;

public class Main extends javax.swing.JFrame {
GeneralCreateBill generalcreatebill=new GeneralCreateBill();
        SearchItem searchitem=new SearchItem();
        SearchBill searchbill=new SearchBill();
        SearchItemMenu searchitemmenu=new SearchItemMenu();
        PrimeCreateBill primecreatebill=new PrimeCreateBill();
        SearchCustomer searchcustomer=new SearchCustomer();
        AddNewCustomer addnewcustomer=new AddNewCustomer();
        AddNewItem addnewitem=new AddNewItem();
      
    public Main() {
  
        initComponents();
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        double width=toolkit.getScreenSize().getWidth();
        double height=toolkit.getScreenSize().getHeight();
        this.setSize((int)width, (int)height);
        this.setTitle("Grocery Shop Management");
        jDesktopPane1.setSize((int)width, (int)height);
       

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Create_Bill = new javax.swing.JButton();
        Search_Item = new javax.swing.JButton();
        Search_Bill = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        ExitButton = new javax.swing.JMenuItem();
        PrimeBillMenu = new javax.swing.JMenu();
        Prime_Bill = new javax.swing.JMenuItem();
        Search_Prime = new javax.swing.JMenuItem();
        New_Prime_Customer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        New_Item = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        Create_Bill.setBackground(new java.awt.Color(255, 255, 0));
        Create_Bill.setText("Create Bill");
        Create_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_BillActionPerformed(evt);
            }
        });

        Search_Item.setBackground(new java.awt.Color(255, 255, 0));
        Search_Item.setText("Search Item");
        Search_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ItemActionPerformed(evt);
            }
        });

        Search_Bill.setBackground(new java.awt.Color(255, 255, 0));
        Search_Bill.setText("Search Bill");
        Search_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(Create_Bill)
                .addGap(18, 18, 18)
                .addComponent(Search_Item)
                .addGap(18, 18, 18)
                .addComponent(Search_Bill)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Create_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(Search_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_Item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(39, 55, 70));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(144, 35));

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("File");

        jMenuItem8.setText("Admin");
        jMenu4.add(jMenuItem8);

        ExitButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jMenu4.add(ExitButton);

        jMenuBar1.add(jMenu4);

        PrimeBillMenu.setForeground(new java.awt.Color(255, 255, 255));
        PrimeBillMenu.setText("Prime Customer");

        Prime_Bill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        Prime_Bill.setText("Create Prime Bill");
        Prime_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prime_BillActionPerformed(evt);
            }
        });
        PrimeBillMenu.add(Prime_Bill);

        Search_Prime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Search_Prime.setText("Search Prime Customer");
        Search_Prime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_PrimeActionPerformed(evt);
            }
        });
        PrimeBillMenu.add(Search_Prime);

        New_Prime_Customer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        New_Prime_Customer.setText("Add New Customer");
        New_Prime_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Prime_CustomerActionPerformed(evt);
            }
        });
        PrimeBillMenu.add(New_Prime_Customer);

        jMenuBar1.add(PrimeBillMenu);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Items");

        New_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New_Item.setText("Add New Item");
        New_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ItemActionPerformed(evt);
            }
        });
        jMenu2.add(New_Item);

        jMenuItem1.setText("Search Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        
     
           
    private void Create_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_BillActionPerformed
        generalcreatebill.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.add(generalcreatebill);
        searchitem.dispose();
         searchitemmenu.dispose();
        searchbill.dispose();
        primecreatebill.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(searchitem);
          jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        int width=jDesktopPane1.getWidth();
        int height=jDesktopPane1.getHeight();
        generalcreatebill.setSize(width,height);
        generalcreatebill.setVisible(true);  
         
    }//GEN-LAST:event_Create_BillActionPerformed

    private void Search_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ItemActionPerformed
        searchitem.dispose();
        jDesktopPane1.remove(searchitem);
        jDesktopPane1.add(searchitem);
        generalcreatebill.dispose();
        searchbill.dispose();
        searchitemmenu.dispose();
        primecreatebill.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        searchitem.setVisible(true);       
    }//GEN-LAST:event_Search_ItemActionPerformed

    private void Search_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BillActionPerformed
        searchbill.dispose();
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.add(searchbill);
        generalcreatebill.dispose();
        searchitem.dispose();
         searchitemmenu.dispose();
        primecreatebill.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchitem);
        jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        int width=jDesktopPane1.getWidth();
        int height=jDesktopPane1.getHeight();
        searchbill.setSize(width,height);
        searchbill.setVisible(true);
          
    }//GEN-LAST:event_Search_BillActionPerformed

    private void Prime_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prime_BillActionPerformed
        primecreatebill.dispose();
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.add(primecreatebill);
        generalcreatebill.dispose();
        searchitem.dispose();
         searchitemmenu.dispose();
        searchbill.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchitem);
         jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        int width=jDesktopPane1.getWidth();
        int height=jDesktopPane1.getHeight();
        primecreatebill.setSize(width,height);
        primecreatebill.setVisible(true);
      
    }//GEN-LAST:event_Prime_BillActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Search_PrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_PrimeActionPerformed
        searchcustomer.dispose();
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.add(searchcustomer);
        generalcreatebill.dispose();
        searchitem.dispose();
        searchitemmenu.dispose();
        searchbill.dispose();
        primecreatebill.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchitem);
         jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        searchcustomer.setVisible(true);   
    }//GEN-LAST:event_Search_PrimeActionPerformed

    private void New_Prime_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Prime_CustomerActionPerformed
        addnewcustomer.dispose();
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.add(addnewcustomer);
        generalcreatebill.dispose();
        searchitem.dispose();
        searchitemmenu.dispose();
        searchbill.dispose();
        primecreatebill.dispose();
        searchcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchitem);
         jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewitem);
        addnewcustomer.setVisible(true);
    }//GEN-LAST:event_New_Prime_CustomerActionPerformed

    private void New_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ItemActionPerformed
        addnewitem.dispose();
        jDesktopPane1.remove(addnewitem);
        jDesktopPane1.add(addnewitem);
        generalcreatebill.dispose();
        searchitem.dispose();
        searchitemmenu.dispose();
        searchbill.dispose();
        primecreatebill.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchitem);
        jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        addnewitem.setVisible(true);
    }//GEN-LAST:event_New_ItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        searchitemmenu.dispose();
        jDesktopPane1.remove(searchitemmenu);
        jDesktopPane1.add(searchitemmenu);
        generalcreatebill.dispose();
        searchbill.dispose();
        primecreatebill.dispose();
        searchitem.dispose();
        searchcustomer.dispose();
        addnewcustomer.dispose();
        addnewitem.dispose();
        jDesktopPane1.remove(searchitem);
        jDesktopPane1.remove(generalcreatebill);
        jDesktopPane1.remove(searchbill);
        jDesktopPane1.remove(primecreatebill);
        jDesktopPane1.remove(searchcustomer);
        jDesktopPane1.remove(addnewcustomer);
        jDesktopPane1.remove(addnewitem);
        searchitemmenu.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

        public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create_Bill;
    private javax.swing.JMenuItem ExitButton;
    private javax.swing.JMenuItem New_Item;
    private javax.swing.JMenuItem New_Prime_Customer;
    private javax.swing.JMenu PrimeBillMenu;
    private javax.swing.JMenuItem Prime_Bill;
    private javax.swing.JButton Search_Bill;
    private javax.swing.JButton Search_Item;
    private javax.swing.JMenuItem Search_Prime;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
