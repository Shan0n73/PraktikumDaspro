
import java.util.Scanner;

public class CabangKafeKopiSenja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();
        int pelanggan = 0;
        int seluruhItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan : ");
            int seluruhPelanggan = sc.nextInt();
            pelanggan += seluruhPelanggan;

            int totalItem = 0;

            for (int j = 1; j <= seluruhPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItem += item;
            }
            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelanggan: " + seluruhPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItem);
            seluruhItem += totalItem;
        }
        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("Pelanggan: " + pelanggan + " orang");
        System.out.println("Item terjual: " + seluruhItem + " item");
    }
}
