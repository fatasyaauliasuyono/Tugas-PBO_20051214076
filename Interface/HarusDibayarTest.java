package Interface;

public class HarusDibayarTest {
    public static void main(String args[]) {
        HarusDibayar harusDibayarObjek[] = new HarusDibayar[4];

        harusDibayarObjek[0] = new Faktur("01234", "seat", 2, 375.00);
        harusDibayarObjek[1] = new Faktur("56789", "tire", 4, 79.95);
        harusDibayarObjek[2] = new GajiPegawai("Tinky", "Winky", "777-77-7777", 800.00);
        harusDibayarObjek[3] = new GajiPegawai("Dipsy", "Po", "999-99-9999", 1200.00);

        System.out.println("Proses polimorphism pada Faktur dan Pegawai:\n");

        for (HarusDibayar harusDibayarSekarang : harusDibayarObjek) {
            System.out.printf("%s \n%s: $%,.2f\n\n", harusDibayarSekarang.toString(), "Jatuh tempo",
                    harusDibayarSekarang.getJumlahPembayaran());
        }
    }
}