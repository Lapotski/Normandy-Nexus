package org.lapotski.normandynexus.product;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.0
 *
 */

public abstract class Product{
    private int id;
    private String name;
    private double price;
    private int stock;

    // constructor
    public Product(int id, String name, double price, int stock) {
        setId(id);
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    // getters & setters
    public int getId() {return id;}
    public void setId(int id) { this.id = id; }

    public String getName() {return name;}
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public int getStock() {return stock;}
    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative");
        this.stock = stock;
    }

    // overrideable methods
    public abstract String getCategory();
    public abstract String getExtraInfo();


    // for debugging
    @Override
    public String toString() {
        return String.format("%s (ID: %d, Price: %.2f, Stock: %d)",
                name, id, price, stock);
    }
}
