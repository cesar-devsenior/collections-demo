package com.devsenior.cdiaz;

import com.devsenior.cdiaz.caluladora.Inventory;
import com.devsenior.cdiaz.caluladora.Product;

public class Main {
    public static void main(String[] args) {
        var inventory = new Inventory();
        inventory.addProduct(new Product("Arroz", 1, 5500d));
        inventory.addProduct(new Product("Cafe", 2, 8500.25d));
        inventory.addProduct(new Product("Frijol", 10, 10000d));
        inventory.addProduct(new Product("Arroz", 3, 5500d));

        var allProducts = inventory.getInventory();
        for (var value : allProducts) {
            System.out.println(value);
        }

        try {
            var product = inventory.getProduct("Cafe");
            System.out.printf("%s \t%d \t$ %,.2f%n",
                    product.getName(), product.getQuantity(), product.getPrice());

            product = inventory.getProduct("Pasta");
            System.out.printf("%s \t%d \t$ %,.2f%n",
                    product.getName(), product.getQuantity(), product.getPrice());
        } catch (NullPointerException e) {
            System.err.println("Error al consultar el producto.");
            //e.printStackTrace();
        }

        var total = inventory.getTotalInventory();
        System.out.printf("El total del inventario es $ %,.2f %n", total);

    }
}