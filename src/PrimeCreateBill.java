
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
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrimeCreateBill extends javax.swing.JInternalFrame {
   
    ConnectionDatabase db=new ConnectionDatabase();
    Connection con;
    PreparedStatement stmt;
    Statement st;
    ResultSet rs;
    String getdate;
    String getnumvalue;
    String date=new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
    String lastdate;
    String billnum;
   // String billnum1="P1910201001";
    String getbillnum;
    DefaultListModel dm=new DefaultListModel();
    static int getselectedrow;
    String selectedrow="";
    float getDiscount1_onclick;
    float getSubTotal_onclick;
    float getquantity_onclick;
   
    
    
    public PrimeCreateBill() {
        
        initComponents();
       // NewBillButton.setVisible(false);
        TotalTF.setText("0");
        Discount2TF.setText("0");
     
        List1.setVisible(false);
        List2.setVisible(false);
        
        List2.setModel(dm);
        
        billnumber();
        
        NewBillButton.setVisible(false);
        date=new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        BillDateTF.setText(date);
        BillDateTF.setEnabled(false);
        BillDateTF.setDisabledTextColor(Color.black);
        BillNoTF.setText(billnum);
        BillNoTF.setEnabled(false);
        BillNoTF.setDisabledTextColor(Color.black);
        GSTNoTF.setText("GST123456789");
        GSTNoTF.setEnabled(false);
        GSTNoTF.setDisabledTextColor(Color.black);
        Discount1TF.setEnabled(false);
        Discount1TF.setDisabledTextColor(Color.black);
        Discount2TF.setEnabled(false);
        Discount2TF.setDisabledTextColor(Color.black);
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
    
    
  private void billnumber(){
        try {
            con=db.DBConnection();
    
            String  billdatequery="SELECT MAX(BILL_DATE) FROM prime_bill";
            st=con.createStatement();
            rs=st.executeQuery(billdatequery);
            if(rs.next()){
                getdate=rs.getString(1);
                if(getdate==null){
                    String date1=new SimpleDateFormat("dd-MM-yyyy").format(new Date()); 
                    lastdate=date1;
                }
                else{
                    lastdate=getdate;
                }
               
            }
            if(lastdate.equals(date)){
                String  billnumquery="SELECT MAX(BILL_NUMBER) FROM prime_bill";
                st=con.createStatement();
                rs=st.executeQuery(billnumquery);
                if(rs.next()){
                    getnumvalue=rs.getString(1);
                                            
                    if(getnumvalue==null){
                        billnum="P"+new SimpleDateFormat("ddMMyy").format(new Date())+"1001"; 
                    }
                    else{

                        int num=Integer.parseInt(getnumvalue.substring(7));
                        int val = num+1;
                      
                       
                    billnum="P"+new SimpleDateFormat("ddMMyy").format(new Date())+val;
                  
                     }
                 }
            }
            else{
                billnum="P"+new SimpleDateFormat("ddMMyy").format(new Date())+"1001"; 
            }        
        } catch (SQLException ex) {
            Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        List1 = new javax.swing.JList<>();
        CusIDTF = new javax.swing.JTextField();
        List2 = new javax.swing.JList<>();
        CusNameTF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BillNoTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BillDateTF = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CusMobTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusAddrTF = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        GSTNoTF = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
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
        QuantityTF = new javax.swing.JTextField();
        Discount1TF = new javax.swing.JTextField();
        SubTotalTF = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        ClearButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CLearButton2 = new javax.swing.JButton();
        NewBillButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TotalTF = new javax.swing.JTextField();
        AmountTF = new javax.swing.JTextField();
        Discount2TF = new javax.swing.JTextField();
        BalanceTF = new javax.swing.JTextField();
        GrandTotalTF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        PTITF = new javax.swing.JTextField();
        PrintButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jTextArea1.setRows(5);

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLayeredPane1.setBackground(new java.awt.Color(208, 211, 212));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setToolTipText("");

        CusIDTF.setBackground(new java.awt.Color(248, 249, 249));
        CusIDTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        List2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        List2.setVisibleRowCount(2);
        List2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List2MouseClicked(evt);
            }
        });

        CusNameTF.setBackground(new java.awt.Color(84, 153, 199));
        CusNameTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CusNameTF.setForeground(new java.awt.Color(255, 255, 255));
        CusNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CusNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CusNameTFKeyReleased(evt);
            }
        });

        jLabel20.setText("Customer ID");

        jLabel1.setText("Customer Name");

        jLabel21.setText("Bill Number");

        BillNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Bill Date");

        BillDateTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane2.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(208, 211, 212));
        jPanel2.setOpaque(false);

        jLabel2.setText("Customer Address");

        jLabel3.setText("Mobile No");

        CusMobTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CusAddrTF.setBackground(new java.awt.Color(248, 249, 249));
        CusAddrTF.setColumns(20);
        CusAddrTF.setRows(5);
        CusAddrTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(CusAddrTF);

        jLabel11.setText("Shop GST No");

        GSTNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GSTNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CusMobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GSTNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addGap(10, 10, 10))
        );

        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(208, 211, 212));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("         Item ID");

        ItemIDTF.setBackground(new java.awt.Color(84, 153, 199));
        ItemIDTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ItemIDTF.setForeground(new java.awt.Color(255, 255, 255));
        ItemIDTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemIDTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemIDTFKeyReleased(evt);
            }
        });

        jLabel6.setText("                   Item Name");

        jLabel7.setText("       Item Price");

        jLabel8.setText("      Quantity");

        jLabel9.setText("  Item Discount(Rs)");

        jLabel10.setText("           Total");

        ItemNameTF.setBackground(new java.awt.Color(248, 249, 249));
        ItemNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ItemPriceTF.setEditable(false);
        ItemPriceTF.setBackground(new java.awt.Color(248, 249, 249));
        ItemPriceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ItemPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPriceTFActionPerformed(evt);
            }
        });

        QuantityTF.setBackground(new java.awt.Color(133, 193, 233));
        QuantityTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityTFKeyReleased(evt);
            }
        });

        Discount1TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SubTotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AddButton.setBackground(new java.awt.Color(241, 196, 15));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(241, 196, 15));
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(241, 196, 15));
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        ClearButton1.setBackground(new java.awt.Color(241, 196, 15));
        ClearButton1.setText("Clear");
        ClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton1ActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Discount1TF)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuantityTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(SubTotalTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(RemoveButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemIDTF)
                    .addComponent(ItemNameTF)
                    .addComponent(ItemPriceTF)
                    .addComponent(Discount1TF)
                    .addComponent(QuantityTF)
                    .addComponent(SubTotalTF)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(133, 146, 158));
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(208, 211, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jLabel12.setText("Total");

        jLabel13.setText("Discount");

        jLabel14.setText("Amount Paid");

        jLabel15.setText("Payment Mode");

        jLabel16.setText("Balance");

        jLabel17.setText("Grand Total");

        CLearButton2.setBackground(new java.awt.Color(241, 196, 15));
        CLearButton2.setText("Clear");
        CLearButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLearButton2ActionPerformed(evt);
            }
        });

        NewBillButton.setBackground(new java.awt.Color(241, 196, 15));
        NewBillButton.setText("New Bill");
        NewBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "UPI", "Internet Banking", "Debit Card", "Credit Card" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AmountTF.setBackground(new java.awt.Color(133, 193, 233));
        AmountTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTFActionPerformed(evt);
            }
        });
        AmountTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmountTFKeyReleased(evt);
            }
        });

        Discount2TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BalanceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GrandTotalTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setText("Payment Transiction Id");

        PTITF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PrintButton.setBackground(new java.awt.Color(241, 196, 15));
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PTITF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Discount2TF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GrandTotalTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 121, Short.MAX_VALUE)
                                    .addComponent(AmountTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BalanceTF, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CLearButton2)
                            .addGap(37, 37, 37)
                            .addComponent(PrintButton)
                            .addGap(38, 38, 38)
                            .addComponent(NewBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(GrandTotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTITF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLearButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        jLayeredPane1.setLayer(List1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CusIDTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(List2, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.setLayer(CusNameTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BillNoTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BillDateTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(CusIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(CusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(BillNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BillDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addComponent(jLayeredPane2)
            .addComponent(jLayeredPane3)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(List1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1384, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(561, 561, 561)
                    .addComponent(List2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addContainerGap(787, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CusIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BillNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BillDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(List1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(592, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(List2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addContainerGap(626, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CusNameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CusNameTFKeyReleased
       
            con=db.DBConnection();
            CusIDTF.setText("");
            CusAddrTF.setText("");
            CusMobTF.setText("");
            String cusname=CusNameTF.getText();
            dm.removeAllElements();
            if(!cusname.isEmpty()){
               try{   
                    String selectlikequery="SELECT CUSTOMER_NAME FROM prime_customer WHERE CUSTOMER_NAME LIKE '"+cusname+"%'";
                    st=con.createStatement();
                    rs=st.executeQuery(selectlikequery);
                    
                    int v=0;
                    while(rs.next()&& v<3){
                      dm.addElement(rs.getString(1));
                      v++;
                    }
                    if(v>=1){
                        List2.setVisible(true);
                        
                        
                       
                        
                    }else{
                        List2.setVisible(false);
                    }
                } catch (SQLException ex) {
                        Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
                    }
               CusIDTF.setEnabled(false);
               CusIDTF.setDisabledTextColor(Color.black);
               
            }else{
                List2.setVisible(false);
                dm.removeAllElements();
            }
            
            
         
    }//GEN-LAST:event_CusNameTFKeyReleased

    private void List2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List2MouseClicked
        String cusid="",cusaddr="",cusmob="";
         CusIDTF.setText("");
            CusAddrTF.setText("");
            CusMobTF.setText("");
        try {
            con=db.DBConnection();
            String s=(String)List2.getSelectedValue();
            CusNameTF.setText(s);
            List2.setVisible(false);
            dm.removeAllElements();
            String cusname=CusNameTF.getText();
            String queryselect="SELECT `CUSTOMER_ID`, `CUSTOMER_ADDRESS`, `CUSTOMER_MOBILE` FROM `prime_customer` WHERE CUSTOMER_NAME='"+cusname+"'";
            st=con.createStatement();
            rs=st.executeQuery(queryselect);
            if(rs.next()){
                cusid=rs.getString(1);
                cusaddr=rs.getString(2);
                cusmob=rs.getString(3);
            }
            
            CusIDTF.setText(cusid);
            CusAddrTF.setText(cusaddr);
            CusMobTF.setText(cusmob);
            cusid="";
            cusaddr="";
            cusmob="";
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }//GEN-LAST:event_List2MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ItemPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPriceTFActionPerformed
        
    }//GEN-LAST:event_ItemPriceTFActionPerformed

    private void ItemIDTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemIDTFKeyReleased
        String itemid,itemname,itemprice,discount;
        itemid=ItemIDTF.getText();
        ItemNameTF.setText("");
        ItemPriceTF.setText("");
        Discount1TF.setText("");
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
            Discount1TF.setText(String.valueOf(dc));
           
            }
           
            
          
        } catch (SQLException ex) {
            Logger.getLogger(PrimeCreateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
    }//GEN-LAST:event_ItemIDTFKeyReleased

    
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
    
    @SuppressWarnings("UnusedAssignment")
    private void QuantityTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityTFKeyReleased
        String quantity,itemprice,discount;
        quantity=QuantityTF.getText();
        itemprice=ItemPriceTF.getText();
        discount=Discount1TF.getText();
        if(!itemprice.isEmpty()){
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

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
            
        String cusid, itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        cusid=CusIDTF.getText();
        itemid=ItemIDTF.getText();
        itemname=ItemNameTF.getText();
        itemprice=ItemPriceTF.getText();
        quantity=QuantityTF.getText();
        discount1=Discount1TF.getText();
        discount2=Discount2TF.getText();
        subtotal=SubTotalTF.getText();
        String gettotal=TotalTF.getText(); 
      
      
        
        if(!cusid.isEmpty()&&!itemid.isEmpty()&&!itemname.isEmpty()&&!itemprice.isEmpty()&&!quantity.isEmpty()&&!discount1.isEmpty()&&!subtotal.isEmpty()&&!gettotal.isEmpty()){
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
            Discount2TF.setText(String.valueOf(dc));
            float gtotal=newtotal-dc;
            GrandTotalTF.setText(String.valueOf(gtotal));
        
            ip=0;
            gett=0;
            newtotal=0;
            dc=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            Discount1TF.setText("");
            QuantityTF.setText("");
            SubTotalTF.setText("");
            BalanceTF.setText("");
            AmountTF.setText("");
        }else{
             JOptionPane.showMessageDialog(this,"Some Fields Are Empty");
        }
         
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AmountTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountTFKeyReleased
        
        BalanceTF.setText("");
        String grandtotal=GrandTotalTF.getText();
        String amount=AmountTF.getText();
        boolean res= onlyDigit(amount);
        if(!grandtotal.isEmpty()){
             if(res==true){
            
            float gtotal=Float.parseFloat(grandtotal);
            float amt=Float.parseFloat(amount);
            if(!(amt>gtotal)){
                float balance=gtotal-amt;
                BalanceTF.setText(String.valueOf(balance)); 
            }
            else if(amt<0){
                    BalanceTF.setText("");
                    AmountTF.setText("");
                }
                else{  
                    JOptionPane.showMessageDialog(this,"Amout Should Be Less Than Or Equal To Grand Total");
                    BalanceTF.setText("");
                    AmountTF.setText("");
                }
        
        
        }
        
        
        }
       
        
    }//GEN-LAST:event_AmountTFKeyReleased

    private void AmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTFActionPerformed
        
    }//GEN-LAST:event_AmountTFActionPerformed

    private void CLearButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLearButton2ActionPerformed
        CusIDTF.setText("");
        CusNameTF.setText("");
        CusAddrTF.setText("");
        CusMobTF.setText("");
        ItemIDTF.setText(""); 
        ItemNameTF.setText("");
        ItemPriceTF.setText("");
        Discount1TF.setText("");
        QuantityTF.setText("");
        SubTotalTF.setText("");
        TotalTF.setText("0");
        Discount2TF.setText("0");
        GrandTotalTF.setText("");
       
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        
        int row=jTable1.getRowCount();
        int coloumn=jTable1.getColumnCount();
        for(int i=row-1;i>=0;i--){
                dt.removeRow(i);  
        }
                
        
        AmountTF.setText("");
        BalanceTF.setText("");
        PTITF.setText("");
         
    }//GEN-LAST:event_CLearButton2ActionPerformed

    
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        String itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        
        itemid=ItemIDTF.getText();
        itemname=ItemNameTF.getText();
        itemprice=ItemPriceTF.getText();
        quantity=QuantityTF.getText();
        discount1=Discount1TF.getText();
        discount2=Discount2TF.getText();
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
            Discount2TF.setText(String.valueOf(dc2));
            float gtotal=newtotal-dc2;
            GrandTotalTF.setText(String.valueOf(gtotal));
        
            ip=0;
            gett=0;
            newtotal=0;
            dc2=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            Discount1TF.setText("");
            QuantityTF.setText("");
            SubTotalTF.setText("");
            BalanceTF.setText("");
            AmountTF.setText("");
            getselectedrow=-1;
            selectedrow="";
            AddButton.setEnabled(true);
            
        }else{
             JOptionPane.showMessageDialog(this,"Update Error");
        }
        
         
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        getselectedrow=jTable1.getSelectedRow();
        selectedrow=String.valueOf(getselectedrow);
        ItemIDTF.setText(dt.getValueAt(getselectedrow, 1).toString()); 
        ItemNameTF.setText(dt.getValueAt(getselectedrow, 2).toString());
        ItemPriceTF.setText(dt.getValueAt(getselectedrow, 3).toString());
        Discount1TF.setText(dt.getValueAt(getselectedrow, 4).toString());
        QuantityTF.setText(dt.getValueAt(getselectedrow, 5).toString());
        SubTotalTF.setText(dt.getValueAt(getselectedrow, 6).toString()); 
        getDiscount1_onclick=Float.parseFloat(Discount1TF.getText());
        getquantity_onclick=Integer.parseInt(QuantityTF.getText());
        getSubTotal_onclick=Float.parseFloat(SubTotalTF.getText());
        AddButton.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void ClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton1ActionPerformed
        ItemIDTF.setText(""); 
        ItemNameTF.setText("");
        ItemPriceTF.setText("");
        Discount1TF.setText("");
        QuantityTF.setText("");
        SubTotalTF.setText("");
        getselectedrow=-1;
        selectedrow="";
        AddButton.setEnabled(true);
      
    }//GEN-LAST:event_ClearButton1ActionPerformed

   
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
            cusid=CusIDTF.getText();
            cusname=CusNameTF.getText();
            mobno=CusMobTF.getText();
            gstno=GSTNoTF.getText();
            total=TotalTF.getText();
            totaldiscount=Discount2TF.getText();
            grandtotal=GrandTotalTF.getText();
            paymentmode=jComboBox1.getSelectedItem().toString();
            amountpaid=AmountTF.getText();
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
                g2d.drawString(""+srnum+"  "+itemid+" "+itemname+"      "+itemprice+"  "+itemdicount+"  "+quantity+" "+subtotal,10,y);y+=yShift;
                        
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
                   
           
           
             
           
            
//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
          

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
            String billnumber,billdate,cusid,total,totaldiscount,grandtotal,amountpaid,balance,pti,paymentmode;
            String itemid,itemprice,itemdicount,quantity,subtotal;
            
            billnumber=BillNoTF.getText();
            billdate=BillDateTF.getText();
            cusid=CusIDTF.getText();
            total=TotalTF.getText();   
            totaldiscount=Discount2TF.getText();
            grandtotal=GrandTotalTF.getText();
            paymentmode=jComboBox1.getSelectedItem().toString();
            amountpaid=AmountTF.getText();
            balance=BalanceTF.getText();
            pti=BillNoTF.getText();
            
            itemid=ItemIDTF.getText();
            quantity=QuantityTF.getText();
     
            if(!billnumber.isEmpty()&& !billdate.isEmpty()&& !cusid.isEmpty()&& !total.isEmpty()&& !grandtotal.isEmpty()&&!amountpaid.isEmpty()&&!balance.isEmpty()){
               
                
                PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                     con=db.DBConnection();
            try {
                
                
                ArrayList<String>itemidlist=new ArrayList();
                ArrayList<String>itemnamelist=new ArrayList();
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
                      itemnamelist.add(dt.getValueAt(i, 2).toString());
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
                StringBuilder allitemname = new StringBuilder();
                String comma2="";
                for(String name:itemnamelist){
                    allitemname.append(comma2);
                    allitemname.append(name);
                    comma2=",";
                }
                StringBuilder allitemprice = new StringBuilder();
                String comma3="";
                for(String price:itempricelist){
                    allitemprice.append(comma3);
                    allitemprice.append(price);
                    comma3=",";
                }
                StringBuilder allitemdiscount = new StringBuilder();
               String comma4="";
                for(String dc:itemdiscountlist){
                    allitemdiscount.append(comma4);
                    allitemdiscount.append(dc);
                    comma4=",";
                }
                StringBuilder allitemquantity = new StringBuilder();
             String comma5="";
                for(String qt:itemquantitylist){
                    allitemquantity.append(comma5);
                    allitemquantity.append(qt);
                    comma5=",";
                }
                StringBuilder allitemsubtotal = new StringBuilder();
               String comma6="";
                for(String st:itemsubtotallist){
                    allitemsubtotal.append(comma6);
                    allitemsubtotal.append(st);
                    comma6=",";
                }
                
               
                
                String query="INSERT INTO `prime_bill`( `BILL_NUMBER`, `BILL_DATE`, `CUSTOMER_ID`, `TOTAL`, `DISCOUNT`, `GRAND_TOTAL`, `PAYMENT_MODE`, `AMOUNT_PAID`, `BALANCE`, `P_T_N`) VALUES (?,?,?,?,?,?,?,?,?,?)";
                stmt=con.prepareStatement(query);
                stmt.setString(1,billnumber );
                stmt.setString(2,billdate );
                stmt.setString(3,cusid );
                stmt.setString(4,total );
                stmt.setString(5,totaldiscount );
                stmt.setString(6,grandtotal );
                stmt.setString(7,paymentmode );
                stmt.setString(8,amountpaid );
                stmt.setString(9,balance );
                stmt.setString(10,pti );
                stmt.executeUpdate();
                
                 String query2="INSERT INTO `prime_bill_items`( `BILL_NUMBER`, `ITEM_ID`,ITEM_NAME, `ITEM_PRICE`, `DISCOUNT`, `QUANTITY`, `SUB_TOTAL`) VALUES (?,?,?,?,?,?,?)";
                stmt=con.prepareStatement(query2);
                
                stmt.setString(1,billnumber );
                
                    stmt.setString(2,allitemid.toString() );
                     stmt.setString(3,allitemname.toString() );
                   
                
                    stmt.setString(4,allitemprice.toString() );
                   
                
                
                    stmt.setString(5,allitemdiscount.toString() );
                    
                
                    stmt.setString(6,allitemquantity.toString() );
                    
                    stmt.setString(7,allitemsubtotal.toString());
                    
                 stmt.executeUpdate();
                
               
                 String sqlid1="ALTER TABLE prime_bill DROP SR_NUM";
                    String sqlno1="ALTER TABLE prime_bill ADD SR_NUM INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";

                    stmt.execute(sqlid1);
                    stmt.execute(sqlno1);
                
                
                JOptionPane.showMessageDialog(this,"Items Added Sucdesfully");
               
                 pj.print();
                 NewBillButton.setVisible(true);
                 PrintButton.setEnabled(false);
                 CLearButton2.setEnabled(false);
                
                
                
                CusIDTF.setText("");
                CusNameTF.setText("");
                CusAddrTF.setText("");
                CusMobTF.setText("");
                ItemIDTF.setText(""); 
                ItemNameTF.setText("");
                ItemPriceTF.setText("");
                Discount1TF.setText("");
                QuantityTF.setText("");
                SubTotalTF.setText("");
                TotalTF.setText("0");
                Discount2TF.setText("0");
                GrandTotalTF.setText("");
              //  DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        
             //   int row=jTable1.getRowCount();
              //  int coloumn=jTable1.getColumnCount();
                for(int i=row-1;i>=0;i--){
                    dt.removeRow(i);  
                }
                
        
                AmountTF.setText("");
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

    
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String itemid,itemname,itemprice,quantity,discount1,discount2,subtotal;
        
       
        if(!(getselectedrow<0)&&!selectedrow.isEmpty()){
            itemid=ItemIDTF.getText();
            itemname=ItemNameTF.getText();
            itemprice=ItemPriceTF.getText();
            quantity=QuantityTF.getText();
            discount1=Discount1TF.getText();
            discount2=Discount2TF.getText();
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
            Discount2TF.setText(String.valueOf(dc2));
            float gtotal=newtotal-dc2;
            GrandTotalTF.setText(String.valueOf(gtotal));
            ip=0;
            gett=0;
            newtotal=0;
            dc2=0;
            ItemIDTF.setText(""); 
            ItemNameTF.setText("");
            ItemPriceTF.setText("");
            Discount1TF.setText("");
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

    private void NewBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillButtonActionPerformed
       billnumber();
       BillDateTF.setText(date);
        BillDateTF.setEnabled(false);
        BillDateTF.setDisabledTextColor(Color.black);
        BillNoTF.setText(billnum);
        BillNoTF.setEnabled(false);
        PrintButton.setEnabled(true);
        CLearButton2.setEnabled(true);
                 
                 NewBillButton.setVisible(false);
               
    }//GEN-LAST:event_NewBillButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AmountTF;
    private javax.swing.JTextField BalanceTF;
    private javax.swing.JTextField BillDateTF;
    private javax.swing.JTextField BillNoTF;
    private javax.swing.JButton CLearButton2;
    private javax.swing.JButton ClearButton1;
    private javax.swing.JTextArea CusAddrTF;
    private javax.swing.JTextField CusIDTF;
    private javax.swing.JTextField CusMobTF;
    private javax.swing.JTextField CusNameTF;
    private javax.swing.JTextField Discount1TF;
    private javax.swing.JTextField Discount2TF;
    private javax.swing.JTextField GSTNoTF;
    private javax.swing.JTextField GrandTotalTF;
    private javax.swing.JTextField ItemIDTF;
    private javax.swing.JTextField ItemNameTF;
    private javax.swing.JTextField ItemPriceTF;
    private javax.swing.JList<String> List1;
    private javax.swing.JList<String> List2;
    private javax.swing.JButton NewBillButton;
    private javax.swing.JTextField PTITF;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextField QuantityTF;
    private javax.swing.JButton RemoveButton;
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
