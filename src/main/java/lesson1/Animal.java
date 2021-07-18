package lesson1;

public abstract class Animal implements CanSwim {
    protected String name;
    protected String color;
    protected int age;

    protected double swimmingSpeed;

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            System.out.println("1. вы ввели отрицательный возраст!");
        } else {
            this.age = age;
        }
    }

    public abstract void voice();

//    public double swim(Pool pool) {
//        System.out.println("Я кот я плыву!");
//        return pool.getLength() / swimmingSpeed;
//    }




}
