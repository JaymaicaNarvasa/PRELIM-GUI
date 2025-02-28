/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import intermalpage.*;
import java.awt.Color;
import Main.*;
import config.dbConnector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CustomerForm extends javax.swing.JFrame {

    public String gender;
    public String action;
    
    
    public CustomerForm() {
        initComponents();
    }
    
    public void close (){
        this.setVisible(false); 
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        customerPage cp = new customerPage();
        dash.maindesktop.add(cp).setVisible(true);
    }
            Color navcolor = new Color (153,153,153);
            Color body = new Color (255,204,204);
            
            
    int validateTegister(){
        int result;
        
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || address.getText().isEmpty() ||
           email.getText().isEmpty() || contact.getText().isEmpty()){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelpane = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        backpane = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        cId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)), "CUSTOMER FORM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelpane.setBackground(new java.awt.Color(255, 204, 204));
        labelpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelpaneMouseExited(evt);
            }
        });
        labelpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("LABEL");
        labelpane.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jPanel1.add(labelpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 110, 30));

        backpane.setBackground(new java.awt.Color(204, 204, 204));
        backpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backpaneMouseExited(evt);
            }
        });
        backpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<");
        backpane.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(backpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 30, 30));

        cId.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cId.setEnabled(false);
        cId.setOpaque(false);
        jPanel1.add(cId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        fname.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.setOpaque(false);
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        lname.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lname.setOpaque(false);
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 60, 30));

        female.setBackground(new java.awt.Color(153, 153, 153));
        female.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, 30));

        male.setBackground(new java.awt.Color(153, 153, 153));
        male.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        male.setText("MALE");
        male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleMouseClicked(evt);
            }
        });
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 70, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 80, 30));

        status.setBackground(new java.awt.Color(153, 153, 153));
        status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 250, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, 30));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 270, 130));

        contact.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        contact.setOpaque(false);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Contact #");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        email.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.setOpaque(false);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpaneMouseClicked
         dbConnector dbc = new dbConnector();
        if(action.equals("ADD")){
            
            int check = validateTegister();
        if(check == 1){
          int result = dbc.insertData("INSERT INTO tbl_customer(c_fname, c_lname, c_gender, c_address, c_contact, c_email, c_status) "
           + "VALUES ('"+fname.getText()+"' , '"+lname.getText()+"' , '"+gender+"' , '"+address.getText()+"' , '"+contact.getText()+"' , '"+email.getText()+"' , '"+status.getSelectedItem()+"')");
           
          if(result == 1){
              JOptionPane.showMessageDialog(null, "SUCCESSFULLY SAVE");
             close();
          }else {
              System.out.println("Saving DATA FAILED!");
          }
        }else {
             JOptionPane.showMessageDialog(null, "ALL FIELDS REQUIRED!");
        }
        
        
       }else if(action.equals("UPDATE")){
           dbc.updateData("UPDATE tbl_customer SET c_fname = '"+fname.getText()+"', c_lname = '"+lname.getText()+"', c_gender = '"+gender+"', "
                   + "c_address = '"+address.getText()+"', c_contact = '"+contact.getText()+"', c_email = '"+email.getText()+"', c_status = '"+status.getSelectedItem()+"' "
                   + "WHERE c_id = '"+cId.getText()+"'");
           close();
       }else {
           JOptionPane.showMessageDialog(null, "NO Action SELECTED!");
           close();
       }
    }//GEN-LAST:event_labelpaneMouseClicked

    private void labelpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpaneMouseEntered
        labelpane.setBackground(navcolor);
    }//GEN-LAST:event_labelpaneMouseEntered

    private void labelpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpaneMouseExited
        labelpane.setBackground(body);
    }//GEN-LAST:event_labelpaneMouseExited

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected())
        {
            gender = "Male";
        }else
        {
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void backpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseClicked
        close();
    }//GEN-LAST:event_backpaneMouseClicked

    private void backpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backpaneMouseEntered

    private void backpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backpaneMouseExited

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
      male.setSelected(false);
        if(female.isSelected())
        {
            gender = "Female";
        }else
        {
            gender = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_maleMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea address;
    private javax.swing.JLabel back;
    private javax.swing.JPanel backpane;
    public javax.swing.JTextField cId;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    private javax.swing.JPanel labelpane;
    public javax.swing.JTextField lname;
    public javax.swing.JRadioButton male;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
