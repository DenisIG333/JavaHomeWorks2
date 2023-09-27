package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -100);
        //product1.brand = "ООО Источник";
        //product1.name = "_";
        //product1.price = -100;
        product1.setName("43");
        System.out.println(product1.displayInfo());


        Product product2 = new Product();
        System.out.println(product2.displayInfo());


        Product product3 = new Product("Бутылка с водой (3)", 50);
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        System.out.println(bottleOfWater1.displayInfo());

        Product milcChocolate = new Chocolate("Alpen gold", "шоколад", 150, "молочный");
        Product bitterChocolate = new Chocolate("Alpen gold", "шоколад", 130, "горький");
        System.out.println(milcChocolate.displayInfo());

        Product juiceLime = new Juice("Pulpy", "сок", 100, "лайм", 1);
        Product juiceApple = new Juice("Добрый", "сок", 100, "мультифрукт",1);
        System.out.println(juiceApple.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);


        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(milcChocolate);
        arrayList.add(bitterChocolate);
        arrayList.add(juiceLime);
        arrayList.add(juiceApple);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }


        Juice juice = vendingMachine.getJuice("сок", "мультифрукт", 1);
        if (juice != null){
            System.out.println("Вы купили:");
            System.out.println(juice.displayInfo());
        }
        else {
            System.out.println("Такого сока нет в автомате.");
        }

        Chocolate chocolate = vendingMachine.getChocolate("шоколад", "молочный");
        if (chocolate != null){
            System.out.println("Вы купили:");
            System.out.println(chocolate.displayInfo());
        }
        else {
            System.out.println("Такой плитки шоколада нет в автомате.");
        }

    }

}
