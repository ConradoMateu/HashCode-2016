package paint;

/**
 * Created by toni on 09/02/16.
 */
public class PaintLine implements Painter{

    private int C1;
    private int C2;
    private int R1;
    private int R2;

    public PaintLine(int c1, int c2, int r1, int r2) {
        C1 = c1;
        C2 = c2;
        R1 = r1;
        R2 = r2;
    }

    @Override
    public void paint() {

    }
}
