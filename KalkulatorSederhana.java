import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban = new String();

       do {
           System.out.println("Selamat datang di Kalkulator Sederhana");
           System.out.println("Pilih operasi yang ingin Anda lakukan:");
           System.out.println("1. Penambahan (+)");
           System.out.println("2. Pengurangan (-)");
           System.out.println("3. Perkalian (*)");
           System.out.println("4. Pembagian (/)");

           System.out.print("Masukkan pilihan (1/2/3/4): ");
           int pilihan = input.nextInt();

           System.out.print("Masukkan angka pertama: ");
           double angka1 = input.nextDouble();

           System.out.print("Masukkan angka kedua: ");
           double angka2 = input.nextDouble();

           double hasil = 0;

           switch (pilihan) {
               case 1:
                   hasil = angka1 + angka2;
                   System.out.println("Hasil penambahan: " + hasil);
                   break;
               case 2:
                   hasil = angka1 - angka2;
                   System.out.println("Hasil pengurangan: " + hasil);
                   break;
               case 3:
                   hasil = angka1 * angka2;
                   System.out.println("Hasil perkalian: " + hasil);
                   break;
               case 4:
                   if (angka2 != 0) {
                       hasil = angka1 / angka2;
                       System.out.println("Hasil pembagian: " + hasil);
                   } else {
                       System.out.println("Kesalahan: Tidak dapat membagi dengan nol.");
                   }
                   break;
               default:
                   System.out.println("Kesalahan: Pilihan tidak valid.");
           }
           System.out.println("apakah ingin lanjut? iya/tidak: ");
           jawaban = input.next();
       }while (jawaban.equalsIgnoreCase("iya"));

    }
}
