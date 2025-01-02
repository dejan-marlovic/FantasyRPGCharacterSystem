public class Rogue extends Character {
    @Override
    public int attack(Character target) {
        return 5;
    }

    @Override
    public int defend(Character attacker) {
        return 5;
    }

    @Override
    public int calculateDefence() {
        int defence = 5;
        return defence;
    }
}
