public class Barbarian extends character
{
    private int rageLvl;
    private String weapon;
    private int stamina;
    private int staminaMax;

    //constructors
    public Barbarian ()
    {
        name = "";
        money = 0;
        lvl = 0;
        health = 0;
        exp = 0;
        rageLvl = 0;
        weapon = "";
        stamina = 0;
        staminaMax = 0;
    }
    public Barbarian (String name, int money, int lvl, int health, String weapon, int rageLvl)
    {
        super(name, money, lvl, health, weapon);
        this.rageLvl = rageLvl;
        this.weapon = weapon;
        this.staminaMax = 10 * lvl;
        this.stamina = staminaMax;
        exp = 0;
    }

    //getters and setters
    public int getRageLvl()
    {
        return rageLvl;
    }
    public int getStamina()
    {
        return stamina;
    }

    //brain methods
    public int Attack(int staminaRq)
    {
        if(staminaRq <= stamina)
        {
            stamina = stamina - staminaRq;
            exp += staminaRq;
            return staminaRq * rageLvl;
        }
        else
        {
            return 0;
        }
    }
    public void longRest()
    {
        super.longRest();
        stamina = staminaMax;
    }
    public void lvlUp()
    {
        super.lvlUp();
        staminaMax = 10*lvl;
    }

    //toString
    public String toString()
    {
        String output = "Class: Barbarian\n" + super.toString() + "\nRage Level: " + rageLvl + "\n";
        return output;
    }



}
