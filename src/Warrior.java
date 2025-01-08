

public class Warrior extends  Hero{

    private  double strength;


    public Warrior(double strength, double healthPoints){
        this.strength = strength;
        this.healthPoints = healthPoints;
    }

    @Override
    public double attack() {
        return this.strength += (this.currentWeapon != null) ? currentWeapon.getDamage() : 0;
    }

    @Override
    public void takeDamage(double damage) {
        healthPoints -= damage;
    }


    @Override
    public double calculateDefence() {
        return 5.0;
    }

}
