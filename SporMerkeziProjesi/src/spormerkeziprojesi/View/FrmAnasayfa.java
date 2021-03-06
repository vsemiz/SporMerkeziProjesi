/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spormerkeziprojesi.View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author sd
 */
public class FrmAnasayfa extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnasayfa
     */
    public FrmAnasayfa() {
        initComponents();
        setIcon();
        tarih();
        saat();

    }

    public void setIcon() {

        setIconImage(Toolkit.getDefaultToolkit().getImage("src/spormerkeziprojesi/Images/icon_program.png"));

    }

    public void tarih() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
        lblTarih.setText("Tarih : " + s.format(d));

    }

    public void saat() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                lblSaat.setText("Saat : " + s.format(d));
            }
        }
        ).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMusteriKayit = new javax.swing.JButton();
        btnUyeKayit = new javax.swing.JButton();
        btnEgiticiKayit = new javax.swing.JButton();
        btnAletKayit = new javax.swing.JButton();
        btnGidaKayit = new javax.swing.JButton();
        btnUyeTakip = new javax.swing.JButton();
        btnEgiticiTakip = new javax.swing.JButton();
        btnEgitimProgramlari = new javax.swing.JButton();
        btnRaporlar = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblTarih = new javax.swing.JLabel();
        lblSaat = new javax.swing.JLabel();
        btnArama = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spor Merkezi Sistemi");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        btnMusteriKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/musteri_kayit.png"))); // NOI18N
        btnMusteriKayit.setText("Müşteri Kayıt");
        btnMusteriKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriKayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnMusteriKayit);
        btnMusteriKayit.setBounds(8, 8, 156, 32);

        btnUyeKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/uye_kayit.png"))); // NOI18N
        btnUyeKayit.setText("Üye Kayıt");
        btnUyeKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeKayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnUyeKayit);
        btnUyeKayit.setBounds(8, 46, 156, 32);

        btnEgiticiKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/egitici_kayit.png"))); // NOI18N
        btnEgiticiKayit.setText("Eğitici Kayıt");
        btnEgiticiKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgiticiKayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnEgiticiKayit);
        btnEgiticiKayit.setBounds(8, 106, 156, 32);

        btnAletKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/alet_kayit.png"))); // NOI18N
        btnAletKayit.setText("Alet Kayıt");
        btnAletKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAletKayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnAletKayit);
        btnAletKayit.setBounds(8, 144, 156, 32);

        btnGidaKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/gida_kayit.png"))); // NOI18N
        btnGidaKayit.setText("Gıda Kayıt");
        btnGidaKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGidaKayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnGidaKayit);
        btnGidaKayit.setBounds(8, 182, 156, 32);

        btnUyeTakip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/uye_takip.png"))); // NOI18N
        btnUyeTakip.setText("Üye Takip");
        btnUyeTakip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeTakipActionPerformed(evt);
            }
        });
        jPanel1.add(btnUyeTakip);
        btnUyeTakip.setBounds(8, 242, 156, 32);

        btnEgiticiTakip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/egitici_takip.png"))); // NOI18N
        btnEgiticiTakip.setText("Eğitici Takip");
        btnEgiticiTakip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgiticiTakipActionPerformed(evt);
            }
        });
        jPanel1.add(btnEgiticiTakip);
        btnEgiticiTakip.setBounds(8, 280, 156, 32);

        btnEgitimProgramlari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/egitim_programi.png"))); // NOI18N
        btnEgitimProgramlari.setText("Eğitim Programları");
        btnEgitimProgramlari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgitimProgramlariActionPerformed(evt);
            }
        });
        jPanel1.add(btnEgitimProgramlari);
        btnEgitimProgramlari.setBounds(8, 318, 156, 32);

        btnRaporlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/raporlar.png"))); // NOI18N
        btnRaporlar.setText("Raporlar");
        btnRaporlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaporlarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaporlar);
        btnRaporlar.setBounds(8, 356, 156, 32);

        btnCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/cikis.png"))); // NOI18N
        btnCikis.setText("Çıkış");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        jPanel1.add(btnCikis);
        btnCikis.setBounds(8, 504, 156, 32);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(27, 90, 137, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(14, 226, 137, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(14, 406, 137, 4);

        lblTarih.setText("Tarih :");
        jPanel1.add(lblTarih);
        lblTarih.setBounds(20, 460, 144, 16);

        lblSaat.setText("Saat :");
        jPanel1.add(lblSaat);
        lblSaat.setBounds(20, 482, 133, 16);

        btnArama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spormerkeziprojesi/Images/arama.png"))); // NOI18N
        btnArama.setText("Arama");
        btnArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArama);
        btnArama.setBounds(8, 416, 156, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 170, 540);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(190, 10, 590, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusteriKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriKayitActionPerformed
        FrmMusteriKayit musteriKayit = new FrmMusteriKayit();
        musteriKayit.setVisible(true);
    }//GEN-LAST:event_btnMusteriKayitActionPerformed

    private void btnUyeKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeKayitActionPerformed
        FrmUyeKayit uyeKayit = new FrmUyeKayit();
        uyeKayit.setVisible(true);
    }//GEN-LAST:event_btnUyeKayitActionPerformed

    private void btnEgiticiKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgiticiKayitActionPerformed
        FrmEgiticiKayit egiticiKayit = new FrmEgiticiKayit();
        egiticiKayit.setVisible(true);
    }//GEN-LAST:event_btnEgiticiKayitActionPerformed

    private void btnAletKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAletKayitActionPerformed
        FrmAletKayit aletKayit = new FrmAletKayit();
        aletKayit.setVisible(true);
    }//GEN-LAST:event_btnAletKayitActionPerformed

    private void btnGidaKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGidaKayitActionPerformed
        FrmGidaKayit gidaKayit = new FrmGidaKayit();
        gidaKayit.setVisible(true);
    }//GEN-LAST:event_btnGidaKayitActionPerformed

    private void btnUyeTakipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeTakipActionPerformed
        FrmUyeTakip uyeTakip = new FrmUyeTakip();
        uyeTakip.setVisible(true);
    }//GEN-LAST:event_btnUyeTakipActionPerformed

    private void btnEgiticiTakipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgiticiTakipActionPerformed
        FrmEgiticiTakip egiticiTakip = new FrmEgiticiTakip();
        egiticiTakip.setVisible(true);
    }//GEN-LAST:event_btnEgiticiTakipActionPerformed

    private void btnEgitimProgramlariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgitimProgramlariActionPerformed
        FrmEgitimProgramlari egitimProgramlari = new FrmEgitimProgramlari();
        egitimProgramlari.setVisible(true);
    }//GEN-LAST:event_btnEgitimProgramlariActionPerformed

    private void btnRaporlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaporlarActionPerformed
        FrmRapolar rapolar = new FrmRapolar();
        rapolar.setVisible(true);
    }//GEN-LAST:event_btnRaporlarActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaActionPerformed
        FrmArama arama = new FrmArama(this, rootPaneCheckingEnabled);
        arama.setVisible(true);
    }//GEN-LAST:event_btnAramaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmAnasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAletKayit;
    private javax.swing.JButton btnArama;
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnEgiticiKayit;
    private javax.swing.JButton btnEgiticiTakip;
    private javax.swing.JButton btnEgitimProgramlari;
    private javax.swing.JButton btnGidaKayit;
    private javax.swing.JButton btnMusteriKayit;
    private javax.swing.JButton btnRaporlar;
    private javax.swing.JButton btnUyeKayit;
    private javax.swing.JButton btnUyeTakip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblSaat;
    private javax.swing.JLabel lblTarih;
    // End of variables declaration//GEN-END:variables

}
