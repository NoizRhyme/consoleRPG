
package warrior;

public class Pathfinder extends Legend {
    private int minStrength = 100;
    private int maxStrength = 100;
    private int minDexterity = 100;
    private int maxDexterity = 125;
    private int minHealth = 150;
    private int maxHealth = 200;

    public Pathfinder() {
        super();
        super.SetName(names.GetRandomName());
        super.SetStrength(super.dice.nextInt(maxStrength) + minStrength);
        super.SetDexterity(super.dice.nextInt(maxDexterity) + minDexterity);
        super.SetHealth(super.dice.nextInt(maxHealth) + minHealth);
    }
}
