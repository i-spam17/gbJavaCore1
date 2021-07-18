package lesson1;

public class Wolf extends Animal {
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Волк воет!");
    }

    @Override
    public double swim(Pool pool) {
        System.out.println("Волк поплыл!" + "Мое время - " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}
