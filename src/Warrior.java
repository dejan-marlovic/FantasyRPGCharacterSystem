

public class Warrior extends  Character{
    @Override
    public int attack(Character target) {
        int attackDamage = 0;
        for (Item item : inventory){
            if (item instanceof  Weapon){
                attackDamage += ((Weapon) item).getDamage();
            }
        }
        attackDamage += this.getStrength()
                + (rand.nextInt(5) + 1)
                - target.defend(target);
        return attackDamage;
    }

    @Override
    public int defend(Character attacker) {
        int defence = 0;
        for(Item item : inventory){
            if (item instanceof Armor){
                defence += ((Armor) item).getProtection();
            }
            defence += this.getConstitution() / 2
                    + this.getDexterity() / 3
                    * rand.nextInt(5) + 1;

            int damage = defence -  attacker.attack(this);

            if (damage < 0){
                this.setHealthPoints(damage);
            }else{
                System.out.println("No damage taken");
            }

        }
        return defence;
    }

    @Override
    public int calculateDefence() {
        int defence = 5;
        return defence;
    }
}
