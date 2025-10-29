import java.util.Scanner;

public class TempatParkir {

    public static void main(String[] args) {

        int jenis;
        int durasi;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");

            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {

                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Biaya anda adalah Rp 12.500 (Tarif tetap untuk parkir lebih dari 5 jam)");
                } else {
                    switch (jenis) {
                        case 1:
                            int biaya = durasi * 3000;
                            total += biaya;
                            System.out.println("Biaya: Rp " + biaya);
                            break;
                        case 2:
                            biaya = durasi * 2000;
                            total += biaya;
                            System.out.println("Biaya: Rp " + biaya);
                            break;
                    }
                }
            }

        } while (jenis != 0);

        System.out.println("Total pendapatan parkir: Rp " + total);
    }
}
