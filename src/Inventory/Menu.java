package Inventory;

import javax.swing.*;

public class Menu {
    private InventoryPOO inventory = new InventoryPOO();

    public Menu() {
    }

    public void menuInventory() {
        int id = 0;
        String menuOptions = "\n...::INVENTORY::...\n1. Add product\n2. Remove product\n3. Search product\n4. Show all products\n5. Exit inventory\nEnter the option";

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, menuOptions));
            switch (option) {
                case 1:
                    String name = JOptionPane.showInputDialog(null, "Product name");
                    double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Price"));
                    String category = JOptionPane.showInputDialog(null, "Category");
                    String brand = JOptionPane.showInputDialog(null, "Brand");
                    SpecificProduct product = new SpecificProduct(id, name, price, category, brand);
                    ++id;
                    this.inventory.addProduct(product);
                    break;
                case 2:
                    int idRemove = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the product ID"));
                    this.inventory.removeProduct(idRemove);
                    break;
                case 3:
                    String searchByNameString = JOptionPane.showInputDialog(null, "Enter product name");
                    SpecificProduct productFounded = this.inventory.searchByName(searchByNameString);
                    JOptionPane.showMessageDialog(null, productFounded.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, this.inventory.showProducts());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Leaving...");
            }
        } while (option != 5);
    }
}
