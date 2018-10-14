public class Dysk extends Komponent {

    double pojemnosc;

    public Dysk(String nazwa, String producent, String serial, double pojemnosc) {
        super(nazwa, producent, serial);
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return "Dysk{" +
                "pojemnosc=" + pojemnosc +
                ", nazwa='" + nazwa + '\'' +
                ", producent='" + producent + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
