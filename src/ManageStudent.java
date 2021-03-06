
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Keith
 */
public class ManageStudent extends javax.swing.JPanel {
    GridBagLayout layout = new GridBagLayout();
    EditStudent es;
    StudentDetails sd;
    PreparedStatement pst,pst1;
    Connection con;
    ResultSet rs;
    String filename;
    byte[] person_image;

    /**
     * Creates new form ManageStudent
     */
    public ManageStudent() {
        initComponents();
        es = new EditStudent();
        sd = new StudentDetails();
        
        backPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        backPanel.add(es, c);
        backPanel.add(sd, c);
        
        student.setVisible(true);
        sd.setVisible(false);
        es.setVisible(false);
    }
    String imgPath = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        student = new javax.swing.JPanel();
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
        add1 = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
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
        jLabel22 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add new Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add new Student");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edit Student");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 250, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Details");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 290, 30));

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 4));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student.setBackground(new java.awt.Color(255, 255, 255));
        student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Nickname");
        student.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        jLabel8.setText("Date of Birth");
        student.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 344, -1, 20));

        jLabel9.setText("Gender");
        student.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        jLabel11.setText("Religion");
        student.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel12.setText("Present Address");
        student.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel13.setText("Permanent Address");
        student.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 20));

        jLabel14.setText("Email");
        student.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel15.setText("Contact");
        student.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel16.setText("Occupation");
        student.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 20));

        jLabel17.setText("Home District");
        student.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, 20));

        jLabel18.setText("Citizenship");
        student.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, 20));

        jButton1.setText("Add Student");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        student.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 150, 30));
        student.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 440, -1));
        student.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 440, -1));
        student.add(citizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 180, -1));
        student.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, -1));
        student.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 180, -1));
        student.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 180, -1));
        student.add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 180, -1));
        student.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 180, -1));
        student.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, -1));
        student.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 180, -1));
        student.add(district, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 180, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 0));
        jLabel19.setText("Personal Informaition");
        student.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel22.setText("Department");
        student.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        student.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));
        student.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 220, -1));

        jLabel21.setText("Faculty");
        student.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel6.setText("Name");
        student.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, -1));
        student.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, -1));
        student.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, -1));

        jLabel5.setText("Student ID:");
        student.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setText("University Information");
        student.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lbl_image.setText("           Photo");
        student.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 120));

        jButton2.setText("Browse");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        student.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));
        student.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 198, 560, -1));

        backPanel.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 720, 590));

        add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 780, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here
        
        student.setVisible(true);
        es.setVisible(false);
        sd.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        es.setVisible(true);
        student.setVisible(false);
        sd.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        sd.setVisible(true);
        es.setVisible(false);
        student.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String query = "INSERT INTO `students`(`studentID`, `name`, `faculty`, `department`, `image`, `nickname`, `dob`, `gender`, `religion`, `email`, `contact`, `occupation`, `homedistrict`, `citizenship`, `address1`, `address2`, `status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,'pending')";

        try{
            con = Connectionz.getConnection();
            pst = con.prepareStatement(query);
            pst1=con.prepareStatement("INSERT INTO `login`(`username`, `password`, `status`) VALUES (?,?,'Student')");
            pst.setString(1, id.getText());
            pst1.setString(2, id.getText());
            pst.setString(2, name.getText());
            pst.setString(3, faculty.getText());
            pst.setString(4, department.getText());
            pst.setBytes(5, person_image);
            pst.setString(6, nickname.getText());
            pst1.setString(1, nickname.getText());
            pst.setString(7, dob.getText());
            pst.setString(8, gender.getText());
            pst.setString(9, religion.getText());
            pst.setString(10, email.getText());
            pst.setString(11, contact.getText());
            pst.setString(12, occupation.getText());
            pst.setString(13, district.getText());
            pst.setString(14, citizen.getText());
            pst.setString(15, add1.getText());
            pst.setString(16, add2.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Student Added Successfully");

            JTextField temp = null;
            for(Component c:student.getComponents()){
                if(c.getClass().toString().contains("javax.swing.JTextField")){
                    temp = (JTextField)c;
                    temp.setText(null);
                }
            }
            lbl_image.setIcon(null);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename= f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageIcon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for(int readNum;(readNum=fis.read(buffer) )!= -1;){
                bos.write(buffer,0,readNum);
            }
            person_image = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JPanel backPanel;
    private javax.swing.JTextField citizen;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField department;
    private javax.swing.JTextField district;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField faculty;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField religion;
    private javax.swing.JPanel student;
    // End of variables declaration//GEN-END:variables
}
