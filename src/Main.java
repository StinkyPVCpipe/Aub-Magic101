import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
     //System.out.println("NYAH");
     Bard saltine = new Bard("Saltine Pretzel Bread", 10, 3,10, "dagger", "flute");
     Bard skilledBard = new Bard("Pete Davidson",200, 10, 10, "pointy stick","trombone");
     Barbarian Darryl = new Barbarian("Darryl", 250,12,10, "fists", 5);
     Barbarian Spencer = new Barbarian("Spencer F. Michael", 10, 11, 10, "super cool and epic sword", 3);
     Rogue Stephen = new Rogue("Stephen Phillips", 500, 15,10, "long cloak", 8);
     Rogue Ron = new Rogue("Ron", 10, 8, 10, "mustache", 3);
     int attackDmg = 0;
     /*
        System.out.println(saltine.toString());
        System.out.println(Darryl.toString());
        System.out.println(Ron.toString());

      */

        ArrayList<character> Chars = new ArrayList<character>();
        Chars.add(saltine);
        Chars.add(skilledBard);
        Chars.add(Darryl);
        Chars.add(Spencer);
        Chars.add(Stephen);
        Chars.add(Ron);

        ListIterator iter = Chars.listIterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next().toString());
        }

        System.out.print("Two bards face off!! " + saltine.getName() + " and " + skilledBard.getName() + " stare each other down..." +
                "\n" + saltine.getName() + " attacks " + skilledBard.getName() + " with her " + saltine.getWeapon() + "!! " +
                skilledBard.getName() + " takes ");
        attackDmg = saltine.getAttackDmg();
        skilledBard.takeDamage(attackDmg);
        System.out.println(attackDmg + " hit points! \nNow " + skilledBard.getName() + " is" + skilledBard.getHealth() + "!!\n" +
                skilledBard.getName() + " retaliates against " + saltine.getName() + " by playing their " +
                skilledBard.getInstrument() + "\nand attacking them with their song!");
        attackDmg = skilledBard.songDmg(6);
        saltine.takeDamage(attackDmg);
        System.out.println(skilledBard.getName() + " plays a tantalizing tune! " + saltine.getName() + " takes " + attackDmg + " hit points!" +
                "\nThis leaves Saltine " + saltine.getHealth() + "!!");

        System.out.println("\nA Rogue and a Barbarian go against each other. \n" +
                Stephen.getName() + " sneaks up and attacks " + Spencer.getName() + " with their " + Stephen.getWeapon());
        attackDmg = Stephen.sneakAttack();
        Spencer.takeDamage(attackDmg);
        System.out.println(Spencer.getName() + " takes " + attackDmg + " hit points!" +
                "\nThis leaves " + Spencer.getName() + Spencer.getHealth());
        System.out.println(Spencer.getName() + " invokes rage and attacks " + Stephen.getName());
        attackDmg = Spencer.Attack(10);
        Stephen.dodge(attackDmg);
        System.out.println(Stephen.getName() + " attempts to dodge and takes " + attackDmg + " hit points" +
                "\nThis leaves Stephen at " + Stephen.getHealth());
    }
}

