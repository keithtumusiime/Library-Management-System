/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keith
 */
public class EditLibrarian extends javax.swing.JPanel {

    /**
     * Creates new form EditLibrarian
     */
    public EditLibrarian() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1090, 493));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Username");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 80, 27));

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 260, 28));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 51, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 117, -1, -1));

        jButton1.setText("Edit Librarian");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 180, 160, 38));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 76, 160, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 142, 160, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 330, 260));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("New Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 47, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Retype Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 123, -1, -1));

        jButton2.setText("Change Password");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 186, 170, 38));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 72, 170, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 148, 170, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 340, 260));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Profile");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 110, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}