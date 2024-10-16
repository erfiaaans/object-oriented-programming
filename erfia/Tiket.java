package erfia;

public class Tiket {
    private Jadwal jadwal;
    private Kursi kursi;

    public Tiket(Jadwal jadwal, Kursi kursi) {
        this.jadwal = jadwal;
        this.kursi = kursi;
    }

    public void tampilkanDetail() {
        double harga = kursi.getHarga();
        if (jadwal.getHari().equals("Sabtu") || jadwal.getHari().equals("Minggu")) {
            harga = Math.round(harga * 1.10);
        }

        System.out.println("\n==================================");
        System.out.println("          HAPPY WATCHING!         ");
        System.out.println("==================================");
        System.out.println("Film  : " + jadwal.getFilm().getJudul());
        System.out.println("Hari  : " + jadwal.getHari());
        System.out.println("Waktu : " + jadwal.getWaktu());
        System.out.println("Kursi : " + kursi.getJenis());
        System.out.println("Audi  : " + jadwal.getAudi());
        System.out.println("Harga : Rp" + harga);
        System.out.println("==================================");
    }
}
