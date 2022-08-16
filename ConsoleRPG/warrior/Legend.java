
package warrior;
import java.util.Random;
import utils.Names;

public abstract class Legend {
    protected Random dice = new Random();
    protected Names names = new Names();
    private int strength;
    private int dexterity;
    private int health;
    private String name;
    
    public Legend() { } // constructor

    // Getters or Accessors
    public int GetStrength() {
        return this.strength;
    } // GetStrength()
    public int GetDexterity() {
        return this.dexterity;
    } // GetDexterity()
    public int GetHealth() {
        return this.health;
    } // GetHealth()
    public String GetName() {
        return this.name;
    } // GetName()

    // Setters or Mutators
    protected void SetStrength(int strength) {
        this.strength = strength;
    } // SetStrength()
    protected void SetDexterity(int dexterity) {
        this.dexterity = dexterity;
    } // SetDexterity()
    protected void SetHealth(int health) {
        this.health = health;
    } // SetHealth()
    protected void SetName(String name) {
        this.name = name;
    }

    public int TakeDamage(int damageAmount, int armourAmount) {
        int actualDamage = 0;
        if(damageAmount > 0) {
            actualDamage = damageAmount - (armourAmount / 10);
            if(actualDamage > 0) {
                this.health -= actualDamage;
            }    
        } 
        if(actualDamage < 0)
            actualDamage = 0; 
        return actualDamage;
    } // TakeDamage()

    public boolean IsAlive() {
        boolean alive = true;

        if(this.health <= 0)
            alive = false;

        return alive;
    } // IsAlive()
}