package frontend;

import backend.Kategori1841720065Rifqie;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class FrmKategori1841720065Rifqie extends javax.swing.JFrame {

    /**
     * Creates new form FrmKategori
     */
    public FrmKategori1841720065Rifqie() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }

    public void kosongkanForm() {
        mTxtIdKategori.setText("0");
        mTxtNama.setText("");
        mTxtKeterangan.setText("");
    }

    public void tampilkanData() {
        String[] kolom = {"ID", "Nama", "Keterangan"};
        ArrayList<Kategori1841720065Rifqie> list = new Kategori1841720065Rifqie().getAllRifqie();
        Object rowData[] = new Object[3];

        mTblKategori.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Kategori1841720065Rifqie kat : list) {
            rowData[0] = kat.getmIdkategoriRifqie();
            rowData[1] = kat.getmNamaRifqie();
            rowData[2] = kat.getmKeteranganRifqie();

            ((DefaultTableModel) mTblKategori.getModel()).addRow(rowData);
        }
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Nama", "Keterangan"};
        ArrayList<Kategori1841720065Rifqie> list = new Kategori1841720065Rifqie().searchRifqie(keyword);
        Object rowData[] = new Object[3];

        mTblKategori.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Kategori1841720065Rifqie kat : list) {
            rowData[0] = kat.getmIdkategoriRifqie();
            rowData[1] = kat.getmNamaRifqie();
            rowData[2] = kat.getmKeteranganRifqie();

            ((DefaultTableModel) mTblKategori.getModel()).addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mLblId = new javax.swing.JLabel();
        mLblNama = new javax.swing.JLabel();
        mLblKet = new javax.swing.JLabel();
        mTxtIdKategori = new javax.swing.JTextField();
        mTxtNama = new javax.swing.JTextField();
        mTxtKeterangan = new javax.swing.JTextField();
        mBtnSimpan = new javax.swing.JButton();
        mBtnTambahBaru = new javax.swing.JButton();
        mBtnHapus = new javax.swing.JButton();
        mTxtCari = new javax.swing.JTextField();
        mBtnCari = new javax.swing.JButton();
        mScrollPanel = new javax.swing.JScrollPane();
        mTblKategori = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mLblId.setText("ID Kategori");

        mLblNama.setText("Nama Kategori");

        mLblKet.setText("Keterangan");

        mTxtIdKategori.setEnabled(false);

        mBtnSimpan.setText("Simpan");
        mBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnSimpanActionPerformed(evt);
            }
        });

        mBtnTambahBaru.setText("Tambah Baru");
        mBtnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnTambahBaruActionPerformed(evt);
            }
        });

        mBtnHapus.setText("Hapus");
        mBtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnHapusActionPerformed(evt);
            }
        });

        mBtnCari.setText("Cari");
        mBtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnCariActionPerformed(evt);
            }
        });

        mTblKategori.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        mTblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTblKategoriMouseClicked(evt);
            }
        });
        mScrollPanel.setViewportView(mTblKategori);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mBtnSimpan)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(mBtnTambahBaru)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mBtnHapus)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mTxtCari)
                                                .addGap(18, 18, 18)
                                                .addComponent(mBtnCari))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(mLblId)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(mTxtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mLblNama)
                                                                        .addComponent(mLblKet))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(mTxtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                        .addComponent(mTxtKeterangan))))
                                                .addGap(346, 346, 346))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(mScrollPanel)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLblId)
                                        .addComponent(mTxtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mLblNama)
                                        .addComponent(mTxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mTxtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mLblKet))
                                .addGap(14, 14, 14)
                                .addComponent(mBtnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtnTambahBaru)
                                        .addComponent(mBtnHapus)
                                        .addComponent(mBtnCari)
                                        .addComponent(mTxtCari))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBtnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_mBtnTambahBaruActionPerformed

    private void mBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnSimpanActionPerformed
        Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie();
        kat.setmIdkategoriRifqie(Integer.parseInt(mTxtIdKategori.getText()));
        kat.setmNamaRifqie(mTxtNama.getText());
        kat.setmKeteranganRifqie(mTxtKeterangan.getText());
        kat.saveRifqie();
        mTxtIdKategori.setText(Integer.toString(kat.getmIdkategoriRifqie()));
        tampilkanData();
    }//GEN-LAST:event_mBtnSimpanActionPerformed

    private void mBtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) mTblKategori.getModel();
        int row = mTblKategori.getSelectedRow();

        Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie().getByIdRifqie(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_mBtnHapusActionPerformed

    private void mBtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnCariActionPerformed
        cari(mTxtCari.getText());
    }//GEN-LAST:event_mBtnCariActionPerformed

    private void mTblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTblKategoriMouseClicked
        DefaultTableModel model = (DefaultTableModel) mTblKategori.getModel();
        int row = mTblKategori.getSelectedRow();

        mTxtIdKategori.setText(model.getValueAt(row, 0).toString());
        mTxtNama.setText(model.getValueAt(row, 1).toString());
        mTxtKeterangan.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_mTblKategoriMouseClicked

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
            java.util.logging.Logger.getLogger(FrmKategori1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKategori1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKategori1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKategori1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKategori1841720065Rifqie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mBtnCari;
    private javax.swing.JButton mBtnHapus;
    private javax.swing.JButton mBtnSimpan;
    private javax.swing.JButton mBtnTambahBaru;
    private javax.swing.JLabel mLblId;
    private javax.swing.JLabel mLblKet;
    private javax.swing.JLabel mLblNama;
    private javax.swing.JScrollPane mScrollPanel;
    private javax.swing.JTable mTblKategori;
    private javax.swing.JTextField mTxtCari;
    private javax.swing.JTextField mTxtIdKategori;
    private javax.swing.JTextField mTxtKeterangan;
    private javax.swing.JTextField mTxtNama;
    // End of variables declaration//GEN-END:variables
}
