import java.util.Scanner;
public class MenuKafe {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Daftar Menu Kafe Yang Tersedia");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("Nama makanan/minuman yang dicari: ");
        String cari = scan.nextLine();

        boolean ketemu = false;
        int ditemukan = -1;

        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                ketemu = true;
                ditemukan = i;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Menu " + cari + " ada di daftar. Ada pada urutan ke-" + (ditemukan + 1) + " di Daftar Menu");
        } else {
            System.out.println("Maaf, Makanan/Minuman " + cari + " tidak tersedia di menu");
        }

    }
}
