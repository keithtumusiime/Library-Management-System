/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keith
 */
public class NoticeBoard extends javax.swing.JPanel {
    /**
     * Creates new form NoticeBoard
     */
    public NoticeBoard() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        from = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("From");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Posted On");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Notice Title");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("Add Notice");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        from.setForeground(new java.awt.Color(0, 102, 204));
        add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        jTextField3.setForeground(new java.awt.Color(0, 102, 204));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, -1));

        jTextField4.setForeground(new java.awt.Color(0, 102, 204));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "From", "Posted On", "Title", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 140));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}