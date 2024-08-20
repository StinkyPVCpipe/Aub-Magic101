public class character {
    //instance variables ?:0
    String name;
    int money;
    int lvl;
    int maxHealth;
    int health;
    int exp;

    public character()
    {
        name = "";
        money = 0;
        lvl = 0;
        maxHealth = 0;
        health = 0;
        exp = 0;
    }
    public character(String name, int money, int lvl, int health)
    {
        this.name = name;
        this.money = money;
        this.lvl = lvl;
        this.maxHealth = lvl * 7;
        this.health = maxHealth;
        exp = 0;
    }

    //set + get

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }

    //brain methods blehhh
    public void longRest()
    {
        health = maxHealth;
    }
    public void takeDamage(int damage)
    {
        health = health - damage; //lol...
    }
    public String lvlUp()
    {
        if (exp > 10)
        {
            lvl++;
            exp = 0;
        }
        return "Congratulations!! this level is now " + lvl;
    }


    //toString YAYYYY
    public String toString()
    {
        return "name: " + name  +
            "\nmoney: " + money + " gold pieces" +
            "\nlevel: " + lvl +
            "\ncurrent hit points: " + health;
    }
}
