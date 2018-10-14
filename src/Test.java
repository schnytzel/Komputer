public class Test {
    public static void main(String[] args) {

        Komponent dysk = new  Dysk("EcoGreen", "Segate", "666AD", 120);

        Komponent pamiec = new Pamiec("Cruiser", "Kingpin", "666", 1333, 1024);

        Komponent procesor = new Procesor("Celeron", "Intel", "DSX", 2400);

        Komputer myPC = new Komputer(dysk, pamiec, procesor);
        System.out.println(myPC.toString());

        ((Pamiec) pamiec).podkrecenie(200);
        System.out.println(myPC.toStringShort());

        ((Pamiec) pamiec).podkrecenie(100);
        System.out.println(myPC.toStringShort());

        ((Procesor) procesor).podkrecenie(300);
        System.out.println(myPC.toStringShort());

        ((Procesor) procesor).podkrecenie(300);
        System.out.println(myPC.toStringShort());

        ((Procesor) procesor).podkrecenie(300);
        System.out.println(myPC.toStringShort());

    }
}
