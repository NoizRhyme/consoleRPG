package armour;

public class Evo extends Armour {
    private int protection = 300;
    private int encumberance = 100;

    public Evo(){
        super();
        super.SetArmourAmount(protection);
        super.SetDexCost(encumberance);
    }
}
