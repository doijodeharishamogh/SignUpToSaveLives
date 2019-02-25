/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AAOrganization extends Organization {
    public AAOrganization(){
        super(Organization.Type.Assign.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AARole());
        return roles;
    }
}
