package Abstrak;

public class SistemDaftarGajiTest {
    public static void main(String[] args) {
        Pegawai[] pegawai = { new GajiPegawai("Dipsy", "Lala", "151-15-1515", 800.00),
                new GajiPerJam("Tinky", "Winky", "979-97-9797", 16.75, 40.0),
                new KomisiPegawai("Po", "Tehyung", "808-80-8080", 10000, .06),
                new GajiPlusKomisiPegawai("Jijel", "Haekal", "949-94-9494", 5000, .04, 300) };

        for (Pegawai pegawaiSekarang : pegawai)
            System.out.printf("%s%n%s%.2f%n%n", pegawaiSekarang, "Pendapatan :", pegawaiSekarang.getJumlahPembayaran());
    }
}