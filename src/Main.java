import Weapons.*;

public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addTeam(new Swordman("Saske", 100, new Sword(25), new GlassShield(10)))
                .addTeam(new Swordman("Itachi", 110, new Sword(40), new StoneShield(25)));
        System.out.println("                    ----SWORDMANS-----");
        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        System.out.println("\n                    ----ARCHERS-----");

        Team<Archer> team2 = new Team<>();
        team2.addTeam(new Archer("Kakashi", 150, new Bow(50, 100), new StoneShield(50)))
                .addTeam(new Archer("Sakura", 70, new Bow(20, 70), new GlassShield(5)));
        for (Archer archer : team2) {
            System.out.println(archer);
        }

        System.out.println("\n                    ----WARRIORS-----");
        Team<Warrior> team3 = new Team<>();
        team3.addTeam(new Swordman("Arnold", 100, new Sword(10), new StoneShield(30)))
                .addTeam(new Archer("Max", 200, new Bow(30, 200), new GlassShield(15)));
        for (Warrior warrior : team3) {
            System.out.println(warrior);
        }

        Commander commanders = (new Commander("Madara", 500, new Sword(100), new StoneShield(200), team3));
        System.out.println(commanders);


        System.out.println("\n      ----OTHER-----");
        System.out.println("Swordmans, maxRange = " + team1.maxTeamRange());
        System.out.println("Archers, maxRange = " + team2.maxTeamRange());

        System.out.println("Swordmans, MinDefShield = " + team1.minTeamShield());
        System.out.println("Archers, MinDefShield = " + team2.minTeamShield());
        System.out.println("Warriors, MinDefShield = " + team3.minTeamShield());
    }
}