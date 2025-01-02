import java.util.ArrayList;
import java.util.Random;

abstract class Character {

    private int healthPoints;
    private int strength;
    private int dexterity;

    public void setHealthPoints(int healthPoints) {
        this.healthPoints += healthPoints;
    }

    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    public ArrayList<Item> inventory = new ArrayList<Item>();
    Random rand = new Random();

    public int getHealthPoints() {
        return healthPoints;
    }


    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }


    public abstract int attack(Character target);

    public abstract int defend(Character attacker);

    public abstract int calculateDefence();

    public void equipItem(Item item){
        inventory.add(item);
    }

}
