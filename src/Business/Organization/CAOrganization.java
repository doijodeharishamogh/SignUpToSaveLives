/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CAOrganization extends Organization {
    public CAOrganization(){
        super(Organization.Type.Certify.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CARole());
        return roles;
    }
}
