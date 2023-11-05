package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (products.length == 2 && index == 1){
            products[1] = null;
        }
        for (int i = index; i < products.length - 1; i++) {
            products[i] = null;
            products[i] = products[i + 1];
            products[i + 1] = null;
        }
        return products;
    }
}