import Weapons.Shield;
import Weapons.Weapon;

public class Commander extends Warrior {
    private Team<Warrior> subordinates = new Team<>();

    public Commander(String name, int healthPoint, Weapon weapon, Shield shield, Team<Warrior> subordinates) {
        super(name, healthPoint, weapon, shield);
        this.subordinates = subordinates;
    }

    public void addCommander(Team team) {
        subordinates = team;
    }

    @Override
    public String toString() {
        String result = "Commander: " + super.toString();
        for (Warrior warrior : subordinates) {
            result += warrior.toString();
        }
        return result;
    }
}
