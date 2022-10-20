//Create your todays bazar list/pocket expenditure which includes the item name and price.
// Then create a function named searchItem(String item) which will be used to
// search any item from your HashMap and return the price. If found no item,
// then print message as "No item found" and another function named totalSum() which will return
// total price of items.

package function_and_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_BazarList {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("FISH", 300);
        list.put("MEAT", 700);
        list.put("RICE", 70);
        list.put("POTATO", 60);
        list.put("ONION", 45);
        list.put("EGG", 120);
        list.put("BANANA", 60);
        list.put("MILK", 65);

        System.out.print("Enter Item to Search: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String item = input.toUpperCase();

        _4_BazarList obj = new _4_BazarList();

        obj.searchItem(item, list);
        obj.totalSum(list);

    }

    void searchItem(String item, HashMap<String, Integer> list) {

        if (list.containsKey(item)) {
            System.out.println("Item: " + item + " Found");
            System.out.println("Item Price: " + list.get(item));
        } else
            System.out.println("Item " + item + " Not Found");

    }

    void totalSum(HashMap<String, Integer> list) {
        int sum = 0;
        for (Map.Entry<String, Integer> e : list.entrySet()) {
            sum += e.getValue();
        }
        System.out.println("Total Price of all Items in the List: " + sum);

    }
}
