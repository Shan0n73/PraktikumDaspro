package jobsheet10;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survey = new int[10][6];

        System.out.println("DATA SURVEY KEPUASAN PELANGGAN");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                int nilai;
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = input.nextInt();
                } while (nilai < 1 || nilai > 5);

                survey[i][j] = nilai;
            }
        }

        System.out.println("\nRERATA TIAP RESPONDEN");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\nRERATA TIAP PERTANYAAN");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        System.out.println("\nRERATA KESELURUHAN");
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
        }
        double rataKeseluruhan = (double) total / (10 * 6);
        System.out.println("Rerata keseluruhan: " + rataKeseluruhan);

    }
}
