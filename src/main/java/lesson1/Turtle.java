package lesson1;

public class Turtle extends Animal {

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук!");
    }

    @Override
    public double swim(Pool pool) {
        System.out.println("Черепаха поплыла!"  + "Мое время - " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}
