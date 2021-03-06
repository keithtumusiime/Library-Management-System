
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keith
 */
public class EditStudent extends javax.swing.JPanel {

    /**
     * Creates new form EditStudent
     */
    public EditStudent() {
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

        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        address1 = new javax.swing.JTextField();
        address2 = new javax.swing.JTextField();
        citizen = new javax.swing.JTextField();
        nickname = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        district = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
        inactive = new javax.swing.JLabel();
        notActive = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        addPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Nickname");
        addPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel8.setText("Date of Birth");
        addPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel9.setText("Gender");
        addPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel11.setText("Religion");
        addPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel12.setText("Present Address");
        addPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel13.setText("Permanent Address");
        addPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));

        jLabel14.setText("Email");
        addPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel15.setText("Contact");
        addPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel16.setText("Occupation");
        addPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 20));

        jLabel17.setText("Home District");
        addPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 20));

        jLabel18.setText("Citizenship");
        addPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 20));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        addPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 150, 30));
        addPanel.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 440, -1));
        addPanel.add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 440, -1));
        addPanel.add(citizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 180, 30));
        addPanel.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));
        addPanel.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 30));
        addPanel.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 180, -1));
        addPanel.add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 180, -1));
        addPanel.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 180, -1));
        addPanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, -1));
        addPanel.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 180, -1));
        addPanel.add(district, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 180, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 0));
        jLabel19.setText("Student Informaition");
        addPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setText("University Information");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel6.setText("Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 220, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 220, -1));

        jLabel5.setText("Student ID:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jLabel21.setText("Faculty");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel22.setText("Department");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel3.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 220, -1));
        jPanel3.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, -1));

        lbl_image.setText("           Photo");
        jPanel3.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, 100));

        inactive.setForeground(new java.awt.Color(153, 0, 0));
        inactive.setText("Inactive");
        jPanel3.add(inactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 50, 20));

        notActive.setText("not active");
        jPanel3.add(notActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
        try{
            Connection con = Connectionz.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from students where studentID=?");
            pst.setString(1, id.getText());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                String add2 = rs.getString("name");
                name.setText(add2);
                String add3 = rs.getString("faculty");
                faculty.setText(add3);
                String add4 = rs.getString("department");
                department.setText(add4);

                byte[] add5 = rs.getBytes("image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(add5).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH));
                lbl_image.setIcon(imageIcon);

                String add6 = rs.getString("email");
                email.setText(add6);
                String add7 = rs.getString("nickname");
                nickname.setText(add7);
                String add8 = rs.getString("dob");
                dob.setText(add8);
                String add9 = rs.getString("gender");
                gender.setText(add9);
                String add10 = rs.getString("religion");
                religion.setText(add10);
                String add11 = rs.getString("contact");
                contact.setText(add11);
                String add12 = rs.getString("occupation");
                occupation.setText(add12);
                String add13 = rs.getString("homedistrict");
                district.setText(add13);
                String add14 = rs.getString("citizenship");
                citizen.setText(add14);
                String add15 = rs.getString("address1");
                address1.setText(add15);
                String add16 = rs.getString("address2");
                address2.setText(add16);

                String add = rs.getString("status");
                String status = "pending";
                if(add.equals(status)){
                    inactive.setText("Inactive");
                }else{inactive.setText("Active");}
                rs.close();
                pst.close();
            }else{

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_idKeyReleased

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField address2;
    private javax.swing.JTextField citizen;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField department;
    private javax.swing.JTextField district;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField faculty;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel inactive;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nickname;
    private javax.swing.JLabel notActive;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField religion;
    // End of variables declaration//GEN-END:variables
}
