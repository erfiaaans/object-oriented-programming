package erfia;

abstract class Kursi {
    protected String jenis;

    public String getJenis() {
        return jenis;
    }

    public abstract double getHarga();
}
