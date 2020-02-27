

package Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Sell extends javax.swing.JFrame {

    /** Creates new form Sell */
    public Sell() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        i1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        i = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        i2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DELETE RECORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 10, 205, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/P124.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 500, 430);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ROOM NO. (AC)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 180, 150, 30);

        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });
        getContentPane().add(i1);
        i1.setBounds(680, 180, 150, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 240, 100, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(700, 240, 100, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ROOM NO. (NON - AC)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 60, 150, 30);

        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        getContentPane().add(i);
        i.setBounds(674, 60, 150, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(580, 120, 100, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(690, 120, 100, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ROOM NO. (NON - AC)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 300, 150, 30);

        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });
        getContentPane().add(i2);
        i2.setBounds(680, 300, 150, 30);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 360, 100, 30);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(700, 360, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String iii=i1.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
            String query = "DELETE from ac where no='"+iii+"'   ";
            int success=stmt.executeUpdate(query);
            if(success==1)
            {
                JOptionPane.showMessageDialog(this, "RECORD deleted succefully");
            }
          else
            {
                JOptionPane.showMessageDialog(this, "PROBLEM in deleting");
          }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String iii=i.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
            String query = "DELETE from nonac where no='"+iii+"'   ";
            int success=stmt.executeUpdate(query);
            if(success==1)
            {
                JOptionPane.showMessageDialog(this, "RECORD deleted succefully");
            }
          else
            {
                JOptionPane.showMessageDialog(this, "PROBLEM in deleting");
          }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     this.setVisible(false);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
String iii=i2.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            Statement stmt = con.createStatement();
            String query = "DELETE from acdelux where no='"+iii+"'   ";
            int success=stmt.executeUpdate(query);
            if(success==1)
            {
                JOptionPane.showMessageDialog(this, "RECORD deleted succefully");
            }
          else
            {
                JOptionPane.showMessageDialog(this, "PROBLEM in deleting");
          }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     this.setVisible(true);
     mainFrame mm=new mainFrame();
     mm.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField i;
    private javax.swing.JTextField i1;
    private javax.swing.JTextField i2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
