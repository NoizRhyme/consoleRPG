
package utils;
import java.util.Random;

public class Names {

    private Random picker = new Random();
    private String[] names = {
        "The Terminator", "John Rambo", "Henry Wallace", 
        "The Duke", "Neo", "John Wick", "Darth Vader",
        "Black Widow", "Wonder Woman", "Mrs Marvel", "Gamora"
    };

    public Names() {}

    public String GetRandomName() {
        return names[picker.nextInt(names.length)];
    }
}
