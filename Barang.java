package inventaris.controller;

import inventaris.model.Barang;
import java.io.*;
import java.util.ArrayList;

public class BarangController {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    public void ubahBarang(int index, Barang b) {
        if (index >= 0 && index < daftarBarang.size()) {
            daftarBarang.set(index, b);
        }
    }

    public void hapusBarang(int index) {
        if (index >= 0 && index < daftarBarang.size()) {
            daftarBarang.remove(index);
        }
    }

    public ArrayList<Barang> getAllBarang() {
        return daftarBarang;
    }

    public void eksporKeTxt(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Barang b : daftarBarang) {
                bw.write(b.getKode() + "," + b.getNama() + "," + b.getJumlah() + "," + b.getHarga());
                bw.newLine();
            }
            bw.flush();
        }
    }
}
