/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author JCMB
 */
public class BronzeSubscription implements SubscriptionLevel {
    @Override
    public int getMaximumItems() {
        return 3;
    }
}