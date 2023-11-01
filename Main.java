import java.util.Scanner;

/**
 * Kelas Segitiga digunakan untuk menghitung kemiringan segitiga.
 */
class Segitiga {
    private double alas;
    private double tinggi;

    /**
     * Konstruktor kelas Segitiga.
     * @param alasa Alas segitiga.
     * @param tinggi Tinggi segitiga.
     */
    public Segitiga(double alasa, double tinggi) {
        this.alas = alasa;
        this.tinggi = tinggi;
    }

    /**
     * Menghitung kemiringan segitiga.
     * @return Nilai kemiringan segitiga.
     */
    public double hitungKemiringan() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);

        double kemiringan = segitiga.hitungKemiringan();

        System.out.println("Kemiringan segitiga adalah: " + kemiringan);
    }
}
