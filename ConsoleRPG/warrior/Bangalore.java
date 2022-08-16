
package warrior;

public class Bangalore extends Legend {
    private int minStrength = 80;
    private int maxStrength = 200;
    private int minDexterity = 75;
    private int maxDexterity = 100;
    private int minHealth = 150;
    private int maxHealth = 200;
    
    public Bangalore() {
        super();
        super.SetName(names.GetRandomName());
        super.SetStrength(super.dice.nextInt(maxStrength) + minStrength);
        super.SetDexterity(super.dice.nextInt(maxDexterity) + minDexterity);
        super.SetHealth(super.dice.nextInt(maxHealth) + minHealth);
    }
}