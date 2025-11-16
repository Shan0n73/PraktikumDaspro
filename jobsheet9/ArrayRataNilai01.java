
import java.util.Scanner;

public class ArrayRataNilai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs;
        int mhsLulus = 0, mhsTdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2lulus = 0, rata2Tdklulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }
        }

        if (mhsLulus > 0) {
            rata2lulus = totalLulus / mhsLulus;
        }
        if (mhsTdkLulus > 0) {
            rata2Tdklulus = totalTdkLulus / mhsTdkLulus;
        }
        System.out.println("Rata-rata Nilai Lulus = " + rata2lulus);
        System.out.println("Rata-rata Nilai tidak Lulus = " + rata2Tdklulus);
    }
}
