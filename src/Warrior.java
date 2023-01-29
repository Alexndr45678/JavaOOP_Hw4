import Weapons.Shield;
import Weapons.Weapon;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weapon weapon;
    private Shield shield;

    public Warrior(String name, int healthPoint, Weapon weapon, Shield shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", HP: " + healthPoint + ", weapon: " + weapon + ", shield: " + shield + "\n";
    }
}
