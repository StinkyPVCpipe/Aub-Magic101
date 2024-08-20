public class Bard extends character{
    //1 instance variables
    private String instrument;
    private int mana; //currently has :3
    private final int MAXMANA;

    //2 constructors
    public Bard(String name, int money, int lvl, int health, String instrument, int mana)
    {
        super(name, money, lvl, health);
        this.instrument = instrument;
        this.MAXMANA = mana;
        this.mana = MAXMANA;
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
        }
        else
        {
            return 0;
        }
        return manaRq * lvl;
    }

    public void longRest()
    {
        super.longRest();
        mana = MAXMANA;
        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
        //uregh....im so COOKED!!!

    }


    //5 toString
    public String toString() {

        String output = super.toString();
        output = output.concat("\ninstrument: " + instrument +
                "\nmana: " + mana);
       return output;
    }
}
