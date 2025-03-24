package Main;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
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

        status.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("Sign Up to Loan ");

        fname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblpass.setText("Password");

        lblFname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblFname.setText("First Name");

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

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

        Already.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Already.setText("Already have an account?");

        lbl___.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl___.setForeground(new java.awt.Color(0, 0, 102));
        lbl___.setText("_____");

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

        contact.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        lblcontact.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblcontact.setText("Role");

        lbladdress.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbladdress.setText("Address");

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        lblLname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblLname.setText("Last Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("___________");

        lblUsernmae.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblUsernmae.setText("Username");

        user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblemail.setText("Email");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("___________");

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("support—financing ");
        jLabel4.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("____________________");

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel3.setText("your future today.");
        jLabel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setText("Your dreams, our");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("CrediSure");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—coin in hand loan logo_8137202.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        lblcontact1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblcontact1.setText("Contact Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUsernmae)
                        .addGap(172, 172, 172)
                        .addComponent(lblpass))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblFname)
                        .addGap(162, 162, 162)
                        .addComponent(lblemail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLname)
                        .addGap(165, 165, 165)
                        .addComponent(lblcontact1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbladdress)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontact)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(registerpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Already, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(lbl___))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lblsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsernmae)
                    .addComponent(lblpass))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFname)
                    .addComponent(lblemail))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLname)
                    .addComponent(lblcontact1))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbladdress))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblcontact)
                        .addGap(4, 4, 4)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(registerpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Already, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl___, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
           try{
           String pass1 = passwordHasher.hashPassword(pass.getText());
           int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_username, u_password, u_address, u_email, u_contact, u_status, u_type)"
                   + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+user.getText()+"', '"+pass1+"', '"+address.getText()+"', '"+Email.getText()+"', '"+contact.getText()+"', 'Pending', 'Customer')");
           if(result == 1){
               JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULY!");
               new LogIn().setVisible(true);
               this.dispose();
           }else{
               JOptionPane.showMessageDialog(null, "Saving Data FAILED!");
           }
       }catch(NoSuchAlgorithmException ex){
               System.out.println(""+ex);
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
    public javax.swing.JComboBox<String> status;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
