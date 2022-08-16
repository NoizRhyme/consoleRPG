 
package weapon;

public class Mace extends Weapon {
    private int damage = 175;
    private int dexCost = 75;

    public Mace() {
        super();
        super.SetBaseDamage(damage);
        super.SetDexCost(dexCost);
    }
}