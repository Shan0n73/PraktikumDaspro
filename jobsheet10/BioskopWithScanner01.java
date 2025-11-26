
import java.util.Scanner;

public class BioskopWithScanner01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan, baris, kolom;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMENU BIOSKOP");
            System.out.println("1. Input data penonton");
            System.out.println("2. Menampilkan daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu yang anda inginkan (1-3): ");

            if (sc.hasNextInt()) {
                pilihan = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama Anda\t\t\t: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Ingin di baris berapa(1-4)\t: ");
                        baris = sc.nextInt();
                        System.out.print("Ingin di kolom berapa (1-2)\t: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Anda telah memesan kursi pada baris " + baris + ", kolom " + kolom + " untuk " + nama);
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi (" + baris + ", " + kolom + ") sudah diisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Anda telah memesan kursi pada baris " + baris + ", kolom " + kolom + " atas nama " + nama);
                        break;
                    }
                }

                case 2 -> {
                    System.out.println("\nDAFTAR PENONTON");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");

                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaKursi = (penonton[i][j] != null) ? penonton[i][j] : "XX";
                            System.out.print(namaKursi + " (" + (i + 1) + "," + (j + 1) + ") | ");
                        }
                        System.out.println();
                    }
                    System.out.println("NB: XX = Kursi Kosong");
                }

                case 3 -> {
                    System.out.println("\nTerimakasih telah berkunjung!!");
                    sc.close();
                    return;
                }

                default ->
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
