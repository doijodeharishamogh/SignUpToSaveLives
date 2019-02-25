/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receptionist;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.UNOSEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CampCertifyingAuthorityWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kiranhun
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    private Network network;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ReceptionistOrganization receptionistOrganization;
    private Enterprise enterprise;
    private UNOSEnterprise UNOS;
    
    
    public ReceptionistWorkAreaJPanel( JPanel userProcessContainer, UserAccount account, 
            Organization organization,Enterprise enterprise, EcoSystem business,Network network){
        initComponents();
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.receptionistOrganization = (ReceptionistOrganization)organization;
        this.enterprise = enterprise;
        
        btnNewPotentialDonor.setEnabled(false);
        btnScheduler.setEnabled(false);
        
        checkIfCertified();
    }

    public void checkIfCertified(){
        UNOSEnterprise entr=null;
        boolean certified=false;
        for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise1 instanceof UNOSEnterprise){
                UNOS=(UNOSEnterprise)enterprise1;
            }
        }
        for(WorkRequest request : UNOS.getCampCertifyingWorkQueue().getWorkRequestList()){
            if(request instanceof CampCertifyingAuthorityWorkRequest){
                
                CampCertifyingAuthorityWorkRequest ccrequest=(CampCertifyingAuthorityWorkRequest)request;
                if(enterprise.getName().equalsIgnoreCase(ccrequest.getCampName())){
                    certified = ccrequest.isCertified();
                    if(certified){
                        btnNewPotentialDonor.setEnabled(true);
                        btnScheduler.setEnabled(true);
                        browseBtn.setEnabled(false);
                        approveReq.setEnabled(false);
                    }
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewPotentialDonor = new javax.swing.JButton();
        btnScheduler = new javax.swing.JButton();
        browseBtn = new javax.swing.JButton();
        displayPic = new javax.swing.JLabel();
        picTxtFld = new javax.swing.JTextField();
        approveReq = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnNewPotentialDonor.setBackground(new java.awt.Color(51, 102, 255));
        btnNewPotentialDonor.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnNewPotentialDonor.setText("Potential Donor");
        btnNewPotentialDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPotentialDonorActionPerformed(evt);
            }
        });

        btnScheduler.setBackground(new java.awt.Color(51, 102, 255));
        btnScheduler.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnScheduler.setText("Scheduler");
        btnScheduler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchedulerActionPerformed(evt);
            }
        });

        browseBtn.setBackground(new java.awt.Color(51, 102, 255));
        browseBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        displayPic.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N

        picTxtFld.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N

        approveReq.setBackground(new java.awt.Color(51, 102, 255));
        approveReq.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        approveReq.setText("Certifying Request");
        approveReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveReqActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("**************************************Sign Up To Save Lives*******************************************");

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Certify Your Camp >>");

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("For Certified Camps");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnScheduler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewPotentialDonor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(approveReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(picTxtFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(displayPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(picTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(approveReq)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewPotentialDonor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnScheduler))
                    .addComponent(displayPic, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPotentialDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPotentialDonorActionPerformed
        NewPotenialDonorDetailsJPanel newPotenialDonorDetailsJPanel = new NewPotenialDonorDetailsJPanel(userProcessContainer, userAccount,  receptionistOrganization,  enterprise,  business);
        userProcessContainer.add("newPotenialDonorDetailsJPanel", newPotenialDonorDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewPotentialDonorActionPerformed

    private void btnSchedulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchedulerActionPerformed
        SchedulerJPanel schedulerJPanel = new SchedulerJPanel(userProcessContainer, userAccount,  receptionistOrganization,  enterprise,  business,"rec");
        userProcessContainer.add("schedulerJPanel", schedulerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSchedulerActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        try{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File file =  fileChooser.getSelectedFile();
            // Gets the URL of the Picture location
            if(file!=null){
                String fileName = file.getAbsolutePath();
                picTxtFld.setText(fileName);
                //set the URL of the picture location in the class
                //Read the image from the URL placed in the class
                Image image = ImageIO.read(new File(picTxtFld.getText()));
                image = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
                ImageIcon myImageIcon = new ImageIcon(image);
                //Add the read image in the label
                displayPic.setIcon(myImageIcon);
            
                //send work request to UNOS
                CampCertifyingAuthorityWorkRequest request = new CampCertifyingAuthorityWorkRequest(picTxtFld.getText());
                request.setCampName(enterprise.getName());
                request.setPicture(picTxtFld.getText());
                
                UNOS.getCampCertifyingWorkQueue().getWorkRequestList().add(request);
            }else{
                JOptionPane.showMessageDialog(this, "Select a file");
            }
            
        }catch (IOException ex) {
           Logger.getLogger(ReceptionistWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_browseBtnActionPerformed

    private void approveReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveReqActionPerformed
        
       JOptionPane.showMessageDialog(this, "Request sent to Certifying Authority");
       picTxtFld.setText("");           
    }//GEN-LAST:event_approveReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveReq;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton btnNewPotentialDonor;
    private javax.swing.JButton btnScheduler;
    private javax.swing.JLabel displayPic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField picTxtFld;
    // End of variables declaration//GEN-END:variables
}
