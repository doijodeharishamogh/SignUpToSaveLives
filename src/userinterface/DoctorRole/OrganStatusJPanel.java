/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Assignment.Assignment;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veena Iyer
 */
public class OrganStatusJPanel extends javax.swing.JPanel {

    private Network network;
    private JPanel userProcessContainer;
    private Enterprise hospitalEnterprise;
    
    public OrganStatusJPanel(JPanel userProcessContainer,Network network,Enterprise hospitalEnterprise) {
        initComponents();
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        this.hospitalEnterprise = hospitalEnterprise;
        populateOrganStatusTable();
    }
    
    public void populateOrganStatusTable(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) organStatusTable.getModel();
        defaultTableModel.setRowCount(0);
        if(null!=network.getAssignmentDirectory().getAssignmentList()){
            for (Assignment assignment : network.getAssignmentDirectory().getAssignmentList()) {
                Object[] row = new Object[6];
                row[0] = assignment.getPatient().getPatientID();
                row[1] = assignment.getPatient().getSeverity();
                row[2] = assignment.getPatient().getOrganType().toString();
                row[3] = assignment.getDonor().getId();
                row[4] = assignment.getOrgan().getOrganID();
                row[5] = (0==assignment.getDonor().getId())?"Organ Awaited":"Organ Assigned";
            
                defaultTableModel.addRow(row);
                if(assignment.getOrgan().getOrganID()!=0)
                    assignment.getPatient().setOrganNeeded(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organStatusTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        organStatusTable.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        organStatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Severity", "Affected Organ", "DonorID", "OrganID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organStatusTable);
        if (organStatusTable.getColumnModel().getColumnCount() > 0) {
            organStatusTable.getColumnModel().getColumn(0).setResizable(false);
            organStatusTable.getColumnModel().getColumn(1).setResizable(false);
            organStatusTable.getColumnModel().getColumn(2).setResizable(false);
            organStatusTable.getColumnModel().getColumn(3).setResizable(false);
            organStatusTable.getColumnModel().getColumn(4).setResizable(false);
            organStatusTable.getColumnModel().getColumn(5).setResizable(false);
        }

        backBtn.setBackground(new java.awt.Color(51, 102, 255));
        backBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 722, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel doctorWorkAreaJPanel = (DoctorWorkAreaJPanel) component;
        doctorWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organStatusTable;
    // End of variables declaration//GEN-END:variables
}
