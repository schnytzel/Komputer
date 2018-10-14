public class Komputer {
    Komponent dysk;
    Komponent pamiec;
    Komponent procesor;

    public Komputer(Komponent dysk, Komponent pamiec, Komponent procesor) {
        this.dysk = dysk;
        this.pamiec = pamiec;
        this.procesor = procesor;
    }

    @Override
    public String toString() {
        return "DYSK: " + dysk.toString() +
                "PAMIEC: " + pamiec.toString() +
                "PROCESOR: " + procesor.toString() +"\n";
    }

    public String toStringShort() {
        return  "PAMIEC: " + ((Pamiec) pamiec).takt + "MHz " + ((Pamiec) pamiec).temp + "stC" +"\n" +
                "PROCESOR: " + ((Procesor) procesor).takt + "MHz " + ((Procesor) procesor).temp + "stC" + "\n";
    }

}
