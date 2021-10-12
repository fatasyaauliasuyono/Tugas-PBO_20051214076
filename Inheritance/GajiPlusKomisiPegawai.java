package Inheritance;

public class GajiPlusKomisiPegawai extends KomisiPegawai {

    private double gajiPokok;

    public GajiPlusKomisiPegawai(String namaDepan, String namaBelakang, String nomorKTP, double penjualan,
            double komisi, double gajiPokok) {
        super(namaDepan, namaBelakang, nomorKTP, penjualan, komisi);

        if (gajiPokok < 0.0)
            throw new IllegalArgumentException("Gaji pokok harus >= 0.0");

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

    @Override
    public double pendapatan() {
        return getGajiPokok() + super.pendapatan();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: $%,.2f", "gaji-pokok", super.toString(), "gaji pokok", getGajiPokok());
    }
}