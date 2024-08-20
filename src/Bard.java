public class Bard extends character{
    //1 instance variables
    private String instrument;
    private int mana; //currently has :3
    private final int MAXMANA;

    public Bard()
    {
        name = "";
        money = 0;
        lvl = 0;
        health = 0;
        exp = 0;
        instrument = "";
        mana = 0;
        MAXMANA = 0;
    }


    //2 constructors
    public Bard(String name, int money, int lvl, int health, String instrument, int mana)
    {
        super(name, money, lvl, health);
        this.instrument = instrument;
        this.MAXMANA = mana;
        this.mana = MAXMANA;
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
        mana = MAXMANA;
    }


    //5 toString
    public String toString() {

        String output = super.toString();
        output = output.concat("\ninstrument: " + instrument +
                "\nmana: " + mana);
       return output;
    }
}
