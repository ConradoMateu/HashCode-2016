package engine;

import reader.Result;


/**
 * Created by toni on 09/02/16.
 */
public class CharacterEngine {

    private static final char EMPTY_PIXEL = '.';
    private static final char PAINTED_PIXEL = '#';

    public void build(Result result) throws BadFormedException {
        int R = result.getRow();
        int C = result.getColum();
        String[] text = result.getText().split("\n\r");

        if (text.length != R){
            throw new BadFormedException("Excepted rows: "+R+", Text rows: "+text.length);
        }else if (text[0].length() != C){
            throw new BadFormedException("Excepted colums: "+C+", Text colums: "+text[0].length());
        }

        for (int row = 0; row < R; row++){
            String textRow = text[0];
            for(int colum = 0; colum < C; colum++){
                char character = textRow.charAt(colum);
                if (PAINTED_PIXEL == character){
                    //Do something
                }
            }
        }

    }

}
