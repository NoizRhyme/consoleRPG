
package armour;

public abstract class Armour {
    private int armourAmount;
    private int dexCost;

    public Armour() {}

    // Getters
    public int GetArmourAmount() {
        return this.armourAmount;
    }
    public int GetDexCost() {
        return this.dexCost;
    }

    // Setters
    protected void SetArmourAmount(int val) {
        this.armourAmount = val;
    }
    protected void SetDexCost(int val) {
        this.dexCost = val;
    }
}
