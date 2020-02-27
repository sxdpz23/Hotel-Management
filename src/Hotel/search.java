
package Hotel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class search extends javax.swing.JFrame {

    /** Creates new form search */
    public search() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iii = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        iii1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iii2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SEARCH DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 250, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ROOM NO. (NON - AC)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 150, 30);

        iii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iiiActionPerformed(evt);
            }
        });
        getContentPane().add(iii);
        iii.setBounds(170, 90, 150, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 140, 100, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROOM NO.", "NAME", "MOBILE NO.", "STATUS", "TYPE"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(72, 213, 770, 290);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 140, 100, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ROOM NO. (AC)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 90, 150, 30);

        iii1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iii1ActionPerformed(evt);
            }
        });
        getContentPane().add(iii1);
        iii1.setBounds(450, 90, 150, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 140, 100, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(490, 140, 100, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ROOM NO. (AC - DELUX)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 90, 180, 30);

        iii2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iii2ActionPerformed(evt);
            }
        });
        getContentPane().add(iii2);
        iii2.setBounds(790, 90, 150, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("SEARCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 140, 100, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(790, 140, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        String ii=iii.getText();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from nonac where no='"+ii+"' ";
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


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void iiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iiiActionPerformed

    private void iii1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iii1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iii1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String ii=iii1.getText();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from ac where no='"+ii+"' ";
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void iii2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iii2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iii2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      String ii=iii2.getText();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
           try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
             String query = "select * from acdelux where no='"+ii+"' ";
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iii;
    private javax.swing.JTextField iii1;
    private javax.swing.JTextField iii2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
