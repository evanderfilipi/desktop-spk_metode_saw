/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spk_pemilihan_siswa_berprestasi;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Evander Filipi
 */
public class Form_Ubah_Bobot extends javax.swing.JFrame {
    String k1 = "";
    String k2 = "";
    String k3 = "";
    String k4 = "";
    String k5 = "";
    String k6 = "";
    
    public void getDataBobot() {
    try {
           java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
           java.sql.Statement stm = conn.createStatement();
           java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tb_bobotkriteria");
           if (sql.next()) {
               double n1 = sql.getDouble("bobot1");
               double n2 = sql.getDouble("bobot2");
               double n3 = sql.getDouble("bobot3");
               double n4 = sql.getDouble("bobot4");
               double n5 = sql.getDouble("bobot5");
               double n6 = sql.getDouble("bobot6");
               String n1s = Double.toString(n1);
               String n2s = Double.toString(n2);
               String n3s = Double.toString(n3);
               String n4s = Double.toString(n4);
               String n5s = Double.toString(n5);
               String n6s = Double.toString(n6);
               
               if(n1s.equals("4.0")){
                    bobot1_1Cmb.setSelectedIndex(1);;}
               else if(n1s.equals("3.0")){
                    bobot1_1Cmb.setSelectedIndex(2);}
               else if(n1s.equals("2.0")){
                    bobot1_1Cmb.setSelectedIndex(3);}
               else if(n1s.equals("1.0")){
                    bobot1_1Cmb.setSelectedIndex(4);}
               else if(n1s.equals("0.0")){
                    bobot1_1Cmb.setSelectedIndex(5);}
               nblama1Txt.setText(n1s);
               
               if(n2s.equals("4.0")){
                    bobot1_2Cmb.setSelectedIndex(1);}
               else if(n2s.equals("3.0")){
                    bobot1_2Cmb.setSelectedIndex(2);}
               else if(n2s.equals("2.0")){
                    bobot1_2Cmb.setSelectedIndex(3);}
               else if(n2s.equals("1.0")){
                    bobot1_2Cmb.setSelectedIndex(4);}
               else if(n2s.equals("0.0")){
                    bobot1_2Cmb.setSelectedIndex(5);}
               nblama2Txt.setText(n2s);
               
               if(n3s.equals("4.0")){
                    bobot1_3Cmb.setSelectedIndex(1);}
               else if(n3s.equals("3.0")){
                    bobot1_3Cmb.setSelectedIndex(2);}
               else if(n3s.equals("2.0")){
                    bobot1_3Cmb.setSelectedIndex(3);}
               else if(n3s.equals("1.0")){
                    bobot1_3Cmb.setSelectedIndex(4);}
               else if(n3s.equals("0.0")){
                    bobot1_3Cmb.setSelectedIndex(5);}
               nblama3Txt.setText(n3s);
               
               if(n4s.equals("4.0")){
                    bobot1_4Cmb.setSelectedIndex(1);}
               else if(n4s.equals("3.0")){
                    bobot1_4Cmb.setSelectedIndex(2);}
               else if(n4s.equals("2.0")){
                    bobot1_4Cmb.setSelectedIndex(3);}
               else if(n4s.equals("1.0")){
                    bobot1_4Cmb.setSelectedIndex(4);}
               else if(n4s.equals("0.0")){
                    bobot1_4Cmb.setSelectedIndex(5);}
               nblama4Txt.setText(n4s);
               
               if(n5s.equals("4.0")){
                    bobot1_5Cmb.setSelectedIndex(1);}
               else if(n5s.equals("3.0")){
                    bobot1_5Cmb.setSelectedIndex(2);}
               else if(n5s.equals("2.0")){
                    bobot1_5Cmb.setSelectedIndex(3);}
               else if(n5s.equals("1.0")){
                    bobot1_5Cmb.setSelectedIndex(4);}
               else if(n5s.equals("0.0")){
                    bobot1_5Cmb.setSelectedIndex(5);}
               nblama5Txt.setText(n5s);
               
               if(n6s.equals("4.0")){
                    bobot1_6Cmb.setSelectedIndex(1);}
               else if(n6s.equals("3.0")){
                    bobot1_6Cmb.setSelectedIndex(2);}
               else if(n6s.equals("2.0")){
                    bobot1_6Cmb.setSelectedIndex(3);}
               else if(n6s.equals("1.0")){
                    bobot1_6Cmb.setSelectedIndex(4);}
               else if(n6s.equals("0.0")){
                    bobot1_6Cmb.setSelectedIndex(5);}
               nblama6Txt.setText(n6s);
           }           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
       }
    }
    
    public void simpan(){
        if(k1.equals("") || k2.equals("") || k3.equals("") || k4.equals("") || k5.equals("") || k6.equals("")) {
            simpanBtn.setEnabled(false);
        } else {
            simpanBtn.setEnabled(true);
        }
    }

    /**
     * Creates new form Form_Ubah_Bobot
     */
    public Form_Ubah_Bobot() {
        initComponents();
        getDataBobot();
        simpan();
        bobot1_1Cmb.setEnabled(false);
        bobot1_2Cmb.setEnabled(false);
        bobot1_3Cmb.setEnabled(false);
        bobot1_4Cmb.setEnabled(false);
        bobot1_5Cmb.setEnabled(false);
        bobot1_6Cmb.setEnabled(false);
        nblama1Txt.setEditable(false);
        nblama2Txt.setEditable(false);
        nblama3Txt.setEditable(false);
        nblama4Txt.setEditable(false);
        nblama5Txt.setEditable(false);
        nblama6Txt.setEditable(false);
        nbbaru1Txt.setEditable(false);
        nbbaru2Txt.setEditable(false);
        nbbaru3Txt.setEditable(false);
        nbbaru4Txt.setEditable(false);
        nbbaru5Txt.setEditable(false);
        nbbaru6Txt.setEditable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bobot1_1Cmb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bobot1_2Cmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bobot1_3Cmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bobot1_4Cmb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bobot1_5Cmb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bobot1_6Cmb = new javax.swing.JComboBox<>();
        nblama1Txt = new javax.swing.JTextField();
        nblama2Txt = new javax.swing.JTextField();
        nblama3Txt = new javax.swing.JTextField();
        nblama4Txt = new javax.swing.JTextField();
        nblama5Txt = new javax.swing.JTextField();
        nblama6Txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bobot2_1Cmb = new javax.swing.JComboBox<>();
        nbbaru1Txt = new javax.swing.JTextField();
        nbbaru2Txt = new javax.swing.JTextField();
        nbbaru3Txt = new javax.swing.JTextField();
        nbbaru4Txt = new javax.swing.JTextField();
        nbbaru5Txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bobot2_2Cmb = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        bobot2_3Cmb = new javax.swing.JComboBox<>();
        nbbaru6Txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        bobot2_4Cmb = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        bobot2_5Cmb = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        bobot2_6Cmb = new javax.swing.JComboBox<>();
        simpanBtn = new javax.swing.JButton();
        batalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Edit Bobot (W)");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bobot Lama"));

        jLabel1.setText("Nilai Terkecil = 0.0    Nilai Terbesar = 4.0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Kedisiplinan");

        bobot1_1Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_1Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot1_1Cmb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Kepribadian");

        bobot1_2Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_2Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kerapihan");

        bobot1_3Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_3Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Ekstrakulikuler");

        bobot1_4Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_4Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Aktif (A)", "Aktif (B)", "Cukup Aktif (C)", "Kurang Aktif (D)", "Tidak Ikut (E)" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Absensi");

        bobot1_5Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_5Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Akademik");

        bobot1_6Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot1_6Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));

        nblama1Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nblama1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nblama1TxtActionPerformed(evt);
            }
        });

        nblama2Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama3Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama4Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama5Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama6Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bobot1_1Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bobot1_2Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bobot1_3Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bobot1_4Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bobot1_5Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bobot1_6Cmb, 0, 130, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nblama6Txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(nblama5Txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nblama4Txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nblama3Txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nblama2Txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nblama1Txt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bobot1_1Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bobot1_2Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bobot1_3Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bobot1_4Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bobot1_5Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bobot1_6Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nblama6Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bobot Baru"));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Kedisiplinan");

        bobot2_1Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_1Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot2_1Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_1CmbActionPerformed(evt);
            }
        });

        nbbaru1Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nbbaru1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbbaru1TxtActionPerformed(evt);
            }
        });

        nbbaru2Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru3Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru4Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru5Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Kepribadian");

        bobot2_2Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_2Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot2_2Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_2CmbActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Kerapihan");

        bobot2_3Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_3Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot2_3Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_3CmbActionPerformed(evt);
            }
        });

        nbbaru6Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Ekstrakulikuler");

        bobot2_4Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_4Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Aktif (A)", "Aktif (B)", "Cukup Aktif (C)", "Kurang Aktif (D)", "Tidak Ikut (E)" }));
        bobot2_4Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_4CmbActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Absensi");

        bobot2_5Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_5Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot2_5Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_5CmbActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Akademik");

        bobot2_6Cmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bobot2_6Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Sangat Baik (A)", "Baik (B)", "Cukup Baik (C)", "Kurang Baik (D)", "Buruk (E)" }));
        bobot2_6Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobot2_6CmbActionPerformed(evt);
            }
        });

        simpanBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        simpanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        batalBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        batalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel.png"))); // NOI18N
        batalBtn.setText("Batal");
        batalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bobot2_1Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bobot2_2Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bobot2_3Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bobot2_4Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bobot2_5Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bobot2_6Cmb, 0, 130, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nbbaru6Txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(nbbaru5Txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbbaru4Txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbbaru3Txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbbaru2Txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbbaru1Txt, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(simpanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(batalBtn)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bobot2_1Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(bobot2_2Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bobot2_3Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(bobot2_4Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(bobot2_5Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bobot2_6Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru6Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanBtn)
                    .addComponent(batalBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nblama1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nblama1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nblama1TxtActionPerformed

    private void nbbaru1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbbaru1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbbaru1TxtActionPerformed

    private void bobot2_1CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_1CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_1Cmb.getSelectedIndex()==0){ 
        k1="";}
        else if(bobot2_1Cmb.getSelectedIndex()==1){
        k1="4.0";}
        else if(bobot2_1Cmb.getSelectedIndex()==2){
        k1="3.0";}
        else if(bobot2_1Cmb.getSelectedIndex()==3){
        k1="2.0";}
        else if(bobot2_1Cmb.getSelectedIndex()==4){
        k1="1.0";}
        else if(bobot2_1Cmb.getSelectedIndex()==5){
        k1="0.0";}
        nbbaru1Txt.setText(k1);
        simpan();
    }//GEN-LAST:event_bobot2_1CmbActionPerformed

    private void bobot2_2CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_2CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_2Cmb.getSelectedIndex()==0){ 
        k2="";}
        else if(bobot2_2Cmb.getSelectedIndex()==1){
        k2="4.0";}
        else if(bobot2_2Cmb.getSelectedIndex()==2){
        k2="3.0";}
        else if(bobot2_2Cmb.getSelectedIndex()==3){
        k2="2.0";}
        else if(bobot2_2Cmb.getSelectedIndex()==4){
        k2="1.0";}
        else if(bobot2_2Cmb.getSelectedIndex()==5){
        k2="0.0";}
        nbbaru2Txt.setText(k2);
        simpan();
    }//GEN-LAST:event_bobot2_2CmbActionPerformed

    private void bobot2_3CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_3CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_3Cmb.getSelectedIndex()==0){ 
        k3="";}
        else if(bobot2_3Cmb.getSelectedIndex()==1){
        k3="4.0";}
        else if(bobot2_3Cmb.getSelectedIndex()==2){
        k3="3.0";}
        else if(bobot2_3Cmb.getSelectedIndex()==3){
        k3="2.0";}
        else if(bobot2_3Cmb.getSelectedIndex()==4){
        k3="1.0";}
        else if(bobot2_3Cmb.getSelectedIndex()==5){
        k3="0.0";}
        nbbaru3Txt.setText(k3);
        simpan();
    }//GEN-LAST:event_bobot2_3CmbActionPerformed

    private void bobot2_4CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_4CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_4Cmb.getSelectedIndex()==0){ 
        k4="";}
        else if(bobot2_4Cmb.getSelectedIndex()==1){
        k4="4.0";}
        else if(bobot2_4Cmb.getSelectedIndex()==2){
        k4="3.0";}
        else if(bobot2_4Cmb.getSelectedIndex()==3){
        k4="2.0";}
        else if(bobot2_4Cmb.getSelectedIndex()==4){
        k4="1.0";}
        else if(bobot2_4Cmb.getSelectedIndex()==5){
        k4="0.0";}
        nbbaru4Txt.setText(k4);
        simpan();
    }//GEN-LAST:event_bobot2_4CmbActionPerformed

    private void bobot2_5CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_5CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_5Cmb.getSelectedIndex()==0){ 
        k5="";}
        else if(bobot2_5Cmb.getSelectedIndex()==1){
        k5="4.0";}
        else if(bobot2_5Cmb.getSelectedIndex()==2){
        k5="3.0";}
        else if(bobot2_5Cmb.getSelectedIndex()==3){
        k5="2.0";}
        else if(bobot2_5Cmb.getSelectedIndex()==4){
        k5="1.0";}
        else if(bobot2_5Cmb.getSelectedIndex()==5){
        k5="0.0";}
        nbbaru5Txt.setText(k5);
        simpan();
    }//GEN-LAST:event_bobot2_5CmbActionPerformed

    private void bobot2_6CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobot2_6CmbActionPerformed
        // TODO add your handling code here:
        if (bobot2_6Cmb.getSelectedIndex()==0){ 
        k6="";}
        else if(bobot2_6Cmb.getSelectedIndex()==1){
        k6="4.0";}
        else if(bobot2_6Cmb.getSelectedIndex()==2){
        k6="3.0";}
        else if(bobot2_6Cmb.getSelectedIndex()==3){
        k6="2.0";}
        else if(bobot2_6Cmb.getSelectedIndex()==4){
        k6="1.0";}
        else if(bobot2_6Cmb.getSelectedIndex()==5){
        k6="0.0";}
        nbbaru6Txt.setText(k6);
        simpan();
    }//GEN-LAST:event_bobot2_6CmbActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
        double k1d = Double.parseDouble(nbbaru1Txt.getText());
        double k2d = Double.parseDouble(nbbaru2Txt.getText());
        double k3d = Double.parseDouble(nbbaru3Txt.getText());
        double k4d = Double.parseDouble(nbbaru4Txt.getText());
        double k5d = Double.parseDouble(nbbaru5Txt.getText());
        double k6d = Double.parseDouble(nbbaru6Txt.getText());
        try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            String sqlz = "TRUNCATE TABLE tb_bobotkriteria";
            java.sql.PreparedStatement pstz = conn.prepareStatement(sqlz);
            pstz.execute();
            String sql = "INSERT INTO tb_bobotkriteria VALUES('"+k1d+"','"+k2d+"','"+k3d+"','"+k4d+"','"+k5d+"','"+k6d+"')";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Nilai bobot kriteria berhasil disimpan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Nilai bobot kriteria gagal disimpan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void batalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_batalBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ubah_Bobot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBtn;
    private javax.swing.JComboBox<String> bobot1_1Cmb;
    private javax.swing.JComboBox<String> bobot1_2Cmb;
    private javax.swing.JComboBox<String> bobot1_3Cmb;
    private javax.swing.JComboBox<String> bobot1_4Cmb;
    private javax.swing.JComboBox<String> bobot1_5Cmb;
    private javax.swing.JComboBox<String> bobot1_6Cmb;
    private javax.swing.JComboBox<String> bobot2_1Cmb;
    private javax.swing.JComboBox<String> bobot2_2Cmb;
    private javax.swing.JComboBox<String> bobot2_3Cmb;
    private javax.swing.JComboBox<String> bobot2_4Cmb;
    private javax.swing.JComboBox<String> bobot2_5Cmb;
    private javax.swing.JComboBox<String> bobot2_6Cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nbbaru1Txt;
    private javax.swing.JTextField nbbaru2Txt;
    private javax.swing.JTextField nbbaru3Txt;
    private javax.swing.JTextField nbbaru4Txt;
    private javax.swing.JTextField nbbaru5Txt;
    private javax.swing.JTextField nbbaru6Txt;
    private javax.swing.JTextField nblama1Txt;
    private javax.swing.JTextField nblama2Txt;
    private javax.swing.JTextField nblama3Txt;
    private javax.swing.JTextField nblama4Txt;
    private javax.swing.JTextField nblama5Txt;
    private javax.swing.JTextField nblama6Txt;
    private javax.swing.JButton simpanBtn;
    // End of variables declaration//GEN-END:variables
}
