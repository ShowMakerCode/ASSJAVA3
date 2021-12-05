/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongdtph18761_assignment_it17101.sof203;

import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author 98tae
 */
public class MainForm extends javax.swing.JFrame {

    public static LOGIN login;
    public static QLDiem qldiem;
    public static QLSV qlsv;
    public static DSSV dssv;
    public static String bien;
    public static MainForm mainform;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setTitle("Phần Mềm Quản Lý Sinh Viên");
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        login = new LOGIN();
        qldiem = new QLDiem();
        qlsv = new QLSV();
        bien = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangNhap = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();
        btnAbount = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbdangnhap = new javax.swing.JLabel();
        jlbquyen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/dangnhap.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exitt.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAbount.setText("About");
        btnAbount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbountActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exitt.png"))); // NOI18N
        jButton2.setText("Đăng Xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlbquyen, lbdangnhap});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlbquyen, lbdangnhap});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangNhap)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnAbount)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbount, btnExit, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbount)
                            .addComponent(btnExit))))
                .addContainerGap(452, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAbount, btnDangNhap, btnExit, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (bien.equals("qlsv")) {
            Helper.MyMess.msgFalse("Vui Lòng Đăng Xuất");
            return;
        }
        if (bien.equals("qldiem")) {
            Helper.MyMess.msgFalse("Vui Lòng Đăng Xuất");
            return;
        }
        if (bien.equals("dssv")) {
            Helper.MyMess.msgFalse("Vui Lòng Đăng Xuất");
            return;
        }
        dangnhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (bien.equals("")) {
            JOptionPane.showMessageDialog(this, " vui lòng đăng nhập");
            dangnhap();
            return;
        }
        if (bien.equals("qlsv")) {
            qlsv.setVisible(false);
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
            dangnhap();
        }
        if (bien.equals("qldiem")) {
            qldiem.setVisible(false);
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
            dangnhap();
        }
        if (bien.equals("dssv")) {
            dssv.setVisible(false);
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
            dangnhap();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAbountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbountActionPerformed
        new ThongTinSV(this, true).setVisible(true);
    }//GEN-LAST:event_btnAbountActionPerformed
    private void close() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void dangnhap() {
        if (login.isVisible()) {
            login.setVisible(false);
        }
        login.setVisible(true);

    }

    public static void openqlsv() {
        qlsv.setVisible(true);
        bien = "qlsv";
    }

    public static void openqldiem() {
        qldiem.setVisible(true);
        bien = "qldiem";
        setquyen(bien);
        
    }

    public static void opendssv() {
        dssv.setVisible(true);
        bien = "dssv";
        setquyen(bien);
    }

    public static void setquyen(String quyen) {
        lbdangnhap.setText("Đang Đăng Nhập");
        jlbquyen.setText("Quyền : " + quyen);

    }

   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new MainForm().setVisible(true);
                login.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbount;
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jlbquyen;
    public static javax.swing.JLabel lbdangnhap;
    // End of variables declaration//GEN-END:variables
}
