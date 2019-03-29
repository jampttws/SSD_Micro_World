public class Adapter implements IUnit {

    LegacyUnit legacyUnit = new LegacyUnit();

    @Override
    public void move() {
        legacyUnit.walk();
    }

    @Override
    public int getX() {
        return legacyUnit.getPositionX();
    }

    @Override
    public int getY() {
        return legacyUnit.getPositionY();
    }

    @Override
    public String getName() {
        return "X";
    }

    @Override
    public int getHealth() {
        return 99;
    }

    @Override
    public boolean dead() {
        return false;
    }

}
