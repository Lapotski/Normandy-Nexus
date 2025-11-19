package org.lapotski.normandynexus.product;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.1
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final ArrayList<Product> products = new ArrayList<>(); // creates new list for products
    private int nextId = 1; // for auto incrementing id

    // methods that modify the list
    public synchronized int getNextId() {
        return nextId++;
    }

    public synchronized void addProduct(Product p) {
        products.add(p);
    }

    public synchronized void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public synchronized void updateProduct(int id, Product updated) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updated);
                return;
            }
        }
    }

    // methods that read the list safely
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public Product getProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}

