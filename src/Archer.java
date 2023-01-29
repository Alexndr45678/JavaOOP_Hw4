import Weapons.Bow;
import Weapons.Shield;
import Weapons.StoneShield;

public class Archer extends Warrior{

    public Archer(String name, int healthPoint, Bow bow, Shield shield) {
        super(name, healthPoint, bow, shield);
    }
    @Override
    public String toString() {
        return "Archer: " + super.toString();
    }
    public int shotRange (){
        return ((Bow) getWeapon()).getRange();
    }
}
