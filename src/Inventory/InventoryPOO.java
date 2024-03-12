package Inventory;

import java.util.ArrayList;

public class InventoryPOO {
    private ArrayList<SpecificProduct> products = new ArrayList<>();

    public InventoryPOO(){}

    public void addProduct(SpecificProduct specificProduct){
        products.add(specificProduct);
    }

    public void removeProduct(int id){
        products.removeIf(product -> product.getId() == id);

    }

    public String showProducts(){
        String message = "";
        if (!products.isEmpty()){
            for (SpecificProduct product: products
            ) {
                message += "ID: "+product.getId()+"\nName: "+product.getName()+"\nPrecio: "+product.getPrice()
                        +"\nCategoria: "+product.getCategory()+"\nMarca: "+product.getBrand();
            }return message;

        }else {
            message = "Products is empty";
            return message;
        }

    }

    public SpecificProduct searchByName(String name){
        for (SpecificProduct product: products
        ) {
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }
    public SpecificProduct searchByCategory(String category){
        for (SpecificProduct product: products
        ) {
            if (product.getCategory().equalsIgnoreCase(category)){
                return product;
            }
        }
        return null;
    }

    public SpecificProduct searchByBrand(String brand){
        for (SpecificProduct product: products
        ) {
            if (product.getBrand().equalsIgnoreCase(brand)){
                return product;
            }
        }
        return null;
    }
}
