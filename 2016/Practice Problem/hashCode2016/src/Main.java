import engine.CharacterEngine;
import reader.FileReader;
import reader.IllegalFileException;
import reader.Result;

/**
 * Created by toni on 09/02/16.
 */
public class Main {

    public static void main(String... args){
        FileReader file = new FileReader();
        try {
            Result result = file.readFile("input.in");
        } catch (IllegalFileException e) {
            e.printStackTrace();
        }

        CharacterEngine engine = new CharacterEngine();
    }

}
