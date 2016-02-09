package reader;

/**
 * Created by toni on 09/02/16.
 */
public class Result {

    private String text;
    private int row;
    private int colum;

    public Result(String text, int row, int colum) {
        this.text = text;
        this.row = row;
        this.colum = colum;
    }

    public String getText() {
        return text;
    }

    public int getRow() {
        return row;
    }

    public int getColum() {
        return colum;
    }
}
