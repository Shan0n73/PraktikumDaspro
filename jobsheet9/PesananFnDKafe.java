import java.util.Scanner;
public class PesananFnDKafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int pesanan = scan.nextInt();
        scan.nextLine();

        String[] namaPesanan = new String[pesanan];
        double[] hargaPesanan = new double[pesanan];
        double totalBiaya = 0;

        for (int i = 0; i < pesanan; i++) {
            System.out.println("Pesanan " + (i + 1) + ": ");
            System.out.print("Nama makanan/minuman(2 Kata)\t: ");
            namaPesanan[i] = scan.nextLine();

            System.out.print("Harga pesanan (Rp)\t\t: ");
            hargaPesanan[i] = scan.nextDouble();
            scan.nextLine();

            totalBiaya += hargaPesanan[i];
            System.out.println();
        }

        System.out.println("Daftar Pesanan");
        System.out.println("No. \t" + " Nama Pesanan \t\t\t" + " Harga (Rp) \t");
        System.out.println("==============================================");

        for (int i = 0; i < pesanan; i++) {
            System.out.println((i + 1) + "\t " + namaPesanan[i] + "\t\t" + "\t " + hargaPesanan[i] + "\t ");
        }
        System.out.println("==============================================");
        System.out.println("Total Biaya Keseluruhan: Rp. " + totalBiaya);

    }
}
