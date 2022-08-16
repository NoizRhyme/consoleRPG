
package utils;
import warrior.*;

public class Printer {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
  
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";

    private String[] wTypes = {
        "Bangalore", "Pathfinder", "Gibraltar"
    };
    private String[] aTypes = {
        "Hauberk", "Evo", "Woven", "Brigadine"
    };
    private String[] wepTypes = {
        "Hemlok", "Wingman", "Mace"
    };
    // Attack Menu
    private String[] attackTypes = {
        "Standard", "Heavy", "Ranged", "Magic", "Ranged", "Ranged Magic"
    };
    
    public Printer() { }

    public void Welcome() {
        System.out.println(ANSI_YELLOW + "888b     d888 8888888 888      .d8888b. 8888888 888b     d888");
        System.out.println("8888b   d8888   888   888     d88P  Y88b  888   8888b   d8888");
        System.out.println("88888b.d88888   888   888     Y88b.       888   88888b.d88888");
        System.out.println("888Y88888P888   888   888      \"Y888b.    888   888Y88888P888");
        System.out.println("888 Y888P 888   888   888         \"Y88b.  888   888 Y888P 888");
        System.out.println("888  Y8P  888   888   888           \"888  888   888  Y8P  888");
        System.out.println("888   \"   888   888   888     Y88b  d88P  888   888   \"   888");
        System.out.println("888       888 8888888 88888888 \"Y8888P\" 8888888 888       888" + ANSI_RESET);

        // Printing the text on console prior
        // System.out.println(ANSI_YELLOW + "This text is yellow" + ANSI_RESET);
    } // Welcome()


    //////////////////////////////////////
    //////////// PRINT MENUS /////////////
    public void AttackMenu() {
        System.out.println("What type of attack do you want to use:");
        for(int i = 0; i < attackTypes.length; i++) {
            System.out.printf("%d) %s\n", i + 1, attackTypes[i]);
        }
    } // AttackMenu()

    public void WarriorMenu() {
        System.out.println("Select your warrior type:");
        for(int i = 0; i < wTypes.length; i++) {
            // %d = number %s = string
            System.out.printf("%d) %s\n", i + 1, wTypes[i]);
            // System.out.println(i + 1 + ") " + wTypes[i]);
        }
    } // WarriorMenu()   

    public void ArmourMenu() {
        System.out.println("Select your armour type:");
        for(int i = 0; i < aTypes.length; i++) {
            System.out.printf("%d) %s\n", i + 1, aTypes[i]);
        }
    } // WeaponMenu()   

    public void WeaponMenu() {
        System.out.println("Select your weapon type:");
        for(int i = 0; i < wepTypes.length; i++) {
            System.out.printf("%d) %s\n", i + 1, wepTypes[i]);
        }
    } // ArmourMenu()


    //////////////////////////////////////
    //////////// PRINT STATS /////////////
    public void PrintStats(Legend pWarrior, Legend eWarrior) {
        System.out.println("Your warrior has " 
            + pWarrior.GetHealth() + " health points! and their name is: " + pWarrior.GetName());
        System.out.println("Your enemy has " 
            + eWarrior.GetHealth() + " health points! and their name is: " + eWarrior.GetName());
    } // PrintStats
    
    public void StrikeStats(String who, int damage) {
        System.out.println("////////////////////////////////////////");
        System.out.printf("\t%s hits for %d points!\n", who, damage);
        System.out.println("////////////////////////////////////////\n\n");
    }

    public void PrintStatus(Legend pWarrior, Legend eWarrior) {
        System.out.println("-----//");
        System.out.printf("Player has %d points left!\n", pWarrior.GetHealth());
        System.out.printf("Enemy has %d points left!\n", eWarrior.GetHealth());
        System.out.println("-----//\n\n");
    } // PrintStatus

    public void PrintMiss(String who) {
        System.out.printf("%s misses!\n\n", who);
    }
} // class