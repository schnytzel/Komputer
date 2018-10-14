public class Zegary2 extends Zegary {


    public Zegary2(String nazwa, String producent, String serial, double taktNom) {
        super(nazwa, producent, serial, taktNom);
        this.taktNom = taktNom;
        this.takt = taktNom;
    }

    @Override
    void podkrecenie(double var) {
        double tempNew = temp + var / 100 * tempInc;
        if(tempNew > tempMax){
            throw new BurnPC();
        } else {
            temp = tempNew;
            takt += var;
        }
    }

    @Override
    void defaultSet() {
        takt = taktNom;
        temp = tempNom;
    }

    @Override
    public String toString() {
                return "taktNom=" + taktNom +
                ", takt=" + this.takt +
                ", tempNom=" + tempNom +
                ", tempMax=" + tempMax +
                ", temp=" + temp +
                ", nazwa='" + nazwa + '\'' +
                ", producent='" + producent + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}