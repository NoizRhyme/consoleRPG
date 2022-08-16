
package warrior;

public class Gibraltar extends Legend {
    private int minStrength = 150;
    private int maxStrength = 300;
    private int minDexterity = 50;
    private int maxDexterity = 75;
    private int minHealth = 100;
    private int maxHealth = 300;
    
    public Gibraltar() {
        super();
        super.SetName(names.GetRandomName());
        //                      dice.nextInt(12) + 1; 1 - 12
        super.SetStrength(super.dice.nextInt(maxStrength) + minStrength); // range: 150 - 450
        super.SetDexterity(super.dice.nextInt(maxDexterity) + minDexterity);
        super.SetHealth(super.dice.nextInt(maxHealth) + minHealth);
    }
}