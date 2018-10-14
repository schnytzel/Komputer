public abstract class Komponent {

    String nazwa;
    String producent;
    String serial;

    public Komponent(String nazwa, String producent, String serial) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.serial = serial;
    }
}
