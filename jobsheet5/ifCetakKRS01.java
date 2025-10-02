import java.util.Scanner;

public class ifCetakKRS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (sudah/belum):");
        String uktLunas = sc.next();
       
        if (uktLunas.equalsIgnoreCase("sudah")) {
        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
        System.out.println("Pembayaran UKT belum terverivikasi");
        System.out.println("Silakan lunasi UKT terlebih dahulu");

            }
        }
    }