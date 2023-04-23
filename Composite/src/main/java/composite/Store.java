/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author JCMB
 */
public class Store {
    private Random random = new Random();

    public Box generateBox(SubscriptionLevel subscriptionLevel) {
        Box box = new Box(subscriptionLevel);
        List<Item> availableItems = new ArrayList<Item>(Arrays.asList(
            new Comic(), new chaveiro(), new Busto(), new Adesivo(), new Poster(),
            new camiseta(), new caneta(), new miniatura()
        ));

        int maximumItems = subscriptionLevel.getMaximumItems();
        for (int i = 0; i < maximumItems; i++) {
            if (availableItems.size() == 0) {
                break;
            }
            int randomIndex = random.nextInt(availableItems.size());
            Item item = availableItems.remove(randomIndex);
            box.addItem(item);
        }

        return box;
    }
}