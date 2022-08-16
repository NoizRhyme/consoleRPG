
package weapon;

public class Wingman extends Weapon {
    private int damage = 100;
    private int dexCost = 25;

    public Wingman() {
        super();
        super.SetBaseDamage(damage);
        super.SetDexCost(dexCost);
    }
}