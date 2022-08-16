
package weapon;

import java.util.Random;

public abstract class Weapon {
    private Random dice = new Random();
    private int baseDamage;
    private int dexCost;
    private int hitPer = 65; // 65% base chance to hit! 0 - 75 is a hit

    public Weapon() {}
    
    // Getters
    public int GetBaseDamage() {
        return this.baseDamage;
    }
    public int GetDexCost() {
        return this.dexCost;
    }

    // Setters
    protected void SetBaseDamage(int amount) {
        this.baseDamage = amount;
    }
    protected void SetDexCost(int amount) {
        this.dexCost = amount;
    }

    public int Strike(int attackType, int strength, int dexterity, 
        int baseDamage, int wDexCost, int aDexCost) {
        int damage = 0;

        int roll = 10;
        int attackTypeMod = attackType * 10;    // inflate attack type for bonus damage in a range!
        roll += attackTypeMod;                  // based on the attack type
        roll += wDexCost;                       // based on the weapons dexterity cost
        roll += aDexCost;                       // based on the armours dexterity cost
        roll -= dexterity / 10;                 // based on the player/enemys dexterity

        if(roll <= hitPer) { // hit!
            damage = (baseDamage / 2) + ((strength / 10) + dice.nextInt(attackTypeMod) + 1);
        } 
        else {
            System.out.println("Missed by: " + (roll - hitPer)); // test print for a miss!
        }
        return damage;
    } // Strike()
} // class