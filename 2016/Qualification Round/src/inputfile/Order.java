package inputfile;

import java.util.Arrays;

/**
 * Created by K0nd3v on 11/2/16.
 */
public class Order {
    int[] location;
    int numItems;
    int[] itemTypes;

    public Order(int[] location, int numItems, int[] itemTypes){
        this.location = location;
        this.numItems = numItems;
        this.itemTypes = itemTypes;
    }

    public int[] getLocation() {
        return  Arrays.copyOf(location , location.length);

    }

    public int getNumItems() {
        return numItems;
    }

    public int[] getItemTypes() {
        return Arrays.copyOf(itemTypes, itemTypes.length);
    }
}
