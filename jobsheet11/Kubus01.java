package jobsheet11;

public class Kubus01 {
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }

    public static void main(String[] args) {
        int panjangSisi = 10;

        System.out.println("Panjang sisi: "+ panjangSisi);

        int volume = hitungVolume(panjangSisi);
        System.out.println("Volume kubus: "+ volume);

        int luasPermukaan = hitungLuasPermukaan(panjangSisi);
        System.out.println("Luas Permukaan kubus: "+ luasPermukaan);

    }
}
