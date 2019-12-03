package frontend;

import backend.Buku1841720065Rifqie;
import backend.Kategori1841720065Rifqie;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmBuku1841720065Rifqie extends javax.swing.JFrame {

    /**
     * Creates new form FrmBuku
     */
    public FrmBuku1841720065Rifqie() {
        initComponents();
        tampilkanData();
        tampilkanCmbKategori();
        kosongkanForm();
    }

    public void kosongkanForm() {
        txtIdBuku.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtJudul.setText("");
        txtPenerbit.setText("");
        txtPenulis.setText("");
    }

    public void tampilkanData() {
        String[] kolom = {"ID", "Kategori", "Judul", "Penerbit", "Penulis"};
        ArrayList<Buku1841720065Rifqie> list = new Buku1841720065Rifqie().getAllRifqie();
        Object[] rowData = new Object[5];
        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getmIdBukuRifqie();
            rowData[1] = list.get(i).getmKategoriRifqie().getmNamaRifqie();
            rowData[2] = list.get(i).getmJudulRifqie();
            rowData[3] = list.get(i).getmPenerbitRifqie();
            rowData[4] = list.get(i).getmPenulisRifqie();
            ((DefaultTableModel) tblBuku.getModel()).addRow(rowData);
        }
    }

    public void tampilkanCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(getKat().toArray()));
    }

    public ArrayList getKat() {
        Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie();
        ArrayList nama = new ArrayList();
        for (int i = 0; i < kat.getAllRifqie().size(); i++) {
            nama.add(kat.getAllRifqie().get(i).getmNamaRifqie());
        }
        return nama;
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Kategori", "Judul", "Penerbit", "Penulis"};
        ArrayList<Buku1841720065Rifqie> list = new Buku1841720065Rifqie().searchRifqie(keyword);
        Object[] rowData = new Object[5];
        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (Buku1841720065Rifqie buk : list) {
            rowData[0] = buk.getmIdBukuRifqie();
            rowData[1] = buk.getmKategoriRifqie();
            rowData[2] = buk.getmJudulRifqie();
            rowData[3] = buk.getmPenerbitRifqie();
            rowData[4] = buk.getmPenulisRifqie();
            ((DefaultTableModel) tblBuku.getModel()).addRow(rowData);
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

        jLabelId = new javax.swing.JLabel();
        jLabelKategori = new javax.swing.JLabel();
        jLabelJudul = new javax.swing.JLabel();
        jLabelPenerbit = new javax.swing.JLabel();
        jLabelPenulis = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtIdBuku = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        txtJudul = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtPenulis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelId.setText("ID Buku");

        jLabelKategori.setText("Kategori");

        jLabelJudul.setText("Judul");

        jLabelPenerbit.setText("Penerbit");

        jLabelPenulis.setText("Penulis");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtIdBuku.setEnabled(false);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiksi", "Novel", "Referensi",}));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambahBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPenerbit)
                            .addComponent(jLabelPenulis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPenulis)
                            .addComponent(txtPenerbit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpan)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKategori)
                            .addComponent(jLabelJudul))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJudul)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addGap(16, 16, 16)
                        .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKategori)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJudul)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPenerbit)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPenulis)
                    .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Buku1841720065Rifqie buk = new Buku1841720065Rifqie();
        buk.setmIdBukuRifqie(Integer.parseInt(txtIdBuku.getText()));
        buk.setmKategoriRifqie((Kategori1841720065Rifqie) cmbKategori.getSelectedItem());
        buk.setmJudulRifqie(txtJudul.getText());
        buk.setmPenerbitRifqie(txtPenerbit.getText());
        buk.setmPenulisRifqie(txtPenulis.getText());
        buk.saveRifqie();
        txtIdBuku.setText(Integer.toString(buk.getmIdBukuRifqie()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBuku.getModel();
        int row = tblBuku.getSelectedRow();
        Buku1841720065Rifqie buku = new Buku1841720065Rifqie().getByIdRifqie(Integer.parseInt(model.getValueAt(row, 0).toString()));
        buku.deleteRifqie();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBuku.getModel();
        int row = tblBuku.getSelectedRow();
        Buku1841720065Rifqie buku = new Buku1841720065Rifqie();
        buku = buku.getByIdRifqie(Integer.parseInt(model.getValueAt(row, 0).toString()));
        txtIdBuku.setText(String.valueOf(buku.getmIdBukuRifqie()));
        cmbKategori.getModel().setSelectedItem(buku.getmKategoriRifqie().getmNamaRifqie());
        txtJudul.setText(buku.getmJudulRifqie());
        txtPenerbit.setText(buku.getmPenerbitRifqie());
        txtPenulis.setText(buku.getmPenulisRifqie());
    }//GEN-LAST:event_tblBukuMouseClicked

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBuku1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720019Sultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuku1841720065Rifqie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelKategori;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelPenulis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    // End of variables declaration//GEN-END:variables
}
