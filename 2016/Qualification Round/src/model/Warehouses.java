package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by toni on 11/02/16.
 */
public class Warehouses {

    private Cell cell;
    private int numberOfProducts;
    private List<Product> products;

    public Warehouses(Cell cell, int numberOfProducts) {
        this.cell = cell;
        this.numberOfProducts = numberOfProducts;
        this.products = new ArrayList<>();
    }

    public void add(Product product){
        products.add(product);
        numberOfProducts = products.size();
    }

    public void remove(Product product){
        products.remove(product);
        numberOfProducts = products.size();
    }

    public Cell getCell() {
        return cell;
    }
}
