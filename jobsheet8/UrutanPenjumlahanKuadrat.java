
import java.util.Scanner;

public class UrutanPenjumlahanKuadrat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Penjulahan kuadrat hingga n = ");
        int batas = sc.nextInt();

        for (int n = 1; n <= batas; n++) {
            int jumlahKuadrat = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat;
                System.out.print(kuadrat);
                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlahKuadrat);
        }
    }
}
