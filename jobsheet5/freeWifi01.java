import java.util.Scanner;
public class freeWifi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int sks;

        System.out.println("Wifi gratis yang hanya diakses oleh civitas akademika. Siapa anda? (dosen/ mahasiswa?) ");
        pengguna = sc.next();
        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Anda dapat mengakses wifi gratis");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukan jumlah SKS yang diambil saat ini: ");   
            sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Anda dapat mengakses wifi gratis");
            } else {
                System.out.println("Maaf, anda tidak diperbolehkan mengakses wifi gratis");
            }
        } else {
            System.out.println("Maaf, anda tidak diperbolehkan mengakses wifi ini karena bukan civitas akademika");

        }

    }
}
    

