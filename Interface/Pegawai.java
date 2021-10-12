package Interface;

public abstract class Pegawai implements HarusDibayar {
    public String namaDepan;
    public String namaBelakang;
    public String nomorKTP;

    public Pegawai(String namaDepan, String namaBelakang, String nomorKTP) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.nomorKTP = nomorKTP;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nnomor KTP : %s", getNamaDepan(), getNamaBelakang(), getNomorKTP());
    }

    public abstract double pendapatan();

}
