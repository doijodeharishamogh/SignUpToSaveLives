/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.DB4OUtil.DB4OUtil;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.PotentialDonor.NewPotenialDonorRemoteJPanel;

/**
 *
 * @author Veena Iyer
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftJPanel = new javax.swing.JPanel();
        userNameTxtFld = new javax.swing.JTextField();
        donorBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("     Sign Up To Save Lives!!");
        container.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(container);

        leftJPanel.setBackground(new java.awt.Color(255, 255, 255));

        userNameTxtFld.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N

        donorBtn.setBackground(new java.awt.Color(51, 102, 255));
        donorBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        donorBtn.setForeground(new java.awt.Color(255, 255, 255));
        donorBtn.setText("Donor Sign Up");
        donorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorBtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(51, 102, 255));
        loginBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        LogOutBtn.setBackground(new java.awt.Color(51, 102, 255));
        LogOutBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Logout");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Enter Username");

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Enter Password");

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(userNameTxtFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(25, 25, 25))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(donorBtn)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(LogOutBtn)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void donorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorBtnActionPerformed
        // TODO add your handling code here:
        NewPotenialDonorRemoteJPanel panel = new NewPotenialDonorRemoteJPanel(container,system);
        container.add("NewPotenialDonorRemoteJPanel",panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_donorBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // Get user name
        String userName = userNameTxtFld.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Network inNetwork=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               inNetwork=network;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       inNetwork=network;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
        }
        
        loginBtn.setEnabled(false);
        LogOutBtn.setEnabled(true);
        userNameTxtFld.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        LogOutBtn.setEnabled(false);
        userNameTxtFld.setEnabled(true);
        passwordField.setEnabled(true);
        loginBtn.setEnabled(true);

        userNameTxtFld.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel container;
    private javax.swing.JButton donorBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
