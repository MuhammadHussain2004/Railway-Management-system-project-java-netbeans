/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kk
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        froms = new javax.swing.JTextField();
        tos = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RAILWAY  MANAGEMENT SYSTEM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, 50));

        froms.setText("FROM STATION");
        froms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fromsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fromsMouseEntered(evt);
            }
        });
        froms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromsActionPerformed(evt);
            }
        });
        jPanel1.add(froms, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 250, 50));

        tos.setText("TO STATION");
        tos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tosMouseEntered(evt);
            }
        });
        jPanel1.add(tos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 250, 50));

        search.setBackground(new java.awt.Color(102, 51, 0));
        search.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 210, 50));

        view.setBackground(new java.awt.Color(0, 102, 102));
        view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "t_code", "t_name", "froms", "tos", "departure", "arrival", "total_time", "total_stops", "ticket_price", "inserted_time", "pub_date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(view);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1340, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/railpic.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        page1 go=new page1();
        go.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fromsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromsActionPerformed

    private void fromsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromsMouseClicked
        // TODO add your handling code here:
            froms.setText("");
    }//GEN-LAST:event_fromsMouseClicked

    private void fromsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromsMouseEntered
        // TODO add your handling code here:
        if(froms.getText().trim().isEmpty()){
            froms.setText("FROM STATION");
        }
    }//GEN-LAST:event_fromsMouseEntered

    private void tosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tosMouseEntered
        // TODO add your handling code here:
        if(tos.getText().trim().isEmpty()){
            tos.setText("TO STATION");
        }
    }//GEN-LAST:event_tosMouseEntered

    private void tosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tosMouseClicked
        // TODO add your handling code here:
                   tos.setText("");

    }//GEN-LAST:event_tosMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
          if(froms.getText().equals(tos.getText())){
            JOptionPane.showMessageDialog(this, "FROM AND TO STATION CANNOT BE EQUAL", "DESTINATION",2);

        }
          else
        {
          
              try {
                  Dbms go=new Dbms();
                                        DefaultTableModel tb=(DefaultTableModel)view.getModel();
                          tb.setRowCount(0);  // Clear the table before adding new data

                  ResultSet rs;
                  rs=go.searchtrains(froms.getText(), tos.getText());
                  if (!rs.isBeforeFirst()) {  // Check if the ResultSet is empty
            JOptionPane.showMessageDialog(this, "NO RECORD FOUND", "SEARCH RESULT", 2);
        } 
                  while(rs.next())
                  {
                      
                
                String [] data={rs.getString("t_code"),rs.getString("t_name"),rs.getString("froms"),rs.getString("tos"),rs.getString("departure"),rs.getString("arrival"),rs.getString("total_time"),rs.getString("total_stops"),rs.getString("ticket_price"),rs.getString("inserted_time"),rs.getString("pub_date")};
                
               tb.addRow(data);
               
                  }
                  
                  
              } catch (SQLException ex) {
              
                      
                  
                  Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
              }
            

        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField froms;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search;
    private javax.swing.JTextField tos;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}
