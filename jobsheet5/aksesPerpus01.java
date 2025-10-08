import java.util.Scanner;
public class aksesPerpus01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ktm;
        boolean regisOnline;
        System.out.println("Apakah anda membawa/memiliki KTM? (true/false)");
        ktm = sc.nextBoolean();
        System.out.println("Apakah sudah registrasi online? (true/false)");
        regisOnline = sc.nextBoolean();
        if (ktm == true || regisOnline == true) {
            System.out.println("Silahkan masuk :>");
        } else {
            System.out.println("Anda tidak boleh masuk");

        }

    }

}