public class KomisiPegawai {
    protected String namaDepan;
    protected String namaBelakang;
    protected String nomorKTP;
    private double penjualan;
    private double komisi;

    public KomisiPegawai(String namaDepan, String namaBelakang, String nomorKTP, double penjualan, double komisi) {

        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.nomorKTP = nomorKTP;

        if (penjualan < 0.0)
            throw new IllegalArgumentException("Penjualan harus >= 0.0");

        if (komisi <= 0.0 || komisi >= 1.0)
            throw new IllegalArgumentException("Komisi harus > 0.0 dan < 1.0");

        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public String getNamaDepan() {
        return this.namaDepan;
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    public String getNomorKTP() {
        return this.nomorKTP;
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
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Pegawai ", namaDepan, namaBelakang,
                "Nomor KTP ", nomorKTP, "Penjualan ", penjualan, "Komisi ", komisi, "Pendapatan ", pendapatan());
    }

}