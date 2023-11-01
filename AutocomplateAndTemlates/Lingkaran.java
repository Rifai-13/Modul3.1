/**
 * Kelas Lingkaran digunakan untuk menghitung luas dan keliling lingkaran.
 *
 * @author Rifai
 */
public class Lingkaran {
    private double jariJari;

    /**
     * Konstruktor untuk membuat objek Lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari Panjang jari-jari lingkaran.
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return Luas lingkaran.
     */
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return Keliling lingkaran.
     */
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    /**
     * Metode utama untuk menguji kelas Lingkaran.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        double jariJari = 5.0;
        Lingkaran lingkaran = new Lingkaran(jariJari);

        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Lingkaran dengan jari-jari " + jariJari);
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
