 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.camLab.CampLabAssistantWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        if(enterprise.getEnterpriseType().toString().equals("Hospital Enterprise"))
            return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
        else
            return new CampLabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
