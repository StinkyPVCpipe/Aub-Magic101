public class Bard extends character{
    //1 instance variables
    private String instrument;
    private int mana; //currently has :3
    private int maxMana;

    public Bard()
    {
        name = "";
        money = 0;
        lvl = 0;
        health = 0;
        exp = 0;
        instrument = "";
        mana = 0;
        maxMana = 0;
    }


    //2 constructors
    public Bard(String name, int money, int lvl, int health, String weapon, String instrument)
    {
        super(name, money, lvl, health, weapon);
        this.instrument = instrument;
        this.maxMana = 10 * lvl;
        mana = maxMana;
        exp = 0;
    }

    //3 setters + getters
    public void setInstrument(String instrument)
    {
        this.instrument = instrument;
    }
    public String getInstrument()
    {
        return instrument;
    }



    //4 Brain methods!!

    public int songDmg(int manaRq) //its so joever
    {
        if (manaRq <= mana)
        {
            mana = mana - manaRq;
            exp += manaRq;
            return manaRq * lvl;
        }
        else
        {
            return 0;
        }
    }
    public void longRest()
    {
        super.longRest();
        mana = maxMana;
    }
    public void lvlUp()
    {
        super.lvlUp();
        maxMana = 10 * lvl;
    }


    //5 toString
    public String toString() {

        String output = "Class: Bard\n" + super.toString() + "\ninstrument: " + instrument +
                "\nmana: " + mana + "\n";
       return output;
    }
}
