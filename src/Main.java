public class Main {
    public static void main(String[] args) {
     //System.out.println("NYAH");
     Bard saltine = new Bard("Saltine Pretzel Bread", 10, 3,10, "dagger", "flute");
     Bard skilledBard = new Bard("Pete Davidson",200, 10, 10, "pointy stick","trombone");
     Barbarian Darryl = new Barbarian("Darryl", 250,12,10, "fists", 5);
     Rogue Ron = new Rogue("Ron", 10, 8, 10, "mustache", 3);

        System.out.println(saltine.toString());
        System.out.println(Darryl.toString());
        System.out.println(Ron.toString());
    }
}