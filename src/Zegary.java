public abstract class Zegary extends Komponent {
    double taktNom;
    double takt;
    double tempNom;
    double tempMax;
    double temp;
    double tempInc;
    abstract void podkrecenie(double var) throws BurnPC;
    abstract void defaultSet();

    public Zegary(String nazwa, String producent, String serial, double taktNom) {
        super(nazwa, producent, serial);
    }
}
