public class Barbarian extends character
{
    private int rageLvl;
    private String weapon;
    private int stamina;
    private int staminaMAX;

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
        staminaMAX = 0;
    }
    public Barbarian (String name, int money, int lvl, int health, int rageLvl, int staminaMAX, String weapon)
    {
        super(name, money, lvl, health);
        this.rageLvl = rageLvl;
        this.weapon = weapon;
        this.staminaMAX = staminaMAX;
        this.stamina = staminaMAX;
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
    public String getWeapon()
    {
        return weapon;
    }
    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
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
        stamina = staminaMAX;
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output = output.concat("\nRage Level: " + rageLvl +
                "\nWeapon: " + weapon);
        return output;
    }



}
