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
    public String getHealth()
    {
        return health + " hit points out of " + maxHealth;
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
    public void lvlUp()
    {
        if (exp > 10)
        {
            lvl++;
            exp = 0;
        }
    }


    //toString YAYYYY
    public String toString()
    {
        return "Name: " + name  +
            "\nMoney: " + money + " gold pieces" +
            "\nLevel: " + lvl +
            "\nCurrent Hit Points: " + health;
    }
}
