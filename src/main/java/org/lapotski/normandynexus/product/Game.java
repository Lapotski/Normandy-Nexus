package org.lapotski.normandynexus.product;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.1
 *
 */

public class Game extends Product {
    private String genre; // game only attribute

    // constructor with inherited attributes
    public Game(int id, String name, double price, int stock, String genre) {
        super(id, name, price, stock);
        this.genre = genre;
    }

    // getter and setter
    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    // overrideable methods
    @Override
    public String getCategory() {return "Game";}

    @Override
    public String getExtraInfo() {return genre;}
}
