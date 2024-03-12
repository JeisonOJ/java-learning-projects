package Inventory;

public class SpecificProduct extends Product{
    private String category;
    private String brand;

    public SpecificProduct(int id, String name, double price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "ID: " + this.getId() + "\nName: " + this.getName() + "\nPrice: " + this.getPrice() + "\nCategory: " + this.getCategory() + "\nBrand: " + this.getBrand();
    }
}
