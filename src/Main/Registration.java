package Main;

import config.dbConnector;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }
                Color navcolor = new Color (153,153,153);
                Color body = new Color (255,204,204);
                
    int validateTegister(){
        int result;
        
        if(user.getText().isEmpty() || pass.getText().isEmpty() || fname.getText().isEmpty() || lname.getText().isEmpty() 
        || address.getText().isEmpty() || Email.getText().isEmpty() || contact.getText().isEmpty()){
            result = 0;
        }else if(pass.getText().length() < 8 ){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters.!");
             result = 0;
        }else if(!contact.getText().matches("\\d+")) {  
            JOptionPane.showMessageDialog(null, "Contact number should contain only numbers!");
             result = 0;
        }else if(!Email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { 
             JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
             result = 0;
        } else if(duplicateCheck()) {             
            System.out.println("Duplicate Exist");
            result = 0;
        } else{
            result = 1;
        }
        return result;
    }          
    
    public boolean duplicateCheck() {
    boolean exists = false;
    dbConnector dbc = new dbConnector();
    
    try {
        Connection conn = dbc.getConnection(); 
        String sql = "SELECT * FROM tbl_user WHERE u_username = ? OR u_email = ?";
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getText());  
        pstmt.setString(2, Email.getText()); 
        
        ResultSet rs = pstmt.executeQuery(); 
        
        if (rs.next()) { 
            exists = true;
        }
        rs.close();
        pstmt.close();
        conn.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return exists;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        registerpane = new javax.swing.JPanel();
        Loglbl1 = new javax.swing.JLabel();
        Already = new javax.swing.JLabel();
        lbl___ = new javax.swing.JLabel();
        lblsignin = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblUsernmae = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        lblcontact1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status.setBackground(new java.awt.Color(102, 102, 102));
        status.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Officer", "Manager", "Admin" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 120, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("Sign Up to Loan ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        fname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 230, 30));

        lblpass.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblpass.setText("Password");
        jPanel3.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        lblFname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblFname.setText("First Name");
        jPanel3.add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 230, 30));

        registerpane.setBackground(new java.awt.Color(255, 204, 204));
        registerpane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerpane.setToolTipText("");
        registerpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerpaneMouseExited(evt);
            }
        });

        Loglbl1.setBackground(new java.awt.Color(255, 204, 204));
        Loglbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Loglbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loglbl1.setText("Register");
        Loglbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Loglbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Loglbl1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout registerpaneLayout = new javax.swing.GroupLayout(registerpane);
        registerpane.setLayout(registerpaneLayout);
        registerpaneLayout.setHorizontalGroup(
            registerpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerpaneLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Loglbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        registerpaneLayout.setVerticalGroup(
            registerpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel3.add(registerpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 320, 40));

        Already.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Already.setText("Already have an account?");
        jPanel3.add(Already, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 170, 20));

        lbl___.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl___.setForeground(new java.awt.Color(0, 0, 102));
        lbl___.setText("_____");
        jPanel3.add(lbl___, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 50, 20));

        lblsignin.setBackground(new java.awt.Color(255, 204, 204));
        lblsignin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblsignin.setForeground(new java.awt.Color(0, 0, 204));
        lblsignin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignin.setText("Sign In");
        lblsignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsigninMouseClicked(evt);
            }
        });
        jPanel3.add(lblsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 70, 20));

        contact.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 230, 30));

        lblcontact.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblcontact.setText("Role");
        jPanel3.add(lblcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        lbladdress.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbladdress.setText("Address");
        jPanel3.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel3.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 230, 30));

        lblLname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblLname.setText("Last Name");
        jPanel3.add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("___________");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 130, -1));

        lblUsernmae.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblUsernmae.setText("Username");
        jPanel3.add(lblUsernmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 230, 30));

        lblemail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblemail.setText("Email");
        jPanel3.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("___________");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 130, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("support—financing ");
        jLabel4.setToolTipText("");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("____________________");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel3.setText("your future today.");
        jLabel3.setToolTipText("");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setText("Your dreams, our");
        jLabel1.setToolTipText("");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("CrediSure");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—coin in hand loan logo_8137202.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 490));

        lname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 230, 30));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 306, 270, 90));

        lblcontact1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblcontact1.setText("Contact Number");
        jPanel3.add(lblcontact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void registerpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerpaneMouseClicked
       int check = validateTegister();
        
    if(check == 1){
        dbConnector dbc = new dbConnector();
        int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_username, u_password, u_address, u_email, u_contact, u_status)"
              + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+user.getText()+"', '"+pass.getText()+"', '"+address.getText()+"', '"+Email.getText()+"', '"+contact.getText()+"', 'Pending')");
      
        if(result == 1){
         JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULY!");
           new LogIn().setVisible(true);
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Saving Data FAILED!");
        }
    }else{
        JOptionPane.showMessageDialog(null, "ALL FIELDS REQUIRED!");
    }
    }//GEN-LAST:event_registerpaneMouseClicked

    private void registerpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerpaneMouseEntered
        registerpane.setBackground(navcolor);
    }//GEN-LAST:event_registerpaneMouseEntered

    private void registerpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerpaneMouseExited
        registerpane.setBackground(body);
    }//GEN-LAST:event_registerpaneMouseExited

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void lblsigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsigninMouseClicked
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblsigninMouseClicked

    private void Loglbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseClicked
        
    }//GEN-LAST:event_Loglbl1MouseClicked

    private void Loglbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseEntered

    }//GEN-LAST:event_Loglbl1MouseEntered

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Already;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Loglbl1;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblUsernmae;
    private javax.swing.JLabel lbl___;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblcontact1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblsignin;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel registerpane;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
