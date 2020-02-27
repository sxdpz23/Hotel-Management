

package Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class mainFrame extends javax.swing.JFrame {

    /** Creates new form mainFrame */
    public mainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 390, 200, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 330, 200, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("ADD CUSTOMER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 270, 200, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("HELPLINES");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(40, 450, 200, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROOM NO.", "NAME", "MOBILE NO.", "STATUS", "TYPE"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setHeaderValue("NAME");
            table.getColumnModel().getColumn(2).setHeaderValue("MOBILE NO.");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 60, 540, 190);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("AC - DELUX");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(750, 20, 120, 25);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("CHECK BOOKED ROOMS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 10, 160, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("NON - AC");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(530, 20, 100, 25);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("AC");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(640, 20, 100, 25);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROOM NO.", "STATUS", "TYPE"
            }
        ));
        jScrollPane2.setViewportView(table1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 320, 540, 190);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("AC - DELUX");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(750, 280, 120, 25);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("CHECK AVAILABLE ROOMS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 270, 170, 40);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton12.setText("NON - AC");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(530, 280, 100, 25);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setText("AC");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(640, 280, 100, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 310, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     this.setVisible(false);
     AddCustomer d=new AddCustomer();
     d.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
     search d=new search();
     d.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    this.setVisible(false);
    helplines hh=new helplines();
    hh.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.setVisible(false);
    Sell hh=new Sell();
    hh.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.setVisible(false);
    Sell hh=new Sell();
    hh.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from acdelux where status ='BOOKED'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                String mob = rs.getString("mob");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,name,mob,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from nonac where status ='BOOKED'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                String mob = rs.getString("mob");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,name,mob,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from ac where status ='BOOKED'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                String mob = rs.getString("mob");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,name,mob,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 DefaultTableModel model = (DefaultTableModel) table1.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select no,status,type from acdelux where status ='AVAILABLE'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         DefaultTableModel model = (DefaultTableModel) table1.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select no,status,type from nonac where status ='AVAILABLE'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 DefaultTableModel model = (DefaultTableModel) table1.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select no,status,type from ac where status ='AVAILABLE'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String no = rs.getString("no");
                String stat = rs.getString("status");
                String typ = rs.getString("type");

                model.addRow(new Object[] {no,stat,typ});
            }
            rs.close();
            //stmt.close();
            //con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

}
