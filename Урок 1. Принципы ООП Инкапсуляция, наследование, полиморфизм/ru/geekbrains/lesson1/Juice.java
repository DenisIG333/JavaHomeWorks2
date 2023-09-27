package ru.geekbrains.lesson1;

public class Juice extends Product {
    private String tasteOfJuice; //вкус сока
    private int volume; //объём

    public String getTasteOfJuice(){
        return tasteOfJuice;
    }

    public void setTasteOfJuice(String tasteOfJuice){
        this.tasteOfJuice = tasteOfJuice;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public Juice(String brand, String name, double price, String taste, int volume) {
        super(brand, name, price);
        this.tasteOfJuice = taste;
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[СОК] %s - %s - %.2fр - вкус: %s - объём: %dл",
                brand, name, price, tasteOfJuice, volume);
    }
}
