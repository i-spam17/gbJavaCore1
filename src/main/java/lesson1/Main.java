package lesson1;

import homeWork1.Wall;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 2);

        Cat cat3 = new Cat("Морис", "black", -2);

        System.out.println(cat2.equals(cat3));

        System.out.println(cat2);

//        cat2.setAge(-4);

        Wolf wolf = new Wolf("wolf1", "gray", 5);
//        System.out.println(wolf);

        Animal cat4 = new Cat("Морис", "black", 2);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("not wolf");
        }
//        ((Cat) cat4).setWild(true);

        Animal cat6 = new Cat("Морис", "black", 2);
        cat6.voice();
        Animal turtle = new Turtle("Тортилла", "зеленый", 22);
        turtle.voice();


        Animal catCompetitor = new Cat("Кот спортсмен", "рыжий", 3);
        catCompetitor.setSwimmingSpeed(10);
        Animal wolfCompetitor = new Wolf("Волк спортсмен", "серый", 23);
        wolfCompetitor.setSwimmingSpeed(15);
        Animal turtleCompetitor = new Turtle("Черепаха спортсмен", "зеленый", 123);
        turtleCompetitor.swimmingSpeed = 25;

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor);
            pool.getTimeToOvercomePool(wolfCompetitor);
            pool.getTimeToOvercomePool(turtleCompetitor);
        }


    }
}
