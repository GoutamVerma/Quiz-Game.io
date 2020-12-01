/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Register.java
 *
 
 */

/**
 *
 * @author megha
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /** Creates new form Register */
    public Register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pf1 = new javax.swing.JTextField();
        RegisterTF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Teletype", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUIZ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 30));

        tf1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf1.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 380, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("REGISTER HERE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 20));

        pf1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pf1.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(pf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 380, -1));

        RegisterTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterTF.setForeground(new java.awt.Color(51, 51, 0));
        RegisterTF.setText("<HTML>REGISTER &<br>START TEST </html>");
        RegisterTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(241, 236, 249), java.awt.Color.pink, new java.awt.Color(153, 0, 153), null));
        RegisterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTFActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 220, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTFActionPerformed
         try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb", "root", "a");
            Statement stmt = conn.createStatement();
            
            String sql;
            sql = "insert into result values('" + tf1.getText() + "',0,0)";
            stmt.executeUpdate(sql);
            sql = "insert into login values ( '" + tf1.getText() + "' , '" + pf1.getText() + "' )";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            new Menu(tf1.getText()).setVisible(true);
            this.setVisible(false);
        }
        catch( ClassNotFoundException e)
        {
             JOptionPane.showMessageDialog(null,"" + e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"" + e);
        }
}//GEN-LAST:event_RegisterTFActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables

}
