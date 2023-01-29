package Weapons;

public class StoneShield extends Shield{
    public StoneShield(int armor) {
        super(armor);
    }

    @Override
    public int protect() {
        return super.getArmor();
    }

    @Override
    public String toString() {
        return "StoneShield" + super.toString();
    }
}
