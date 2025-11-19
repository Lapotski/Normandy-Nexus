package org.lapotski.normandynexus.product;

public interface Sellable {
    double getPrice();
    void setPrice(double price);

    int getStock();
    void setStock(int stock);
}