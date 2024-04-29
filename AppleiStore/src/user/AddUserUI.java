/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddUserUI extends javax.swing.JFrame {

    /**
     * Creates new form AddUserUI
     */
    public AddUserUI() {
        initComponents();
        setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnManager = new javax.swing.JRadioButton();
        btnCashier = new javax.swing.JRadioButton();
        btnADD = new javax.swing.JButton();
        btnCANCEL = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Apple_Store logo 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 18, 86, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("APPLE iSTORE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 26, -1, 72));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 150, -1, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 236, 96, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 153, 243, 26));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 239, 243, 28));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 345, 96, -1));

        btnManager.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(btnManager);
        btnManager.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManager.setText("Manager");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });
        jPanel1.add(btnManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 336, -1, -1));

        btnCashier.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(btnCashier);
        btnCashier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCashier.setText("Cashier");
        btnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierActionPerformed(evt);
            }
        });
        jPanel1.add(btnCashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 336, -1, -1));

        btnADD.setBackground(new java.awt.Color(0, 0, 0));
        btnADD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnADD.setForeground(new java.awt.Color(255, 255, 255));
        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanel1.add(btnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 410, 107, -1));

        btnCANCEL.setBackground(new java.awt.Color(0, 0, 0));
        btnCANCEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCANCEL.setForeground(new java.awt.Color(255, 255, 255));
        btnCANCEL.setText("CANCEL");
        btnCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELActionPerformed(evt);
            }
        });
        jPanel1.add(btnCANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 410, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/peakpx (6).jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCashierActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        addUser();
    }//GEN-LAST:event_btnADDActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JRadioButton btnCashier;
    private javax.swing.JRadioButton btnManager;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    public void addUser(){
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        if(username.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(rootPane, "All feilds must filled");
            return;
        }
        if(btnCashier.isSelected()){
            try{
                File file = new File("CashierUser.txt");
                if(file.exists()){
                    String data;
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    while((data = br.readLine())!=null){
                        if(data.equals("")){
                        }
                        else{
                            String[] line = data.split(":");
                            if(line[0].equals(username)){
                                JOptionPane.showMessageDialog(rootPane, "Username Exists!");
                                br.close();
                                return;
                            }
                        }
                    }
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                    bw.append("\n"+username+":"+password);
                    bw.close();
                    JOptionPane.showMessageDialog(rootPane, "User Created!");
                    return;
                }
            }
            catch(IOException e){
               return;
            }   
        }
        else{
            try{
                File file = new File("SuperUser.txt");
                if(file.exists()){
                    String data;
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    while((data = br.readLine())!=null){
                        if(data.equals("")){
                            
                        }
                        else{
                            String[] line = data.split(":");
                            if(line[0].equals(username)){
                                JOptionPane.showMessageDialog(rootPane, "Username Exists!");
                                br.close();
                                return;
                            }
                            
                        }
                    }
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                    bw.append("\n"+username+":"+password);
                    bw.close();
                    JOptionPane.showMessageDialog(rootPane, "User Created!");
                    return;
                }
            }
            catch(IOException e){
                return;
            }
        }
    }
  }