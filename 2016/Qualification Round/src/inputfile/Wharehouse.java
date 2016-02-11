package inputfile;

import java.util.Arrays;

/**
 * Created by K0nd3v on 11/2/16.
 */
public class Wharehouse {

    private int[] location;
    private int[] storeInt;

    public Wharehouse(int[] location,int[] storeInt) {
        this.location = location;
        this.storeInt = storeInt;

    }

    public int[] getLocation() {
        return Arrays.copyOf(location, location.length);
    }

    public int[] getStoreInt() {
        return Arrays.copyOf(storeInt, storeInt.length);
    }
}
