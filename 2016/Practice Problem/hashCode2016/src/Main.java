import engine.CharacterEngine;
import reader.FileReader;

/**
 * Created by toni on 09/02/16.
 */
public class Main {

    public static void main(String... args){
        FileReader file = new FileReader();
        String text = file.readFile("input.in");

        CharacterEngine engine = new CharacterEngine();
        engine.build(text);
        String result = engine.getResult();

        System.out.println(result);
    }

}
