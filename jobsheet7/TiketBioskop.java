
import java.util.Scanner;

public class TiketBioskop {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000;
        double totalPenjualanTiketPerHari = 0.0;
        
        int totalTiketHarian = 0;
        
        System.out.println("Selamat datang!!");
        System.out.println("Masukkan jumlah tiket per transaksi.");
        
        do {
            
            System.out.print("\nMasukkan jumlah tiket: ");
            int jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                System.out.println("Kasir ditutup.");
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan coba lagi.");
                continue;
            }
            
            double diskon;           
            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            } else {
                diskon = 0.0;
            }
            
            double hargaAwal = jumlahTiket * hargaTiket;
            double potonganDiskon = hargaAwal * diskon;
            double hargaAkhir = hargaAwal - potonganDiskon;

            System.out.println("Harga Tiket: Rp " + hargaAwal);
            System.out.println("Diskon: Rp " + potonganDiskon);
            System.out.println("Total yang harus dibayar: Rp " + hargaAkhir);

            totalTiketHarian = totalTiketHarian + jumlahTiket;
            totalPenjualanTiketPerHari = totalPenjualanTiketPerHari + hargaAkhir;
            
        } while (true);
        

        System.out.println("\nTotal Tiket Terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan Harian: Rp " + totalPenjualanTiketPerHari);
    }
}
