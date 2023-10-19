package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderPresenterImpl implements OrderPresenter{
    private OrderModel orderModel;
    private OrderView orderView;

    public OrderPresenterImpl(OrderModel orderModel, OrderView orderView) {
        this.orderModel = orderModel;
        this.orderView = orderView;
    }

    @Override
    public void processOrder(String clientName, String product, int quantity, double price) {
        orderModel = new OrderModel(clientName, product, quantity, price);
        saveToJson();
        orderView.showConfirmation();
    }

    private void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + orderModel.getClientName() + "\",\n");
            writer.write("\"product\":\"" + orderModel.getProduct() + "\",\n");
            writer.write("\"qnt\":" + orderModel.getQuantity() + ",\n");
            writer.write("\"price\":" + orderModel.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
