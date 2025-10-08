import java.util.Scanner;

public class ifCetakKRS01 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (sudah/belum):");
        
        boolean uktlunas = sc.nextBoolean();
        String hasil = (uktlunas) ? "pembayaran UKT terverifikasi\nsilahkan cetak KRS dan minta tanda tangan dosen DPA" : "pembayaran UKT belum terverifikasi\nsilahkan lunasi pembayaran UKT terlebih dahulu";
        System.out.println(hasil);
    }
}
}