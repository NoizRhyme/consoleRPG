
package utils;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    private Printer printer = new Printer();
    private static Scanner input = new Scanner(System.in);

    public int ValidateChoice(String type) {
        int choice = 0;
        boolean valueBad = true;
        do {
            try {
                switch(type) {
                    case "warrior": {
                        printer.WarriorMenu();
                        break;
                    }
                    case "armour": {
                        printer.ArmourMenu();
                        break;
                    }
                    case "weapon": {
                        printer.WeaponMenu();
                        break;
                    }
                } // switch
                choice = input.nextInt(); // assignment
                if(choice >= 1 && choice <= 3) {
                    valueBad = false;
                }
            } // try
            catch(InputMismatchException elvis) {
                input.nextLine(); // discards any input
                System.out.println("oops, need coffee??");
                valueBad = true;
            }
        } while(valueBad == true);
        return choice;
    } // ValidateChoice()
} // class