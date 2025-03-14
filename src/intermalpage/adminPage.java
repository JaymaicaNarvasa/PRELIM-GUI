package intermalpage;

import Main.*;
import config.dbConnector;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class adminPage extends javax.swing.JInternalFrame {

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
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_address, u_email, u_contact, u_status "
                                     + "FROM tbl_user");
            adminr_tbl.setModel(DbUtils.resultSetToTableModel(rs));
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
        adminr_tbl = new javax.swing.JTable();
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

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN");

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

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addpaneLayout = new javax.swing.GroupLayout(addpane);
        addpane.setLayout(addpaneLayout);
        addpaneLayout.setHorizontalGroup(
            addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addpaneLayout.setVerticalGroup(
            addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("EDIT");

        javax.swing.GroupLayout editpaneLayout = new javax.swing.GroupLayout(editpane);
        editpane.setLayout(editpaneLayout);
        editpaneLayout.setHorizontalGroup(
            editpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        editpaneLayout.setVerticalGroup(
            editpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("DELETE");

        javax.swing.GroupLayout delpaneLayout = new javax.swing.GroupLayout(delpane);
        delpane.setLayout(delpaneLayout);
        delpaneLayout.setHorizontalGroup(
            delpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        delpaneLayout.setVerticalGroup(
            delpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        search1.setBackground(new java.awt.Color(255, 255, 255));
        search1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search1.setText("SERACH");

        javax.swing.GroupLayout searchpaneLayout = new javax.swing.GroupLayout(searchpane);
        searchpane.setLayout(searchpaneLayout);
        searchpaneLayout.setHorizontalGroup(
            searchpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        searchpaneLayout.setVerticalGroup(
            searchpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        adminr_tbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminr_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(adminr_tbl);

        search.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("__________________________");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("__________________________");

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

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("REFRESH");

        javax.swing.GroupLayout refreshpaneLayout = new javax.swing.GroupLayout(refreshpane);
        refreshpane.setLayout(refreshpaneLayout);
        refreshpaneLayout.setHorizontalGroup(
            refreshpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        refreshpaneLayout.setVerticalGroup(
            refreshpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(editpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(delpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(searchpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        int rowindex = adminr_tbl.getSelectedRow();

        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Field");
        }else {
            TableModel model = adminr_tbl.getModel();
            AdminForm af = new AdminForm();
            af.uId.setText(""+model.getValueAt(rowindex, 0));
            af.fname.setText(""+model.getValueAt(rowindex, 1));
            af.lname.setText(""+model.getValueAt(rowindex, 2));
            af.address.setText(model.getValueAt(rowindex, 3).toString());
            af.email.setText(""+model.getValueAt(rowindex, 4));
            af.contact.setText(""+model.getValueAt(rowindex, 5));
           // af.password.setText(""+model.getValueAt(rowindex, 6));
            af.action = "UPDATE";
            af.label.setText("UPDATE");
            af.setVisible(true);
            JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
        }
    }//GEN-LAST:event_editpaneMouseClicked

    private void editpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpaneMouseEntered
        editpane.setBackground(navcolor);
    }//GEN-LAST:event_editpaneMouseEntered

    private void editpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpaneMouseExited
        editpane.setBackground(body);
    }//GEN-LAST:event_editpaneMouseExited

    private void delpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpaneMouseClicked
            int rowIndex = adminr_tbl.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
        }else{
            TableModel model = adminr_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE ID: " + id);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int uId = Integer.parseInt(id);
                dbc.deleteData(uId, "tbl_user", "u_id");
                displayData();
            }
        }
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
       
    }//GEN-LAST:event_jPanel1MouseMoved

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainJFrame.dispose();
        AdminForm cf = new AdminForm();
                cf.setVisible(true);
                cf.action = "ADD";
                cf.label.setText("SAVE");
    }//GEN-LAST:event_addMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addpane;
    private javax.swing.JTable adminr_tbl;
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
