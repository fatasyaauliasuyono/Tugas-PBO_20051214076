package Interface;

public class Faktur implements HarusDibayar {
    private final String nomorBagian;
    private final String deskripsiBagian;
    private int kuantitas;
    private double hargaPerBarang;

    public Faktur(String nomorBagian, String deskripsiBagian, int kuantitas, double hargaPerBarang) {
        if (kuantitas < 0)
            throw new IllegalArgumentException("Kuantitas harus >= 0");
        if (hargaPerBarang < 0.0)
            throw new IllegalArgumentException("Harga per item harus >= 0");
        this.kuantitas = kuantitas;
        this.nomorBagian = nomorBagian;
        this.deskripsiBagian = deskripsiBagian;
        this.hargaPerBarang = hargaPerBarang;
    }

    public String getNomorBagian() {
        return nomorBagian;
    }

    public String getDeskripsiBagian() {
        return deskripsiBagian;
    }

    public void setKuantitas(int kuantitas) {
        if (kuantitas < 0)
            throw new IllegalArgumentException("Kuantitas harus >= 0");
        this.kuantitas = kuantitas;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setHargaPerBarang(double hargaPerBarang) {
        if (hargaPerBarang < 0.0)
            throw new IllegalArgumentException("Harga per item harus >= 0");
        this.hargaPerBarang = hargaPerBarang;
    }

    public double getHargaPerBarang() {
        return hargaPerBarang;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "Faktur", "Nomor bagian", getNomorBagian(),
                getDeskripsiBagian(), "Kuantitas", getKuantitas(), "Harga per item", getHargaPerBarang());
    }

    @Override
    public double getJumlahPembayaran() {
        return getKuantitas() * getHargaPerBarang();
    }
}