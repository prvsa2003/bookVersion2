package book;

import java.util.Arrays;

public class BookVersion2 {

    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public BookVersion2() {
    }

    public BookVersion2(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public BookVersion2(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAutherNames() {
        String ali = "";
        for (Author at : author) {
            ali.concat("," + at.getName());
        }
        return ali;

    }

    @Override
    public String toString() {
        return "BookVersion2{" + "name=" + getName() + ", authors =" + Arrays.toString(author) + ", price=" + getPrice() + ", qty=" + getQty() + '}';
    }

}
