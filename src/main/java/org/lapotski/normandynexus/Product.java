package org.lapotski.normandynexus;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    // constructor
    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // getters & setters
    public int getId() {return id;}
    public void setId(int id) { this.id = id; }

    public String getName() {return name;}
    public void setName(String name) { this.name = name; }

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
    public String getCategory() {return "Product";}
    public String getExtraInfo() {
        return "";
    }
}
