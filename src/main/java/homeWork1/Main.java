package homeWork1;

public class Main {

    public static void main(String[] args) {

//Создаем набор участников:
//        Robot robot1 = new Robot("Электроник1", 10, 20);
//        Man man1 = new Man("Василий1", 8, 15);
//        Cat cat1 = new Cat("Барсик1", 15, 3);
//
//        System.out.println("------------------");

////Все участники прыгают через стену
//        Wall wall1 = new Wall(20);
//        wall1.jumpThroughWall(robot1);
//        wall1.jumpThroughWall(man1);
//        wall1.jumpThroughWall(cat1);
//
//        System.out.println("------------------");
//
////Все участники бегут по дорожке
//        Treadmill treadmill1 = new Treadmill(5);
//        treadmill1.runOnATreadmill(robot1);
//        treadmill1.runOnATreadmill(man1);
//        treadmill1.runOnATreadmill(cat1);
//
//        System.out.println("------------------");

//Создаем набор препятствий (стен и дорожек) и участников:
        Wall[] walls = {
                new Wall(3),
                new Wall(5),
                new Wall(15)
        };
        Treadmill[] treadmills = {
                new Treadmill(5),
                new Treadmill(8),
                new Treadmill(10)
        };
        Competitors[] competitors = {
                new Robot("Электроник", 5, 8),
                new Cat("Мурзик", 12, 2),
                new Man("Володя", 4, 6)
        };

        System.out.println("------------------");

//Соревнования: вариант как в лекции:
//        System.out.println("Прыжки:");
//        for (Wall wall : walls) {
//            wall.jumpThroughWall(robot1);
//            wall.jumpThroughWall(man1);
//            wall.jumpThroughWall(cat1);
//        }
//        System.out.println("Бег:");
//        for (Treadmill treadmill : treadmills) {
//            treadmill.runOnATreadmill(robot1);
//            treadmill.runOnATreadmill(man1);
//            treadmill.runOnATreadmill(cat1);
//        }
//        System.out.println("------------------");

//Соревнования: мой вариант:
        System.out.println("Прыжки:");
        for (Wall wall : walls) {
            for (int i = 0; i < competitors.length; i++) {
                wall.jumpThroughWall((CanJump) competitors[i]);
            }
        }
        System.out.println("Бег:");
        for (Treadmill treadmill : treadmills) {
            for (int i = 0; i < competitors.length; i++) {
                treadmill.runOnATreadmill((CanRun) competitors[i]);
            }
        }
        System.out.println("------------------");

        System.out.println("Задание 5*:");
        System.out.println("---Прыжки:---");
        for (Wall wall : walls) {
            for (int i = 0; i < competitors.length; i++) {
                if (competitors[i].getJumping() < wall.getHeight()) {
                    System.out.println(((Competitors) competitors[i]).getName() + " выбывает из соревнований!");
                } else {
                    wall.jumpThroughWall((CanJump) competitors[i]);
                }
            }
        }
        System.out.println("---Бег:---");
        for (Treadmill treadmill : treadmills) {
            for (int i = 0; i < competitors.length; i++) {
                if (competitors[i].getEndurance() < treadmill.getLength()) {
                    System.out.println(((Competitors) competitors[i]).getName() + " выбывает из соревнований!");
                } else {
                    treadmill.runOnATreadmill((CanRun) competitors[i]);
                }
            }
        }

    }
}
