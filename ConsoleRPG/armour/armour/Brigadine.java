package armour;

public class Brigadine extends Armour {
    private int protection = 300;
    private int encumberance = 100;

    public Brigadine(){
        super();
        super.SetArmourAmount(protection);
        super.SetDexCost(encumberance);

    }
    
}
