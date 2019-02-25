/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receptionist;

import Business.Appointment.Appointment;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.CampEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.DonorAccount;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiranhun
 */
public class SchedulerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SchedulerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ReceptionistOrganization receptionistOrganization;
    private CampEnterprise enterprise;
    private String role;
    
    public SchedulerJPanel(JPanel userProcessContainer, UserAccount account, ReceptionistOrganization receptionistOrganization,Enterprise enterprise, EcoSystem business, String role) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.receptionistOrganization = receptionistOrganization;
        this.enterprise = (CampEnterprise)enterprise;
        this.role = role;
        comboBoxDonorID.removeAllItems();
        comboBoxDDocList.removeAllItems();
        radioBtn10to11.setSelected(false);
        radioBtn11to12.setSelected(false);
        radioBtn12to1.setSelected(false);
        populateDonorID();
        pouplateDoc();
        validate();
        poupulateTbale();
    }
    
    public void poupulateTbale(){
        DefaultTableModel model = (DefaultTableModel) tblScheduler.getModel();
        model.setRowCount(0);
        for(Appointment appointment : enterprise.getAppointmentDirectory().getAppointmentList()){
            Object[] row = new Object[model.getColumnCount()];
            row[0]=appointment;
            row[1]=appointment.getDonorFirstName();
            row[2]=appointment.getDonorLastName();
            row[3]=appointment.getDocName();
            if(appointment.isSlot10to11())
                row[4]="10AM-11AM";
            if(appointment.isSlot11to12())
                row[4]="11AM-12PM";
            if(appointment.isSlot12to01())
                row[4]="12PM-1PM";
            row[5]=appointment.getDate();
            model.addRow(row);
        }
    }
    
    public void validate(){
        try {
            radioBtn10to11.setEnabled(true);
            radioBtn11to12.setEnabled(true);
            radioBtn12to1.setEnabled(true);
            Object emp = comboBoxDDocList.getSelectedItem();
            Employee employee = (Employee) comboBoxDDocList.getSelectedItem();
            if((employee!=null)&&(jDateChooser.getDate()!=null)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String s = simpleDateFormat.format(jDateChooser.getDate());
                Date d = simpleDateFormat.parse(s);
                for(Appointment appointment: enterprise.getAppointmentDirectory().getAppointmentList()){
                    if((appointment.getDocID()==employee.getId())&&(appointment.getDate().compareTo(d))==0){
                        if(appointment.isSlot10to11()){
                            radioBtn10to11.setEnabled(false);
                        }
                        if(appointment.isSlot11to12()){
                            radioBtn11to12.setEnabled(false);
                        }
                        if(appointment.isSlot12to01()){
                            radioBtn12to1.setEnabled(false);
                        }
                    }
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(SchedulerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void pouplateDoc(){
        comboBoxDDocList.removeAllItems();
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
              if(organization.getName().equals("Doctor Organization")){
                  for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                        comboBoxDDocList.addItem(employee);        }
              }
        }
    }
    
        private void populateDonorID(){
        comboBoxDonorID.removeAllItems();
        for(DonorAccount donor : enterprise.getPotentialDonorAccountDirectory().getPotentialDonorList()){
            if(!donor.isScheduled())
                if(role.equals("rec") && !donor.isRemoteDonor())
                    comboBoxDonorID.addItem(donor);
                else if(role.equals(String.valueOf(donor.getId())))
                    comboBoxDonorID.addItem(donor);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxDonorID = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioBtn10to11 = new javax.swing.JRadioButton();
        radioBtn11to12 = new javax.swing.JRadioButton();
        radioBtn12to1 = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblScheduler = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        comboBoxDDocList = new javax.swing.JComboBox();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Scheduling Screen");

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Donor ID");

        comboBoxDonorID.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        comboBoxDonorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDonorIDActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Doctor");

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Time Slot");

        radioBtn10to11.setBackground(new java.awt.Color(51, 102, 255));
        radioBtn10to11.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        radioBtn10to11.setText("10AM-11AM");
        radioBtn10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn10to11ActionPerformed(evt);
            }
        });

        radioBtn11to12.setBackground(new java.awt.Color(51, 102, 255));
        radioBtn11to12.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        radioBtn11to12.setText("11AM-12PM");
        radioBtn11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn11to12ActionPerformed(evt);
            }
        });

        radioBtn12to1.setBackground(new java.awt.Color(51, 102, 255));
        radioBtn12to1.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        radioBtn12to1.setText("12PM-1PM");
        radioBtn12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn12to1ActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 102, 255));
        btnSave.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtFirstName.setEditable(false);
        txtFirstName.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N

        txtLastName.setEditable(false);
        txtLastName.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N

        tblScheduler.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        tblScheduler.setForeground(new java.awt.Color(51, 102, 255));
        tblScheduler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DonorID", "First Name", "Last Name", "Doctor", "Date", "Time Slot"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblScheduler);

        jLabel7.setBackground(new java.awt.Color(51, 102, 255));
        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Select Date");

        jDateChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooserMouseClicked(evt);
            }
        });
        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });

        comboBoxDDocList.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        comboBoxDDocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDDocListActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(51, 102, 255));
        backbtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFirstName)
                                .addComponent(comboBoxDonorID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(txtLastName)
                                .addComponent(comboBoxDDocList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtn10to11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBtn11to12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBtn12to1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxDonorID))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(comboBoxDDocList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioBtn10to11)
                    .addComponent(radioBtn11to12)
                    .addComponent(radioBtn12to1))
                .addGap(12, 12, 12)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDonorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDonorIDActionPerformed
        // TODO add your handling code here:
        DonorAccount donor = (DonorAccount)comboBoxDonorID.getSelectedItem();
        if(donor!=null){
            txtFirstName.setText(donor.getFirstName()); 
            txtLastName.setText(donor.getLastName());        
        }
    }//GEN-LAST:event_comboBoxDonorIDActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // TODO add your handling code here:
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String s = simpleDateFormat.format(jDateChooser.getDate());
            Date d = simpleDateFormat.parse(s);
            Appointment appointment = enterprise.getAppointmentDirectory().addAppointment();
            Employee employee = (Employee) comboBoxDDocList.getSelectedItem();
            int donorID = Integer.parseInt(comboBoxDonorID.getSelectedItem().toString());
            DonorAccount donor = (DonorAccount)comboBoxDonorID.getSelectedItem();
            donor.setScheduled(true);
            appointment.setDonorID(donorID);
            appointment.setDonorFirstName(txtFirstName.getText());
            appointment.setDonorLastName(txtLastName.getText());
            appointment.setDocID(employee.getId());
            appointment.setDocName(String.valueOf(comboBoxDDocList.getSelectedItem()));
            appointment.setDate(d);
            if(radioBtn10to11.isSelected()){
                appointment.setSlot10to11(true);
            }
            else if(radioBtn11to12.isSelected()){
                appointment.setSlot11to12(true);
            }
            else if(radioBtn12to1.isSelected()){
                appointment.setSlot12to01(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Please select the time slot");
                return;
            }
            radioBtn10to11.setSelected(false);
            radioBtn11to12.setSelected(false);
            radioBtn12to1.setSelected(false);
            radioBtn10to11.setEnabled(true);
            radioBtn11to12.setEnabled(true);
            radioBtn12to1.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Appointment scheduled successfully");
            poupulateTbale();
        } catch (ParseException ex) {
            Logger.getLogger(SchedulerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboBoxDDocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDDocListActionPerformed
        // TODO add your handling code here:
        validate();
    }//GEN-LAST:event_comboBoxDDocListActionPerformed

    private void jDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserPropertyChange
        // TODO add your handling code here:
        validate();
    }//GEN-LAST:event_jDateChooserPropertyChange

    private void jDateChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooserMouseClicked
        // TODO add your handling code here:
        validate();
    }//GEN-LAST:event_jDateChooserMouseClicked

    private void radioBtn10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn10to11ActionPerformed
        // TODO add your handling code here:
        radioBtn11to12.setSelected(false);
        radioBtn12to1.setSelected(false);
    }//GEN-LAST:event_radioBtn10to11ActionPerformed

    private void radioBtn11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn11to12ActionPerformed
        // TODO add your handling code here:
        radioBtn12to1.setSelected(false);
        radioBtn10to11.setSelected(false);
    }//GEN-LAST:event_radioBtn11to12ActionPerformed

    private void radioBtn12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn12to1ActionPerformed
        // TODO add your handling code here:
        radioBtn10to11.setSelected(false);
        radioBtn11to12.setSelected(false);
    }//GEN-LAST:event_radioBtn12to1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboBoxDDocList;
    private javax.swing.JComboBox comboBoxDonorID;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBtn10to11;
    private javax.swing.JRadioButton radioBtn11to12;
    private javax.swing.JRadioButton radioBtn12to1;
    private javax.swing.JTable tblScheduler;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
