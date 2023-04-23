/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author JCMB
 */
public class Busto implements Item {
    private final double price = 10.00;
    private final String description = "Busto";

    @Override
    public double getPreco() {
        return price;
    }

    @Override
    public String getDescricao() {
        return description;
    } 
}