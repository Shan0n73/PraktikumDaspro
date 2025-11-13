
import java.util.Scanner;

public class PersegiSisiLuar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang sisi persegi(min. 3): ");
        int sisi = sc.nextInt();
        if (sisi < 3) {
            System.out.print("Panjang sisinya harus 3 atau lebih.");
        } else {
            System.out.println("Persegi dengan sisi " + sisi + " adalah:");
            for (int i = 1; i <= sisi; i++) {
                for (int j = 1; j <= sisi; j++) {
                    if (i == 1 || i == sisi || j == 1 || j == sisi) {
                        System.out.print(sisi);
                    } else {
                        System.out.print(" ");
                    }
                    if (j < sisi) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                sc.close();
            }
        }
    }
}
