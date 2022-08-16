
package weapon;

public class Hemlok extends Weapon {
    private int damage = 50;
    private int dexCost = 10;

    public Hemlok() {
        super();
        super.SetBaseDamage(damage);
        super.SetDexCost(dexCost);
    }
}