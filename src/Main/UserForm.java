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
public class UserForm extends javax.swing.JFrame {

    public String gender;
    public String action;
    
    
    public UserForm() {
        initComponents();
    }
    
    public void close (){
        this.setVisible(false); 
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        userPage cp = new userPage();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        labelpane = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        backpane = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        uId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)), "USER FORM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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

        uId.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        uId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        uId.setEnabled(false);
        uId.setOpaque(false);
        jPanel1.add(uId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, 30));

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

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 80, 30));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 270, 130));

        contact.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        contact.setOpaque(false);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 210, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Contact #");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 30));

        email.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.setOpaque(false);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 210, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 30));

        password.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        password.setOpaque(false);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 30));

        username.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.setOpaque(false);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Username");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

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
          int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_username , u_password , u_address, u_contact, u_email, u_status) "
           + "VALUES ('"+fname.getText()+"' , '"+lname.getText()+"' , '"+username.getText()+"' , '"+password.getText()+"' , "
                   + "'"+address.getText()+"' , '"+contact.getText()+"' , '"+email.getText()+"' , 'Pending')");
           
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
           dbc.updateData("UPDATE tbl_user SET u_fname = '"+fname.getText()+"', u_lname = '"+lname.getText()+"' ,"
                   + "u_username = '"+username.getText()+"' , u_password = '"+password.getText()+"' ,"
                   + "u_address = '"+address.getText()+"' , u_contact = '"+contact.getText()+"' , u_email = '"+email.getText()+"' ,"
                   + "WHERE u_id = '"+uId.getText()+"' ");
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

    private void backpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseClicked
        close();
    }//GEN-LAST:event_backpaneMouseClicked

    private void backpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backpaneMouseEntered

    private void backpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpaneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backpaneMouseExited

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea address;
    private javax.swing.JLabel back;
    private javax.swing.JPanel backpane;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    private javax.swing.JPanel labelpane;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField password;
    public javax.swing.JTextField uId;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
