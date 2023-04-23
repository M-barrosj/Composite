/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class Box implements Item {
    private List<Item> items = new ArrayList<Item>();
    private SubscriptionLevel subscriptionLevel;

    public Box(SubscriptionLevel subscriptionLevel) {
        this.subscriptionLevel = subscriptionLevel;
    }

    public void addItem(Item item) {
        if (items.size() < subscriptionLevel.getMaximumItems()) {
            items.add(item);
        }
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (Item item : items) {
            precoTotal += item.getPreco();
        }
        return precoTotal;
    }

    @Override
    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append(subscriptionLevel.getClass().getSimpleName() + " Box:\n");
        for (Item item : items) {
            descricao.append("- " + item.getDescricao() + " (R$" + item.getPreco() + ")\n");
        }
        descricao.append("Total price: R$" + getPreco());
        return descricao.toString();
    }
}