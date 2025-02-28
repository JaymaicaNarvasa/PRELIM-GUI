/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intermalpage;

import Main.*;
import config.dbConnector;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class adminPage extends javax.swing.JInternalFrame {

    /** Creates new form adminPage */
    public adminPage() {
        initComponents();
        
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
    }
    
     public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_customer");
            customer_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    
            Color navcolor = new Color (153,153,153);
            Color body = new Color (255,204,204);
            
            
            public String gender;
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addpane = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editpane = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        delpane = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        searchpane = new javax.swing.JPanel();
        search1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customer_tbl = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        refreshpane = new javax.swing.JPanel();
        refresh = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        addpane.setBackground(new java.awt.Color(255, 204, 204));
        addpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addpaneMouseExited(evt);
            }
        });
        addpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        addpane.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jPanel1.add(addpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 50, 30));

        editpane.setBackground(new java.awt.Color(255, 204, 204));
        editpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editpaneMouseExited(evt);
            }
        });
        editpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("EDIT");
        editpane.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jPanel1.add(editpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 50, 30));

        delpane.setBackground(new java.awt.Color(255, 204, 204));
        delpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delpaneMouseExited(evt);
            }
        });
        delpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("DELETE");
        delpane.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanel1.add(delpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 60, 30));

        searchpane.setBackground(new java.awt.Color(255, 204, 204));
        searchpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchpaneMouseExited(evt);
            }
        });
        searchpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search1.setBackground(new java.awt.Color(255, 255, 255));
        search1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search1.setText("SERACH");
        searchpane.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanel1.add(searchpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 60, 30));

        customer_tbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customer_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(customer_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 670, 280));

        search.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setOpaque(false);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 170, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("__________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -20, 290, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("__________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 290, 70));

        refreshpane.setBackground(new java.awt.Color(255, 204, 204));
        refreshpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        refreshpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshpaneMouseExited(evt);
            }
        });
        refreshpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("REFRESH");
        refreshpane.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(refreshpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseClicked
        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainJFrame.dispose();
        new CustomerForm().setVisible(true);
    }//GEN-LAST:event_addpaneMouseClicked

    private void addpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseEntered
        addpane.setBackground(navcolor);
    }//GEN-LAST:event_addpaneMouseEntered

    private void addpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseExited
        addpane.setBackground(body);
    }//GEN-LAST:event_addpaneMouseExited

    private void editpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpaneMouseClicked
        int rowindex = customer_tbl.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Field");
        }else {
            TableModel model = customer_tbl.getModel();
            CustomerForm cf = new CustomerForm();
            cf.cId.setText(""+model.getValueAt(rowindex, 0));
            cf.fname.setText(""+model.getValueAt(rowindex, 1));
            cf.lname.setText(""+model.getValueAt(rowindex, 2));
            cf.contact.setText(""+model.getValueAt(rowindex, 3));
            cf.email.setText(""+model.getValueAt(rowindex, 4));
            gender = model.getValueAt(rowindex, 7).toString();
        }
    }//GEN-LAST:event_editpaneMouseClicked

    private void editpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpaneMouseEntered
        editpane.setBackground(navcolor);
    }//GEN-LAST:event_editpaneMouseEntered

    private void editpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpaneMouseExited
        editpane.setBackground(body);
    }//GEN-LAST:event_editpaneMouseExited

    private void delpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpaneMouseClicked

    }//GEN-LAST:event_delpaneMouseClicked

    private void delpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpaneMouseEntered
        delpane.setBackground(navcolor);
    }//GEN-LAST:event_delpaneMouseEntered

    private void delpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpaneMouseExited
        delpane.setBackground(body);
    }//GEN-LAST:event_delpaneMouseExited

    private void searchpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpaneMouseClicked

    }//GEN-LAST:event_searchpaneMouseClicked

    private void searchpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpaneMouseEntered
        searchpane.setBackground(navcolor);
    }//GEN-LAST:event_searchpaneMouseEntered

    private void searchpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpaneMouseExited
        searchpane.setBackground(body);
    }//GEN-LAST:event_searchpaneMouseExited

    private void refreshpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshpaneMouseClicked
        displayData();
    }//GEN-LAST:event_refreshpaneMouseClicked

    private void refreshpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshpaneMouseEntered
        refreshpane.setBackground(navcolor);
    }//GEN-LAST:event_refreshpaneMouseEntered

    private void refreshpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshpaneMouseExited
        refreshpane.setBackground(body);
    }//GEN-LAST:event_refreshpaneMouseExited

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addpane;
    private javax.swing.JTable customer_tbl;
    private javax.swing.JLabel del;
    private javax.swing.JPanel delpane;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editpane;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refresh;
    private javax.swing.JPanel refreshpane;
    private javax.swing.JTextField search;
    private javax.swing.JLabel search1;
    private javax.swing.JPanel searchpane;
    // End of variables declaration//GEN-END:variables

}
