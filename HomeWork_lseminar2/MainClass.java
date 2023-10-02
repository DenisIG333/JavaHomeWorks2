public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 90, false);
        Cat cat2 = new Cat("Рыжик", 10, false);
        Cat cat3 = new Cat("Персик", 20, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat();


        Cat[] cats = new Cat[3];
        cats[0] = cat;
        cats[1] = cat2;
        cats[2] = cat3;

        processFeeding(cats, plate);
    }

    public static void processFeeding(Cat[] cats, Plate plate){
        for (Cat cat : cats) {
            System.out.printf("Кот %s пошёл к тарелке \n", cat.getName());
            if (plate.getFood() < cat.getAppetite()) {
                System.out.printf("недостаточно еды для того чтобы накормить кота %s до сыта,  сытость кота = %b \n", cat.getName(), cat.getSatiety());

            } else if ((plate.getFood() >= cat.getAppetite())) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.setSatiety(true);
                System.out.printf("кот %s накормлен, сытость кота = %b \n", cat.getName(), cat.getSatiety());
            }
        }
        plate.info();
    }
}
