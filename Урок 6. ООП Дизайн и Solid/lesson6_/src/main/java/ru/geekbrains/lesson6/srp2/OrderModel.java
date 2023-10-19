package ru.geekbrains.lesson6.srp2;

public class OrderModel {
    private String clientName;
    private String product;
    private int quantity;
    private double price;

    public OrderModel(String clientName, String product, int quantity, double price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Геттеры и сеттеры для доступа к полям
}
