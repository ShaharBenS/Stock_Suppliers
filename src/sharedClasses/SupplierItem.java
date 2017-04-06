package sharedClasses;

/**
 * Created by keren on 4/6/2017.
 */
public class SupplierItem {
    private int supplierID;
    private int itemID;
    private int catalogNumber;
    private int cost;

    public SupplierItem(int supplierID, int itemID, int catalogNumber, int cost){
        this.supplierID = supplierID;
        this.itemID = itemID;
        this.catalogNumber = catalogNumber;
        this.cost = cost;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
