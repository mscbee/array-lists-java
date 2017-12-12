package groceries;

/**
 * Created by cba50 on 12/12/2017.
 */
public class GroceryItem {

    // instance data
    public String itemName;

    // constructors
    public GroceryItem(String itemName){
        this.itemName = itemName;
    }

    // return information

    public String toString() {
        return "Item: " + itemName + "\n";
    }
}
