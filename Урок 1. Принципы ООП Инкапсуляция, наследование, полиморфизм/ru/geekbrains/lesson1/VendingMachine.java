package ru.geekbrains.lesson1;

import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }


    public Chocolate getChocolate(String name, String taste ) {
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && Objects.equals(chocolate.getTasteOfChocolate(), taste))
                    return chocolate;
            }
        }
        return null;
    }

    public Juice getJuice(String name, String taste, int volume ) {
        for (Product product : products){
            if (product instanceof Juice){
                Juice juice = (Juice)product;
                if (juice.getVolume() == volume && juice.getName().equals(name) && Objects.equals(juice.getTasteOfJuice(), taste))
                    return juice;
            }
        }
        return null;
    }


}
