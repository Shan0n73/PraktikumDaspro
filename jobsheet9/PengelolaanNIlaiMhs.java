import java.util.Scanner;
public class PengelolaanNIlaiMhs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilaiTertinggi, nilaiTerendah;
        int totalNilai = 0;
        double rerata;

        System.out.print("Masukkan jumlah mahasiswa\t: ");
        int mhs = scan.nextInt();

        int[] nilaiMhs = new int[mhs];

        for (int i = 0; i < mhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + "\t: ");
            nilaiMhs[i] = scan.nextInt();
            totalNilai += nilaiMhs[1];
        }

        nilaiTertinggi = nilaiMhs[0];
        nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < mhs; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        rerata = totalNilai / mhs;

        System.out.print("Nilai-nilai yang dimasukkan: ");
        for (int i = 0; i < mhs; i++) {
            System.out.print(nilaiMhs[i]);
            if (i < mhs - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");

        System.out.println("Rerata nilai\t: " + rerata);
        System.out.println("Nilai tertinggi\t: " + nilaiTertinggi);
        System.out.println("Nilai terendah\t: " + nilaiTerendah);

    }
}
