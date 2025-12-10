package jobsheet11;

import java.util.Scanner;

public class Kafe01 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda telah mendapatkan tambahan diskon sebesar 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda telah mendapatkan tambahan diskon sebesar 30%");
        } else {
            System.out.println("Kode promo yang anda masukkan tidak valid, silahkan coba lagi!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }
    
    public static int hitungTotalHarga01(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            return 0;
        }
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        double diskon = 0;
        double hargaAkhir = hargaTotal;
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 0.50;
            hargaAkhir = hargaTotal - diskon;
            System.out.println("Kode Promo: DISKON50 (50%) berlaku");
            System.out.println("Besar Diskon: Rp" + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 0.30;
            hargaAkhir = hargaTotal - diskon;
            System.out.println("Kode Promo: DISKON30 (30%) berlaku");
            System.out.println("Besar Diskon: Rp" + diskon);
        } else {
            System.out.println("Kode Promo: '" + kodePromo + "' **INVALID**");
            System.out.println("Tidak ada diskon");
        }
        return hargaTotal;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "DISKON50");
        String kodePromo = "DISKON50";
        int totalKeseluruhan = 0;
        String tambahMenu;
        
        
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
    
            int totalHarga = hitungTotalHarga01(pilihanMenu, banyakItem, kodePromo);
    
            if (totalHarga > 0) {
                totalKeseluruhan += totalHarga;
                System.out.println("Harga item ini: Rp" + totalHarga);
            } else {
                System.out.println("Nomor menu tidak valid. Pesanan diabaikan.");
            }
    
            System.out.print("Mau Pesan menu lain? (yes/no): ");
            tambahMenu = sc.nextLine();
    
        } while (tambahMenu.equalsIgnoreCase("yes"));
    
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalKeseluruhan);
        
    }
}
