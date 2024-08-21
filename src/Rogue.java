public class Rogue extends character
{
    private int sneakLvl;
    private int sneak;

    public Rogue()
    {
        name = "";
        money = 0;
        lvl = 0;
        health = 0;
        exp = 0;
        sneakLvl = 0;
    }

    public Rogue(String name, int money, int lvl, int health, int sneakLvl)
    {
        super(name, money, lvl, health);
        this.sneakLvl = sneakLvl;
        sneak = sneakLvl;
        exp = 0;
    }

    //getters + setters
    public int getSneakLvl()
    {
        return sneakLvl;
    }
    public int getSneak()
    {
        return sneak;
    }

    //brain methods
    public int dodge(int potenDmg)
    {
        //MMEEEEOIOWWWW
        potenDmg = (potenDmg/2);
        int doesDodge = (int)(Math.random()*2);
        if (doesDodge == 1)
        {
            potenDmg = (potenDmg/2);
        }
        health = health - potenDmg;
        return potenDmg;
    }

    public int sneakAttack()
    {
        int attackDmg = lvl*sneak;
        sneak--;
        return attackDmg;
    }
    public void longRest()
    {
        super.longRest();
        sneak = sneakLvl;
    }
    public void lvlUp()
    {
        super.lvlUp();
        sneakLvl++;
    }


    // toString
    public String toString()
    {
        String output = "Class: Rogue\n" + super.toString() + "\nSneak Level: " + sneakLvl +"\n";
        return output;
    }

}
