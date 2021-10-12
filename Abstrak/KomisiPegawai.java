package Abstrak;

public class KomisiPegawai extends Pegawai {
    private double penjualan;
    private double komisi;

    public KomisiPegawai(String namaDepan, String namaBelakang, String nomorKTP, double penjualan, double komisi) {
        super(namaDepan, namaBelakang, nomorKTP);

        if (penjualan < 0.0)
            throw new IllegalArgumentException("Penjualan harus >= 0.0");

        if (komisi <= 0.0 || komisi >= 1.0)
            throw new IllegalArgumentException("Komisi harus > 0.0 dan < 1.0");

        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(double penjualan) {
        if (penjualan < 0.0)
            throw new IllegalArgumentException("Penjualan harus >= 0.0");

        this.penjualan = penjualan;
    }

    public double getPenjualan() {
        return penjualan;
    }

    public void setKomisi(double komisi) {
        if (komisi <= 0.0 || komisi >= 1.0)
            throw new IllegalArgumentException("Komisi harus > 0.0 dan < 1.0");

        this.komisi = komisi;
    }

    public double getKomisi() {
        return komisi;
    }

    public double pendapatan() {
        return getKomisi() * getPenjualan();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f;\n%s: %.2f", "Komisi pegawai", super.toString(), "penjualan",
                getPenjualan(), "komisi", getKomisi());
    }
}