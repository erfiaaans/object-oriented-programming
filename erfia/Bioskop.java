package erfia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("SELAMAT DATANG DI CGV PLAZA SHIBUYA");
        System.out.println("===================================");

        List<Film> filmList = new ArrayList<>(
                Arrays.asList(new Film("Ipar adalah Maut"), new Film("Exhuma"), new Film("Kimi no Nawa")));

        for (int i = 0; i < filmList.size(); i++) {
            System.out.println((i + 1) + ". " + filmList.get(i).getJudul());
        }
        System.out.print("Pilih Film: ");

        int filmIndex = scanner.nextInt() - 1;
        Film pilihFilm = filmList.get(filmIndex);

        System.out.println("\n=============");
        List<String> days = Arrays.asList("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu");
        for (int i = 0; i < days.size(); i++) {
            System.out.println((i + 1) + ". " + days.get(i));
        }

        System.out.print("Pilih Hari: ");
        String hari = "";
        int choiceDay = scanner.nextInt();
        if (choiceDay >= 1 && choiceDay <= 7) {
            hari = days.get(choiceDay - 1);
        } else {
            System.out.println("Hari tidak valid!");
            return;
        }

        System.out.println("\n=============");
        System.out.println("1. 11.00 - 13.15");
        System.out.println("2. 13.30 - 15.45");
        System.out.println("3. 16.00 - 18.15");
        System.out.print("Pilih Waktu: ");
        String waktu = "";
        switch (scanner.nextInt()) {
            case 1:
                waktu = "11.00 - 13.15";
                break;

            case 2:
                waktu = "13.30 - 15.45";
                break;

            case 3:
                waktu = "16.00 - 18.15";
                break;

            default:
                System.out.println("Waktu tidak valid!");
                return;
        }

        System.out.println("\n=============");
        System.out.println("1. Audi 1");
        System.out.println("2. Audi 2");
        System.out.println("3. Audi 3");
        System.out.print("Pilih Audi: ");
        String audi = "";
        switch (scanner.nextInt()) {
            case 1:
                audi = "Audi 1";
                break;

            case 2:
                audi = "Audi 2";
                break;

            case 3:
                audi = "Audi 3";
                break;

            default:
                System.out.println("Audi tidak valid!");
                return;
        }

        Jadwal jadwal = new Jadwal(pilihFilm, hari, waktu, audi);

        System.out.println("\n===========");
        System.out.println("1. Reguler");
        System.out.println("2. Sweetbox");
        System.out.print("Pilih Kursi: ");
        Kursi kursi = null;
        switch ((scanner.nextInt())) {
            case 1:
                kursi = new KursiReguler();
                break;
            case 2:
                kursi = new KursiSweetbox();
                break;
            default:
                System.out.println("Kursi tidak valid!");
                return;
        }

        Tiket tiket = new Tiket(jadwal, kursi);

        tiket.tampilkanDetail();

        scanner.close();
    }
}
