
package Hotel;


import java.sql.*;
import javax.swing.JOptionPane;

public class AddCustomer extends javax.swing.JFrame {

    /** Creates new form AddCustomer */
    public AddCustomer() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        i = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        i1 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        g1 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        i2 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        g2 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CUSTOMER DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 40, 260, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROOM NO.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 180, 150, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 210, 150, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MOBILE NO.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 150, 20);

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NON - AC");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 140, 150, 20);

        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        getContentPane().add(i);
        i.setBounds(220, 180, 150, 22);

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        getContentPane().add(n);
        n.setBounds(220, 210, 150, 22);
        getContentPane().add(g);
        g.setBounds(220, 240, 150, 22);

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        getContentPane().add(p);
        p.setBounds(220, 270, 150, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 360, 100, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 360, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 270, 150, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TYPE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 310, 150, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NON - AC");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 310, 150, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ROOM NO.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 170, 150, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NAME");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 200, 150, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MOBILE NO.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 230, 150, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("AC");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 130, 150, 20);

        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });
        getContentPane().add(i1);
        i1.setBounds(560, 170, 150, 22);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        getContentPane().add(n1);
        n1.setBounds(560, 200, 150, 22);
        getContentPane().add(g1);
        g1.setBounds(560, 230, 150, 22);

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(560, 260, 150, 22);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 350, 100, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 350, 100, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("STATUS");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 260, 150, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TYPE");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 300, 150, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("AC");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(560, 300, 150, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ROOM NO.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(760, 170, 150, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NAME");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(760, 200, 150, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MOBILE NO.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(760, 230, 150, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("AC- DELUX");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(840, 130, 150, 20);

        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });
        getContentPane().add(i2);
        i2.setBounds(910, 170, 150, 22);

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        getContentPane().add(n2);
        n2.setBounds(910, 200, 150, 22);
        getContentPane().add(g2);
        g2.setBounds(910, 230, 150, 22);

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2);
        p2.setBounds(910, 260, 150, 22);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(810, 350, 100, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(940, 350, 100, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("STATUS");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(760, 260, 150, 20);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("TYPE");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(760, 300, 150, 20);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("AC - DELUX");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(910, 300, 150, 20);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("ROOM NO. 1 - 10 NON-AC");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(190, 420, 180, 50);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("ROOM NO. 11 - 20 AC");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(550, 420, 180, 50);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("ROOM NO. 21 - 30 AC-DL ");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(910, 420, 180, 50);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("ROOM CHART -");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(790, 430, 110, 30);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("ROOM CHART - ");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(80, 430, 110, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("ROOM CHART -");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(440, 430, 110, 30);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/6.jpg"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(0, 0, 300, 130);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/6.jpg"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(960, 0, 300, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String no=i.getText();
     String nam=n.getText();
     String mob=g.getText();
     String stat=p.getText();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
               String query = "update nonac set name='"+nam+"',mob='"+mob+"',status='"+stat+"' where no='"+no+"'";
        Statement smt3=con.createStatement();
         //ResultSet   rs=smt3.executeQueryUpdate(query);


                       int success=smt3.executeUpdate(query);
                            if(success==1)
                            {
                                JOptionPane.showMessageDialog(this, "DETAILS Successfully Added ");
                               //emp1.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                            else
                            {

                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }


        }

    catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i1ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String no=i1.getText();
     String nam=n1.getText();
     String mob=g1.getText();
     String stat=p1.getText();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
               String query = "update ac set name='"+nam+"',mob='"+mob+"',status='"+stat+"' where no='"+no+"'";
           Statement smt3=con.createStatement();
         //ResultSet   rs=smt3.executeQueryUpdate(query);



                       int success=smt3.executeUpdate(query);
                            if(success==1)
                            {
                                JOptionPane.showMessageDialog(this, "DETAILS Successfully Added ");
                               //emp1.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                            else
                            {

                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }


        }

    catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i2ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   String no=i2.getText();
     String nam=n2.getText();
     String mob=g2.getText();
     String stat=p2.getText();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
           String query = "update acdelux set name='"+nam+"',mob='"+mob+"',status='"+stat+"' where no='"+no+"'";
           Statement smt3=con.createStatement();
         //ResultSet   rs=smt3.executeQueryUpdate(query);



                       int success=smt3.executeUpdate(query);
                            if(success==1)
                            {
                                JOptionPane.showMessageDialog(this, "DETAILS Successfully Added ");
                               //emp1.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                            else
                            {

                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }


        }

    catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g;
    private javax.swing.JTextField g1;
    private javax.swing.JTextField g2;
    private javax.swing.JTextField i;
    private javax.swing.JTextField i1;
    private javax.swing.JTextField i2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField n;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField p;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    // End of variables declaration//GEN-END:variables

}
