public class Procesor extends Zegary2 {

    public Procesor(String nazwa, String producent, String serial, double taktNom) {
        super(nazwa, producent, serial, taktNom);
        tempMax = 110;
        tempNom = 50;
        tempInc = 10;
        this.temp = tempNom;
    }

}
