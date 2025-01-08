public class Mage  extends Hero{

    private double intelligence;

    @Override
    public double attack() {
        return 5;
    }

    @Override
    public void takeDamage(double damage) {

    }


    @Override
    public double calculateDefence() {
        double defence = 5;
        return defence;
    }


}
