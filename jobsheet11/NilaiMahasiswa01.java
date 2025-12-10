package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa01 {
    public static Scanner sc = new Scanner(System.in);

    public static void isianArray(int[] nilaiArray) {
        System.out.println("\nNilai Mahasiswa");
        System.out.println("================");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+ (i + 1) +": ");
            nilaiArray[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilaiArray) {
        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.print("Nilai: [");

        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print(nilaiArray[i]);
            if (i < nilaiArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static double hitTot(int[] nilaiArray) {
        double total = 0;

        for (int nilai : nilaiArray) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Mahasiswa(N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        double totalNilai = hitTot(nilaiMahasiswa);

        System.out.printf("Total nilai seluruh Mahasiswa: %.2f\n", totalNilai);
    }
}
