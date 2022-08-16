
package armour;

public class Hauberk extends Armour {
    private int protection = 50;
    private int encumberance = 10;
    
    public Hauberk() {
        super();
        super.SetArmourAmount(protection);
        super.SetDexCost(encumberance);
    }
}