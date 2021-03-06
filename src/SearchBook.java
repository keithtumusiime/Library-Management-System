
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class SearchBook extends javax.swing.JPanel {
    GridBagLayout layout = new GridBagLayout();
    SearchByISBN sbi;
    SearchByName sbn;

    /**
     * Creates new form SearchBook
     */
    public SearchBook() {
        initComponents();
        sbi = new SearchByISBN();
        sbn = new SearchByName();
        jPanel4.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        jPanel4.add(sbi, c);
        c.gridx = 0;
        c.gridy = 0;
        jPanel4.add(sbn, c);
        
        accessionNo.setVisible(true);
        sbi.setVisible(false);
        sbn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        accessionNo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        an1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        an = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        bookself = new javax.swing.JLabel();
        edition = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accessionNo.setBackground(new java.awt.Color(255, 255, 255));
        accessionNo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Accession no:");
        accessionNo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        an1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                an1ActionPerformed(evt);
            }
        });
        an1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                an1KeyReleased(evt);
            }
        });
        accessionNo.add(an1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 223, -1));

        jLabel5.setText("Accession no:");
        accessionNo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 97, -1, 30));

        jLabel6.setText("Book Title");
        accessionNo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 227, -1, 30));

        jLabel7.setText("Author");
        accessionNo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 167, -1, -1));

        jLabel8.setText("ISBN");
        accessionNo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 161, -1, 20));

        jLabel9.setText("Edition:");
        accessionNo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 233, -1, -1));

        jLabel10.setText("Bookself no:");
        accessionNo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 107, -1, -1));

        an.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        an.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(an, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 152, 22));

        isbn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        isbn.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 152, 23));

        author.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        author.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 144, 23));

        title.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 152, 24));

        bookself.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookself.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(bookself, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 144, 22));

        edition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edition.setForeground(new java.awt.Color(0, 51, 204));
        accessionNo.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 150, 23));

        jPanel4.add(accessionNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 590, 280));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search by Accession No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by ISBN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search by Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void an1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_an1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_an1ActionPerformed

    private void an1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_an1KeyReleased
        // TODO add your handling code here:
        try{
            Connection con = Connectionz.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Books WHERE accessionNO=?");
            pst.setString(1, an1.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                an.setText(rs.getString("accessionNO"));
                isbn.setText(rs.getString("isbn"));

                bookself.setText(rs.getString("bookself"));
                title.setText(rs.getString("title"));
                author.setText(rs.getString("author"));
                edition.setText(rs.getString("edition"));

                rs.close();
                pst.close();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(accessionNo, e);
        }
    }//GEN-LAST:event_an1KeyReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        accessionNo.setVisible(true);
        sbi.setVisible(false);
        sbn.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        sbi.setVisible(true);
        accessionNo.setVisible(false);
        sbn.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        accessionNo.setVisible(false);
        sbi.setVisible(false);
        sbn.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accessionNo;
    private javax.swing.JLabel an;
    private javax.swing.JTextField an1;
    private javax.swing.JLabel author;
    private javax.swing.JLabel bookself;
    private javax.swing.JLabel edition;
    private javax.swing.JLabel isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
