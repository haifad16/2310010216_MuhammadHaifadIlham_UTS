package inventaris.model;

public class Barang {
    private String kode;
    private String nama;
    private int jumlah;
    private double harga;

    public Barang(String kode, String nama, int jumlah, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public double getTotal() {
        return jumlah * harga;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + jumlah + " @ " + harga + ")";
    }
}
