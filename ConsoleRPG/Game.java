
import utils.*;
import warrior.*;
import armour.*;
import weapon.*;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.Random;

public class Game {

    private static Printer ink = new Printer();
    private static Validator validator = new Validator();
    private static Scanner input = new Scanner(System.in);
    private static Random dice = new Random();

    private static String who = "Player";
    private static boolean gameOver = false;
    private static int attackType = 0;
    private static int damageAmount = 0;
    private static boolean isAlive = true;
    private static String winner = "";

    // Player Objects
    private static Legend pWarrior;
    private static Armour pArmour;
    private static Weapon pWeapon;

    // Enemy Objects
    private static Legend eWarrior;
    private static Armour eArmour;
    private static Weapon eWeapon;


    public static void main(String[] args) {
        //=================>>
        // Game Setup:
        ink.Welcome();
        
        //////////////////////////////////
        // Player Setup Section:
        // print warrior menu, take in users pick
        // create a warrior based on that pick
        int wPick = validator.ValidateChoice("warrior");
        CreateWarrior(wPick, who);

        // print armour menu, take in users pick
        // create new armour based on that pick
        wPick = validator.ValidateChoice("armour");
        CreateArmour(wPick, who);

        // print weapon menu, take in users pick
        // create a new weapon based on that pick
        wPick = validator.ValidateChoice("weapon");
        CreateWeapon(wPick, who);

        who = "Enemy";

        //////////////////////////////////
        // Enemy Setup Section:
        CreateWarrior(dice.nextInt(3) + 1, who); // 1, 2, 3
        CreateArmour(dice.nextInt(3) + 1, who);
        CreateWeapon(dice.nextInt(3) + 1, who);

        who = "Player"; // player goes first!

        //////////////////////////////////
        // Test print of objects
        // printing details/info about the warrior
        ink.PrintStats(pWarrior, eWarrior);

        //==============================>>
        // Main Game Loop:
        while(!gameOver) {
            if(who.equals("Player")) { // player's turn code
                ink.AttackMenu();
                attackType = input.nextInt();

                damageAmount = pWeapon.Strike(attackType, pWarrior.GetStrength(), 
                    pWarrior.GetDexterity(), pWeapon.GetBaseDamage(), 
                    pWeapon.GetDexCost(), pArmour.GetDexCost());

                if(damageAmount > 0) { // hit!
                    damageAmount = eWarrior.TakeDamage(damageAmount, eArmour.GetArmourAmount());

                    ink.StrikeStats(who, damageAmount);
                    ink.PrintStatus(pWarrior, eWarrior);
                    
                    isAlive = eWarrior.IsAlive();
                    if(!isAlive) {
                        gameOver = true;
                        winner = "player";
                    }
                }
                else { // miss!
                    ink.PrintMiss(who);
                }
                who = "Enemy";
            }
            else { // enemy's turn code
                attackType = dice.nextInt(2) + 1; 
                
                damageAmount = eWeapon.Strike(attackType, eWarrior.GetStrength(), 
                    eWarrior.GetDexterity(), eWeapon.GetBaseDamage(), 
                    eWeapon.GetDexCost(), eArmour.GetDexCost());
                    
                if(damageAmount > 0) { // hit!
                    damageAmount = pWarrior.TakeDamage(damageAmount, pArmour.GetArmourAmount());

                    ink.StrikeStats(who, damageAmount);
                    ink.PrintStatus(pWarrior, eWarrior);

                    isAlive = pWarrior.IsAlive();

                    if(!isAlive) {
                        gameOver = true;
                        winner = "enemy";
                    }
                }
                else { // miss!
                    ink.PrintMiss(who);
                }
                who = "Player";
            }
        } // while

        System.out.println(winner + " WINS!");

    } // main()

    // Helper methods
    private static void CreateWarrior(int choice, String who) {
        switch(choice) {
            case 1: { // new Human
                if(who.equals("Player"))
                    pWarrior = new Bangalore();
                else
                    eWarrior = new Bangalore();
                break;
            }
            case 2: { // new Elf
                if(who.equals("Player"))
                    pWarrior = new Pathfinder();
                else 
                    eWarrior = new Pathfinder();
                break;
            }
            case 3: { // new Orc
                if(who.equals("Player"))
                    pWarrior = new Gibraltar();
                else 
                    eWarrior = new Gibraltar();
                break;
            }
        } // switch
    } // CreateWarrior()
    
    private static void CreateArmour(int choice, String who) {
        switch(choice) {
            case 1: { // new Leather
                if(who.equals("Player"))
                    pArmour = new Hauberk();
                else
                    eArmour = new Hauberk();
                break;
            }
            case 2: { // new Chainmail
                if(who.equals("Player"))
                    pArmour = new Evo();
                else
                    eArmour = new Evo();
                break;
            }
            case 3: { // new Platemail
                if(who.equals("Player"))
                    pArmour = new Woven();
                else 
                    eArmour = new Woven();
                break;
            }
            case 4: { //new Brigadine
                if(who.equals("Player"))
                    pArmour = new Brigadine();
                    else
                         eArmour = new Brigadine();
                    break;
            }
        } // switch
    } // CreateWarrior()
    
    private static void CreateWeapon(int choice, String who) {
        switch(choice) {
            case 1: { // new Dagger
                if(who.equals("Player"))
                    pWeapon = new Hemlok();
                else 
                    eWeapon = new Hemlok();
                break;
            }
            case 2: { // new Sword
                if(who.equals("Player"))
                    pWeapon = new Mace();
                else 
                    eWeapon = new Mace();
                break;
            }
            case 3: { // new Axe
                if(who.equals("Player"))
                    pWeapon = new Wingman();
                else 
                    eWeapon = new Wingman();
                break;
            }
        } // switch
    } // CreateWeapon()
} // class