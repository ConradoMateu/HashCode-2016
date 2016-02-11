package reader;

import com.sun.org.apache.regexp.internal.RE;

import java.io.File;
import java.util.Scanner;

/**
 * Created by toni on 09/02/16.
 */
public class FileReader {

    public FileReader() {
    }

    public Result readFile(String path) throws IllegalFileException{
        int row = 0;
        int colum = 0;
        String textResult ="";
        int cont = 0;

        try {
            System.out.println("Reading file...\n");
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNext()){
                if (cont == 0) {
                    row = sc.nextInt();
                    colum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Row: "+row+" Colum: "+colum+"\n");
                }else{
                    String textRow = sc.nextLine();
                    textResult += textRow+"\n\r";
                    System.out.println(textRow);
                }
                cont++;
            }
            System.out.println("\nEnd file ....");
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalFileException();
        }

        return new Result(textResult, row, colum);
    }
}
