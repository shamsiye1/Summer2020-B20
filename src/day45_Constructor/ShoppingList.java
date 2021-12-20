package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        Item item1 = new Item("Apple",1.5,3);
        Item item2 = new Item("Bread 1Lb",0.97,5);
        Item item3 = new Item("Manchego cheese 1.75Lb",9.89,2);
        Item item4 = new Item("Garbanzo Beans 15.5oz",0.88,5);
        Item item5 = new Item("Almonds milk 1/2 Gallon",1.79,2);

        ArrayList<Item> list= new ArrayList<>();
        list.addAll(Arrays.asList(item1, item2, item3,item4, item5));

        System.out.println("Items: "+ list.size());
        double totalCost =0;

        for (Item each: list){
            totalCost +=each.calCost();
        }
        System.out.println("Total Price: "+ totalCost);
        System.out.println("===================================================");

      Item[] items={item1, item2, item3, item4, item5};
      double totalCost2=0;

//      for (Item each: items){
//         totalCost2 +=each.calCost();
//      }
//        System.out.println("Total Cost: "+ totalCost2);

        for (int i=0; i<= items.length-1; i++){
            totalCost2 += items[i].calCost();
        }
        System.out.println("Total Cost: "+ totalCost2);



    }
}
