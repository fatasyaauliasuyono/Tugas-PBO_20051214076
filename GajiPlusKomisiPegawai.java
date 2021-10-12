public class GajiPlusKomisiPegawai {

    protected String namaDepan;
    protected String namaBelakang;
    protected String nomorKTP;
    private double penjualan;
    private double komisi;
    private double gajiPokok;

    public GajiPlusKomisiPegawai(String namaDepan, String namaBelakang, String nomorKTP, double penjualan,
            double komisi, double gajiPokok) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.nomorKTP = nomorKTP;

        if (penjualan < 0.0)
            throw new IllegalArgumentException("Penjualan harus >= 0.0");

        if (komisi <= 0.0 || komisi >= 1.0)
            throw new IllegalArgumentException("Komisi harus > 0.0 dan < 1.0");

        if (gajiPokok < 0.0)
            throw new IllegalArgumentException("Gaji pokok harus >= 0.0");

        this.penjualan = penjualan;
        this.komisi = komisi;
        this.gajiPokok = gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0.0)
            throw new IllegalArgumentException("Gaji pokok harus >= 0.0");
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
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
        return gajiPokok + (penjualan * komisi);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Pegawai ", namaDepan,
                namaBelakang, "Nomor KTP ", nomorKTP, "Penjualan ", penjualan, "Komisi ", komisi, "Pendapatan ",
                pendapatan(), "Gaji Pokok ", gajiPokok);
    }
}