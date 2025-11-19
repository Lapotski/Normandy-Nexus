package org.lapotski.normandynexus;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.0
 *
 */

public class Console extends Product {
    private String brand; // console only attribute

    public Console(int id, String name, double price, int stock, String brand) {
        super(id, name, price, stock);
        this.brand = brand;
    }

    // getter and setter
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    // overrideable methods
    @Override
    public String getCategory() {return "Console";}

    @Override
    public String getExtraInfo() {return brand;}
}
