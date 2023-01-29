// Создать класс щита, разработать разные типы щитов,
// добавить в семейство классов Warriors обобщения в виде щитов.
// Реструктуризировать код в конечных классах семейства Warriors.
// Добавить метод определения минимального щита в команде.
//* Продумать, как можно сделать воина без щита.
package Weapons;

public abstract class Shield implements Protection{
    protected int armor;

    public Shield(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return " armor = " + armor;
    }
}
