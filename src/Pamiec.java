public class Pamiec extends Zegary2 {

    double wielkosc;

    public Pamiec(String nazwa, String producent, String serial, double taktNom, double wielkosc ) {
        super(nazwa, producent, serial, taktNom);
        tempMax = 120;
        tempNom = 60;
        tempInc = 15;
        this.wielkosc = wielkosc;
        this.temp = tempNom;
    }

}
