package erfia;

public class Jadwal {
    private Film film;
    private String hari;
    private String waktu;
    private String audi;

    public Jadwal(Film film, String hari, String waktu, String audi) {
        this.film = film;
        this.hari = hari;
        this.waktu = waktu;
        this.audi = audi;
    }

    public Film getFilm() {
        return film;
    }

    public String getHari() {
        return hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getAudi() {
        return audi;
    }
}
