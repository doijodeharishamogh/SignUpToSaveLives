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
import Business.Organization.CAOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CertifyingAuthorityRole.CertifyingAuthorityWorkArea;

/**
 *
 * @author HP
 */
public class CARole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new CertifyingAuthorityWorkArea(userProcessContainer,(CAOrganization)organization, (UNOSEnterprise)enterprise,account, network);
    }
    
}
