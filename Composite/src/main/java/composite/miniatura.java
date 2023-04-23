/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author JCMB
 */
public class miniatura implements Item {
    private final double price = 20.00;
    private final String description = "Miniatura";

    @Override
    public double getPreco() {
        return price;
    }

    @Override
    public String getDescricao() {
        return description;
    } 
}