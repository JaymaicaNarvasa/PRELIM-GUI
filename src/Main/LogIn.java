package Main;

import config.dbConnector;
import intermalpage.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        
    }

          Color navcolor = new Color (153,153,153);
          Color body = new Color (255,204,204);
          
         Border empty = BorderFactory.createEmptyBorder();
         
         void buttonBorderAnimation(JPanel panel) {
             panel.setBackground(navcolor);
             panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             panel.setBorder(BorderFactory.createStrokeBorder (new BasicStroke (2.0f)));
    
    }
         void buttonDefaultColor(JPanel panel) {
             panel.setBorder((Border) body);
             panel.setBorder(empty);
             
}
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        utxtfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ptxtfield = new javax.swing.JPasswordField();
        loginpane1 = new javax.swing.JPanel();
        Loglbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        __lbl = new javax.swing.JLabel();
        lblsign = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("support—financing ");
        jLabel4.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("____________________");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("Sign In to Loan ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Don't have an account? ");

        utxtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        utxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utxtfieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setText("Password");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Username");

        ptxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ptxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ptxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxtfieldActionPerformed(evt);
            }
        });

        loginpane1.setBackground(new java.awt.Color(255, 204, 204));
        loginpane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginpane1.setToolTipText("");
        loginpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginpane1MouseExited(evt);
            }
        });

        Loglbl1.setBackground(new java.awt.Color(255, 204, 204));
        Loglbl1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Loglbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loglbl1.setText("LOG IN");
        Loglbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Loglbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Loglbl1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout loginpane1Layout = new javax.swing.GroupLayout(loginpane1);
        loginpane1.setLayout(loginpane1Layout);
        loginpane1Layout.setHorizontalGroup(
            loginpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpane1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Loglbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        loginpane1Layout.setVerticalGroup(
            loginpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("_________________________________________________");

        __lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        __lbl.setForeground(new java.awt.Color(0, 0, 102));
        __lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        __lbl.setText("______");

        lblsign.setBackground(new java.awt.Color(255, 204, 204));
        lblsign.setForeground(new java.awt.Color(0, 0, 204));
        lblsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsign.setText("Sign Up");
        lblsign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignMouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(194, 194, 194)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(utxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(ptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(loginpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsign, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(__lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(minimize)
                    .addComponent(close)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(utxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(ptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(__lbl)
                            .addComponent(jLabel7))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void utxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utxtfieldActionPerformed

    }//GEN-LAST:event_utxtfieldActionPerformed

    private void ptxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxtfieldActionPerformed

    }//GEN-LAST:event_ptxtfieldActionPerformed

    private void loginpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseClicked
               try {
        dbConnector dbc = new dbConnector();
        Connection conn = dbc.getConnection();
        
        String sql = "SELECT u_type, u_status FROM tbl_user WHERE u_username = ? AND u_password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, utxtfield.getText().trim());
        pstmt.setString(2, ptxtfield.getText().trim());
        
        ResultSet rs = pstmt.executeQuery();

        if (utxtfield.getText().isEmpty() || ptxtfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "LOG IN FAILED! Fields must not be EMPTY");
        }else if (rs.next()) { 
            String userType = rs.getString("u_type");
            String userStatus = rs.getString("u_status");

            if (userStatus.equalsIgnoreCase("Pending")) {
                JOptionPane.showMessageDialog(this, "Your account is not yet activated!");
                
            } else if (userStatus.equalsIgnoreCase("Active")) {
                 Dashboard dash = new Dashboard();
                 dash.setVisible(true);
                 
                if (userType.equalsIgnoreCase("Admin")) {
                    adminPage ap = new adminPage();
                    dash.maindesktop.add(ap).setVisible(true);
                    
                } else if (userType.equalsIgnoreCase("User")) {
                    userPage ap = new userPage();
                    dash.maindesktop.add(ap).setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid user type!");
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Unknown account status!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Login failed! Incorrect username or password.");
        }

        rs.close();
        pstmt.close();
        conn.close();

    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }                 
    
    }//GEN-LAST:event_loginpane1MouseClicked

    private void loginpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseEntered
        loginpane1.setBackground(navcolor);
    }//GEN-LAST:event_loginpane1MouseEntered

    private void loginpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseExited
        loginpane1.setBackground(body);
    }//GEN-LAST:event_loginpane1MouseExited

    private void lblsignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignMouseClicked
            new Registration().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_lblsignMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");
        
       if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void Loglbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseClicked
      
    }//GEN-LAST:event_Loglbl1MouseClicked

    private void Loglbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseEntered

    }//GEN-LAST:event_Loglbl1MouseEntered

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loglbl1;
    private javax.swing.JLabel __lbl;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblsign;
    private javax.swing.JPanel loginpane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField ptxtfield;
    private javax.swing.JTextField utxtfield;
    // End of variables declaration//GEN-END:variables
}
