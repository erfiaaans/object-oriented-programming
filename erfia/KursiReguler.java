package erfia;

public class KursiReguler extends Kursi {
    public KursiReguler() {
        jenis = "Reguler";
    }

    @Override
    public double getHarga() {
        return 45000;
    }
}
