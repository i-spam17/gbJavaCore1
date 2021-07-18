package homeWork1;

public class Cat extends Competitors implements CanJump, CanRun {

    public Cat(String name, int jumping, int endurance) {
        super(name, jumping, endurance);
        System.out.println("Создался новый Кот- " + name + ". Параметры: прыгучесть- " + jumping + ", выносливость- " + endurance);
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getEndurance() >= treadmill.getLength()) {
            System.out.println("Кот- " + getName() + " бежит по беговой дорожке!");
        } else {
            System.out.println("Кот- " + getName() + " не может пробежать по беговой дорожке!");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (getJumping() >= wall.getHeight()) {
            System.out.println("Кот- " + getName() + " прыгает через стену!");
        } else {
            System.out.println("Кот- " + getName() + " не может перепрыгнуть через стену!");
        }
    }
}
