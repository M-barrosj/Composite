/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author JCMB
 */
public class Poster implements Item {
    private final double price = 25.00;
    private final String description = "Quadrinho";

    @Override
    public double getPreco() {
        return price;
    }

    public String getDescricao() {
        return description;
    } 
}