import java.util.ArrayList;
import java.util.Random;

public abstract class Hero {

    protected double healthPoints;
    protected double armor;
    protected double damage;
    protected Armor currentArmor;
    protected Weapon currentWeapon;


    public ArrayList<Item> inventory = new ArrayList<Item>();
    Random rand = new Random();

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public abstract double attack();

    public abstract void takeDamage(double damage);

    public abstract double calculateDefence();

    public void equipItem(Item item) {
        if (currentArmor instanceof Armor) {
            this.currentArmor = (Armor)item;

        } else if (currentWeapon instanceof Weapon){
            this.currentWeapon = (Weapon) item;
        }
        else throw  new IllegalArgumentException("You can only equip Weapon or Armor");
    }

}
