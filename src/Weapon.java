public class Weapon
{
    private String type;
    private int strength;

    public Weapon()
    {
        type = "";
        strength = 0;
    }
    public Weapon(String type, int strength)
    {
        this.type = type;
        this.strength = strength;
    }

    //getters + setters
    public String getType()
    {
        return type;
    }
    public int getStrength()
    {
        return strength;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    //brain methods :333
    public int attack()
    {
        int damage = (int)(Math.random()*strength) + strength;
        return damage;
    }

    //to String
    public String toString()
    {
        String output = "Weapon type: " + type +
                        "\nStrength of Weapon: " + strength;
        return output;
    }


}
