public class GajiPlusKomisiPegawaiTest {
    public static void main(String args[]) {
        GajiPlusKomisiPegawai pegawai = new GajiPlusKomisiPegawai("Fatasya", "Aulia", "678-90-1234", 20000.0, .06, 350.0);

        System.out.println("Informasi Pegawai berdasarkan method : \n");
        System.out.printf("%s %s\n", "Nama depan :", pegawai.getNamaDepan());
        System.out.printf("%s %s\n", "Nama belakang :", pegawai.getNamaBelakang());
        System.out.printf("%s %s\n", "Nomor KTP :", pegawai.getNomorKTP());
        System.out.printf("%s %.2f\n", "Penjualan :", pegawai.getPenjualan());
        System.out.printf("%s %.2f\n", "Komisi :", pegawai.getKomisi());
        System.out.printf("%s %.2f\n", "Pendapatan :", pegawai.pendapatan());
        System.out.printf("%s %.2f\n", "Gaji Pokok :", pegawai.getGajiPokok());

        pegawai.setGajiPokok(2000.0);

        System.out.printf("\n%s:\n\n%s\n", "Update Informasi Pegawai berdasarkan toString", pegawai);
    }

}