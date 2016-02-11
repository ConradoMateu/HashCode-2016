package inputfile;

import java.util.Scanner;

/**
 * Created by conradomateu on 11/2/16.
 */
public class ParamSimulation {
    int[] weights;
    Wharehouse[] warehouses;
    Order[] order;
    int[] itemTypes;

    private int rows;
    private int colums;
    private int numDrones;
    private int deadLine;
    private int maxLoad;
    private int numProducts;
    private int numWarehouses;
    private int deliverItem;
    private int numOrders;

    private Scanner esc;

    public ParamSimulation(String fichero) {
        this.esc = new Scanner(fichero);
    }

    private void init(){
        if (esc.hasNext()){
            stepOne();
            stepTwo();
            stepThree();
            stepFour();
            stepFive();
            stepSix();
        }
    }

    private void stepOne(){
        rows = esc.nextInt();
        colums = esc.nextInt();
        numDrones = esc.nextInt();
        deadLine = esc.nextInt();
        maxLoad = esc.nextInt();
        esc.nextLine();

    }

    private void stepTwo(){
        numProducts = esc.nextInt();
        esc.nextLine();

    }
    private void stepThree(){
         weights =  new  int[numProducts];
        for(int i = 0; i < numProducts; i++){
            weights[i] = esc.nextInt();
        }
        esc.nextLine();

    }
    private void stepFour(){
        numWarehouses = esc.nextInt();
        esc.nextLine();

    }
    private void stepFive() {
        for (int i = 0; i < numWarehouses; i++) {
           warehouses[i] =  new Wharehouse(location(), storeItems());

        }
    }
    private int[] location(){
        int[] location = new int[2];
        for(int i = 0; i < 2; i++){
            location[i] = esc.nextInt();
        }
        esc.nextLine();
        return location;
    }
    private int[] storeItems(){
        int[] storeItems = new int[numProducts];
        for(int i = 0; i<numProducts; i++){
            storeItems[i] = esc.nextInt();
        }
        esc.nextLine();
        return storeItems;

    }

    private void stepSix(){
        numOrders = esc.nextInt();
        for(int i = 0; i<numOrders; i++){
            int[] location = location();
            int deliverI = deliverItems();
            int[] itemsType = itemTypes(deliverI);


            order[i] = new Order(location, deliverI, itemsType);
        }

    }

    private int[] itemTypes(int numProducts) {
        int[] itemTypes  = new int[numProducts];
        for(int i = 0; i< numProducts; i++){
            itemTypes[i] = esc.nextInt();
        }
        return itemTypes;
    }


    private int deliverItems(){
        deliverItem = esc.nextInt();
        esc.nextLine();
        return deliverItem;
    }
    private void stepSeven(){
    }

}
