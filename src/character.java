public class character {
    //instance variables ?:0
    String name;
    int money;
    int lvl;
    int maxHealth;
    int health;

    public character()
    {
        name = "";
        money = 0;
        lvl = 0;
        maxHealth = 0;
        health = 0;
    }
    public character(String name, int money, int lvl, int health)
    {
        this.name = name;
        this.money = money;
        this.lvl = lvl;
        this.maxHealth = lvl * 7;
        this.health = maxHealth;
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


    //toString YAYYYY
    public String toString()
    {
        return "name: " + name  +
            "\nmoney: " + money + " gold pieces" +
            "\nlevel: " + lvl +
            "\ncurrent hit points: " + health;
    }
}
