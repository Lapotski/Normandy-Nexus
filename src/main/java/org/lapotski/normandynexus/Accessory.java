package org.lapotski.normandynexus;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.0
 *
 */

public class Accessory extends Product {
    private String type; // extra field

    public Accessory(int id, String name, double price, int stock, String type) {
        super(id, name, price, stock);
        this.type = type;
    }

    // getter and setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // overrideable methods
    @Override
    public String getCategory() {return "Accessory";}

    @Override
    public String getExtraInfo() {return type;}
}