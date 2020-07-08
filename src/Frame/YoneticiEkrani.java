
package Frame;

import DB.VeriTabaniBaglanti;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class YoneticiEkrani extends javax.swing.JFrame {
    public static String paketId;
    DefaultTableModel defaultTableModel=new DefaultTableModel();
    Object[] satir={"İsim" , "Soyisim", "Kullanıcı Adı", "Şifre", "Paket İsmi", "İndirme Hızı", "Yükleme Hızı","Fiyat"};
    Object[] sutun=new Object[8];
    
    public YoneticiEkrani() {
        initComponents();
        tabloGoster("select * from kullanici INNER JOIN paketler on kullanici.paket_id=paketler.paket_id ");
        comboBoxYapilandir();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        basvur_buton1 = new javax.swing.JButton();
        admin_buton1 = new javax.swing.JButton();
        kullanici_buton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        YoneticiPanel = new javax.swing.JTable();
        cikar_buton = new javax.swing.JButton();
        bul_buton = new javax.swing.JButton();
        guncelle_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JTextField();
        sifre_text_field = new javax.swing.JTextField();
        paket_ismi_check_box = new javax.swing.JComboBox();
        cikis_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Ekranı");

        jPanel4.setBackground(new java.awt.Color(21, 50, 70));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        basvur_buton1.setBackground(new java.awt.Color(167, 153, 153));
        basvur_buton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        basvur_buton1.setText("Başvur");

        admin_buton1.setBackground(new java.awt.Color(167, 153, 153));
        admin_buton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        admin_buton1.setText("Yönetici Girişi");

        kullanici_buton1.setBackground(new java.awt.Color(167, 153, 153));
        kullanici_buton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        kullanici_buton1.setText("Kullanıcı Girişi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvur_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(admin_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kullanici_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basvur_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YoneticiPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        YoneticiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YoneticiPanelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(YoneticiPanel);

        cikar_buton.setText("Çıkar");
        cikar_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikar_butonActionPerformed(evt);
            }
        });

        bul_buton.setText("Bul");
        bul_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bul_butonActionPerformed(evt);
            }
        });

        guncelle_button.setText("Güncelle");
        guncelle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paket İsmi :");

        paket_ismi_check_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paket_ismi_check_boxİtemStateChanged(evt);
            }
        });

        cikis_buton.setText("Çıkış");
        cikis_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cikar_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bul_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(guncelle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifre_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(paket_ismi_check_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(cikis_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(cikar_buton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bul_buton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guncelle_button)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addContainerGap(31, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(sifre_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(paket_ismi_check_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cikis_buton))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YoneticiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoneticiPanelMouseClicked

       kullanici_adi.setText((String) defaultTableModel.getValueAt(YoneticiPanel.getSelectedRow(), 2));
       sifre_text_field.setText((String) defaultTableModel.getValueAt(YoneticiPanel.getSelectedRow(), 3));
       paket_ismi_check_box.addItem((String) defaultTableModel.getValueAt(YoneticiPanel.getSelectedRow(), 4));
    }//GEN-LAST:event_YoneticiPanelMouseClicked

    private void bul_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bul_butonActionPerformed
        String kullaniciAdi , SQLsorgu;
        kullaniciAdi=kullanici_adi.getText();
        if(kullaniciAdi.isEmpty()){
            String SQLbosSorgu="select * from kullanici INNER JOIN paketler on kullanici.paket_id=paketler.paket_id ";
            tabloGoster(SQLbosSorgu);
        }
        if (!kullaniciAdi.isEmpty()) {
          SQLsorgu="select * from kullanici INNER JOIN paketler on kullanici.paket_id=paketler.paket_id where isim= '"+kullaniciAdi+"'"; 
            System.out.println(SQLsorgu);
          tabloGoster(SQLsorgu);
        }
    }//GEN-LAST:event_bul_butonActionPerformed

    private void cikar_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikar_butonActionPerformed
        String kullaniciAdi , sifre,paketIsmi;
        kullaniciAdi=kullanici_adi.getText();
        sifre=sifre_text_field.getText();
        String SQLsorgu = "DELETE FROM kullanici WHERE kullanici_adi= '" + kullaniciAdi + "'and "+"sifre ='" +sifre+"'";
        System.out.println(SQLsorgu);
        VeriTabaniBaglanti.veriGuncelle(SQLsorgu);
        defaultTableModel.setColumnCount(0);
        defaultTableModel.setRowCount(0);
        tabloGoster("select * from kullanici INNER JOIN paketler on kullanici.paket_id=paketler.paket_id");
    }//GEN-LAST:event_cikar_butonActionPerformed

    private void guncelle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_buttonActionPerformed
        String kullaniciAdi , sifre,paketIsmi ;
        kullaniciAdi=kullanici_adi.getText();
        sifre=sifre_text_field.getText();       
        String SQLsorgu="update kullanici set sifre='"+sifre+"' where kullanici_adi ='" +kullaniciAdi+"'";   
        System.out.println(SQLsorgu);
        VeriTabaniBaglanti.veriGuncelle(SQLsorgu);
        tabloGoster("select * from kullanici INNER JOIN paketler on kullanici.paket_id=paketler.paket_id");

        
        
    }//GEN-LAST:event_guncelle_buttonActionPerformed

    private void paket_ismi_check_boxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paket_ismi_check_boxİtemStateChanged
        paketIdAtama();
    }//GEN-LAST:event_paket_ismi_check_boxİtemStateChanged

    private void cikis_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonActionPerformed
       dispose();
    }//GEN-LAST:event_cikis_butonActionPerformed

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
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiEkrani().setVisible(true);
            }
        });
    }
    private void tabloGoster(String SQLsorgu){            
        ResultSet resultSet=VeriTabaniBaglanti.listele(SQLsorgu);
        defaultTableModel.setColumnCount(0);
        defaultTableModel.setRowCount(0);
        defaultTableModel.setColumnIdentifiers(satir);
        try {
            while(resultSet.next()){
                sutun[0]=resultSet.getString("isim");
                sutun[1]=resultSet.getString("soyisim");
                sutun[2]=resultSet.getString("kullanici_adi");
                sutun[3]=resultSet.getString("sifre");
                sutun[4]=resultSet.getString("paket_adi");
                sutun[5]=resultSet.getString("indirme_hizi");
                sutun[6]=resultSet.getString("yukleme_hizi");
                sutun[7]=resultSet.getString("fiyat");
                defaultTableModel.addRow(sutun);
            }
            YoneticiPanel.setModel(defaultTableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void comboBoxYapilandir(){
        String SQLsorgu="select paket_adi from paketler";
        try {
            ResultSet resultSet=VeriTabaniBaglanti.listele(SQLsorgu);
            while (resultSet.next()) {                
                String fiyat=resultSet.getString("paket_adi");
                paket_ismi_check_box.addItem(fiyat);               
            }
        } catch (Exception e) {
        }
    }
    
    private void paketIdAtama(){
        paketId=(String)paket_ismi_check_box.getSelectedItem();        
        ResultSet resultSet=VeriTabaniBaglanti.listele("Select * from paketler");      
        try {
            paketId=resultSet.getString("paket_id");
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable YoneticiPanel;
    private javax.swing.JButton admin_buton1;
    private javax.swing.JButton basvur_buton1;
    private javax.swing.JButton bul_buton;
    private javax.swing.JButton cikar_buton;
    private javax.swing.JButton cikis_buton;
    private javax.swing.JButton guncelle_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JButton kullanici_buton1;
    private javax.swing.JComboBox paket_ismi_check_box;
    private javax.swing.JTextField sifre_text_field;
    // End of variables declaration//GEN-END:variables
}
