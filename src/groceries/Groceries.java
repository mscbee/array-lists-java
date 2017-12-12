package groceries;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by cba50 on 12/12/2017.
 */
public class Groceries {
    public static void main(String[] args) {

        String itemName;


        // initialising array list
        ArrayList<GroceryItem> groceryArray = new ArrayList<GroceryItem>();

        // creating new instance of GroceryItem class
        GroceryItem apple = new GroceryItem("Apple");
        GroceryItem pear = new GroceryItem("Pear");
        GroceryItem toothpaste = new GroceryItem("Toothpaste");

        Scanner in = new Scanner(System.in);



        // adding these GroceryItem instances to groceryArray array list
        groceryArray.add(apple);
        groceryArray.add(pear);
        groceryArray.add(toothpaste);

        System.out.println(groceryArray.toString());




        System.out.println("Add another item to your grocery list: ");
        itemName = in.nextLine();

        // Creating a new instance of GroceryItem
        GroceryItem userGroceryItem = new GroceryItem(itemName);

        // adding the user's inputted item to the array list
        groceryArray.add(userGroceryItem);

        System.out.println(groceryArray.toString());

        // Removing the first item in the array list
        groceryArray.remove(0);

        System.out.println(groceryArray.toString());


    }

}
