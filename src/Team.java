import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }
    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }
    public int minTeamShield() {
        int minDef = 100;
        for (E item : team) {
            if(item.getShield().getArmor() < minDef) minDef = item.getShield().getArmor();
        }
        return minDef;
    }

}
