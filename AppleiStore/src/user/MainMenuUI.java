/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.sql.Date;
import business.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MainMenuUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuUI
     */
    public MainMenuUI() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnADD = new javax.swing.JButton();
        btnLOGOUT = new javax.swing.JButton();
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        txtSellDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnViewAll = new javax.swing.JMenuItem();
        btnUpdate = new javax.swing.JMenuItem();
        btnDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnAddUser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Apple_Store logo 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 89, 72));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("APPLE iSTORE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 371, 64));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Product ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 139, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Product Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 139, 38));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 139, 37));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Category");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 139, 37));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Sell Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 139, 37));

        btnADD.setBackground(new java.awt.Color(0, 0, 0));
        btnADD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnADD.setForeground(new java.awt.Color(255, 255, 255));
        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanel1.add(btnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, 107, -1));

        btnLOGOUT.setBackground(new java.awt.Color(0, 0, 0));
        btnLOGOUT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        btnLOGOUT.setText("LOG OUT");
        btnLOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(btnLOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));
        jPanel1.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 149, 271, 35));
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 271, 37));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 271, 38));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 271, 37));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iPhone", "iPad", "iWatch", "Apple Pencil", "AirPods", "Mac Book Air", "Apple TV" }));
        jPanel1.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 271, 37));
        jPanel1.add(txtSellDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 271, 37));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/peakpx (4).jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 730));

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("Products");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jMenuItem1.setText("Search Product");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        btnViewAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnViewAll.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        jMenu1.add(btnViewAll);

        btnUpdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(btnUpdate);

        btnDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(btnDelete);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Users");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnAddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAddUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jMenu2.add(btnAddUser);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        UpdateProductUI upUI = new UpdateProductUI();
        upUI.setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddUserUI uAUI = new AddUserUI();
        uAUI.setVisible(true);
       
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnLOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGOUTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginUI lUI = new LoginUI();
        lUI.setVisible(true);
        
    }//GEN-LAST:event_btnLOGOUTActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        if (checked()&&check()&&primaryTest()){
            add();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "All Feilds Must Filled to Add Data!");
        }
    }//GEN-LAST:event_btnADDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchUI sUI = new SearchUI();
        sUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewAllUI vaUI = new ViewAllUI();
        vaUI.setVisible(true);
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DeleteUI dUI = new DeleteUI();
        dUI.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JMenuItem btnAddUser;
    private javax.swing.JMenuItem btnDelete;
    private javax.swing.JButton btnLOGOUT;
    private javax.swing.JMenuItem btnUpdate;
    private javax.swing.JMenuItem btnViewAll;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSellDate;
    // End of variables declaration//GEN-END:variables
public void add (){
    int ProductID = Integer.valueOf(txtProductID.getText());
    String ProductName = txtProductName.getText();
    String Price = txtPrice.getText();
    int Amount = Integer.valueOf(txtAmount.getText());
    String Category = cmbCategory.getSelectedItem().toString();
    Date SellDate = Date.valueOf(txtSellDate.getText());
    
    Product pr = new Product(ProductID,ProductName,Price,Amount,Category,SellDate);
    
    try{
        BufferedWriter bf = new BufferedWriter(new FileWriter("Product.txt",true));
        bf.append("\n"+pr.Print());
        JOptionPane.showMessageDialog(rootPane, "Product Added Successfully!");
        bf.close();
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
}
public boolean checked(){
    if(txtProductID.getText().equals("")){
        return false;
    }
    if(txtProductName.getText().equals("")){
        return false;
    }
    if(txtPrice.getText().equals("")){
        return false;
    }
    if(txtAmount.getText().equals("")){
        return false;
    }
    if(txtSellDate.getText().equals("")){
        return false;
    }
    else{
        return true;
    }
}
public boolean check(){
    try{
        int productID = Integer.valueOf(txtProductID.getText());
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Product ID must be an Integer!");
        return false;
    }
    try{
        int productAmount = Integer.valueOf(txtAmount.getText());
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Amount must be an Integer!");
        return false;
    }
    try{
        Date sellDate = Date.valueOf(txtSellDate.getText());
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Product publish date must follow YYYY-MM-DD Format!");
        return false;
    }
    return true;
}

public boolean primaryTest(){
    try{
        BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
        String data;
        String productID = txtProductID.getText();
        while((data = br.readLine())!=null){
            String[] line = data.split(",");
            if(line[0].equals(productID)){
                JOptionPane.showMessageDialog(rootPane, "Product ID Exists!");
                return false;
            }
        }
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
    return true;
}

} 
