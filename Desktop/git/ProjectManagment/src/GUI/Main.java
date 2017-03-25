/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DLL.DepartmentDLL;
import DLL.EmployeeDLL;
import DLL.ProjectDLL;
import Emtity.Department;
import Emtity.Employess;
import Emtity.Project;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    EmployeeDLL empDll = new EmployeeDLL();
    ArrayList<Employess> listEMP = new ArrayList<>();
    
    DepartmentDLL depDLL = new DepartmentDLL();
    ArrayList<Department> listDep = new ArrayList<>();
    
    ProjectDLL proDLL = new ProjectDLL();
    ArrayList<Project> listPro = new ArrayList<>();

    public Main() {
        initComponents();
        this.setLocation(350, 200);
//        Biding();
        bidingDep();
        bidingPr();

    }
    public void bidingDep(){
        listDep = depDLL.getALL();
        for(Department d :listDep){
            cbxDep.addItem(d.getDepName());
        }
    } 
    public void bidingPr(){
       listPro = proDLL.getALL();
       for(Project p :listPro){
            cbxPr.addItem(p.getPrName());
        }
    }    

    public void Biding() {
        
        listEMP = empDll.getALL();

        Vector clums = new Vector();
        clums.add("username");
        clums.add("password");
        clums.add("FullName");
        clums.add("age");
        clums.add("address");
        clums.add("phone");
        clums.add("Department");
        clums.add("Project");
        
        Vector data = new Vector();
        for(Employess emp :listEMP){
            Vector row = new Vector();
            row.add(emp.getUsername());
            row.add(emp.getPassword());
            row.add(emp.getFullName());
            row.add(emp.getAge());
            row.add(emp.getAddress());
            row.add(emp.getPhone());
//            row.add(emp.getPrID());
//            row.add(emp.getDepID());
            
            listDep = depDLL.getByID(emp.getDepID());
            if(listDep.size()>0){
                row.add(listDep.get(0).getDepName());
            }else{
                row.add("isEmpty");
            }
            
            
            listPro = proDLL.getByID(emp.getPrID());
            if(listPro.size()>0){
               row.add(listPro.get(0).getPrName()); 
            }else{
                row.add("isEmpty");
            }
            data.add(row);
            
        }
        DefaultTableModel dtm = new DefaultTableModel(data, clums);
        tblEmp.setModel(dtm);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cbxDep = new javax.swing.JComboBox();
        cbxPr = new javax.swing.JComboBox();
        User = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        FName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Addrss = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbthongbao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Employee Mangement");

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        cbxDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDepActionPerformed(evt);
            }
        });

        User.setText("User:");

        pass.setText("Pass:");

        FName.setText("Full Name:");

        Age.setText("Age:");

        Addrss.setText("Address:");

        Phone.setText("Phone:");

        jLabel8.setText("Department:");

        jLabel9.setText("Project:");

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Update.setText("UpDate");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        btdelete.setText("Delete");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("HELLO:");

        lbthongbao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbthongbao.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(FName, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Addrss, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Age, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Phone))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtAge))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxDep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(Update)
                                .addGap(29, 29, 29)
                                .addComponent(btdelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57)
                                .addComponent(lbthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFullName, txtPass, txtUser});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtAge, txtPhone});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxDep, cbxPr});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbthongbao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User)
                    .addComponent(Age)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass)
                    .addComponent(Addrss)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FName)
                    .addComponent(Phone))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Update)
                    .addComponent(btdelete))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxDep, cbxPr, txtAddress, txtAge, txtFullName, txtPass, txtPhone, txtUser});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        listDep = depDLL.getALL();
        listPro = proDLL.getALL();
        String User = txtUser.getText();
        String pass = txtPass.getText();
        String FName = txtFullName.getText();
        String Age = txtAge.getText();
        String Addrss = txtAddress.getText();
        String Phone = txtPhone.getText();
        int rowDep =cbxDep.getSelectedIndex();
        int rowPr = cbxPr.getSelectedIndex();
        
        int idDep = listDep.get(rowDep).getDepID();
        int idPr = listPro.get(rowPr).getPrID();
        
        Employess emp = new Employess();
        emp.setUsername(User);
        emp.setPassworld(pass);
        emp.setFullName(FName);
        emp.setAge(Age);
        emp.setAddress(Addrss);
        emp.setPhone(Phone);
        emp.setDepID(idDep);
        emp.setPrID(idPr);
        if(empDll.AddData(emp)){
            JOptionPane.showMessageDialog(this, "add new emp Success! ");
            Biding();
        }else{
            JOptionPane.showMessageDialog(this, "add new emp Fail! ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        if(tblEmp.getSelectedRow() !=-1){
        int row =tblEmp.getSelectedRow();
//        listDep = depDLL.getALL();
//        listPro = proDLL.getALL();
        listEMP = empDll.getALL();
        txtUser.setText(listEMP.get(row).getUsername());
        txtPass.setText(listEMP.get(row).getPassword());
        txtPass.setText(listEMP.get(row).getPassword());
        txtFullName.setText(listEMP.get(row).getFullName());
        txtAge.setText(listEMP.get(row).getAge());
        txtAddress.setText(listEMP.get(row).getAddress());
        txtPhone.setText(listEMP.get(row).getPhone());
        
        listDep = depDLL.getByID(listEMP.get(row).getDepID());
        if(listDep.size()>0){
        cbxDep.setSelectedItem(listDep.get(0).getDepName());
        }else{
            cbxDep.setSelectedIndex(0);
        }
        
        listPro = proDLL.getByID(listEMP.get(row).getPrID());
        if(listPro.size()>0){
            cbxPr.setSelectedItem(listPro.get(00).getPrName());
        }else{
            cbxPr.setSelectedIndex(0);
        }
        }
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        if(tblEmp.getSelectedRow() !=-1){
            int row = tblEmp.getSelectedRow();
            listEMP = empDll.getALL();
            
            if(empDll.Delete(listEMP.get(row).getUsername())){
                JOptionPane.showMessageDialog(this, "delete new emp Success! ");
            Biding();
            }else{
                JOptionPane.showMessageDialog(this, "delete fail ");
            }
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        listDep = depDLL.getALL();
        listPro = proDLL.getALL();
        listEMP = empDll.getALL();
        
        String User = txtUser.getText();
        String pass = txtPass.getText();
        String FName = txtFullName.getText();
        String Age = txtAge.getText();
        String Addrss = txtAddress.getText();
        String Phone = txtPhone.getText();
        int rowDep =cbxDep.getSelectedIndex();
        int rowPr = cbxPr.getSelectedIndex();
        int row =tblEmp.getSelectedRow();
        
        int idDep = listDep.get(rowDep).getDepID();
        int idPr = listPro.get(rowPr).getPrID();
        
        Employess emp = new Employess();
        emp.setUsername(listEMP.get(row).getUsername());
        emp.setPassworld(pass);
        emp.setFullName(FName);
        emp.setAge(Age);
        emp.setAddress(Addrss);
        emp.setPhone(Phone);
        emp.setDepID(idDep);
        emp.setPrID(idPr);
        
        if(empDll.update(emp)){
            JOptionPane.showMessageDialog(this, " new update emp Success! ");
            Biding();
        }else{
            JOptionPane.showMessageDialog(this, "update emp Fail! ");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void cbxDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDepActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addrss;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel FName;
    private javax.swing.JLabel Phone;
    private javax.swing.JButton Update;
    private javax.swing.JLabel User;
    private javax.swing.JButton btdelete;
    private javax.swing.JComboBox cbxDep;
    private javax.swing.JComboBox cbxPr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JLabel lbthongbao;
    private javax.swing.JLabel pass;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}