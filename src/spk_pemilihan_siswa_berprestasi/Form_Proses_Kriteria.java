/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spk_pemilihan_siswa_berprestasi;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Evander Filipi
 */
public class Form_Proses_Kriteria extends javax.swing.JFrame {
    private Form_Ubah_Bobot formubahbobot = new Form_Ubah_Bobot();
    private Form_Rincian_Hitung formrincian = new Form_Rincian_Hitung();
    Koneksi konek = new Koneksi();
    JasperReport jReport;
    JasperPrint jPrint;
    JasperDesign jDesign;
    Map param = new HashMap();
    String kelas = "";
    String semester = "";
    String tahunajaran = "";
    DefaultTableModel tmodel1, tmodel2;
    private WindowAdapter windowAdapter = null;
    
    public void initFrame(){
        this.windowAdapter = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                formubahbobot.dispose();
                formrincian.dispose();
            }
            public void windowClosed (WindowEvent e){
                super.windowClosed(e);
                formubahbobot.dispose();
                formrincian.dispose();
            }
            
        };
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.addWindowListener(this.windowAdapter);
    }
    
    private void tampilkan(){
        if(kelas.equals("") || semester.equals("") || tahunajaran.equals("")){
            tampilkanBtn.setEnabled(false);
        } else {
            tampilkanBtn.setEnabled(true);
        }
    }
    
    public void alur(){
        tmodel2 = (DefaultTableModel)perankinganTbl.getModel();
        tmodel1 = (DefaultTableModel)kriteriaTbl.getModel();
        if (tmodel1.getRowCount()>0 && tmodel2.getRowCount()>0){
            prosesBtn.setEnabled(true);
            rincianBtn.setEnabled(true);
            cetakBtn.setEnabled(true);
        } else if (tmodel1.getRowCount()>0 && tmodel2.getRowCount()==0) {
            prosesBtn.setEnabled(true);
            rincianBtn.setEnabled(false);
            cetakBtn.setEnabled(false);
        } else if (tmodel1.getRowCount()==0 && tmodel2.getRowCount()>0) {
            prosesBtn.setEnabled(false);
            rincianBtn.setEnabled(true);
            cetakBtn.setEnabled(true);
        } else if (tmodel1.getRowCount()==0 && tmodel2.getRowCount()==0){
            prosesBtn.setEnabled(false);
            rincianBtn.setEnabled(false);
            cetakBtn.setEnabled(false);
        }
    }
    

    /**
     * Creates new form Form_Proses_Kriteria
     */
    public Form_Proses_Kriteria() {
        initComponents();
        initFrame();
        this.setLocationRelativeTo(null);
        tmodel2 = (DefaultTableModel)perankinganTbl.getModel();
        tmodel1 = (DefaultTableModel)kriteriaTbl.getModel();
        tmodel1.setRowCount(0);
        tmodel2.setRowCount(0);
        alur();
        tampilkan();
        tahunajaranTxt.setEnabled(false);
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
        kelasCmb = new javax.swing.JComboBox<>();
        semesterCmb = new javax.swing.JComboBox<>();
        tahunajaranCmb = new javax.swing.JComboBox<>();
        tahunajaranTxt = new javax.swing.JTextField();
        tampilkanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kriteriaTbl = new javax.swing.JTable();
        prosesBtn = new javax.swing.JButton();
        ubahbobotBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cetakBtn = new javax.swing.JButton();
        rincianBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        perankinganTbl = new javax.swing.JTable();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Laporan Prestasi Siswa");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        kelasCmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kelasCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Kelas-", "VII-A", "VII-B", "VII-C", "VII-D", "VIII-A", "VIII-B", "VIII-C", "VIII-D", "IX-A", "IX-B", "IX-C", "IX-D" }));
        kelasCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasCmbActionPerformed(evt);
            }
        });

        semesterCmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        semesterCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Semester-", "Ganjil", "Genap" }));
        semesterCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterCmbActionPerformed(evt);
            }
        });

        tahunajaranCmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tahunajaranCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tahun Ajaran-", "2016/2017", "2017/2018", "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023", "2023/2024", "2024/2025", "2025/2026", "2026/2027", "2027/2028", "2028/2029", "2029/2030", "Input Manual" }));
        tahunajaranCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunajaranCmbActionPerformed(evt);
            }
        });

        tahunajaranTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tahunajaranTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tahunajaranTxtKeyTyped(evt);
            }
        });

        tampilkanBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tampilkanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Show.png"))); // NOI18N
        tampilkanBtn.setText("Tampilkan");
        tampilkanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanBtnActionPerformed(evt);
            }
        });

        kriteriaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kd_Alternatif", "NIS", "Nama", "Kedisiplinan", "Kepribadian", "Kerapihan", "Ekstrakulikuler", "Absensi", "Akademik", "Kelas", "Semester", "Tahun Ajaran"
            }
        ));
        jScrollPane2.setViewportView(kriteriaTbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kelasCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(semesterCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tahunajaranCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tahunajaranTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(tampilkanBtn)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelasCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunajaranCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunajaranTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tampilkanBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
        );

        prosesBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prosesBtn.setText("Proses >>");
        prosesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesBtnActionPerformed(evt);
            }
        });

        ubahbobotBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ubahbobotBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        ubahbobotBtn.setText("Edit Bobot");
        ubahbobotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahbobotBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        cetakBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cetakBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Print.png"))); // NOI18N
        cetakBtn.setText("Cetak");
        cetakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBtnActionPerformed(evt);
            }
        });

        rincianBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rincianBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Detail.png"))); // NOI18N
        rincianBtn.setText("Lihat Rincian");
        rincianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianBtnActionPerformed(evt);
            }
        });

        perankinganTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kd_Alternatif", "NIS", "Nama", "Nilai Ranking", "Kelas", "Semester", "Tahun Ajaran"
            }
        ));
        jScrollPane5.setViewportView(perankinganTbl);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rincianBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(cetakBtn)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetakBtn)
                    .addComponent(rincianBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
        );

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clear.png"))); // NOI18N
        clearBtn.setText("Clear All");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prosesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubahbobotBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(ubahbobotBtn)
                .addGap(36, 36, 36)
                .addComponent(prosesBtn)
                .addGap(34, 34, 34)
                .addComponent(clearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelasCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasCmbActionPerformed
        // TODO add your handling code here:
        if (kelasCmb.getSelectedIndex()==0){ 
        kelas="";}
        else if(kelasCmb.getSelectedIndex()==1){
        kelas="VII-A";}
        else if(kelasCmb.getSelectedIndex()==2){
        kelas="VII-B";}
        else if(kelasCmb.getSelectedIndex()==3){
        kelas="VII-C";}
        else if(kelasCmb.getSelectedIndex()==4){
        kelas="VII-D";}
        else if(kelasCmb.getSelectedIndex()==5){
        kelas="VIII-A";}
        else if(kelasCmb.getSelectedIndex()==6){
        kelas="VIII-B";}
        else if(kelasCmb.getSelectedIndex()==7){
        kelas="VIII-C";}
        else if(kelasCmb.getSelectedIndex()==8){
        kelas="VIII-D";}
        else if(kelasCmb.getSelectedIndex()==9){
        kelas="IX-A";}
        else if(kelasCmb.getSelectedIndex()==10){
        kelas="IX-B";}
        else if(kelasCmb.getSelectedIndex()==11){
        kelas="IX-C";}
        else if(kelasCmb.getSelectedIndex()==12){
        kelas="IX-D";}
        tampilkan();
    }//GEN-LAST:event_kelasCmbActionPerformed

    private void semesterCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterCmbActionPerformed
        // TODO add your handling code here:
        if (semesterCmb.getSelectedIndex()==0){ 
        semester="";}
        else if(semesterCmb.getSelectedIndex()==1){
        semester="Ganjil";}
        else if(semesterCmb.getSelectedIndex()==2){
        semester="Genap";}
        tampilkan();
    }//GEN-LAST:event_semesterCmbActionPerformed

    private void tahunajaranCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunajaranCmbActionPerformed
        // TODO add your handling code here:
        if (tahunajaranCmb.getSelectedIndex()==0){ 
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="";}
        else if(tahunajaranCmb.getSelectedIndex()==1){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2016/2017";}
        else if(tahunajaranCmb.getSelectedIndex()==2){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2017/2018";}
        else if(tahunajaranCmb.getSelectedIndex()==3){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2018/2019";}
        else if(tahunajaranCmb.getSelectedIndex()==4){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2019/2020";}
        else if(tahunajaranCmb.getSelectedIndex()==5){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2020/2021";}
        else if(tahunajaranCmb.getSelectedIndex()==6){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2021/2022";}
        else if(tahunajaranCmb.getSelectedIndex()==7){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2022/2023";}
        else if(tahunajaranCmb.getSelectedIndex()==8){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2023/2024";}
        else if(tahunajaranCmb.getSelectedIndex()==9){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2024/2025";}
        else if(tahunajaranCmb.getSelectedIndex()==10){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2025/2026";}
        else if(tahunajaranCmb.getSelectedIndex()==11){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2026/2027";}
        else if(tahunajaranCmb.getSelectedIndex()==12){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2027/2028";}
        else if(tahunajaranCmb.getSelectedIndex()==13){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2028/2029";}
        else if(tahunajaranCmb.getSelectedIndex()==14){
        tahunajaranTxt.setEnabled(false);
        tahunajaranTxt.setText("");
        tahunajaran="2029/2030";}
        else if(tahunajaranCmb.getSelectedIndex()==15){
        tahunajaranTxt.setEnabled(true);
        tahunajaran=tahunajaranTxt.getText();}
        tampilkan();
    }//GEN-LAST:event_tahunajaranCmbActionPerformed

    private void tampilkanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanBtnActionPerformed
        // TODO add your handling code here:
        if(tahunajaranCmb.getSelectedIndex()==15){
        tahunajaran=tahunajaranTxt.getText();}
        try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT kd_alternatif, NIS, Nama, Kedisiplinan, Kepribadian, Kerapihan, Ekstrakulikuler, Absensi, Akademik, Kelas, Semester, Tahun_Ajaran FROM tb_nilaikriteria WHERE Kelas='"+kelas+"' AND Semester='"+semester+"' AND Tahun_Ajaran='"+tahunajaran+"'");
            kriteriaTbl.setModel(DbUtils.resultSetToTableModel(sql));
            alur();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tampilkanBtnActionPerformed

    private void tahunajaranTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tahunajaranTxtKeyTyped
        // TODO add your handling code here:
        String isi = tahunajaranTxt.getText();
        if (isi.length()>0){
            if (kelas.equals("") || semester.equals("")) {
                tampilkanBtn.setEnabled(false);
            } else {
                tampilkanBtn.setEnabled(true);
            }
        } else {
            tampilkanBtn.setEnabled(false);
        }
    }//GEN-LAST:event_tahunajaranTxtKeyTyped

    private void ubahbobotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahbobotBtnActionPerformed
        // TODO add your handling code here:
        formubahbobot.getDataBobot();
        formubahbobot.setVisible(true);
    }//GEN-LAST:event_ubahbobotBtnActionPerformed

    private void prosesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesBtnActionPerformed
        // TODO add your handling code here:
        double c1max = 0.0;
        double c2max = 0.0;
        double c3max = 0.0;
        double c4max = 0.0;
        double c5max = 0.0;
        double c6max = 0.0;
        try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT MAX(Kedisiplinan) AS nk1, MAX(Kepribadian) AS nk2, MAX(Kerapihan) AS nk3, MAX(Ekstrakulikuler) AS nk4, MAX(Absensi) AS nk5, MAX(Akademik) AS nk6 FROM tb_nilaikriteria WHERE Kelas='"+kelas+"' AND Semester='"+semester+"' AND Tahun_Ajaran='"+tahunajaran+"'");
            if(sql.next()){
                    c1max = sql.getDouble("nk1");
                    c2max = sql.getDouble("nk2");
                    c3max = sql.getDouble("nk3");
                    c4max = sql.getDouble("nk4");
                    c5max = sql.getDouble("nk5");
                    c6max = sql.getDouble("nk6");
            } else {
                JOptionPane.showMessageDialog(null, "Tidak dapat menghitung, karena data kriteria siswa belum ditampilkan/tidak ada!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            }
            
            String sqln = "TRUNCATE table tb_normalisasimatriks";
            java.sql.PreparedStatement pst = conn.prepareStatement(sqln);
            pst.execute();
            
            java.sql.Statement stmmm = conn.createStatement();
            java.sql.ResultSet sqlll = stmmm.executeQuery("SELECT kd_alternatif, NIS, Nama, (SELECT Kedisiplinan/'"+c1max+"') AS kr1, (SELECT Kepribadian/'"+c2max+"') AS kr2, (SELECT Kerapihan/'"+c3max+"') AS kr3, (SELECT Ekstrakulikuler/'"+c4max+"') AS kr4,"
                    + "(SELECT Absensi/'"+c5max+"') AS kr5, (SELECT Akademik/'"+c6max+"') AS kr6, Kelas, Semester, Tahun_Ajaran FROM tb_nilaikriteria WHERE Kelas='"+kelas+"' AND Semester='"+semester+"' AND Tahun_Ajaran='"+tahunajaran+"'");           
            while(sqlll.next()){
               int kd_alternatif = sqlll.getInt("kd_alternatif");
               int nis = sqlll.getInt("NIS");
               String nama = sqlll.getString("Nama");
               double n1 = sqlll.getDouble("kr1");
               double n2 = sqlll.getDouble("kr2");
               double n3 = sqlll.getDouble("kr3");
               double n4 = sqlll.getDouble("kr4");
               double n5 = sqlll.getDouble("kr5");
               double n6 = sqlll.getDouble("kr6");
               String kelasnya = sqlll.getString("Kelas");
               String semesternya = sqlll.getString("Semester");
               String tahunajarannya = sqlll.getString("Tahun_Ajaran");
               String queryco = "INSERT INTO tb_normalisasimatriks (kd_alternatif, NIS, Nama, c1, c2, c3, c4, c5, c6, Kelas, Semester, Tahun_Ajaran) VALUES ('"+kd_alternatif+"','"+nis+"','"+nama+"','"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+kelasnya+"','"+semesternya+"','"+tahunajarannya+"')";
               java.sql.PreparedStatement pstp = conn.prepareStatement(queryco);
               pstp.execute();
            }
            
            String sqlm = "TRUNCATE table tb_perankingan";
            java.sql.PreparedStatement pstm = conn.prepareStatement(sqlm);
            pstm.execute();
            
            java.sql.Statement stma = conn.createStatement();
            java.sql.ResultSet sqla = stma.executeQuery("SELECT kd_alternatif, NIS, Nama, (SELECT bobot1 FROM tb_bobotkriteria)*(SELECT c1) AS k1, (SELECT bobot2 FROM tb_bobotkriteria)*(SELECT c2) AS k2, (SELECT bobot3 FROM tb_bobotkriteria)*(SELECT c3) AS k3, (SELECT bobot4 FROM tb_bobotkriteria)*(SELECT c4) AS k4,"
                    + "(SELECT bobot5 FROM tb_bobotkriteria)*(SELECT c5) AS k5, (SELECT bobot6 FROM tb_bobotkriteria)*(SELECT c6) AS k6, (SELECT k1+k2+k3+k4+k5+k6) AS nilai_ranking, Kelas, Semester, Tahun_Ajaran FROM tb_normalisasimatriks");
            while(sqla.next()){
               int kd_alternatif2 = sqla.getInt("kd_alternatif");
               int nis2 = sqla.getInt("NIS");
               String nama2 = sqla.getString("Nama");
               double nk1 = sqla.getDouble("k1");
               double nk2 = sqla.getDouble("k2");
               double nk3 = sqla.getDouble("k3");
               double nk4 = sqla.getDouble("k4");
               double nk5 = sqla.getDouble("k5");
               double nk6 = sqla.getDouble("k6");
               double nilai_ranking = sqla.getDouble("nilai_ranking");
               String kelasnya2 = sqla.getString("Kelas");
               String semesternya2 = sqla.getString("Semester");
               String tahunajarannya2 = sqla.getString("Tahun_Ajaran");
               String querycom = "INSERT INTO tb_perankingan (kd_alternatif, NIS, Nama, k1, k2, k3, k4, k5, k6, Nilai_Ranking, Kelas, Semester, Tahun_Ajaran) VALUES('"+kd_alternatif2+"','"+nis2+"','"+nama2+"','"+nk1+"','"+nk2+"','"+nk3+"','"+nk4+"','"+nk5+"','"+nk6+"','"+nilai_ranking+"','"+kelasnya2+"','"+semesternya2+"','"+tahunajarannya2+"')";
               java.sql.PreparedStatement ps = conn.prepareStatement(querycom);
               ps.execute();
            }
            
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet sq = st.executeQuery("SELECT kd_alternatif, NIS, Nama, ROUND(Nilai_Ranking,2) AS Nilai_Rangking, Kelas, Semester, Tahun_Ajaran FROM tb_perankingan");
            perankinganTbl.setModel(DbUtils.resultSetToTableModel(sq));
            alur();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_prosesBtnActionPerformed

    private void cetakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBtnActionPerformed
        // TODO add your handling code here:
        try{
            File file = new File("src/report/laporan_siswa_berprestasi.jrxml");
            jDesign = JRXmlLoader.load(file);
            param.clear();
            jReport = JasperCompileManager.compileReport(jDesign);
            jPrint = JasperFillManager.fillReport(jReport, param, konek.getConnection());
            JasperViewer.viewReport(jPrint, false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak dapat mencetak. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cetakBtnActionPerformed

    private void rincianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianBtnActionPerformed
        // TODO add your handling code here:
        formrincian.getData();
        formrincian.setVisible(true);
    }//GEN-LAST:event_rincianBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
         try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            String sqlr = "TRUNCATE table tb_perankingan";
            java.sql.PreparedStatement pstr = conn.prepareStatement(sqlr);
            pstr.execute();
            String sqls = "TRUNCATE table tb_normalisasimatriks";
            java.sql.PreparedStatement psts = conn.prepareStatement(sqls);
            psts.execute();
            kelasCmb.setSelectedIndex(0);
            semesterCmb.setSelectedIndex(0);
            tahunajaranCmb.setSelectedIndex(0);
            tahunajaranTxt.setText("");
            tampilkanBtn.setEnabled(false);
            tmodel1.setRowCount(0);
            tmodel2.setRowCount(0);
            alur();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Pembersihan error. Tidak dapat terhubung ke database!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Proses_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Proses_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Proses_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Proses_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Proses_Kriteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetakBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> kelasCmb;
    private javax.swing.JTable kriteriaTbl;
    private javax.swing.JTable perankinganTbl;
    private javax.swing.JButton prosesBtn;
    private javax.swing.JButton rincianBtn;
    private javax.swing.JComboBox<String> semesterCmb;
    private javax.swing.JComboBox<String> tahunajaranCmb;
    private javax.swing.JTextField tahunajaranTxt;
    private javax.swing.JButton tampilkanBtn;
    private javax.swing.JButton ubahbobotBtn;
    // End of variables declaration//GEN-END:variables
}
