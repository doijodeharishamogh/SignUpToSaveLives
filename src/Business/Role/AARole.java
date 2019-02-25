/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.UNOSEnterprise;
import Business.Network.Network;
import Business.Organization.AAOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AssigningAuthorityRole.AssigningAuthorityWorkArea;

/**
 *
 * @author HP
 */
public class AARole extends Role{
    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AssigningAuthorityWorkArea(userProcessContainer, account, (AAOrganization)organization, (UNOSEnterprise)enterprise, network);
    } 
}
