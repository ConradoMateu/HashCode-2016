package model;

/**
 * Created by toni on 11/02/16.
 */
public class Drone {

    private Command command;
    private Order order;
    private Warehouses startWarehouse;
    private Cell destination;
    private Cell currentCell;
    private boolean isWarehouseDestination;
    private int turns;

    public Drone() {
    }

    public int getTurns() {
        return turns;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Warehouses getStartWarehouse() {
        return startWarehouse;
    }

    public void setStartWarehouse(Warehouses startWarehouse) {
        this.startWarehouse = startWarehouse;
    }

    public Cell getDestination() {
        return destination;
    }

    public void setDestination(Cell destination) {
        this.destination = destination;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public boolean isWarehouseDestination() {
        return isWarehouseDestination;
    }

    public void setWarehouseDestination(boolean warehouseDestination) {
        isWarehouseDestination = warehouseDestination;
    }

    public void calculateDistance(){
        Cell start = startWarehouse.getCell();
        Cell end = destination;

        int row = (start.r - end.r);
        int cell = (start.c - end.c);

        turns = (int)Math.round(Math.sqrt(Math.abs(row*row) + Math.abs(cell*cell)));
    }

}
