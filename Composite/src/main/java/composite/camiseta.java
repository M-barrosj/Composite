/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author JCMB
 */
public class camiseta implements Item {
    private final double price = 25.00;
    private final String description = "Camiseta";

    @Override
    public double getPreco() {
        return price;
    }

    @Override
    public String getDescricao() {
        return description;
    } 
}