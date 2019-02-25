/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Organization.Organization;
import Business.UserAccount.PatientAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Veena Iyer
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    private Organization organization;
    private JPanel userProcessContainer;
    
    public CreatePatientJPanel(JPanel userProcessContainer,Organization organization) {
        initComponents();
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        
        populateProfessionComboBox();
    }

    private void populateProfessionComboBox(){
        professionjComboBox.removeAllItems();
        
        for (PatientAccount.professionType type : PatientAccount.professionType.values()) {
            professionjComboBox.addItem(type);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNmTxtFld = new javax.swing.JTextField();
        lastNmTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agetxtFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        weightTxtFld = new javax.swing.JTextField();
        fRadioButton = new javax.swing.JRadioButton();
        mRadioButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        bloodTypeTxtFld = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        checkboxpanel = new javax.swing.JPanel();
        diabeticjCheckBox = new javax.swing.JCheckBox();
        HyperTensionjCheckBox = new javax.swing.JCheckBox();
        smokingjCheckBox1 = new javax.swing.JCheckBox();
        drinkingjCheckBox1 = new javax.swing.JCheckBox();
        asthamajCheckBox = new javax.swing.JCheckBox();
        epilepsyCheckBox = new javax.swing.JCheckBox();
        strokejCheckBox = new javax.swing.JCheckBox();
        heartDieseaseJcheckbox = new javax.swing.JCheckBox();
        stdjCheckBox = new javax.swing.JCheckBox();
        hepatitisjCheckBox = new javax.swing.JCheckBox();
        hivjCheckBox = new javax.swing.JCheckBox();
        createBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        professionjComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("*************************************Sign Up To Save Lives*********************************");

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Name*");

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Last");

        firstNmTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNmTxtFldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("First");

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Age*");

        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Gender*");

        jLabel8.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Weight*");

        fRadioButton.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        fRadioButton.setText("F");
        fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRadioButtonActionPerformed(evt);
            }
        });

        mRadioButton.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        mRadioButton.setText("M");
        mRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRadioButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Blood Type");

        backbtn.setBackground(new java.awt.Color(51, 102, 255));
        backbtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        checkboxpanel.setBackground(new java.awt.Color(204, 204, 204));

        diabeticjCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        diabeticjCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        diabeticjCheckBox.setText("Diabetic");

        HyperTensionjCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        HyperTensionjCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        HyperTensionjCheckBox.setText("HyperTension");

        smokingjCheckBox1.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        smokingjCheckBox1.setForeground(new java.awt.Color(51, 102, 255));
        smokingjCheckBox1.setText("Smoking");
        smokingjCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smokingjCheckBox1ActionPerformed(evt);
            }
        });

        drinkingjCheckBox1.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        drinkingjCheckBox1.setForeground(new java.awt.Color(51, 102, 255));
        drinkingjCheckBox1.setText("Drinking");

        asthamajCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        asthamajCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        asthamajCheckBox.setText("Asthama");
        asthamajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asthamajCheckBoxActionPerformed(evt);
            }
        });

        epilepsyCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        epilepsyCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        epilepsyCheckBox.setText("Epilepsy");

        strokejCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        strokejCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        strokejCheckBox.setText("Stroke");

        heartDieseaseJcheckbox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        heartDieseaseJcheckbox.setForeground(new java.awt.Color(51, 102, 255));
        heartDieseaseJcheckbox.setText("Heart Diesease");

        stdjCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        stdjCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        stdjCheckBox.setText("STD");
        stdjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdjCheckBoxActionPerformed(evt);
            }
        });

        hepatitisjCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        hepatitisjCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        hepatitisjCheckBox.setText("Hepatitis");

        hivjCheckBox.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        hivjCheckBox.setForeground(new java.awt.Color(51, 102, 255));
        hivjCheckBox.setText("HIV");

        javax.swing.GroupLayout checkboxpanelLayout = new javax.swing.GroupLayout(checkboxpanel);
        checkboxpanel.setLayout(checkboxpanelLayout);
        checkboxpanelLayout.setHorizontalGroup(
            checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkboxpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diabeticjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(strokejCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HyperTensionjCheckBox)
                    .addComponent(heartDieseaseJcheckbox))
                .addGap(18, 18, 18)
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smokingjCheckBox1)
                    .addComponent(stdjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinkingjCheckBox1)
                    .addComponent(hepatitisjCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asthamajCheckBox)
                    .addComponent(hivjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(epilepsyCheckBox)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        checkboxpanelLayout.setVerticalGroup(
            checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkboxpanelLayout.createSequentialGroup()
                .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkboxpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diabeticjCheckBox)
                            .addComponent(HyperTensionjCheckBox)
                            .addComponent(smokingjCheckBox1)
                            .addComponent(drinkingjCheckBox1)
                            .addComponent(asthamajCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(checkboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strokejCheckBox)
                            .addComponent(heartDieseaseJcheckbox)
                            .addComponent(stdjCheckBox)
                            .addComponent(hepatitisjCheckBox)
                            .addComponent(hivjCheckBox)))
                    .addGroup(checkboxpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(epilepsyCheckBox)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createBtn.setBackground(new java.awt.Color(51, 102, 255));
        createBtn.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Profession*");

        professionjComboBox.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(agetxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(weightTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloodTypeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastNmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(professionjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fRadioButton)
                        .addComponent(mRadioButton)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agetxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodTypeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkboxpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(createBtn)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void smokingjCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smokingjCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smokingjCheckBox1ActionPerformed

    private void asthamajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asthamajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asthamajCheckBoxActionPerformed

    private void stdjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdjCheckBoxActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
       boolean diabetic=false;boolean hyperTension=false;boolean smoking=false;
       boolean drinking=false;boolean asthama=false;boolean epilepsy=false;
       boolean stroke=false;boolean heartDiesease=false;boolean hepatitis=false;
       boolean hiv=false;boolean std=false;
       
        if(validateForm()){
          String gender= null;
          if(fRadioButton.isSelected())
            gender="F";
          else if(mRadioButton.isSelected())
            gender = "M";  
          
            for (Component component : checkboxpanel.getComponents()) {
                if(component.getClass().equals(JCheckBox.class)){
                    JCheckBox checkBox = (JCheckBox)component;
                    if(diabeticjCheckBox.isSelected())
                        diabetic=true;
                    if(HyperTensionjCheckBox.isSelected())
                        hyperTension=true;
                    if(smokingjCheckBox1.isSelected())
                        smoking=true;
                    if(drinkingjCheckBox1.isSelected())
                        drinking=true;
                    if(asthamajCheckBox.isSelected())
                        asthama=true;
                    if(epilepsyCheckBox.isSelected())
                        epilepsy=true;
                    if(strokejCheckBox.isSelected())
                        stroke=true;
                    if(heartDieseaseJcheckbox.isSelected())
                        heartDiesease=true;
                    if(hepatitisjCheckBox.isSelected())
                        hepatitis=true;
                    if(stdjCheckBox.isSelected())
                        std=true;
                }
            }
          PatientAccount.professionType type = (PatientAccount.professionType) professionjComboBox.getSelectedItem();
            if(type == null){
              JOptionPane.showMessageDialog(this, "Choose Profession");
              return;
            }
          organization.getPatientAccountDirectory().createPatientAccount(firstNmTxtFld.getText(),
                  lastNmTxtFld.getText(), Integer.parseInt(agetxtFld.getText()),
                  bloodTypeTxtFld.getText(),Double.parseDouble(weightTxtFld.getText()),
                  gender, diabetic, hyperTension,0, smoking, drinking, asthama, epilepsy, 
                  heartDiesease, stroke,std , hepatitis, hiv,type);
          
            JOptionPane.showMessageDialog(this, "Patient Created Successfully");
            resetFields();
        }else{
            JOptionPane.showMessageDialog(this, "* field are compulsory & select one gender");
        }
          
    }//GEN-LAST:event_createBtnActionPerformed

    private void firstNmTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNmTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNmTxtFldActionPerformed

    private void fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRadioButtonActionPerformed
        // TODO add your handling code here:
        mRadioButton.setSelected(false);
    }//GEN-LAST:event_fRadioButtonActionPerformed

    private void mRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRadioButtonActionPerformed
        // TODO add your handling code here:
        fRadioButton.setSelected(false);
    }//GEN-LAST:event_mRadioButtonActionPerformed

    public void resetFields(){
        lastNmTxtFld.setText("");
        firstNmTxtFld.setText("");
        agetxtFld.setText("");
        weightTxtFld.setText("");
        bloodTypeTxtFld.setText("");
        fRadioButton.setSelected(false);
        mRadioButton.setSelected(false);
        diabeticjCheckBox.setSelected(false);
        HyperTensionjCheckBox.setSelected(false);
        smokingjCheckBox1.setSelected(false);
        drinkingjCheckBox1.setSelected(false);
        asthamajCheckBox.setSelected(false);
        epilepsyCheckBox.setSelected(false);
        heartDieseaseJcheckbox.setSelected(false);
        strokejCheckBox.setSelected(false);
        stdjCheckBox.setSelected(false);
        hepatitisjCheckBox.setSelected(false);
        hivjCheckBox.setSelected(false);
    }
    
    public boolean validateForm(){
        if(!lastNmTxtFld.getText().isEmpty() && !firstNmTxtFld.getText().isEmpty()){
            if(!agetxtFld.getText().isEmpty()){
               if(!weightTxtFld.getText().isEmpty()){
                   if((fRadioButton.isSelected() && !mRadioButton.isSelected()) ||
                          (!fRadioButton.isSelected() && mRadioButton.isSelected()))
                    return true;
               } 
            }
            
        }return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox HyperTensionjCheckBox;
    private javax.swing.JTextField agetxtFld;
    private javax.swing.JCheckBox asthamajCheckBox;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bloodTypeTxtFld;
    private javax.swing.JPanel checkboxpanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JCheckBox diabeticjCheckBox;
    private javax.swing.JCheckBox drinkingjCheckBox1;
    private javax.swing.JCheckBox epilepsyCheckBox;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JTextField firstNmTxtFld;
    private javax.swing.JCheckBox heartDieseaseJcheckbox;
    private javax.swing.JCheckBox hepatitisjCheckBox;
    private javax.swing.JCheckBox hivjCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNmTxtFld;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JComboBox professionjComboBox;
    private javax.swing.JCheckBox smokingjCheckBox1;
    private javax.swing.JCheckBox stdjCheckBox;
    private javax.swing.JCheckBox strokejCheckBox;
    private javax.swing.JTextField weightTxtFld;
    // End of variables declaration//GEN-END:variables
}