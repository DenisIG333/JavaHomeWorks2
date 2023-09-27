package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    private String tasteOfChocolate; //вкус шоколада

     public String getTasteOfChocolate(){
         return tasteOfChocolate;
     }

     public void setTasteOfChocolate(String tasteOfChocolate){
         this.tasteOfChocolate = tasteOfChocolate;
     }

     public Chocolate(String brand, String name, double price, String tasteOfChocolate) {
         super(brand, name, price);
         this.tasteOfChocolate = tasteOfChocolate;
     }

     @Override
     public String displayInfo() {
         return String.format("[ПЛИТКА ШОКОЛАДА] %s - %s - %.2fр - вкус: %s",
                 brand, name, price, tasteOfChocolate);
     }
}
