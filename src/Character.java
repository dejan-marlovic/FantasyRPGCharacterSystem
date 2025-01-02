import java.util.ArrayList;

abstract class Character {

    private int healthPoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    public ArrayList<Item> inventory = new ArrayList<Item>();

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


    public abstract void attack(Character target);

    public abstract void defend(Character attacker);

    public abstract int calculateDefence();

    public void equipItem(Item item){
        inventory.add(item);
    }

}
