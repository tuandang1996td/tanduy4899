/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.ProjectDAL;
import Emtity.Department;
import Emtity.Project;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProjectDLL {

    ProjectDAL dal = new ProjectDAL();

    public ArrayList<Project> getByID(int id) {
        return dal.getByID(id);
    }

    public ArrayList<Project> getALL() {
        return dal.getALL();
    }
}
