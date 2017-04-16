package SharedClasses;

/**
 * Created by rotem on 06/04/2017.
 */

public class Order {
    private int orderID;
    private int supplierID;
    private String supName;
    private String date;
    private String ContactNum;
    private OrderItem orderItems;

    public Order(int OrderID, int supplierID, String supName, String date, String ContactNum){
        this.orderID = OrderID;
        this.supplierID = supplierID;
        this.supName= supName;
        this.date= date;
        this.ContactNum = ContactNum;
    }


    public int getOrderID(){ return orderID;}

    public void setOrderID(int orderID){this.orderID=orderID;}

    public int getSupplier(){return supplierID;}

    public void setSupplierID(int supID){this.supplierID=supID;}

    public String getSupplierName(){return supName;}

    public void setSupplierName(String supName){this.supName=supName;}

    public String getDate(){return date;}

    public void setDate(String date){this.date = date;}

    public String getContactNum(){return ContactNum;};

    public void setContactNum(String contactNum){this.ContactNum = contactNum;}

}
