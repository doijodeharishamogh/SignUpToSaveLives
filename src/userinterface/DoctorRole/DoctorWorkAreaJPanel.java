/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.UNOSEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.PatientAccount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HosUNOSWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veena Iyer
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private UNOSEnterprise UNOS;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        valueLabel.setText(enterprise.getName());
        //reqOrganBtn.setEnabled(false);
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createpatientbtn = new javax.swing.JButton();
        reqLabTestBtn = new javax.swing.JButton();
        reqOrganBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        labrequestjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();
        statusOfReqOrganBtn = new javax.swing.JButton();
        patientHistorybtn = new javax.swing.JButton();
        scheduleOperationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        createpatientbtn.setBackground(new java.awt.Color(51, 102, 255));
        createpatientbtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        createpatientbtn.setForeground(new java.awt.Color(255, 255, 255));
        createpatientbtn.setText("Create Patient");
        createpatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpatientbtnActionPerformed(evt);
            }
        });

        reqLabTestBtn.setBackground(new java.awt.Color(51, 102, 255));
        reqLabTestBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        reqLabTestBtn.setForeground(new java.awt.Color(255, 255, 255));
        reqLabTestBtn.setText("Request Lab Test");
        reqLabTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqLabTestBtnActionPerformed(evt);
            }
        });

        reqOrganBtn.setBackground(new java.awt.Color(51, 102, 255));
        reqOrganBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        reqOrganBtn.setForeground(new java.awt.Color(255, 255, 255));
        reqOrganBtn.setText("Need Organ");
        reqOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqOrganBtnActionPerformed(evt);
            }
        });

        labrequestjTable.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        labrequestjTable.setForeground(new java.awt.Color(51, 204, 255));
        labrequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Message", "Receiver", "Status", "Result", "Severity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(labrequestjTable);
        if (labrequestjTable.getColumnModel().getColumnCount() > 0) {
            labrequestjTable.getColumnModel().getColumn(0).setResizable(false);
            labrequestjTable.getColumnModel().getColumn(1).setResizable(false);
            labrequestjTable.getColumnModel().getColumn(2).setResizable(false);
            labrequestjTable.getColumnModel().getColumn(3).setResizable(false);
            labrequestjTable.getColumnModel().getColumn(4).setResizable(false);
            labrequestjTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Enterprise>> ");

        valueLabel.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(51, 102, 255));

        refreshbtn.setBackground(new java.awt.Color(51, 102, 255));
        refreshbtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        statusOfReqOrganBtn.setBackground(new java.awt.Color(51, 102, 255));
        statusOfReqOrganBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        statusOfReqOrganBtn.setForeground(new java.awt.Color(255, 255, 255));
        statusOfReqOrganBtn.setText("Status Of Requested Organs");
        statusOfReqOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusOfReqOrganBtnActionPerformed(evt);
            }
        });

        patientHistorybtn.setBackground(new java.awt.Color(51, 102, 255));
        patientHistorybtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        patientHistorybtn.setForeground(new java.awt.Color(255, 255, 255));
        patientHistorybtn.setText("Patient History");
        patientHistorybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientHistorybtnActionPerformed(evt);
            }
        });

        scheduleOperationBtn.setBackground(new java.awt.Color(51, 102, 255));
        scheduleOperationBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        scheduleOperationBtn.setForeground(new java.awt.Color(255, 255, 255));
        scheduleOperationBtn.setText("Schedule Operation");
        scheduleOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleOperationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patientHistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createpatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(refreshbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reqLabTestBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(statusOfReqOrganBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(reqOrganBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scheduleOperationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(refreshbtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createpatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(reqLabTestBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(reqOrganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusOfReqOrganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scheduleOperationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientHistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createpatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpatientbtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CreatePatientJPanel", new CreatePatientJPanel(userProcessContainer,organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createpatientbtnActionPerformed

    private void reqLabTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqLabTestBtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reqLabTestBtnActionPerformed

    private void reqOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqOrganBtnActionPerformed
       //communicate with unos enterprise
        DefaultTableModel model = (DefaultTableModel) labrequestjTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            
            Object[] row = new Object[6];  
            row[0] = ((LabTestWorkRequest) request).getPatientID();
            row[1] = request.getMessage();
            row[2] = request.getReceiver();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            int severity = ((LabTestWorkRequest) request).getSeverity();
            row[5] = String.valueOf(severity)==null? 0 : String.valueOf(severity);
            if(severity>3 && request.getStatus().equalsIgnoreCase("Lab Test Completed")&& request.getStatus().equalsIgnoreCase("Requested Organ"))
            request.setStatus("Advice Medication");
            else
            request.setStatus("Requested Organ");
            
            row[3] = request.getStatus();
            model.addRow(row);
        }
        
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof UNOSEnterprise)
                {   
                    UNOS=(UNOSEnterprise)enterprise;
                }
        }
       UNOS.getHosUNOSworkQueue().getWorkRequestList().clear();
        for(PatientAccount patient : organization.getPatientAccountDirectory().getPatientList()){
            if(Integer.valueOf(patient.getSeverity()).equals(1) || 
                    Integer.valueOf(patient.getSeverity()).equals(2) || 
                    Integer.valueOf(patient.getSeverity()).equals(3)){
                if(patient.isOrganNeeded()){
                            HosUNOSWorkRequest hr=new HosUNOSWorkRequest(patient);
                            hr.setAssigned(false);
                            UNOS.getHosUNOSworkQueue().getWorkRequestList().add(hr);
                            patient.setOrganNeeded(false);
                        }
                    }
                }
            
        
        JOptionPane.showMessageDialog(this, "Organ Request sent To Unified Network for Organ Sharing");
    }//GEN-LAST:event_reqOrganBtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void statusOfReqOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusOfReqOrganBtnActionPerformed
        OrganStatusJPanel organStatusJPanel=new OrganStatusJPanel(userProcessContainer, network, (HospitalEnterprise)enterprise);
        userProcessContainer.add("organStatusJPanel",organStatusJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_statusOfReqOrganBtnActionPerformed

    private void patientHistorybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientHistorybtnActionPerformed
        PatientHistoryJPanel patientHistoryJPanel = new PatientHistoryJPanel(userProcessContainer, (HospitalEnterprise)enterprise,organization);
        userProcessContainer.add("PatientHistoryJPanel",patientHistoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientHistorybtnActionPerformed

    private void scheduleOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleOperationBtnActionPerformed
        ScheduleOperationJPanel operationJPanel = new ScheduleOperationJPanel(userProcessContainer, network, enterprise,organization);
        userProcessContainer.add("ScheduleOperationJPanel",operationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_scheduleOperationBtnActionPerformed

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) labrequestjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = ((LabTestWorkRequest) request).getPatientID();
            row[1] = request.getMessage();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            int severity = ((LabTestWorkRequest) request).getSeverity();
            row[5] = String.valueOf(severity)==null? 0 : String.valueOf(severity);
            
            model.addRow(row);
            
            for (PatientAccount patientAccount : organization.getPatientAccountDirectory().getPatientList()) {
                if(patientAccount.getPatientID()==((LabTestWorkRequest) request).getPatientID()){
                    patientAccount.setOrganNeeded(false);
                    patientAccount.setSeverity(((LabTestWorkRequest) request).getSeverity());
                    for (PatientAccount.organType type : PatientAccount.organType.values()){
                        if(type.getValue().equals(result))
                            patientAccount.setOrganType(type);  
                    }
                    if((patientAccount.getSeverity()==1 || patientAccount.getSeverity()==2 
                            || patientAccount.getSeverity()==3)){
                        patientAccount.setOrganNeeded(true);
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createpatientbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labrequestjTable;
    private javax.swing.JButton patientHistorybtn;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton reqLabTestBtn;
    private javax.swing.JButton reqOrganBtn;
    private javax.swing.JButton scheduleOperationBtn;
    private javax.swing.JButton statusOfReqOrganBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
