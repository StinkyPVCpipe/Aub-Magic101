public class character {
    //instance variables ?:0
    String name;
    int money;
    int lvl;
    int maxHealth;
    int health;
    int exp;
    Weapon weapon;

    public character()
    {
        name = "";
        money = 0;
        lvl = 0;
        maxHealth = 0;
        health = 0;
        exp = 0;
        weapon = new Weapon("", 0);
    }
    public character(String name, int money, int lvl, int health, String weapon)
    {
        this.name = name;
        this.money = money;
        this.lvl = lvl;
        this.maxHealth = lvl * 7;
        this.health = maxHealth;
        exp = 0;
        this.weapon = new Weapon(weapon, lvl);
    }

    //set + get

    public void setName(String name) {
        this.name = name;
    }
    public void setWeapon(String weapon)
    {
        this.weapon = new Weapon(weapon, lvl);
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public String getHealth()
    {
        if(health <= 0-maxHealth)
        {
            return "dead";
        }
        return " at " + health + " hit points out of " + maxHealth;
    }
    public String getWeapon() {
        return weapon.getType();
    }

    //brain methods blehhh
    public void longRest()
    {
        health = maxHealth;
    }
    public void takeDamage(int damage)
    {
        health = health - damage; //lol.
    }
    public void lvlUp()
    {
        if (exp > 10)
        {
            lvl++;
            exp = 0;
        }
    }
    public int getAttackDmg()
    {
        int attackDmg = weapon.attack();
        exp+=attackDmg;
        return attackDmg;
    }


    //toString YAYYYY
    public String toString()
    {
        return "Name: " + name  +
            "\nMoney: " + money + " gold pieces" +
            "\nLevel: " + lvl +
            "\nCurrent Hit Points: " + health +
            "\n" + weapon.toString();

    }
}
