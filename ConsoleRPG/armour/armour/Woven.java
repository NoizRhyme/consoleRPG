
package armour;

public class Woven extends Armour {
    private int protection = 150; // positive stat - protects you
    private int encumberance = 50; // negative stat - reduces your hit change
    
    public Woven() {
        super();
        super.SetArmourAmount(protection);
        super.SetDexCost(encumberance);
    }
}
