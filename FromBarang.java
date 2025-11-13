package inventaris.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class FormBarang extends JFrame {

    private JLabel lblTitle, lblKode, lblNama, lblJumlah, lblHarga;
    private JTextField txtKode, txtNama, txtJumlah, txtHarga;
    private JButton btnTambah, btnUbah, btnHapus, btnEkspor;
    private JTable tblBarang;
    private DefaultTableModel model;

    public FormBarang() {
        setTitle("Aplikasi Inventaris Barang");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        // Judul
        lblTitle = new JLabel("Aplikasi Inventaris Barang", SwingConstants.CENTER);
        lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        lblTitle.setBounds(200, 10, 400, 30);
        add(lblTitle);

        // Label dan TextField
        lblKode = new JLabel("Kode");
        lblKode.setBounds(30, 60, 80, 25);
        add(lblKode);
        txtKode = new JTextField();
        txtKode.setBounds(110, 60, 200, 25);
        add(txtKode);

        lblNama = new JLabel("Nama");
        lblNama.setBounds(30, 95, 80, 25);
        add(lblNama);
        txtNama = new JTextField();
        txtNama.setBounds(110, 95, 200, 25);
        add(txtNama);

        lblJumlah = new JLabel("Jumlah");
        lblJumlah.setBounds(30, 130, 80, 25);
        add(lblJumlah);
        txtJumlah = new JTextField();
        txtJumlah.setBounds(110, 130, 200, 25);
        add(txtJumlah);

        lblHarga = new JLabel("Harga");
        lblHarga.setBounds(30, 165, 80, 25);
        add(lblHarga);
        txtHarga = new JTextField();
        txtHarga.setBounds(110, 165, 200, 25);
        add(txtHarga);

        // Tombol
        btnTambah = new JButton("Tambah");
        btnTambah.setBounds(340, 60, 120, 30);
        add(btnTambah);
        btnUbah = new JButton("Ubah");
        btnUbah.setBounds(340, 95, 120, 30);
        add(btnUbah);
        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(340, 130, 120, 30);
        add(btnHapus);
        btnEkspor = new JButton("Ekspor ke TXT");
        btnEkspor.setBounds(340, 165, 120, 30);
        add(btnEkspor);

        // Tabel
        model = new DefaultTableModel(new String[]{"Kode", "Nama", "Jumlah", "Harga"}, 0);
        tblBarang = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tblBarang);
        scrollPane.setBounds(30, 210, 720, 220);
        add(scrollPane);

        // Tombol Tambah data
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{
                        txtKode.getText(),
                        txtNama.getText(),
                        txtJumlah.getText(),
                        txtHarga.getText()
                });
                txtKode.setText("");
                txtNama.setText("");
                txtJumlah.setText("");
                txtHarga.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormBarang().setVisible(true));
    }
}
