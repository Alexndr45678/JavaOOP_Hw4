import Weapons.GlassShield;
import Weapons.Shield;
import Weapons.Sword;

public class Swordman extends Warrior {
    public Swordman(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, sword, shield);
    }
    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }
}
