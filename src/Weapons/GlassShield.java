package Weapons;

public class GlassShield extends Shield {

    public GlassShield(int armor) {
        super(armor);
    }

    @Override
    public int protect() {
        return super.getArmor();
    }

    @Override
    public String toString() {
        return "GlassShield" + super.toString();
    }
}
