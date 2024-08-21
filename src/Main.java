public class Main {
    public static void main(String[] args) {
     //System.out.println("NYAH");
     Bard saltine = new Bard("Saltine Pretzel Bread", 10, 3,10, "flute");
     Bard skilledBard = new Bard("Pete Davidson",200, 10, 10,"trombone");
     Barbarian Darryl = new Barbarian("Darryl", 250,12,10, 5, "fists");
     Rogue Ron = new Rogue("Ron", 10, 8, 10, 3);

        System.out.println(saltine.toString());
        System.out.println(Darryl.toString());
        System.out.println(Ron.toString());
    }
}