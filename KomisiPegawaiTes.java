public class KomisiPegawaiTes {
    public static void main(String args[]) {
        KomisiPegawai pegawai = new KomisiPegawai("Fatasya", "Aulia", "678-90-1234", 20000.0, .06);

        System.out.println("Informasi Pegawai berdasarkan method : \n");
        System.out.printf("%s %s\n", "Nama depan :", pegawai.getNamaDepan());
        System.out.printf("%s %s\n", "Nama belakang :", pegawai.getNamaBelakang());
        System.out.printf("%s %s\n", "Nomor KTP :", pegawai.getNomorKTP());
        System.out.printf("%s %.2f\n", "Penjualan :", pegawai.getPenjualan());
        System.out.printf("%s %.2f\n", "Komisi :", pegawai.getKomisi());
        System.out.printf("%s %.2f\n", "Pendapatan :", pegawai.pendapatan());

        pegawai.setPenjualan(800);
        pegawai.setKomisi(.1);

        System.out.printf("\n%s:\n\n%s\n", "Updated Informasi Pegawai berdasarkan toString", pegawai);
    }
}