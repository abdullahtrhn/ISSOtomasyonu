
package Frame;

import DB.VeriTabaniBaglanti;
import java.awt.GraphicsConfiguration;
import java.sql.ResultSet;
import java.util.Random;


public class BasvurEkrani extends javax.swing.JFrame {
    public static String kullaniciAdi,sifre,tc,adres,paketIsmi,indirmeHizi,yuklemeHizi,fiyat,paketId,kullanilanPaket,yas="0",isim,soyisim;
    
    public BasvurEkrani() {
        initComponents();
        VeriTabaniBaglanti.baglan();
        comboBoxYapilandir();
        hizlariAta();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        geri_don_buton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        basvur_buton = new javax.swing.JButton();
        admin_buton = new javax.swing.JButton();
        kullanici_buton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sifre_text_field = new javax.swing.JTextField();
        basvur_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tcno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adres_text = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        indirme_hizi_goster = new javax.swing.JLabel();
        yukleme_hizi_goster = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paket = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        fiyat_goster = new javax.swing.JLabel();
        geri_don_buton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        soyisim_text_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        isim_text_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("İndirme Hız :");

        geri_don_buton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        geri_don_buton.setText("Geri Dön");
        geri_don_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_don_butonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Başvuru Ekranı");

        jPanel2.setBackground(new java.awt.Color(21, 50, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        basvur_buton.setBackground(new java.awt.Color(167, 153, 153));
        basvur_buton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        basvur_buton.setText("Başvur");

        admin_buton.setBackground(new java.awt.Color(167, 153, 153));
        admin_buton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        admin_buton.setText("Yönetici Girişi");

        kullanici_buton.setBackground(new java.awt.Color(167, 153, 153));
        kullanici_buton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        kullanici_buton.setText("Kullanıcı Girişi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(admin_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kullanici_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basvur_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre : ");

        sifre_text_field.setInheritsPopupMenu(true);

        basvur_btn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        basvur_btn.setText("Başvur");
        basvur_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvur_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TC No:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adres:");

        adres_text.setInheritsPopupMenu(true);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("İndirme Hız :");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Yükleme Hız :");

        indirme_hizi_goster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        indirme_hizi_goster.setForeground(new java.awt.Color(255, 255, 255));
        indirme_hizi_goster.setText("0");

        yukleme_hizi_goster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        yukleme_hizi_goster.setForeground(new java.awt.Color(255, 255, 255));
        yukleme_hizi_goster.setText("0");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Paket:");

        paket.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paketİtemStateChanged(evt);
            }
        });
        paket.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paketMouseDragged(evt);
            }
        });
        paket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paketMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fiyat :");

        fiyat_goster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        fiyat_goster.setForeground(new java.awt.Color(255, 255, 255));
        fiyat_goster.setText("0");

        geri_don_buton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        geri_don_buton1.setText("Geri Dön");
        geri_don_buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_don_buton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Soyisim :");

        soyisim_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyisim_text_fieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("İsim :");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Başvuru Formu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(geri_don_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(basvur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fiyat_goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yukleme_hizi_goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indirme_hizi_goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifre_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyisim_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isim_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adres_text, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(55, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(isim_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(soyisim_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sifre_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(adres_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indirme_hizi_goster)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(yukleme_hizi_goster))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiyat_goster)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addComponent(basvur_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(geri_don_buton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basvur_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvur_btnActionPerformed
        Random rmRandom=new Random();
        BasvurEkrani.kullaniciAdi=kullanici_adi.getText();
        BasvurEkrani.sifre=sifre_text_field.getText();
        BasvurEkrani.tc=tcno.getText();
        BasvurEkrani.adres=adres_text.getText();
        BasvurEkrani.isim=isim_text_field.getText();
        BasvurEkrani.soyisim=soyisim_text_field.getText();
        BasvurEkrani.paketIsmi=(String) paket.getSelectedItem();
        BasvurEkrani.kullanilanPaket=String.valueOf(rmRandom.nextInt(500));
        String SQLsorgu="select * from paketler where paket_adi='"+paketIsmi+"'";
        try {
            ResultSet resultSet=VeriTabaniBaglanti.listele(SQLsorgu);
            BasvurEkrani.yuklemeHizi=resultSet.getString("yukleme_hizi");
            BasvurEkrani.indirmeHizi=resultSet.getString("indirme_hizi");
            BasvurEkrani.fiyat=resultSet.getString("fiyat");
            BasvurEkrani.paketId=resultSet.getString("paket_id");
        } catch (Exception e) {
        }
        
        String SQLekle = "INSERT INTO kullanici (kullanici_adi , sifre ,adres ,isim ,soyisim , yas ,TC , kullanici_id ,paket_id ,kullanilan_paket ) VALUES "
                +"('"+kullaniciAdi+"','"+sifre+"' ,'"+adres+"','"+isim+"','"+soyisim+"','"+yas+"','"+tc+"','"+1+"','"+paketId+"','"+kullanilanPaket+"')";
        System.out.println(SQLekle);
        VeriTabaniBaglanti.veriGuncelle(SQLekle);  
        geriDon();
    }//GEN-LAST:event_basvur_btnActionPerformed

    private void geri_don_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_don_butonActionPerformed
        geriDon();
    }//GEN-LAST:event_geri_don_butonActionPerformed

    private void geri_don_buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_don_buton1ActionPerformed
        geriDon();
    }//GEN-LAST:event_geri_don_buton1ActionPerformed

    private void soyisim_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyisim_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyisim_text_fieldActionPerformed

    private void paketMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paketMouseDragged
        //hizlariAta();
    }//GEN-LAST:event_paketMouseDragged

    private void paketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paketMouseClicked
        //hizlariAta();
    }//GEN-LAST:event_paketMouseClicked

    private void paketİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paketİtemStateChanged
        hizlariAta();
    }//GEN-LAST:event_paketİtemStateChanged

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
            java.util.logging.Logger.getLogger(BasvurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvurEkrani().setVisible(true);
            }
        });
    }

    public BasvurEkrani(GraphicsConfiguration gc) {
        super(gc);
    }
    
    private void comboBoxYapilandir(){
        String SQLsorgu="select paket_adi from paketler";
        try {
            ResultSet resultSet=VeriTabaniBaglanti.listele(SQLsorgu);
            while (resultSet.next()) {                
                String fiyat=resultSet.getString("paket_adi");
                paket.addItem(fiyat);               
            }
        } catch (Exception e) {
        }
    }
    
    private void geriDon(){
        GirisEkrani girisEkrani=new GirisEkrani();
        girisEkrani.setVisible(true);
        dispose();
    }
    
    private void hizlariAta(){
        String paketIsmi=(String) paket.getSelectedItem();
        String SQLsorgu="select * from paketler where paket_adi='"+paketIsmi+"'";
        try {
             ResultSet resultSet=VeriTabaniBaglanti.listele(SQLsorgu);
             yukleme_hizi_goster.setText(resultSet.getString("yukleme_hizi"));
             indirme_hizi_goster.setText(resultSet.getString("indirme_hizi"));
             fiyat_goster.setText(resultSet.getString("fiyat"));
        } catch (Exception e) {
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_buton;
    private javax.swing.JTextField adres_text;
    private javax.swing.JButton basvur_btn;
    private javax.swing.JButton basvur_buton;
    private javax.swing.JLabel fiyat_goster;
    private javax.swing.JButton geri_don_buton;
    private javax.swing.JButton geri_don_buton1;
    private javax.swing.JLabel indirme_hizi_goster;
    private javax.swing.JTextField isim_text_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JButton kullanici_buton;
    private javax.swing.JComboBox paket;
    private javax.swing.JTextField sifre_text_field;
    private javax.swing.JTextField soyisim_text_field;
    private javax.swing.JTextField tcno;
    private javax.swing.JLabel yukleme_hizi_goster;
    // End of variables declaration//GEN-END:variables
}
