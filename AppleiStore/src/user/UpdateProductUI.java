/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.sql.Date;
import business.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UpdateProductUI extends javax.swing.JFrame {

    /**
     * Creates new form UpdateProductUI
     */
    public UpdateProductUI() {
        initComponents();
        setLocationRelativeTo(this);
        Product pr = new Product();
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
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSellDate = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        btnUPDATE = new javax.swing.JButton();
        btnCANCEL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Apple_Store logo 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 87, 75));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("APPLE iSTORE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 365, 66));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Product ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 123, 33));
        jPanel1.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 268, 33));
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 268, 34));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Product Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 34));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 139, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 268, 37));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 139, -1));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 268, 37));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Category");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 139, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Sell Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));
        jPanel1.add(txtSellDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 268, 38));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iPhone", "iPad", "iWatch", "Apple Pencil", "AirPods", "Mac Book Air", "Apple TV" }));
        jPanel1.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 268, 36));

        btnUPDATE.setBackground(new java.awt.Color(0, 0, 0));
        btnUPDATE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUPDATE.setForeground(new java.awt.Color(255, 255, 255));
        btnUPDATE.setText("UPDATE");
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(btnUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, -1, -1));

        btnCANCEL.setBackground(new java.awt.Color(0, 0, 0));
        btnCANCEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCANCEL.setForeground(new java.awt.Color(255, 255, 255));
        btnCANCEL.setText("CANCEL");
        btnCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELActionPerformed(evt);
            }
        });
        jPanel1.add(btnCANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/peakpx (3).jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        // TODO add your handling code here:
        if(checked()&&check()){
            String productID = txtProductID.getText();
            delete(productID);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "All Fields Must Filled to Update Data!");
        }
    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void btnCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainMenuUI mUI = new MainMenuUI();
        mUI.setVisible(true);
    }//GEN-LAST:event_btnCANCELActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProductUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JButton btnUPDATE;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSellDate;
    // End of variables declaration//GEN-END:variables
public void add(){
    int ProductID = Integer.valueOf(txtProductID.getText());
    String ProductName = txtProductName.getText();
    String Price = txtPrice.getText();
    int Amount = Integer.valueOf(txtAmount.getText());
    String Category = cmbCategory.getSelectedItem().toString();
    Date sellDate = Date.valueOf(txtSellDate.getText());
    
    Product pr = new Product(ProductID,ProductName,Price,Amount,Category,sellDate);
    
    try{
        BufferedWriter bf = new BufferedWriter(new FileWriter("Product.txt",true));
        bf.append("\n"+pr.Print());
        JOptionPane.showMessageDialog(rootPane, "Product Update Successfully!");
        bf.close();
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
}
public void delete(String productID){
    String data;
    //String productID = txtBroductID.getText();
    boolean deleted = false;
    ArrayList arr = new ArrayList<>();
    
    
    try{
        BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
        
        while((data = br.readLine())!=null){
            if(data.equals("")){
                continue;
            }
            else{
                String[] sData = data.split(",");
                
                if(sData[0].equals(productID)){
                    deleted = true;
                    continue;
                }
                else{
                    int ProductID = Integer.valueOf(sData[0]);
                    String ProductName = sData[1];
                    String Price = sData[2];
                    int Amount = Integer.valueOf(sData[3]);
                    String Category = sData[4];
                    Date sellDate = Date.valueOf(sData[5]);
                    
                    Product pr = new Product(ProductID,ProductName,Price,Amount,Category,sellDate);
                    arr.add(pr.Print());
                }
            }
        }
        if(deleted){
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter("Product.txt"));
            bw.write("");
            bw.close();
            int i = 0;
            while(i<arr.size()){
                String line = String.valueOf(arr.get(i));
                bw = new BufferedWriter (new FileWriter("Product.txt",true));
                bw.append("\n"+line);
                bw.close();
                i++;
            }
            add();
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Found!");
        }
    }
    catch(IOException e){
        System.out.print(e.getMessage());
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
        JOptionPane.showMessageDialog(rootPane, "Amount must be an Integer");
        return false;
    }
    try{
        Date sellDate = Date.valueOf(txtSellDate.getText());
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Product Sell Date date must follow YYYY-MM-DD Format!");
        return false;
    }
    return true;
}
}
