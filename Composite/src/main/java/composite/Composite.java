/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package composite;

/**
 *
 * @author Aluno
 */
public class Composite {

    public static void main(String[] args) {
        Store store = new Store();

        SubscriptionLevel[] subscriptionLevels = {
            new BronzeSubscription(),
            new SilverSubscription(),
            new GoldSubscription(),
            new PlatinumSubscription()
        };

        for (SubscriptionLevel subscriptionLevel : subscriptionLevels) {
            System.out.println(store.generateBox(subscriptionLevel).getDescricao());
            System.out.println();
        }
    }
}