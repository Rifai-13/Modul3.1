import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alasa, double tinggi) {
        this.alas = alasa;
        this.tinggi = tinggi;
    }

    public double hitungKemiringan() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi pertama: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan panjang sisi kedua: ");
        double tinggi = input.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);

        double kemiringan = segitiga.hitungKemiringan();

        System.out.println("Kemiringan segitiga adalah: " + kemiringan);
    }
}
