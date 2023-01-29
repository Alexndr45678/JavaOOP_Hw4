package Weapons;

import java.util.Random;

public class Bow extends Weapon{
    private int range;

    public Bow(int damagePoint, int range) {
        super(damagePoint);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, damagePoint);
    }

    @Override
    public String toString() {
        return "Bow [range: " + range + ", damage: " + damagePoint + "]";
    }
}
