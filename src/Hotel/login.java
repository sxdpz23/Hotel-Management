
package Hotel;
import java.awt.AWTEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    /** Creates new form login */
    public login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        lg_jb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -80, 630, 560);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(650, 20, 250, 70);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("USERNAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 110, 250, 70);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 200, 250, 70);

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname);
        uname.setBounds(750, 110, 250, 70);
        getContentPane().add(pass);
        pass.setBounds(750, 200, 250, 70);

        lg_jb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lg_jb.setText("LOGIN");
        lg_jb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lg_jbMouseClicked(evt);
            }
        });
        lg_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lg_jbActionPerformed(evt);
            }
        });
        getContentPane().add(lg_jb);
        lg_jb.setBounds(700, 300, 200, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void lg_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lg_jbActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_lg_jbActionPerformed

    private void lg_jbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lg_jbMouseClicked
        // TODO add your handling code here:
          if(evt.getSource()==lg_jb)
        {
            if(uname.getText().length()==0 && pass.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"!!Enter the valid entries..");
            }
            else
                if(uname.getText().equals("admin") && pass.getText().equals("123"))
            {
                this.setVisible(false);
                mainFrame d=new mainFrame();
                d.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid!! Try again..");
                uname.setText(null);
                pass.setText(null);

            }
        }

    }//GEN-LAST:event_lg_jbMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton lg_jb;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

}
