package Inheritance;

public class PolimorphismTest {
        public static void main(String args[]) {
                KomisiPegawai komisiPegawai = new KomisiPegawai("Fatasya", "Aulia", "678-90-1234", 20000, .06);

                GajiPlusKomisiPegawai gajiPlusKomisiPegawai = new GajiPlusKomisiPegawai("Upin", "Ipin",
                                "999-99-9999", 5000, .04, 300);

                System.out.printf("%s %s:\n\n%s\n\n", "Memanggil KomisiPegawai dengan referensi superclass ",
                                "ke superclass object", komisiPegawai.toString());

                System.out.printf("%s %s:\n\n%s\n\n", "Memanggil GajiPlusKomisiPegawai toString dengan subclass",
                                "referensi ke subclass object", gajiPlusKomisiPegawai.toString());

                KomisiPegawai komisiPegawai2 = gajiPlusKomisiPegawai;
                System.out.printf("%s %s:\n\n%s\n\n", "Memanggil GajiPlusKomisiPegawai toString dengan superclass",
                                "referensi ke subclass object", komisiPegawai2.toString());
        }
}
