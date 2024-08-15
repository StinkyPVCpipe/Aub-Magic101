public class Bard extends character{
    //1 instance variables
    String instrument;
    int money;
    int mana; //currently has :3

    //2 constructors
    public Bard(String instrument, int money, int mana)
    {
        this.instrument = instrument;
        this.money = money;
        this.mana = mana;
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


    //5 toString
    public String toString() {
        String output = "instrument: " + instrument +
                "\nmoney: " + money + " gold pieces" +
                "\nmana: " + mana;
       return output;
    }
}
