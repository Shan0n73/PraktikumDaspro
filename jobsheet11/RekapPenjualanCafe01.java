package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe01 {
    public static void dataPenjualanCafe(Scanner sc, int[][] dataJual, int jmlMenu, int jmlHari) {
        sc.nextLine();

        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Input Penjualan Menu ke-" + (i + 1));
                for (int j = 0; j < jmlHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataJual[i][j] = sc.nextInt();
            }
        }     
    }

    public static void menampilkanData(int[][] dataJual, int jmlMenu) {
        int JML_HARI = dataJual[0].length;
        System.out.println("\n--- Rekap Penjualan ---");
        
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= JML_HARI; h++) {
            System.out.printf("HARI %-3d", h);
        }
        System.out.println();
        for (int i = 0; i < jmlMenu; i++) { 
            System.out.printf("%-15s", "Menu " + (i + 1)); 
            for (int j = 0; j < JML_HARI; j++) {
                System.out.printf("%-9d", dataJual[i][j]);
            }
            System.out.println();
        }
    }
    public static void dataPenjualanTertinggi(int[][] dataJual, int jmlMenu) {
        int menuTertinggi = 0;
        int totPenjualan = -1;
        
        for (int i = 0; i < dataJual.length; i++) {
            int totalSaatIni = 0;
            for (int j = 0; j < dataJual[i].length; j++) {
                totalSaatIni += dataJual[i][j];
            }

            if (totalSaatIni > totPenjualan) {
                totPenjualan = totalSaatIni;
                menuTertinggi = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + (menuTertinggi + 1)); 
        System.out.println("Total Penjualan adalah " + totPenjualan + " item");
    }
    public static void RataRata(int[][] dataJual, int jmlMenu) {
        int jumlahHari = dataJual[0].length;
        System.out.println("\n--- Rata-rata Penjualan ---");

        for (int i = 0; i < dataJual.length; i++) {
            double total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += dataJual[i][j];
            }
            double rataRata = total / jumlahHari;
            
        String namaMenu = "Menu " + (i + 1);
        System.out.printf(namaMenu + " : %.2f unit\n", rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        int[][] dataPenjualan = new int[jmlMenu][jmlHari];

        dataPenjualanCafe(sc, dataPenjualan , jmlMenu, jmlHari);
        menampilkanData(dataPenjualan, jmlMenu);
        dataPenjualanTertinggi(dataPenjualan, jmlMenu);
        RataRata(dataPenjualan, jmlMenu);





    }
}
